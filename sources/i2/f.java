package i2;

import android.net.Uri;
import android.util.Base64;
import b8.zb;
import d2.v0;
import g2.n0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
public final class f extends c {
    public n f14535a;
    public byte[] f14536b;
    public int f14537c;
    public int d;

    @Override
    public final void close() {
        if (this.f14536b != null) {
            this.f14536b = null;
            transferEnded();
        }
        this.f14535a = null;
    }

    @Override
    public final Uri getUri() {
        n nVar = this.f14535a;
        if (nVar != null) {
            return nVar.f14564a;
        }
        return null;
    }

    @Override
    public final long open(n nVar) {
        transferInitializing(nVar);
        this.f14535a = nVar;
        Uri uri = nVar.f14564a;
        long j10 = nVar.f14568f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zb.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = n0.f11873a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f14536b = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e10) {
                    throw new v0(t4.c.f("Error while parsing Base64 encoded string: ", str2), e10, true, 0);
                }
            } else {
                this.f14536b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j11 = nVar.f14567e;
            byte[] bArr = this.f14536b;
            if (j11 <= bArr.length) {
                int i3 = (int) j11;
                this.f14537c = i3;
                int length = bArr.length - i3;
                this.d = length;
                int i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                if (i10 != 0) {
                    this.d = (int) Math.min(length, j10);
                }
                transferStarted(nVar);
                if (i10 != 0) {
                    return j10;
                }
                return this.d;
            }
            this.f14536b = null;
            throw new k(2008);
        }
        throw new v0("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.d;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.f14536b;
        String str = n0.f11873a;
        System.arraycopy(bArr2, this.f14537c, bArr, i3, min);
        this.f14537c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
