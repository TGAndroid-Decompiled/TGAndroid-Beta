package g5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public final class c extends g {
    public final AssetManager f6839a;
    public Uri f6840b;
    public InputStream f6841c;
    public long d;
    public boolean f6842e;

    public c(Context context) {
        super(false);
        this.f6839a = context.getAssets();
    }

    @Override
    public final void close() {
        this.f6840b = null;
        try {
            try {
                InputStream inputStream = this.f6841c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e6) {
                throw new n(e6, 2000);
            }
        } finally {
            this.f6841c = null;
            if (this.f6842e) {
                this.f6842e = false;
                transferEnded();
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f6840b;
    }

    @Override
    public final long open(p pVar) {
        int i10;
        try {
            Uri uri = pVar.f6885a;
            long j10 = pVar.f6888e;
            this.f6840b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(pVar);
            InputStream open = this.f6839a.open(path, 1);
            this.f6841c = open;
            if (open.skip(j10) >= j10) {
                long j11 = pVar.f6889f;
                if (j11 != -1) {
                    this.d = j11;
                } else {
                    long available = this.f6841c.available();
                    this.d = available;
                    if (available == 2147483647L) {
                        this.d = -1L;
                    }
                }
                this.f6842e = true;
                transferStarted(pVar);
                return this.d;
            }
            throw new n((Exception) null, 2008);
        } catch (b e6) {
            throw e6;
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = 2000;
            }
            throw new n(e10, i10);
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
                } catch (IOException e6) {
                    throw new n(e6, 2000);
                }
            }
            InputStream inputStream = this.f6841c;
            int i12 = h5.d0.f7237a;
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
