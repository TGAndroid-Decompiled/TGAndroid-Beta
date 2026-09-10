package g2;

import android.net.Uri;
import android.util.Base64;
import b2.s0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Cells.r6;
public final class f extends c {
    public m f8491a;
    public byte[] f8492b;
    public int f8493c;
    public int d;

    @Override
    public final void close() {
        if (this.f8492b != null) {
            this.f8492b = null;
            transferEnded();
        }
        this.f8491a = null;
    }

    @Override
    public final Uri getUri() {
        m mVar = this.f8491a;
        if (mVar != null) {
            return mVar.f8508a;
        }
        return null;
    }

    @Override
    public final long open(m mVar) {
        transferInitializing(mVar);
        this.f8491a = mVar;
        Uri uri = mVar.f8508a;
        long j3 = mVar.f8511f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        e2.d.a("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = e2.d0.f7188a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f8492b = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw new s0(r6.i("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                this.f8492b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j10 = mVar.e;
            byte[] bArr = this.f8492b;
            if (j10 <= bArr.length) {
                int i10 = (int) j10;
                this.f8493c = i10;
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
            this.f8492b = null;
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
        byte[] bArr2 = this.f8492b;
        String str = e2.d0.f7188a;
        System.arraycopy(bArr2, this.f8493c, bArr, i10, min);
        this.f8493c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
