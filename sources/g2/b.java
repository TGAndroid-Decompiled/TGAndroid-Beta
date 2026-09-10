package g2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class b extends c {
    public final AssetManager f8475a;
    public Uri f8476b;
    public InputStream f8477c;
    public long d;
    public boolean e;

    public b(Context context) {
        super(false);
        this.f8475a = context.getAssets();
    }

    @Override
    public final void close() {
        this.f8476b = null;
        try {
            try {
                InputStream inputStream = this.f8477c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new j(e, 2000);
            }
        } finally {
            this.f8477c = null;
            if (this.e) {
                this.e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f8476b;
    }

    @Override
    public final long open(m mVar) {
        int i10;
        try {
            Uri uri = mVar.f8508a;
            long j3 = mVar.e;
            this.f8476b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(mVar);
            InputStream open = this.f8475a.open(path, 1);
            this.f8477c = open;
            if (open.skip(j3) >= j3) {
                long j10 = mVar.f8511f;
                if (j10 != -1) {
                    this.d = j10;
                } else {
                    long available = this.f8477c.available();
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
        } catch (IOException e7) {
            if (e7 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = 2000;
            }
            throw new j(e7, i10);
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
                } catch (IOException e) {
                    throw new j(e, 2000);
                }
            }
            InputStream inputStream = this.f8477c;
            String str = e2.d0.f7188a;
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
