package org.telegram.messenger.secretmedia;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.Utilities;

public final class EncryptedFileDataSource extends BaseDataSource {
    private long bytesRemaining;
    private RandomAccessFile file;
    private int fileOffset;
    private byte[] f840iv;
    private byte[] key;
    private boolean opened;
    private Uri uri;

    @Override
    public Map<String, List<String>> getResponseHeaders() {
        Map<String, List<String>> emptyMap;
        emptyMap = Collections.emptyMap();
        return emptyMap;
    }

    public static class EncryptedFileDataSourceException extends IOException {
        public EncryptedFileDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public EncryptedFileDataSource() {
        super(false);
        this.key = new byte[32];
        this.f840iv = new byte[16];
    }

    @Deprecated
    public EncryptedFileDataSource(TransferListener transferListener) {
        this();
        if (transferListener != null) {
            addTransferListener(transferListener);
        }
    }

    @Override
    public long open(DataSpec dataSpec) throws EncryptedFileDataSourceException {
        try {
            this.uri = dataSpec.uri;
            File file = new File(dataSpec.uri.getPath());
            String name = file.getName();
            File internalCacheDir = FileLoader.getInternalCacheDir();
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(internalCacheDir, name + ".key"), "r");
            randomAccessFile.read(this.key);
            randomAccessFile.read(this.f840iv);
            randomAccessFile.close();
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            this.file = randomAccessFile2;
            randomAccessFile2.seek(dataSpec.position);
            this.fileOffset = (int) dataSpec.position;
            long j = dataSpec.length;
            if (j == -1) {
                j = this.file.length() - dataSpec.position;
            }
            this.bytesRemaining = j;
            if (j < 0) {
                throw new EOFException();
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (IOException e) {
            throw new EncryptedFileDataSourceException(e);
        }
    }

    @Override
    public int read(byte[] bArr, int i, int i2) throws EncryptedFileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.file.read(bArr, i, (int) Math.min(j, i2));
            long j2 = read;
            Utilities.aesCtrDecryptionByteArray(bArr, this.key, this.f840iv, i, j2, this.fileOffset);
            this.fileOffset += read;
            if (read > 0) {
                this.bytesRemaining -= j2;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new EncryptedFileDataSourceException(e);
        }
    }

    @Override
    public Uri getUri() {
        return this.uri;
    }

    @Override
    public void close() throws EncryptedFileDataSourceException {
        this.uri = null;
        this.fileOffset = 0;
        try {
            try {
                RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new EncryptedFileDataSourceException(e);
            }
        } finally {
            this.file = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }
}
