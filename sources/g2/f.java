package g2;

import android.net.Uri;
import android.util.Base64;
import b2.s0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Cells.p6;
public final class f extends c {
    public m f9363a;
    public byte[] f9364b;
    public int f9365c;
    public int d;

    @Override
    public final void close() {
        if (this.f9364b != null) {
            this.f9364b = null;
            transferEnded();
        }
        this.f9363a = null;
    }

    @Override
    public final Uri getUri() {
        m mVar = this.f9363a;
        if (mVar != null) {
            return mVar.f9380a;
        }
        return null;
    }

    @Override
    public final long open(m mVar) {
        transferInitializing(mVar);
        this.f9363a = mVar;
        Uri uri = mVar.f9380a;
        long j3 = mVar.f9383f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        e2.d.a("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = e2.d0.f7888a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f9364b = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw new s0(p6.i("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                this.f9364b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j10 = mVar.e;
            byte[] bArr = this.f9364b;
            if (j10 <= bArr.length) {
                int i10 = (int) j10;
                this.f9365c = i10;
                int length = bArr.length - i10;
                this.d = length;
                int i11 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                if (i11 != 0) {
                    this.d = (int) Math.min(length, j3);
                }
                transferStarted(mVar);
                if (i11 != 0) {
                    return j3;
                }
                return this.d;
            }
            this.f9364b = null;
            throw new j(2008);
        }
        throw new s0("Unexpected URI format: " + normalizeScheme, null, true, 0);
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
        byte[] bArr2 = this.f9364b;
        String str = e2.d0.f7888a;
        System.arraycopy(bArr2, this.f9365c, bArr, i10, min);
        this.f9365c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
