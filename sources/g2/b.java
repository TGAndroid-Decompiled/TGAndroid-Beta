package g2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import e2.m0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class b extends c {
    public final AssetManager f10760a;
    public Uri f10761b;
    public InputStream f10762c;
    public long d;
    public boolean e;

    public b(Context context) {
        super(false);
        this.f10760a = context.getAssets();
    }

    @Override
    public final void close() {
        this.f10761b = null;
        try {
            try {
                InputStream inputStream = this.f10762c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new j(e, 2000);
            }
        } finally {
            this.f10762c = null;
            if (this.e) {
                this.e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f10761b;
    }

    @Override
    public final long open(m mVar) {
        int i10;
        try {
            Uri uri = mVar.f10792a;
            long j10 = mVar.e;
            this.f10761b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(mVar);
            InputStream open = this.f10760a.open(path, 1);
            this.f10762c = open;
            if (open.skip(j10) >= j10) {
                long j11 = mVar.f10795f;
                if (j11 != -1) {
                    this.d = j11;
                } else {
                    long available = this.f10762c.available();
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
        long j10 = this.d;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e) {
                    throw new j(e, 2000);
                }
            }
            InputStream inputStream = this.f10762c;
            String str = m0.f8253a;
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
