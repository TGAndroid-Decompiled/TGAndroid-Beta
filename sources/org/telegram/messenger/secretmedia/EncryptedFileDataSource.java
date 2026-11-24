package org.telegram.messenger.secretmedia;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.a;
public final class EncryptedFileDataSource extends qg0 {
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
    public EncryptedFileDataSource(w0c w0cVar) {
        this();
        if (w0cVar != null) {
            addTransferListener(w0cVar);
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
    public long open(g83 g83Var) {
        this.uri = g83Var.a;
        File file = new File(g83Var.a.getPath());
        String name = file.getName();
        Pattern pattern = bc4.J;
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(a.b.getCacheDir(), td4.p(name, ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(g83Var.e);
        int length = (int) file.length();
        transferInitializing(g83Var);
        long j = g83Var.e;
        long j2 = length;
        if (j <= j2) {
            int i = (int) (j2 - j);
            this.bytesRemaining = i;
            long j3 = g83Var.f;
            if (j3 != -1) {
                this.bytesRemaining = (int) Math.min(i, j3);
            }
            this.opened = true;
            transferStarted(g83Var);
            long j4 = g83Var.f;
            if (j4 != -1) {
                return j4;
            }
            return this.bytesRemaining;
        }
        throw new d83(2008);
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
