package g2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class b extends c {
    public final AssetManager f10156a;
    public Uri f10157b;
    public InputStream f10158c;
    public long d;
    public boolean f10159e;

    public b(Context context) {
        super(false);
        this.f10156a = context.getAssets();
    }

    @Override
    public final void close() {
        this.f10157b = null;
        try {
            try {
                InputStream inputStream = this.f10158c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new j(e7, 2000);
            }
        } finally {
            this.f10158c = null;
            if (this.f10159e) {
                this.f10159e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f10157b;
    }

    @Override
    public final long open(m mVar) {
        int i10;
        try {
            Uri uri = mVar.f10194a;
            long j3 = mVar.f10197e;
            this.f10157b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(mVar);
            InputStream open = this.f10156a.open(path, 1);
            this.f10158c = open;
            if (open.skip(j3) >= j3) {
                long j10 = mVar.f10198f;
                if (j10 != -1) {
                    this.d = j10;
                } else {
                    long available = this.f10158c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1L;
                    }
                }
                this.f10159e = true;
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
            InputStream inputStream = this.f10158c;
            String str = e2.d0.f8538a;
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
