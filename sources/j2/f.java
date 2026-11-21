package j2;

import a8.la;
import android.net.Uri;
import android.util.Base64;
import e2.t0;
import h2.l0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
public final class f extends c {
    public m f17191a;
    public byte[] f17192b;
    public int f17193c;
    public int d;

    @Override
    public final void close() {
        if (this.f17192b != null) {
            this.f17192b = null;
            transferEnded();
        }
        this.f17191a = null;
    }

    @Override
    public final Uri getUri() {
        m mVar = this.f17191a;
        if (mVar != null) {
            return mVar.f17210a;
        }
        return null;
    }

    @Override
    public final long open(m mVar) {
        transferInitializing(mVar);
        this.f17191a = mVar;
        Uri uri = mVar.f17210a;
        long j3 = mVar.f17214f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        la.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = l0.f13812a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f17192b = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e10) {
                    throw new t0(p5.c.k("Error while parsing Base64 encoded string: ", str2), e10, true, 0);
                }
            } else {
                this.f17192b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j10 = mVar.f17213e;
            byte[] bArr = this.f17192b;
            if (j10 <= bArr.length) {
                int i7 = (int) j10;
                this.f17193c = i7;
                int length = bArr.length - i7;
                this.d = length;
                int i10 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                if (i10 != 0) {
                    this.d = (int) Math.min(length, j3);
                }
                transferStarted(mVar);
                if (i10 != 0) {
                    return j3;
                }
                return this.d;
            }
            this.f17192b = null;
            throw new j(2008);
        }
        throw new t0("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.d;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.f17192b;
        String str = l0.f13812a;
        System.arraycopy(bArr2, this.f17193c, bArr, i7, min);
        this.f17193c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
