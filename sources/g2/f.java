package g2;

import android.net.Uri;
import android.util.Base64;
import b2.x0;
import e2.m0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import v7.u6;
public final class f extends c {
    public m f9870a;
    public byte[] f9871b;
    public int f9872c;
    public int d;

    @Override
    public final void close() {
        if (this.f9871b != null) {
            this.f9871b = null;
            transferEnded();
        }
        this.f9870a = null;
    }

    @Override
    public final Uri getUri() {
        m mVar = this.f9870a;
        if (mVar != null) {
            return mVar.f9886a;
        }
        return null;
    }

    @Override
    public final long open(m mVar) {
        transferInitializing(mVar);
        this.f9870a = mVar;
        Uri uri = mVar.f9886a;
        long j10 = mVar.f9889f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        u6.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = m0.f8375a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f9871b = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw new x0(t8.b.h("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                this.f9871b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j11 = mVar.e;
            byte[] bArr = this.f9871b;
            if (j11 <= bArr.length) {
                int i10 = (int) j11;
                this.f9872c = i10;
                int length = bArr.length - i10;
                this.d = length;
                int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                if (i11 != 0) {
                    this.d = (int) Math.min(length, j10);
                }
                transferStarted(mVar);
                if (i11 != 0) {
                    return j10;
                }
                return this.d;
            }
            this.f9871b = null;
            throw new j(2008);
        }
        throw new x0("Unexpected URI format: " + normalizeScheme, null, true, 0);
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
        byte[] bArr2 = this.f9871b;
        String str = m0.f8375a;
        System.arraycopy(bArr2, this.f9872c, bArr, i10, min);
        this.f9872c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
