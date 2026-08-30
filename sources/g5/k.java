package g5;

import android.net.Uri;
import android.util.Base64;
import j3.r1;
import java.net.URLDecoder;
import vh.v2;
public final class k extends g {
    public p f6388a;
    public byte[] f6389b;
    public int f6390c;
    public int d;

    @Override
    public final void close() {
        if (this.f6389b != null) {
            this.f6389b = null;
            transferEnded();
        }
        this.f6388a = null;
    }

    @Override
    public final Uri getUri() {
        p pVar = this.f6388a;
        if (pVar != null) {
            return pVar.f6401a;
        }
        return null;
    }

    @Override
    public final long open(p pVar) {
        transferInitializing(pVar);
        this.f6388a = pVar;
        Uri uri = pVar.f6401a;
        long j10 = pVar.f6404f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        h5.a.e("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = h5.d0.f6937a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f6389b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw new r1(v2.e("Error while parsing Base64 encoded string: ", str), e, true, 0);
                }
            } else {
                this.f6389b = URLDecoder.decode(str, r8.d.f43387a.name()).getBytes(r8.d.f43389c);
            }
            long j11 = pVar.e;
            byte[] bArr = this.f6389b;
            if (j11 <= bArr.length) {
                int i11 = (int) j11;
                this.f6390c = i11;
                int length = bArr.length - i11;
                this.d = length;
                int i12 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                if (i12 != 0) {
                    this.d = (int) Math.min(length, j10);
                }
                transferStarted(pVar);
                if (i12 != 0) {
                    return j10;
                }
                return this.d;
            }
            this.f6389b = null;
            throw new n(2008);
        }
        throw new r1("Unexpected URI format: " + normalizeScheme, null, true, 0);
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
        byte[] bArr2 = this.f6389b;
        int i13 = h5.d0.f6937a;
        System.arraycopy(bArr2, this.f6390c, bArr, i10, min);
        this.f6390c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
