package g2;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class t extends c {
    public RandomAccessFile f9406a;
    public Uri f9407b;
    public long f9408c;
    public boolean d;

    @Override
    public final void close() {
        this.f9407b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f9406a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new j(e, 2000);
            }
        } finally {
            this.f9406a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f9407b;
    }

    @Override
    public final long open(m mVar) {
        Uri uri = mVar.f9379a;
        long j3 = mVar.e;
        this.f9407b = uri;
        transferInitializing(mVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f9406a = randomAccessFile;
            try {
                randomAccessFile.seek(j3);
                long j10 = mVar.f9382f;
                if (j10 == -1) {
                    j10 = this.f9406a.length() - j3;
                }
                this.f9408c = j10;
                if (j10 >= 0) {
                    this.d = true;
                    transferStarted(mVar);
                    return this.f9408c;
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
            StringBuilder w10 = a4.a.w("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            w10.append(fragment);
            throw new j(w10.toString(), e7, 1004);
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
        long j3 = this.f9408c;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f9406a;
            String str = e2.d0.f7887a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j3, i11));
            if (read > 0) {
                this.f9408c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new j(e, 2000);
        }
    }
}
