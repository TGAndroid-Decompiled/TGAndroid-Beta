package g2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import e2.m0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class t extends c {
    public RandomAccessFile f10818a;
    public Uri f10819b;
    public long f10820c;
    public boolean d;

    @Override
    public final void close() {
        this.f10819b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f10818a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new j(e, 2000);
            }
        } finally {
            this.f10818a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f10819b;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f10791a;
        long j10 = mVar.e;
        this.f10819b = uri;
        transferInitializing(mVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f10818a = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long j11 = mVar.f10794f;
                if (j11 == -1) {
                    j11 = this.f10818a.length() - j10;
                }
                this.f10820c = j11;
                if (j11 >= 0) {
                    this.d = true;
                    transferStarted(mVar);
                    return this.f10820c;
                }
                throw new j(null, null, 2008);
            } catch (IOException e) {
                throw new j(e, 2000);
            }
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new j(e7, ((e7.getCause() instanceof ErrnoException) && ((ErrnoException) e7.getCause()).errno == OsConstants.EACCES) ? 2005 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder w9 = a1.g.w("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            w9.append(fragment);
            throw new j(w9.toString(), e7, 1004);
        } catch (SecurityException e10) {
            throw new j(e10, 2006);
        } catch (RuntimeException e11) {
            throw new j(e11, 2000);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f10820c;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f10818a;
            String str = m0.f8252a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f10820c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new j(e, 2000);
        }
    }
}
