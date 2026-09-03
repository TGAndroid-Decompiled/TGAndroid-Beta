package g5;

import android.net.Uri;
import android.util.Base64;
import j3.r1;
import java.net.URLDecoder;
import org.telegram.ui.yh;
public final class k extends g {
    public p f6870a;
    public byte[] f6871b;
    public int f6872c;
    public int d;

    @Override
    public final void close() {
        if (this.f6871b != null) {
            this.f6871b = null;
            transferEnded();
        }
        this.f6870a = null;
    }

    @Override
    public final Uri getUri() {
        p pVar = this.f6870a;
        if (pVar != null) {
            return pVar.f6885a;
        }
        return null;
    }

    @Override
    public final long open(p pVar) {
        transferInitializing(pVar);
        this.f6870a = pVar;
        Uri uri = pVar.f6885a;
        long j10 = pVar.f6889f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        h5.a.e("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = h5.d0.f7237a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f6871b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e6) {
                    throw new r1(yh.k("Error while parsing Base64 encoded string: ", str), e6, true, 0);
                }
            } else {
                this.f6871b = URLDecoder.decode(str, r8.d.f46767a.name()).getBytes(r8.d.f46769c);
            }
            long j11 = pVar.f6888e;
            byte[] bArr = this.f6871b;
            if (j11 <= bArr.length) {
                int i11 = (int) j11;
                this.f6872c = i11;
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
            this.f6871b = null;
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
        byte[] bArr2 = this.f6871b;
        int i13 = h5.d0.f7237a;
        System.arraycopy(bArr2, this.f6872c, bArr, i10, min);
        this.f6872c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
