package org.telegram.messenger.secretmedia;

import android.net.Uri;
import j2.c;
import j2.c0;
import j2.j;
import j2.m;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
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
    public long open(m mVar) {
        this.uri = mVar.f17179a;
        File file = new File(mVar.f17179a.getPath());
        String name = file.getName();
        Pattern pattern = w7.J;
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(t0.f26895b.getCacheDir(), p5.c.v(name, ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(mVar.f17182e);
        int length = (int) file.length();
        transferInitializing(mVar);
        long j3 = mVar.f17182e;
        long j10 = length;
        if (j3 <= j10) {
            int i7 = (int) (j10 - j3);
            this.bytesRemaining = i7;
            long j11 = mVar.f17183f;
            if (j11 != -1) {
                this.bytesRemaining = (int) Math.min(i7, j11);
            }
            this.opened = true;
            transferStarted(mVar);
            long j12 = mVar.f17183f;
            if (j12 != -1) {
                return j12;
            }
            return this.bytesRemaining;
        }
        throw new j(2008);
    }

    @Override
    public int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.bytesRemaining;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        try {
            this.fileInputStream.read(bArr, i7, min);
        } catch (IOException e10) {
            e10.printStackTrace();
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
