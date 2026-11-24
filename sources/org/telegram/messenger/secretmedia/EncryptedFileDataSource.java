package org.telegram.messenger.secretmedia;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.a;
public final class EncryptedFileDataSource extends qf0 {
    private int bytesRemaining;
    EncryptedFileInputStream fileInputStream;
    private boolean opened;
    private Uri uri;

    public static class EncryptedFileDataSourceException extends IOException {
        public EncryptedFileDataSourceException(Throwable th) {
            super(th);
        }
    }

    @Deprecated
    public EncryptedFileDataSource(vyb vybVar) {
        this();
        if (vybVar != null) {
            addTransferListener(vybVar);
        }
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
    public long open(u63 u63Var) {
        this.uri = u63Var.a;
        File file = new File(u63Var.a.getPath());
        String name = file.getName();
        Pattern pattern = ba4.J;
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(a.b.getCacheDir(), tb4.o(name, ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(u63Var.e);
        int length = (int) file.length();
        transferInitializing(u63Var);
        long j = u63Var.e;
        long j2 = length;
        if (j <= j2) {
            int i = (int) (j2 - j);
            this.bytesRemaining = i;
            long j3 = u63Var.f;
            if (j3 != -1) {
                this.bytesRemaining = (int) Math.min(i, j3);
            }
            this.opened = true;
            transferStarted(u63Var);
            long j4 = u63Var.f;
            if (j4 != -1) {
                return j4;
            }
            return this.bytesRemaining;
        }
        throw new r63(2008);
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

    public EncryptedFileDataSource() {
        super(false);
    }
}
