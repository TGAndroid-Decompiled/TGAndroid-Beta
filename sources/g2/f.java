package g2;

import a8.yb;
import android.net.Uri;
import android.util.Base64;
import b2.x0;
import e2.n0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.b10;
public final class f extends c {
    public m f12241a;
    public byte[] f12242b;
    public int f12243c;
    public int d;

    @Override
    public final void close() {
        if (this.f12242b != null) {
            this.f12242b = null;
            transferEnded();
        }
        this.f12241a = null;
    }

    @Override
    public final Uri getUri() {
        m mVar = this.f12241a;
        if (mVar != null) {
            return mVar.f12257a;
        }
        return null;
    }

    @Override
    public final long open(m mVar) {
        transferInitializing(mVar);
        this.f12241a = mVar;
        Uri uri = mVar.f12257a;
        long j10 = mVar.f12260f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        yb.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = n0.f9691a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f12242b = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw new x0(b10.j("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                this.f12242b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j11 = mVar.e;
            byte[] bArr = this.f12242b;
            if (j11 <= bArr.length) {
                int i10 = (int) j11;
                this.f12243c = i10;
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
            this.f12242b = null;
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
        byte[] bArr2 = this.f12242b;
        String str = n0.f9691a;
        System.arraycopy(bArr2, this.f12243c, bArr, i10, min);
        this.f12243c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
