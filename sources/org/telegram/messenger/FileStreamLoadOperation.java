package org.telegram.messenger;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeFilename;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;

public class FileStreamLoadOperation extends BaseDataSource implements FileLoadOperationStream {
    public static final ConcurrentHashMap<Long, FileStreamLoadOperation> allStreams = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Integer> priorityMap = new ConcurrentHashMap<>();
    private long bytesRemaining;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    File currentFile;
    private long currentOffset;
    private TLRPC$Document document;
    private RandomAccessFile file;
    private FileLoadOperation loadOperation;
    private boolean opened;
    private Object parentObject;
    private Uri uri;

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        Map<String, List<String>> emptyMap;
        emptyMap = Collections.emptyMap();
        return emptyMap;
    }

    public FileStreamLoadOperation() {
        super(false);
    }

    @Deprecated
    public FileStreamLoadOperation(TransferListener transferListener) {
        this();
        if (transferListener != null) {
            addTransferListener(transferListener);
        }
    }

    public static int getStreamPrioriy(TLRPC$Document tLRPC$Document) {
        Integer num;
        if (tLRPC$Document == null || (num = priorityMap.get(Long.valueOf(tLRPC$Document.id))) == null) {
            return 3;
        }
        return num.intValue();
    }

    @Override
    public long open(DataSpec dataSpec) throws IOException {
        this.uri = dataSpec.uri;
        transferInitializing(dataSpec);
        int intValue = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("account")).intValue();
        this.currentAccount = intValue;
        this.parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) this.uri.getQueryParameter("rid")).intValue());
        TLRPC$TL_document tLRPC$TL_document = new TLRPC$TL_document();
        this.document = tLRPC$TL_document;
        tLRPC$TL_document.access_hash = Utilities.parseLong(this.uri.getQueryParameter("hash")).longValue();
        this.document.id = Utilities.parseLong(this.uri.getQueryParameter("id")).longValue();
        this.document.size = Utilities.parseLong(this.uri.getQueryParameter("size")).longValue();
        this.document.dc_id = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("dc")).intValue();
        this.document.mime_type = this.uri.getQueryParameter("mime");
        this.document.file_reference = Utilities.hexToBytes(this.uri.getQueryParameter("reference"));
        TLRPC$TL_documentAttributeFilename tLRPC$TL_documentAttributeFilename = new TLRPC$TL_documentAttributeFilename();
        tLRPC$TL_documentAttributeFilename.file_name = this.uri.getQueryParameter("name");
        this.document.attributes.add(tLRPC$TL_documentAttributeFilename);
        if (this.document.mime_type.startsWith("video")) {
            this.document.attributes.add(new TLRPC$TL_documentAttributeVideo());
        } else if (this.document.mime_type.startsWith("audio")) {
            this.document.attributes.add(new TLRPC$TL_documentAttributeAudio());
        }
        allStreams.put(Long.valueOf(this.document.id), this);
        FileLoader fileLoader = FileLoader.getInstance(this.currentAccount);
        TLRPC$Document tLRPC$Document = this.document;
        Object obj = this.parentObject;
        long j = dataSpec.position;
        this.currentOffset = j;
        this.loadOperation = fileLoader.loadStreamFile(this, tLRPC$Document, null, obj, j, false, getCurrentPriority());
        long j2 = dataSpec.length;
        if (j2 == -1) {
            j2 = this.document.size - dataSpec.position;
        }
        this.bytesRemaining = j2;
        if (j2 < 0) {
            throw new EOFException();
        }
        this.opened = true;
        transferStarted(dataSpec);
        FileLoadOperation fileLoadOperation = this.loadOperation;
        if (fileLoadOperation != null) {
            File currentFile = fileLoadOperation.getCurrentFile();
            this.currentFile = currentFile;
            if (currentFile != null) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.currentFile, "r");
                    this.file = randomAccessFile;
                    randomAccessFile.seek(this.currentOffset);
                    if (this.loadOperation.isFinished()) {
                        this.bytesRemaining = this.currentFile.length() - this.currentOffset;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return this.bytesRemaining;
    }

    private int getCurrentPriority() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(priorityMap, Long.valueOf(this.document.id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    @Override
    public int read(byte[] r13, int r14, int r15) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileStreamLoadOperation.read(byte[], int, int):int");
    }

    @Override
    public Uri getUri() {
        return this.uri;
    }

    @Override
    public void close() {
        FileLoadOperation fileLoadOperation = this.loadOperation;
        if (fileLoadOperation != null) {
            fileLoadOperation.removeStreamListener(this);
        }
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.file = null;
        }
        this.uri = null;
        allStreams.remove(Long.valueOf(this.document.id));
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        CountDownLatch countDownLatch = this.countDownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.countDownLatch = null;
        }
    }

    @Override
    public void newDataAvailable() {
        CountDownLatch countDownLatch = this.countDownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.countDownLatch = null;
        }
    }

    public static void setPriorityForDocument(TLRPC$Document tLRPC$Document, int i) {
        if (tLRPC$Document != null) {
            priorityMap.put(Long.valueOf(tLRPC$Document.id), Integer.valueOf(i));
        }
    }

    public static Uri prepareUri(int i, TLRPC$Document tLRPC$Document, Object obj) {
        String attachFileName = FileLoader.getAttachFileName(tLRPC$Document);
        File pathToAttach = FileLoader.getInstance(i).getPathToAttach(tLRPC$Document);
        if (pathToAttach != null && pathToAttach.exists()) {
            return Uri.fromFile(pathToAttach);
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("?account=");
            sb.append(i);
            sb.append("&id=");
            sb.append(tLRPC$Document.id);
            sb.append("&hash=");
            sb.append(tLRPC$Document.access_hash);
            sb.append("&dc=");
            sb.append(tLRPC$Document.dc_id);
            sb.append("&size=");
            sb.append(tLRPC$Document.size);
            sb.append("&mime=");
            sb.append(URLEncoder.encode(tLRPC$Document.mime_type, "UTF-8"));
            sb.append("&rid=");
            sb.append(FileLoader.getInstance(i).getFileReference(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(tLRPC$Document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = tLRPC$Document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb.append(Utilities.bytesToHex(bArr));
            return Uri.parse("tg://" + attachFileName + sb.toString());
        } catch (UnsupportedEncodingException e) {
            FileLog.e(e);
            return null;
        }
    }
}
