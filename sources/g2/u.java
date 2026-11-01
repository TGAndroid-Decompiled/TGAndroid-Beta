package g2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import e2.l0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class u extends c {
    public RandomAccessFile f7344a;
    public Uri f7345b;
    public long f7346c;
    public boolean d;

    @Override
    public final void close() {
        this.f7345b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f7344a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new k(e, 2000);
            }
        } finally {
            this.f7344a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f7345b;
    }

    @Override
    public final long open(n nVar) {
        Uri uri = nVar.f7315a;
        long j10 = nVar.e;
        this.f7345b = uri;
        transferInitializing(nVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f7344a = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long j11 = nVar.f7318f;
                if (j11 == -1) {
                    j11 = this.f7344a.length() - j10;
                }
                this.f7346c = j11;
                if (j11 >= 0) {
                    this.d = true;
                    transferStarted(nVar);
                    return this.f7346c;
                }
                throw new k(null, null, 2008);
            } catch (IOException e) {
                throw new k(e, 2000);
            }
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new k(e7, ((e7.getCause() instanceof ErrnoException) && ((ErrnoException) e7.getCause()).errno == OsConstants.EACCES) ? 2005 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder v = a1.g.v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            v.append(fragment);
            throw new k(v.toString(), e7, 1004);
        } catch (SecurityException e10) {
            throw new k(e10, 2006);
        } catch (RuntimeException e11) {
            throw new k(e11, 2000);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f7346c;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f7344a;
            String str = l0.f6165a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f7346c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new k(e, 2000);
        }
    }
}
