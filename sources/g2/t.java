package g2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class t extends c {
    public RandomAccessFile f10361a;
    public Uri f10362b;
    public long f10363c;
    public boolean d;

    @Override
    public final void close() {
        this.f10362b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f10361a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new j(e7, 2000);
            }
        } finally {
            this.f10361a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f10362b;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f10330a;
        long j3 = mVar.f10333e;
        this.f10362b = uri;
        transferInitializing(mVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f10361a = randomAccessFile;
            try {
                randomAccessFile.seek(j3);
                long j10 = mVar.f10334f;
                if (j10 == -1) {
                    j10 = this.f10361a.length() - j3;
                }
                this.f10363c = j10;
                if (j10 >= 0) {
                    this.d = true;
                    transferStarted(mVar);
                    return this.f10363c;
                }
                throw new j(null, null, 2008);
            } catch (IOException e7) {
                throw new j(e7, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new j(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2005 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder w10 = a4.a.w("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
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
        long j3 = this.f10363c;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f10361a;
            String str = e2.d0.f8737a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j3, i11));
            if (read > 0) {
                this.f10363c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e7) {
            throw new j(e7, 2000);
        }
    }
}
