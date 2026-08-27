package org.telegram.messenger;

import android.net.Uri;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import java.io.File;
import java.io.IOException;
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
        Integer num = (Integer) ConcurrentMap$EL.getOrDefault(priorityMap, Long.valueOf(this.document.f22386id), null);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public static int getStreamPrioriy(TLRPC.Document document) {
        Integer num;
        if (document == null || (num = priorityMap.get(Long.valueOf(document.f22386id))) == null) {
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
            sb2.append(document.f22386id);
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
            return Uri.parse("tg://" + attachFileName + sb2.toString());
        } catch (UnsupportedEncodingException e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static void setPriorityForDocument(TLRPC.Document document, int i10) {
        if (document != null) {
            priorityMap.put(Long.valueOf(document.f22386id), Integer.valueOf(i10));
        }
    }

    @Override
    public void close() {
        FileLog.e("FileStreamLoadOperation " + this.document.f22386id + " close me=" + this);
        FileLoadOperation fileLoadOperation = this.loadOperation;
        if (fileLoadOperation != null) {
            fileLoadOperation.removeStreamListener(this);
        }
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            this.file = null;
        }
        this.uri = null;
        allStreams.remove(Long.valueOf(this.document.f22386id));
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
        Uri uri = qVar.f3022a;
        long j10 = qVar.f3025e;
        this.uri = uri;
        transferInitializing(qVar);
        int iIntValue = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("account")).intValue();
        this.currentAccount = iIntValue;
        this.parentObject = FileLoader.getInstance(iIntValue).getParentObject(Utilities.parseInt((CharSequence) this.uri.getQueryParameter("rid")).intValue());
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.document = tL_document;
        tL_document.access_hash = Utilities.parseLong(this.uri.getQueryParameter("hash")).longValue();
        this.document.f22386id = Utilities.parseLong(this.uri.getQueryParameter("id")).longValue();
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
        allStreams.put(Long.valueOf(this.document.f22386id), this);
        this.currentOffset = j10;
        this.requestedLength = qVar.f3026f;
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
        FileLog.e("FileStreamLoadOperation " + this.document.f22386id + " open operation=" + this.loadOperation + " currentFile=" + this.currentFile + " file=" + this.file + " bytesRemaining=" + this.bytesRemaining + " me=" + this);
        FileLog.e("FileStreamLoadOperation " + this.document.f22386id + " " + MessageObject.getVideoWidth(this.document) + "x" + MessageObject.getVideoWidth(this.document) + " mime_type=" + this.document.mime_type + " codec=" + MessageObject.getVideoCodec(this.document) + " size=" + this.document.size);
        return this.bytesRemaining;
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        Exception exc;
        InterruptedException interruptedException;
        Exception e9;
        InterruptedException e10;
        FileStreamLoadOperation fileStreamLoadOperation;
        File currentFileFast;
        RandomAccessFile randomAccessFile;
        long length;
        long j10;
        FileLoadOperation fileLoadOperationLoadStreamFile;
        FileLoadOperation fileLoadOperation;
        CountDownLatch countDownLatch;
        RandomAccessFile randomAccessFile2;
        if (i11 == 0) {
            return 0;
        }
        long j11 = this.bytesRemaining;
        if (j11 == 0) {
            return -1;
        }
        if (j11 < i11) {
            i11 = (int) j11;
        }
        int i12 = 0;
        while (true) {
            try {
                if (i12 == 0) {
                    try {
                        if (!this.opened) {
                        }
                        i12 = (int) this.loadOperation.getDownloadedLengthFromOffset(this.currentOffset, i11)[0];
                        if (i12 == 0) {
                            this.countDownLatch = new CountDownLatch(1);
                            fileStreamLoadOperation = this;
                            try {
                                fileLoadOperationLoadStreamFile = FileLoader.getInstance(this.currentAccount).loadStreamFile(fileStreamLoadOperation, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
                                fileLoadOperation = fileStreamLoadOperation.loadOperation;
                                if (fileLoadOperation != fileLoadOperationLoadStreamFile) {
                                    fileLoadOperation.removeStreamListener(this);
                                    fileStreamLoadOperation.loadOperation = fileLoadOperationLoadStreamFile;
                                }
                                countDownLatch = fileStreamLoadOperation.countDownLatch;
                                if (countDownLatch != null) {
                                    countDownLatch.await();
                                    fileStreamLoadOperation.countDownLatch = null;
                                }
                            } catch (InterruptedException e11) {
                                e10 = e11;
                                interruptedException = e10;
                                FileLog.e(interruptedException);
                                return -3;
                            } catch (Exception e12) {
                                e9 = e12;
                                exc = e9;
                                throw new IOException(exc);
                            }
                        } else {
                            fileStreamLoadOperation = this;
                        }
                        currentFileFast = fileStreamLoadOperation.loadOperation.getCurrentFileFast();
                        if (fileStreamLoadOperation.file != null || !Objects.equals(fileStreamLoadOperation.currentFile, currentFileFast)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("check stream file " + currentFileFast);
                            }
                            randomAccessFile = fileStreamLoadOperation.file;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception unused) {
                                }
                            }
                            fileStreamLoadOperation.currentFile = currentFileFast;
                            if (currentFileFast != null) {
                                try {
                                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(fileStreamLoadOperation.currentFile, "r");
                                    fileStreamLoadOperation.file = randomAccessFile3;
                                    randomAccessFile3.seek(fileStreamLoadOperation.currentOffset);
                                    if (fileStreamLoadOperation.loadOperation.isFinished()) {
                                        fileStreamLoadOperation.isNetwork = false;
                                        length = fileStreamLoadOperation.currentFile.length() - fileStreamLoadOperation.currentOffset;
                                        fileStreamLoadOperation.bytesRemaining = length;
                                        j10 = fileStreamLoadOperation.requestedLength;
                                        if (j10 != -1) {
                                            fileStreamLoadOperation.bytesRemaining = Math.min(length, j10 - fileStreamLoadOperation.bytesTransferred);
                                        }
                                    }
                                } catch (Throwable unused2) {
                                    if (fileStreamLoadOperation.loadOperation.isFinished() && !fileStreamLoadOperation.currentFile.exists()) {
                                        FileLoader.getInstance(fileStreamLoadOperation.currentAccount).cancelLoadFile(fileStreamLoadOperation.loadOperation.getFileName());
                                        FileLoadOperation fileLoadOperationLoadStreamFile2 = FileLoader.getInstance(fileStreamLoadOperation.currentAccount).loadStreamFile(fileStreamLoadOperation, fileStreamLoadOperation.document, null, fileStreamLoadOperation.parentObject, fileStreamLoadOperation.currentOffset, false, getCurrentPriority());
                                        FileLoadOperation fileLoadOperation2 = fileStreamLoadOperation.loadOperation;
                                        if (fileLoadOperation2 != fileLoadOperationLoadStreamFile2) {
                                            fileLoadOperation2.removeStreamListener(this);
                                            fileStreamLoadOperation.loadOperation = fileLoadOperationLoadStreamFile2;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (InterruptedException e13) {
                        interruptedException = e13;
                        FileLog.e(interruptedException);
                        return -3;
                    } catch (Exception e14) {
                        exc = e14;
                        throw new IOException(exc);
                    }
                }
                i12 = (int) this.loadOperation.getDownloadedLengthFromOffset(this.currentOffset, i11)[0];
                if (i12 == 0) {
                    this.countDownLatch = new CountDownLatch(1);
                    fileStreamLoadOperation = this;
                    fileLoadOperationLoadStreamFile = FileLoader.getInstance(this.currentAccount).loadStreamFile(fileStreamLoadOperation, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
                    fileLoadOperation = fileStreamLoadOperation.loadOperation;
                    if (fileLoadOperation != fileLoadOperationLoadStreamFile) {
                        fileLoadOperation.removeStreamListener(this);
                        fileStreamLoadOperation.loadOperation = fileLoadOperationLoadStreamFile;
                    }
                    countDownLatch = fileStreamLoadOperation.countDownLatch;
                    if (countDownLatch != null) {
                        countDownLatch.await();
                        fileStreamLoadOperation.countDownLatch = null;
                    }
                } else {
                    fileStreamLoadOperation = this;
                }
                currentFileFast = fileStreamLoadOperation.loadOperation.getCurrentFileFast();
                if (fileStreamLoadOperation.file != null) {
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("check stream file " + currentFileFast);
                }
                randomAccessFile = fileStreamLoadOperation.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                fileStreamLoadOperation.currentFile = currentFileFast;
                if (currentFileFast != null) {
                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(fileStreamLoadOperation.currentFile, "r");
                    fileStreamLoadOperation.file = randomAccessFile4;
                    randomAccessFile4.seek(fileStreamLoadOperation.currentOffset);
                    if (fileStreamLoadOperation.loadOperation.isFinished()) {
                        fileStreamLoadOperation.isNetwork = false;
                        length = fileStreamLoadOperation.currentFile.length() - fileStreamLoadOperation.currentOffset;
                        fileStreamLoadOperation.bytesRemaining = length;
                        j10 = fileStreamLoadOperation.requestedLength;
                        if (j10 != -1) {
                            fileStreamLoadOperation.bytesRemaining = Math.min(length, j10 - fileStreamLoadOperation.bytesTransferred);
                        }
                    }
                }
            } catch (InterruptedException e15) {
                e10 = e15;
                interruptedException = e10;
                FileLog.e(interruptedException);
                return -3;
            } catch (Exception e16) {
                e9 = e16;
                exc = e9;
                throw new IOException(exc);
            }
            randomAccessFile2 = this.file;
            if (randomAccessFile2 != null) {
                break;
            }
        }
        if (!this.opened) {
            return 0;
        }
        int i13 = randomAccessFile2.read(bArr, i10, i12);
        if (i13 > 0) {
            long j12 = i13;
            this.currentOffset += j12;
            this.bytesRemaining -= j12;
            this.bytesTransferred += j12;
            bytesTransferred(i13);
        }
        return i13;
    }

    @Deprecated
    public FileStreamLoadOperation(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this();
        if (y0Var != null) {
            addTransferListener(y0Var);
        }
    }
}
