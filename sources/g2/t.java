package g2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import e2.n0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class t extends c {
    public RandomAccessFile f12285a;
    public Uri f12286b;
    public long f12287c;
    public boolean d;

    @Override
    public final void close() {
        this.f12286b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f12285a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new j(e, 2000);
            }
        } finally {
            this.f12285a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f12286b;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f12258a;
        long j10 = mVar.e;
        this.f12286b = uri;
        transferInitializing(mVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f12285a = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long j11 = mVar.f12261f;
                if (j11 == -1) {
                    j11 = this.f12285a.length() - j10;
                }
                this.f12287c = j11;
                if (j11 >= 0) {
                    this.d = true;
                    transferStarted(mVar);
                    return this.f12287c;
                }
                throw new j(null, null, 2008);
            } catch (IOException e) {
                throw new j(e, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new j(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2005 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder w10 = a1.g.w("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            w10.append(fragment);
            throw new j(w10.toString(), e10, 1004);
        } catch (SecurityException e11) {
            throw new j(e11, 2006);
        } catch (RuntimeException e12) {
            throw new j(e12, 2000);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f12287c;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f12285a;
            String str = n0.f9692a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f12287c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new j(e, 2000);
        }
    }
}
