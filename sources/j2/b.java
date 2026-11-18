package j2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import h2.l0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class b extends c {
    public final AssetManager f17147a;
    public Uri f17148b;
    public InputStream f17149c;
    public long d;
    public boolean f17150e;

    public b(Context context) {
        super(false);
        this.f17147a = context.getAssets();
    }

    @Override
    public final void close() {
        this.f17148b = null;
        try {
            try {
                InputStream inputStream = this.f17149c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new j(e10, 2000);
            }
        } finally {
            this.f17149c = null;
            if (this.f17150e) {
                this.f17150e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f17148b;
    }

    @Override
    public final long open(m mVar) {
        int i7;
        try {
            Uri uri = mVar.f17185a;
            long j3 = mVar.f17188e;
            this.f17148b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(mVar);
            InputStream open = this.f17147a.open(path, 1);
            this.f17149c = open;
            if (open.skip(j3) >= j3) {
                long j10 = mVar.f17189f;
                if (j10 != -1) {
                    this.d = j10;
                } else {
                    long available = this.f17149c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1L;
                    }
                }
                this.f17150e = true;
                transferStarted(mVar);
                return this.d;
            }
            throw new j((Exception) null, 2008);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i7 = 2005;
            } else {
                i7 = 2000;
            }
            throw new j(e11, i7);
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j3 = this.d;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i10 = (int) Math.min(j3, i10);
                } catch (IOException e10) {
                    throw new j(e10, 2000);
                }
            }
            InputStream inputStream = this.f17149c;
            String str = l0.f13783a;
            int read = inputStream.read(bArr, i7, i10);
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
