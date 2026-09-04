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
public class FileStreamLoadOperation implements g2.h, FileLoadOperationStream {
    public static final ConcurrentHashMap<Long, FileStreamLoadOperation> allStreams = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Integer> priorityMap = new ConcurrentHashMap<>();
    private long bytesRemaining;
    private long bytesTransferred;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    File currentFile;
    private long currentOffset;
    private g2.m dataSpec;
    private TLRPC.Document document;
    private RandomAccessFile file;
    protected boolean isNetwork;
    private int listenerCount;
    private final ArrayList<g2.c0> listeners;
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
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(priorityMap, Long.valueOf(this.document.f19875id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public static int getStreamPrioriy(TLRPC.Document document) {
        Integer num;
        if (document == null || (num = priorityMap.get(Long.valueOf(document.f19875id))) == null) {
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
            sb2.append(document.f19875id);
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
        } catch (UnsupportedEncodingException e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static void setPriorityForDocument(TLRPC.Document document, int i10) {
        if (document != null) {
            priorityMap.put(Long.valueOf(document.f19875id), Integer.valueOf(i10));
        }
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        c0Var.getClass();
        if (!this.listeners.contains(c0Var)) {
            this.listeners.add(c0Var);
            this.listenerCount++;
        }
    }

    public final void bytesTransferred(int i10) {
        g2.m mVar = this.dataSpec;
        String str = e2.d0.f8737a;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            boolean z10 = this.isNetwork;
            y2.f fVar = (y2.f) this.listeners.get(i11);
            synchronized (fVar) {
                if (z10) {
                    if (mVar != null) {
                        try {
                            if ((mVar.h & 8) == 8) {
                            }
                        } finally {
                        }
                    }
                    fVar.f49498i += i10;
                }
            }
        }
    }

    @Override
    public void close() {
        FileLog.e("FileStreamLoadOperation " + this.document.f19875id + " close me=" + this);
        FileLoadOperation fileLoadOperation = this.loadOperation;
        if (fileLoadOperation != null) {
            fileLoadOperation.removeStreamListener(this);
        }
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.file = null;
        }
        this.uri = null;
        allStreams.remove(Long.valueOf(this.document.f19875id));
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
    public long open(g2.m mVar) {
        Uri uri = mVar.f10330a;
        long j3 = mVar.f10333e;
        this.uri = uri;
        transferInitializing(mVar);
        int intValue = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("account")).intValue();
        this.currentAccount = intValue;
        this.parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) this.uri.getQueryParameter("rid")).intValue());
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.document = tL_document;
        tL_document.access_hash = Utilities.parseLong(this.uri.getQueryParameter("hash")).longValue();
        this.document.f19875id = Utilities.parseLong(this.uri.getQueryParameter("id")).longValue();
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
        allStreams.put(Long.valueOf(this.document.f19875id), this);
        this.currentOffset = j3;
        this.requestedLength = mVar.f10334f;
        this.loadOperation = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
        this.bytesTransferred = 0L;
        long j10 = this.document.size - j3;
        this.bytesRemaining = j10;
        long j11 = this.requestedLength;
        if (j11 != -1) {
            this.bytesRemaining = Math.min(j10, j11);
        }
        this.opened = true;
        transferStarted(mVar);
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
                        long j12 = this.requestedLength;
                        if (j12 != -1) {
                            this.bytesRemaining = Math.min(length, j12 - this.bytesTransferred);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        FileLog.e("FileStreamLoadOperation " + this.document.f19875id + " open operation=" + this.loadOperation + " currentFile=" + this.currentFile + " file=" + this.file + " bytesRemaining=" + this.bytesRemaining + " me=" + this);
        FileLog.e("FileStreamLoadOperation " + this.document.f19875id + " " + MessageObject.getVideoWidth(this.document) + "x" + MessageObject.getVideoWidth(this.document) + " mime_type=" + this.document.mime_type + " codec=" + MessageObject.getVideoCodec(this.document) + " size=" + this.document.size);
        return this.bytesRemaining;
    }

    @Override
    public int read(byte[] r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileStreamLoadOperation.read(byte[], int, int):int");
    }

    public final void transferEnded() {
        g2.m mVar = this.dataSpec;
        String str = e2.d0.f8737a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((y2.f) this.listeners.get(i10)).e(mVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(g2.m mVar) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).getClass();
        }
    }

    public final void transferStarted(g2.m mVar) {
        this.dataSpec = mVar;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            ((y2.f) this.listeners.get(i10)).f(mVar, this.isNetwork);
        }
    }

    @Deprecated
    public FileStreamLoadOperation(g2.c0 c0Var) {
        this();
        if (c0Var != null) {
            addTransferListener(c0Var);
        }
    }
}
