package i2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import g2.n0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class b extends c {
    public final AssetManager f14518a;
    public Uri f14519b;
    public InputStream f14520c;
    public long d;
    public boolean f14521e;

    public b(Context context) {
        super(false);
        this.f14518a = context.getAssets();
    }

    @Override
    public final void close() {
        this.f14519b = null;
        try {
            try {
                InputStream inputStream = this.f14520c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new k(e10, 2000);
            }
        } finally {
            this.f14520c = null;
            if (this.f14521e) {
                this.f14521e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f14519b;
    }

    @Override
    public final long open(n nVar) {
        int i3;
        try {
            Uri uri = nVar.f14564a;
            long j10 = nVar.f14567e;
            this.f14519b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(nVar);
            InputStream open = this.f14518a.open(path, 1);
            this.f14520c = open;
            if (open.skip(j10) >= j10) {
                long j11 = nVar.f14568f;
                if (j11 != -1) {
                    this.d = j11;
                } else {
                    long available = this.f14520c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1L;
                    }
                }
                this.f14521e = true;
                transferStarted(nVar);
                return this.d;
            }
            throw new k((Exception) null, 2008);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i3 = 2005;
            } else {
                i3 = 2000;
            }
            throw new k(e11, i3);
        }
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.d;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e10) {
                    throw new k(e10, 2000);
                }
            }
            InputStream inputStream = this.f14520c;
            String str = n0.f11873a;
            int read = inputStream.read(bArr, i3, i10);
            if (read != -1) {
                long j11 = this.d;
                if (j11 != -1) {
                    this.d = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
