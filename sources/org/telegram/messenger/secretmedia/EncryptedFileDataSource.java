package org.telegram.messenger.secretmedia;

import android.net.Uri;
import j2.c;
import j2.d0;
import j2.j;
import j2.m;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import rf.b;
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
        this.uri = mVar.f16449a;
        File file = new File(mVar.f16449a.getPath());
        String name = file.getName();
        Pattern pattern = w7.I;
        EncryptedFileInputStream encryptedFileInputStream = new EncryptedFileInputStream(file, new File(t0.f25566b.getCacheDir(), b.r(name, ".key")));
        this.fileInputStream = encryptedFileInputStream;
        encryptedFileInputStream.skip(mVar.f16452e);
        int length = (int) file.length();
        transferInitializing(mVar);
        long j3 = mVar.f16452e;
        long j10 = length;
        if (j3 <= j10) {
            int i7 = (int) (j10 - j3);
            this.bytesRemaining = i7;
            long j11 = mVar.f16453f;
            if (j11 != -1) {
                this.bytesRemaining = (int) Math.min(i7, j11);
            }
            this.opened = true;
            transferStarted(mVar);
            long j12 = mVar.f16453f;
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
    public EncryptedFileDataSource(d0 d0Var) {
        this();
        if (d0Var != null) {
            addTransferListener(d0Var);
        }
    }
}
