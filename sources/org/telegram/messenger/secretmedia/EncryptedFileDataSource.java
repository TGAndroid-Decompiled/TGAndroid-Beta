package org.telegram.messenger.secretmedia;

import android.net.Uri;
import g2.c;
import g2.d0;
import g2.k;
import g2.n;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.b8;
import org.telegram.messenger.w0;
import sc.e;
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
    public long open(n nVar) {
        this.uri = nVar.f7315a;
        File file = new File(nVar.f7315a.getPath());
        String name = file.getName();
        Pattern pattern = b8.I;
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(w0.f18945b.getCacheDir(), e.A(name, ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(nVar.e);
        int length = (int) file.length();
        transferInitializing(nVar);
        long j10 = nVar.e;
        long j11 = length;
        if (j10 <= j11) {
            int i10 = (int) (j11 - j10);
            this.bytesRemaining = i10;
            long j12 = nVar.f7318f;
            if (j12 != -1) {
                this.bytesRemaining = (int) Math.min(i10, j12);
            }
            this.opened = true;
            transferStarted(nVar);
            long j13 = nVar.f7318f;
            if (j13 != -1) {
                return j13;
            }
            return this.bytesRemaining;
        }
        throw new k(2008);
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
    public EncryptedFileDataSource(d0 d0Var) {
        this();
        if (d0Var != null) {
            addTransferListener(d0Var);
        }
    }
}
