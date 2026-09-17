package g2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class b extends c {
    public final AssetManager f10320a;
    public Uri f10321b;
    public InputStream f10322c;
    public long d;
    public boolean f10323e;

    public b(Context context) {
        super(false);
        this.f10320a = context.getAssets();
    }

    @Override
    public final void close() {
        this.f10321b = null;
        try {
            try {
                InputStream inputStream = this.f10322c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new j(e7, 2000);
            }
        } finally {
            this.f10322c = null;
            if (this.f10323e) {
                this.f10323e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f10321b;
    }

    @Override
    public final long open(m mVar) {
        int i10;
        try {
            Uri uri = mVar.f10358a;
            long j3 = mVar.f10361e;
            this.f10321b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(mVar);
            InputStream open = this.f10320a.open(path, 1);
            this.f10322c = open;
            if (open.skip(j3) >= j3) {
                long j10 = mVar.f10362f;
                if (j10 != -1) {
                    this.d = j10;
                } else {
                    long available = this.f10322c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1L;
                    }
                }
                this.f10323e = true;
                transferStarted(mVar);
                return this.d;
            }
            throw new j((Exception) null, 2008);
        } catch (a e7) {
            throw e7;
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = 2000;
            }
            throw new j(e10, i10);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.d;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i11 = (int) Math.min(j3, i11);
                } catch (IOException e7) {
                    throw new j(e7, 2000);
                }
            }
            InputStream inputStream = this.f10322c;
            String str = e2.d0.f8765a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                long j10 = this.d;
                if (j10 != -1) {
                    this.d = j10 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
