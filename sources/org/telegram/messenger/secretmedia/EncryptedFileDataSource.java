package org.telegram.messenger.secretmedia;

import android.net.Uri;
import g2.c;
import g2.c0;
import g2.j;
import g2.m;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.telegram.messenger.FileLoader;
import org.telegram.ui.Cells.p6;
public final class EncryptedFileDataSource extends c {
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
        } catch (IOException e7) {
            e7.printStackTrace();
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
    public long open(m mVar) {
        Uri uri = mVar.f10358a;
        long j3 = mVar.f10362f;
        long j10 = mVar.f10361e;
        this.uri = uri;
        File file = new File(mVar.f10358a.getPath());
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(FileLoader.getInternalCacheDir(), p6.t(file.getName(), ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(j10);
        transferInitializing(mVar);
        long length = (int) file.length();
        if (j10 <= length) {
            int i10 = (int) (length - j10);
            this.bytesRemaining = i10;
            if (j3 != -1) {
                this.bytesRemaining = (int) Math.min(i10, j3);
            }
            this.opened = true;
            transferStarted(mVar);
            if (j3 != -1) {
                return j3;
            }
            return this.bytesRemaining;
        }
        throw new j(2008);
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
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    @Deprecated
    public EncryptedFileDataSource(c0 c0Var) {
        this();
        if (c0Var != null) {
            addTransferListener(c0Var);
        }
    }
}
