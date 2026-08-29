package org.telegram.messenger.secretmedia;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.y0;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.telegram.messenger.FileLoader;
import u3.c;
public final class EncryptedFileDataSource extends g {
    private int bytesRemaining;
    EncryptedFileInputStream fileInputStream;
    private boolean opened;
    private Uri uri;

    public static class EncryptedFileDataSourceException extends IOException {
        public EncryptedFileDataSourceException(Throwable th2) {
            super(th2);
        }
    }

    public EncryptedFileDataSource() {
        super(false);
    }

    @Override
    public void close() {
        try {
            this.fileInputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.fileInputStream = null;
        this.uri = null;
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
    public long open(q qVar) {
        Uri uri = qVar.f3599a;
        long j10 = qVar.f3603f;
        long j11 = qVar.f3602e;
        this.uri = uri;
        File file = new File(qVar.f3599a.getPath());
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(FileLoader.getInternalCacheDir(), c.k(file.getName(), ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(j11);
        transferInitializing(qVar);
        long length = (int) file.length();
        if (j11 <= length) {
            int i10 = (int) (length - j11);
            this.bytesRemaining = i10;
            if (j10 != -1) {
                this.bytesRemaining = (int) Math.min(i10, j10);
            }
            this.opened = true;
            transferStarted(qVar);
            if (j10 != -1) {
                return j10;
            }
            return this.bytesRemaining;
        }
        throw new n(2008);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.bytesRemaining;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        try {
            this.fileInputStream.read(bArr, i10, min);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    @Deprecated
    public EncryptedFileDataSource(y0 y0Var) {
        this();
        if (y0Var != null) {
            addTransferListener(y0Var);
        }
    }
}
