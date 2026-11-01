package g2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import e2.l0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class b extends c {
    public final AssetManager f7276a;
    public Uri f7277b;
    public InputStream f7278c;
    public long d;
    public boolean e;

    public b(Context context) {
        super(false);
        this.f7276a = context.getAssets();
    }

    @Override
    public final void close() {
        this.f7277b = null;
        try {
            try {
                InputStream inputStream = this.f7278c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new k(e, 2000);
            }
        } finally {
            this.f7278c = null;
            if (this.e) {
                this.e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f7277b;
    }

    @Override
    public final long open(n nVar) {
        int i10;
        try {
            Uri uri = nVar.f7315a;
            long j10 = nVar.e;
            this.f7277b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(nVar);
            InputStream open = this.f7276a.open(path, 1);
            this.f7278c = open;
            if (open.skip(j10) >= j10) {
                long j11 = nVar.f7318f;
                if (j11 != -1) {
                    this.d = j11;
                } else {
                    long available = this.f7278c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1L;
                    }
                }
                this.e = true;
                transferStarted(nVar);
                return this.d;
            }
            throw new k((Exception) null, 2008);
        } catch (a e) {
            throw e;
        } catch (IOException e7) {
            if (e7 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = 2000;
            }
            throw new k(e7, i10);
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
                    throw new k(e, 2000);
                }
            }
            InputStream inputStream = this.f7278c;
            String str = l0.f6165a;
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
