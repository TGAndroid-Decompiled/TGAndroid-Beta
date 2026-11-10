package j2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import h2.m0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class u extends c {
    public RandomAccessFile f16485a;
    public Uri f16486b;
    public long f16487c;
    public boolean d;

    @Override
    public final void close() {
        this.f16486b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f16485a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new j(e10, 2000);
            }
        } finally {
            this.f16485a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f16486b;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f16449a;
        long j3 = mVar.f16452e;
        this.f16486b = uri;
        transferInitializing(mVar);
        int i7 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f16485a = randomAccessFile;
            try {
                randomAccessFile.seek(j3);
                long j10 = mVar.f16453f;
                if (j10 == -1) {
                    j10 = this.f16485a.length() - j3;
                }
                this.f16487c = j10;
                if (j10 >= 0) {
                    this.d = true;
                    transferStarted(mVar);
                    return this.f16487c;
                }
                throw new j(null, null, 2008);
            } catch (IOException e10) {
                throw new j(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new j(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2005 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            n10.append(fragment);
            throw new j(n10.toString(), e11, 1004);
        } catch (SecurityException e12) {
            throw new j(e12, 2006);
        } catch (RuntimeException e13) {
            throw new j(e13, 2000);
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j3 = this.f16487c;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f16485a;
            String str = m0.f14114a;
            int read = randomAccessFile.read(bArr, i7, (int) Math.min(j3, i10));
            if (read > 0) {
                this.f16487c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e10) {
            throw new j(e10, 2000);
        }
    }
}
