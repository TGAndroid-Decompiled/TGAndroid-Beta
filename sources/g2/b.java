package g2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import e2.n0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class b extends c {
    public final AssetManager f12226a;
    public Uri f12227b;
    public InputStream f12228c;
    public long d;
    public boolean e;

    public b(Context context) {
        super(false);
        this.f12226a = context.getAssets();
    }

    @Override
    public final void close() {
        this.f12227b = null;
        try {
            try {
                InputStream inputStream = this.f12228c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new j(e, 2000);
            }
        } finally {
            this.f12228c = null;
            if (this.e) {
                this.e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f12227b;
    }

    @Override
    public final long open(m mVar) {
        int i10;
        try {
            Uri uri = mVar.f12258a;
            long j10 = mVar.e;
            this.f12227b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(mVar);
            InputStream open = this.f12226a.open(path, 1);
            this.f12228c = open;
            if (open.skip(j10) >= j10) {
                long j11 = mVar.f12261f;
                if (j11 != -1) {
                    this.d = j11;
                } else {
                    long available = this.f12228c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1L;
                    }
                }
                this.e = true;
                transferStarted(mVar);
                return this.d;
            }
            throw new j((Exception) null, 2008);
        } catch (a e) {
            throw e;
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
        long j10 = this.d;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e) {
                    throw new j(e, 2000);
                }
            }
            InputStream inputStream = this.f12228c;
            String str = n0.f9692a;
            int read = inputStream.read(bArr, i10, i11);
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
