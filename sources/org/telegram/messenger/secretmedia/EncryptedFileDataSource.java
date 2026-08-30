package org.telegram.messenger.secretmedia;

import android.net.Uri;
import g5.g;
import g5.n;
import g5.p;
import g5.v0;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.telegram.messenger.FileLoader;
import vh.v2;
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

    @Override
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override
    public Uri getUri() {
        return this.uri;
    }

    @Override
    public long open(p pVar) {
        Uri uri = pVar.f6401a;
        long j10 = pVar.f6404f;
        long j11 = pVar.e;
        this.uri = uri;
        File file = new File(pVar.f6401a.getPath());
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(FileLoader.getInternalCacheDir(), v2.k(file.getName(), ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(j11);
        transferInitializing(pVar);
        long length = (int) file.length();
        if (j11 <= length) {
            int i10 = (int) (length - j11);
            this.bytesRemaining = i10;
            if (j10 != -1) {
                this.bytesRemaining = (int) Math.min(i10, j10);
            }
            this.opened = true;
            transferStarted(pVar);
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    @Deprecated
    public EncryptedFileDataSource(v0 v0Var) {
        this();
        if (v0Var != null) {
            addTransferListener(v0Var);
        }
    }
}
