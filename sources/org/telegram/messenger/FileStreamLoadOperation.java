package org.telegram.messenger;

import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class FileStreamLoadOperation implements g5.m, FileLoadOperationStream {
    public static final ConcurrentHashMap<Long, FileStreamLoadOperation> allStreams = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Integer> priorityMap = new ConcurrentHashMap<>();
    private long bytesRemaining;
    private long bytesTransferred;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    File currentFile;
    private long currentOffset;
    private g5.p dataSpec;
    private TLRPC.Document document;
    private RandomAccessFile file;
    protected boolean isNetwork;
    private int listenerCount;
    private final ArrayList<g5.v0> listeners;
    private FileLoadOperation loadOperation;
    private boolean opened;
    private Object parentObject;
    private long requestedLength;
    private Uri uri;

    public FileStreamLoadOperation() {
        this.isNetwork = true;
        this.listeners = new ArrayList<>(1);
    }

    private int getCurrentPriority() {
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(priorityMap, Long.valueOf(this.document.f20849id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public static int getStreamPrioriy(TLRPC.Document document) {
        Integer num;
        if (document == null || (num = priorityMap.get(Long.valueOf(document.f20849id))) == null) {
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
            StringBuilder sb = new StringBuilder("?account=");
            sb.append(i10);
            sb.append("&id=");
            sb.append(document.f20849id);
            sb.append("&hash=");
            sb.append(document.access_hash);
            sb.append("&dc=");
            sb.append(document.dc_id);
            sb.append("&size=");
            sb.append(document.size);
            sb.append("&mime=");
            sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb.append("&rid=");
            sb.append(FileLoader.getInstance(i10).getFileReference(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sb.append(Utilities.bytesToHex(bArr));
            String sb2 = sb.toString();
            return Uri.parse("tg://" + attachFileName + sb2);
        } catch (UnsupportedEncodingException e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static void setPriorityForDocument(TLRPC.Document document, int i10) {
        if (document != null) {
            priorityMap.put(Long.valueOf(document.f20849id), Integer.valueOf(i10));
        }
    }

    @Override
    public final void addTransferListener(g5.v0 v0Var) {
        v0Var.getClass();
        if (!this.listeners.contains(v0Var)) {
            this.listeners.add(v0Var);
            this.listenerCount++;
        }
    }

    public final void bytesTransferred(int i10) {
        g5.p pVar = this.dataSpec;
        int i11 = h5.d0.f7237a;
        for (int i12 = 0; i12 < this.listenerCount; i12++) {
            boolean z4 = this.isNetwork;
            g5.s sVar = (g5.s) this.listeners.get(i12);
            synchronized (sVar) {
                if (z4) {
                    if (pVar != null) {
                        try {
                            if ((pVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    sVar.h += i10;
                }
            }
        }
    }

    @Override
    public void close() {
        FileLog.e("FileStreamLoadOperation " + this.document.f20849id + " close me=" + this);
        FileLoadOperation fileLoadOperation = this.loadOperation;
        if (fileLoadOperation != null) {
            fileLoadOperation.removeStreamListener(this);
        }
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            this.file = null;
        }
        this.uri = null;
        allStreams.remove(Long.valueOf(this.document.f20849id));
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
    public long open(g5.p pVar) {
        Uri uri = pVar.f6885a;
        long j10 = pVar.f6888e;
        this.uri = uri;
        transferInitializing(pVar);
        int intValue = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("account")).intValue();
        this.currentAccount = intValue;
        this.parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) this.uri.getQueryParameter("rid")).intValue());
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.document = tL_document;
        tL_document.access_hash = Utilities.parseLong(this.uri.getQueryParameter("hash")).longValue();
        this.document.f20849id = Utilities.parseLong(this.uri.getQueryParameter("id")).longValue();
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
        allStreams.put(Long.valueOf(this.document.f20849id), this);
        this.currentOffset = j10;
        this.requestedLength = pVar.f6889f;
        this.loadOperation = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
        this.bytesTransferred = 0L;
        long j11 = this.document.size - j10;
        this.bytesRemaining = j11;
        long j12 = this.requestedLength;
        if (j12 != -1) {
            this.bytesRemaining = Math.min(j11, j12);
        }
        this.opened = true;
        transferStarted(pVar);
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
        FileLog.e("FileStreamLoadOperation " + this.document.f20849id + " open operation=" + this.loadOperation + " currentFile=" + this.currentFile + " file=" + this.file + " bytesRemaining=" + this.bytesRemaining + " me=" + this);
        FileLog.e("FileStreamLoadOperation " + this.document.f20849id + " " + MessageObject.getVideoWidth(this.document) + "x" + MessageObject.getVideoWidth(this.document) + " mime_type=" + this.document.mime_type + " codec=" + MessageObject.getVideoCodec(this.document) + " size=" + this.document.size);
        return this.bytesRemaining;
    }

    @Override
    public int read(byte[] r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileStreamLoadOperation.read(byte[], int, int):int");
    }

    public final void transferEnded() {
        g5.p pVar = this.dataSpec;
        int i10 = h5.d0.f7237a;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            ((g5.s) this.listeners.get(i11)).e(pVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(g5.p pVar) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).getClass();
        }
    }

    public final void transferStarted(g5.p pVar) {
        this.dataSpec = pVar;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((g5.s) this.listeners.get(i10)).f(pVar, this.isNetwork);
        }
    }

    @Deprecated
    public FileStreamLoadOperation(g5.v0 v0Var) {
        this();
        if (v0Var != null) {
            addTransferListener(v0Var);
        }
    }
}
