package g2;

import android.net.Uri;
import android.util.Base64;
import b2.w0;
import e2.l0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import v7.t6;
public final class f extends c {
    public n f7289a;
    public byte[] f7290b;
    public int f7291c;
    public int d;

    @Override
    public final void close() {
        if (this.f7290b != null) {
            this.f7290b = null;
            transferEnded();
        }
        this.f7289a = null;
    }

    @Override
    public final Uri getUri() {
        n nVar = this.f7289a;
        if (nVar != null) {
            return nVar.f7314a;
        }
        return null;
    }

    @Override
    public final long open(n nVar) {
        transferInitializing(nVar);
        this.f7289a = nVar;
        Uri uri = nVar.f7314a;
        long j10 = nVar.f7317f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        t6.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = l0.f6165a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f7290b = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw new w0(sc.e.h("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                this.f7290b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j11 = nVar.e;
            byte[] bArr = this.f7290b;
            if (j11 <= bArr.length) {
                int i10 = (int) j11;
                this.f7291c = i10;
                int length = bArr.length - i10;
                this.d = length;
                int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                if (i11 != 0) {
                    this.d = (int) Math.min(length, j10);
                }
                transferStarted(nVar);
                if (i11 != 0) {
                    return j10;
                }
                return this.d;
            }
            this.f7290b = null;
            throw new k(2008);
        }
        throw new w0("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.d;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f7290b;
        String str = l0.f6165a;
        System.arraycopy(bArr2, this.f7291c, bArr, i10, min);
        this.f7291c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
