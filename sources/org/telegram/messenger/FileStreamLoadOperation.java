package org.telegram.messenger;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
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

public class FileStreamLoadOperation extends BaseDataSource implements FileLoadOperationStream {
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

    @Override
    public Map getResponseHeaders() {
        return Collections.emptyMap();
    }

    public FileStreamLoadOperation() {
        super(true);
    }

    @Deprecated
    public FileStreamLoadOperation(TransferListener transferListener) {
        this();
        if (transferListener != null) {
            addTransferListener(transferListener);
        }
    }

    public static int getStreamPrioriy(TLRPC.Document document) {
        Integer num;
        if (document == null || (num = priorityMap.get(Long.valueOf(document.id))) == null) {
            return 3;
        }
        return num.intValue();
    }

    @Override
    public long open(DataSpec dataSpec) {
        this.uri = dataSpec.uri;
        transferInitializing(dataSpec);
        int iIntValue = Utilities.parseInt((CharSequence) this.uri.getQueryParameter("account")).intValue();
        this.currentAccount = iIntValue;
        this.parentObject = FileLoader.getInstance(iIntValue).getParentObject(Utilities.parseInt((CharSequence) this.uri.getQueryParameter("rid")).intValue());
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.document = tL_document;
        tL_document.access_hash = Utilities.parseLong(this.uri.getQueryParameter("hash")).longValue();
        this.document.id = Utilities.parseLong(this.uri.getQueryParameter("id")).longValue();
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
        allStreams.put(Long.valueOf(this.document.id), this);
        this.currentOffset = dataSpec.position;
        this.requestedLength = dataSpec.length;
        this.loadOperation = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
        this.bytesTransferred = 0L;
        long j = this.document.size - dataSpec.position;
        this.bytesRemaining = j;
        long j2 = this.requestedLength;
        if (j2 != -1) {
            this.bytesRemaining = Math.min(j, j2);
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
                        this.isNetwork = false;
                        long length = this.currentFile.length() - this.currentOffset;
                        this.bytesRemaining = length;
                        long j3 = this.requestedLength;
                        if (j3 != -1) {
                            this.bytesRemaining = Math.min(length, j3 - this.bytesTransferred);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        FileLog.e("FileStreamLoadOperation " + this.document.id + " open operation=" + this.loadOperation + " currentFile=" + this.currentFile + " file=" + this.file + " bytesRemaining=" + this.bytesRemaining + " me=" + this);
        FileLog.e("FileStreamLoadOperation " + this.document.id + " " + MessageObject.getVideoWidth(this.document) + "x" + MessageObject.getVideoWidth(this.document) + " mime_type=" + this.document.mime_type + " codec=" + MessageObject.getVideoCodec(this.document) + " size=" + this.document.size);
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
    public int read(byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile;
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j < i2) {
            i2 = (int) j;
        }
        int i3 = 0;
        while (true) {
            if (i3 != 0) {
                randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    break;
                    break;
                }
            } else {
                try {
                    if (!this.opened) {
                        randomAccessFile = this.file;
                        if (randomAccessFile != null) {
                            break;
                        }
                    }
                } catch (InterruptedException e) {
                    FileLog.e(e);
                    return -3;
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            }
            i3 = (int) this.loadOperation.getDownloadedLengthFromOffset(this.currentOffset, i2)[0];
            if (i3 == 0) {
                this.countDownLatch = new CountDownLatch(1);
                FileLoadOperation fileLoadOperationLoadStreamFile = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
                FileLoadOperation fileLoadOperation = this.loadOperation;
                if (fileLoadOperation != fileLoadOperationLoadStreamFile) {
                    fileLoadOperation.removeStreamListener(this);
                    this.loadOperation = fileLoadOperationLoadStreamFile;
                }
                CountDownLatch countDownLatch = this.countDownLatch;
                if (countDownLatch != null) {
                    countDownLatch.await();
                    this.countDownLatch = null;
                }
            }
            File currentFileFast = this.loadOperation.getCurrentFileFast();
            if (this.file == null || !Objects.equals(this.currentFile, currentFileFast)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("check stream file " + currentFileFast);
                }
                RandomAccessFile randomAccessFile2 = this.file;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (Exception unused) {
                    }
                }
                this.currentFile = currentFileFast;
                if (currentFileFast != null) {
                    try {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.currentFile, "r");
                        this.file = randomAccessFile3;
                        randomAccessFile3.seek(this.currentOffset);
                        if (this.loadOperation.isFinished()) {
                            this.isNetwork = false;
                            long length = this.currentFile.length() - this.currentOffset;
                            this.bytesRemaining = length;
                            long j2 = this.requestedLength;
                            if (j2 != -1) {
                                this.bytesRemaining = Math.min(length, j2 - this.bytesTransferred);
                            }
                        }
                    } catch (Throwable unused2) {
                        if (this.loadOperation.isFinished() && !this.currentFile.exists()) {
                            FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.loadOperation.getFileName());
                            FileLoadOperation fileLoadOperationLoadStreamFile2 = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, null, this.parentObject, this.currentOffset, false, getCurrentPriority());
                            FileLoadOperation fileLoadOperation2 = this.loadOperation;
                            if (fileLoadOperation2 != fileLoadOperationLoadStreamFile2) {
                                fileLoadOperation2.removeStreamListener(this);
                                this.loadOperation = fileLoadOperationLoadStreamFile2;
                            }
                        }
                    }
                }
            }
        }
        if (!this.opened) {
            return 0;
        }
        int i4 = randomAccessFile.read(bArr, i, i3);
        if (i4 > 0) {
            long j3 = i4;
            this.currentOffset += j3;
            this.bytesRemaining -= j3;
            this.bytesTransferred += j3;
            bytesTransferred(i4);
        }
        return i4;
    }

    @Override
    public Uri getUri() {
        return this.uri;
    }

    @Override
    public void close() {
        FileLog.e("FileStreamLoadOperation " + this.document.id + " close me=" + this);
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
        this.countDownLatch = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static void setPriorityForDocument(TLRPC.Document document, int i) {
        if (document != null) {
            priorityMap.put(Long.valueOf(document.id), Integer.valueOf(i));
        }
    }

    public static Uri prepareUri(int i, TLRPC.Document document, Object obj) {
        String attachFileName = FileLoader.getAttachFileName(document);
        File pathToAttach = FileLoader.getInstance(i).getPathToAttach(document);
        if (pathToAttach != null && pathToAttach.exists()) {
            return Uri.fromFile(pathToAttach);
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("?account=");
            sb.append(i);
            sb.append("&id=");
            sb.append(document.id);
            sb.append("&hash=");
            sb.append(document.access_hash);
            sb.append("&dc=");
            sb.append(document.dc_id);
            sb.append("&size=");
            sb.append(document.size);
            sb.append("&mime=");
            sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sb.append("&rid=");
            sb.append(FileLoader.getInstance(i).getFileReference(obj));
            sb.append("&name=");
            sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
            sb.append("&reference=");
            byte[] bArr = document.file_reference;
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
