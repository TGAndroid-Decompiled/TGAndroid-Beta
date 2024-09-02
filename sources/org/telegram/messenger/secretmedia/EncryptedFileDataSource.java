package org.telegram.messenger.secretmedia;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.telegram.messenger.FileLoader;

public final class EncryptedFileDataSource extends BaseDataSource {
    private int bytesRemaining;
    EncryptedFileInputStream fileInputStream;
    private boolean opened;
    private Uri uri;

    @Override
    public Map getResponseHeaders() {
        Map emptyMap;
        emptyMap = Collections.emptyMap();
        return emptyMap;
    }

    public static class EncryptedFileDataSourceException extends IOException {
        public EncryptedFileDataSourceException(Throwable th) {
            super(th);
        }
    }

    public EncryptedFileDataSource() {
        super(false);
    }

    @Deprecated
    public EncryptedFileDataSource(TransferListener transferListener) {
        this();
        if (transferListener != null) {
            addTransferListener(transferListener);
        }
    }

    @Override
    public long open(DataSpec dataSpec) throws IOException {
        this.uri = dataSpec.uri;
        File file = new File(dataSpec.uri.getPath());
        String name = file.getName();
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(FileLoader.getInternalCacheDir(), name + ".key"));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(dataSpec.position);
        int length = (int) file.length();
        transferInitializing(dataSpec);
        long j = dataSpec.position;
        long j2 = length;
        if (j > j2) {
            throw new DataSourceException(2008);
        }
        int i = (int) (j2 - j);
        this.bytesRemaining = i;
        long j3 = dataSpec.length;
        if (j3 != -1) {
            this.bytesRemaining = (int) Math.min(i, j3);
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j4 = dataSpec.length;
        return j4 != -1 ? j4 : this.bytesRemaining;
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        try {
            this.fileInputStream.read(bArr, i, min);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    @Override
    public Uri getUri() {
        return this.uri;
    }

    @Override
    public void close() {
        try {
            this.fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.fileInputStream = null;
        this.uri = null;
    }
}
