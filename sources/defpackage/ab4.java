package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public final class ab4 extends qg0 {
    public RandomAccessFile a;
    public Uri b;
    public long c;
    public boolean d;

    @Override
    public final void close() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new d83(e, 2000);
            }
        } finally {
            this.a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.b;
    }

    @Override
    public final long open(g83 g83Var) {
        Uri uri = g83Var.a;
        long j = g83Var.e;
        this.b = uri;
        transferInitializing(g83Var);
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = g83Var.f;
                if (j2 == -1) {
                    j2 = this.a.length() - j;
                }
                this.c = j2;
                if (j2 >= 0) {
                    this.d = true;
                    transferStarted(g83Var);
                    return this.c;
                }
                throw new d83(null, null, 2008);
            } catch (IOException e) {
                throw new d83(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new d83(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2005 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder m = mlb.m("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            m.append(fragment);
            throw new d83(m.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new d83(e3, 2006);
        } catch (RuntimeException e4) {
            throw new d83(e4, 2000);
        }
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            String str = hac.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new d83(e, 2000);
        }
    }
}
