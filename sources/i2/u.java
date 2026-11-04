package i2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import g2.n0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class u extends c {
    public RandomAccessFile f14597a;
    public Uri f14598b;
    public long f14599c;
    public boolean d;

    @Override
    public final void close() {
        this.f14598b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14597a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new k(e10, 2000);
            }
        } finally {
            this.f14597a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f14598b;
    }

    @Override
    public final long open(n nVar) {
        Uri uri = nVar.f14564a;
        long j10 = nVar.f14567e;
        this.f14598b = uri;
        transferInitializing(nVar);
        int i3 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f14597a = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long j11 = nVar.f14568f;
                if (j11 == -1) {
                    j11 = this.f14597a.length() - j10;
                }
                this.f14599c = j11;
                if (j11 >= 0) {
                    this.d = true;
                    transferStarted(nVar);
                    return this.f14599c;
                }
                throw new k(null, null, 2008);
            } catch (IOException e10) {
                throw new k(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new k(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2005 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder n4 = com.google.android.recaptcha.internal.a.n("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            n4.append(fragment);
            throw new k(n4.toString(), e11, 1004);
        } catch (SecurityException e12) {
            throw new k(e12, 2006);
        } catch (RuntimeException e13) {
            throw new k(e13, 2000);
        }
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f14599c;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14597a;
            String str = n0.f11873a;
            int read = randomAccessFile.read(bArr, i3, (int) Math.min(j10, i10));
            if (read > 0) {
                this.f14599c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e10) {
            throw new k(e10, 2000);
        }
    }
}
