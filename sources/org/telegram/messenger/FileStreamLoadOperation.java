package org.telegram.messenger;

import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class FileStreamLoadOperation extends com.google.android.exoplayer2.upstream.g implements FileLoadOperationStream {
    public static final ConcurrentHashMap<Long, FileStreamLoadOperation> allStreams = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Integer> priorityMap = new ConcurrentHashMap<>();
    private long bytesRemaining;
    private long bytesTransferred;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    File currentFile;
    private long currentOffset;
    private TLRPC.Document document;
    private RandomAccessFile file;
    private FileLoadOperation loadOperation;
    private boolean opened;
    private Object parentObject;
    private long requestedLength;
    private Uri uri;

    public FileStreamLoadOperation() {
        super(true);
    }

    private int getCurrentPriority() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(priorityMap, Long.valueOf(this.document.f22398id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public static int getStreamPrioriy(TLRPC.Document document) {
        Integer num;
        if (document == null || (num = priorityMap.get(Long.valueOf(document.f22398id))) == null) {
            return 3;
        }
        return num.intValue();
    }

    public static Uri prepareUri(int i10, TLRPC.Document document, Object obj) {
        String attachFileName = FileLoader.getAttachFileName(document);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document);
        if (pathToAttach != null && pathToAttach.exists()) {
            return Uri.fromFile(pathToAttach);
        }
        try {
            StringBuilder sb2 = new StringBuilder("?account=");
            sb2.append(i10);
            sb2.append("&id=");
            sb2.append(document.f22398id);
            sb2.append("&hash=");
            sb2.append(document.access_hash);
            sb2.append("&dc=");
            sb2.append(document.dc_id);
            sb2.append("&size=");
            sb2.append(document.size);
            sb2.append("&mime=");
            sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb2.append("&rid=");
            sb2.append(FileLoader.getInstance(i10).getFileReference(obj));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
            sb2.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb2.append(Utilities.bytesToHex(bArr));
            String sb3 = sb2.toString();
            return Uri.parse("tg://" + attachFileName + sb3);
        } catch (UnsupportedEncodingException e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static void setPriorityForDocument(TLRPC.Document document, int i10) {
        if (document != null) {
            priorityMap.put(Long.valueOf(document.f22398id), Integer.valueOf(i10));
        }
    }

    @Override
    public void close() {
        FileLog.e("FileStreamLoadOperation " + this.document.f22398id + " close me=" + this);
        FileLoadOperation fileLoadOperation = this.loadOperation;
        if (fileLoadOperation != null) {
            fileLoadOperation.removeStreamListener(this);
        }
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.file = null;
        }
        this.uri = null;
        allStreams.remove(Long.valueOf(this.document.f22398id));
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
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override
    public Uri getUri() {
        return this.uri;
    }

    @Override
    public void newDataAvailable() {
        CountDownLatch countDownLatch = this.countDownLatch;
        this.countDownLatch = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override
    public long open(com.google.android.exoplayer2.upstream.q qVar) {
        Uri uri = qVar.f3599a;
        long j10 = qVar.f3602e;
        this.uri = uri;
        transferInitializing(qVar);
        int intValue = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("account")).intValue();
        this.currentAccount = intValue;
        this.parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) this.uri.getQueryParameter("rid")).intValue());
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.document = tL_document;
        tL_document.access_hash = Utilities.parseLong(this.uri.getQueryParameter("hash")).longValue();
        this.document.f22398id = Utilities.parseLong(this.uri.getQueryParameter("id")).longValue();
        this.document.size = Utilities.parseLong(this.uri.getQueryParameter("size")).longValue();
        this.document.dc_id = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("dc")).intValue();
        this.document.mime_type = this.uri.getQueryParameter("mime");
        this.document.file_reference = Utilities.hexToBytes(this.uri.getQueryParameter("reference"));
        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
        tL_documentAttributeFilename.file_name = this.uri.getQueryParameter("name");
        this.document.attributes.add(tL_documentAttributeFilename);
        if (this.document.mime_type.startsWith("video")) {
            this.document.attributes.add(new TLRPC.TL_documentAttributeVideo());
        } else if (this.document.mime_type.startsWith("audio")) {
            this.document.attributes.add(new TLRPC.TL_documentAttributeAudio());
        }
        allStreams.put(Long.valueOf(this.document.f22398id), this);
        this.currentOffset = j10;
        this.requestedLength = qVar.f3603f;
        this.loadOperation = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
        this.bytesTransferred = 0L;
        long j11 = this.document.size - j10;
        this.bytesRemaining = j11;
        long j12 = this.requestedLength;
        if (j12 != -1) {
            this.bytesRemaining = Math.min(j11, j12);
        }
        this.opened = true;
        transferStarted(qVar);
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
                        this.isNetwork = false;
                        long length = this.currentFile.length() - this.currentOffset;
                        this.bytesRemaining = length;
                        long j13 = this.requestedLength;
                        if (j13 != -1) {
                            this.bytesRemaining = Math.min(length, j13 - this.bytesTransferred);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        FileLog.e("FileStreamLoadOperation " + this.document.f22398id + " open operation=" + this.loadOperation + " currentFile=" + this.currentFile + " file=" + this.file + " bytesRemaining=" + this.bytesRemaining + " me=" + this);
        FileLog.e("FileStreamLoadOperation " + this.document.f22398id + " " + MessageObject.getVideoWidth(this.document) + "x" + MessageObject.getVideoWidth(this.document) + " mime_type=" + this.document.mime_type + " codec=" + MessageObject.getVideoCodec(this.document) + " size=" + this.document.size);
        return this.bytesRemaining;
    }

    @Override
    public int read(byte[] r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileStreamLoadOperation.read(byte[], int, int):int");
    }

    @Deprecated
    public FileStreamLoadOperation(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this();
        if (y0Var != null) {
            addTransferListener(y0Var);
        }
    }
}
