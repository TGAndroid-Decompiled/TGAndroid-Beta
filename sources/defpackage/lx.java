package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class lx extends sf0 {
    public final AssetManager a;
    public Uri b;
    public InputStream c;
    public long d;
    public boolean e;

    public lx(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override
    public final void close() {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new k73(e, 2000);
            }
        } finally {
            this.c = null;
            if (this.e) {
                this.e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.b;
    }

    @Override
    public final long open(n73 n73Var) {
        int i;
        try {
            Uri uri = n73Var.a;
            long j = n73Var.e;
            this.b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(n73Var);
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(j) >= j) {
                long j2 = n73Var.f;
                if (j2 != -1) {
                    this.d = j2;
                } else {
                    long available = this.c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1L;
                    }
                }
                this.e = true;
                transferStarted(n73Var);
                return this.d;
            }
            throw new k73((Exception) null, 2008);
        } catch (kx e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = 2000;
            }
            throw new k73(e2, i);
        }
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new k73(e, 2000);
                }
            }
            InputStream inputStream = this.c;
            String str = gcc.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.d;
                if (j2 != -1) {
                    this.d = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
