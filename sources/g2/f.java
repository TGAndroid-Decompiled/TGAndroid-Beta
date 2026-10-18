package g2;

import android.net.Uri;
import android.util.Base64;
import b2.w0;
import e2.m0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import v7.u6;
public final class f extends c {
    public m f10778a;
    public byte[] f10779b;
    public int f10780c;
    public int d;

    @Override
    public final void close() {
        if (this.f10779b != null) {
            this.f10779b = null;
            transferEnded();
        }
        this.f10778a = null;
    }

    @Override
    public final Uri getUri() {
        m mVar = this.f10778a;
        if (mVar != null) {
            return mVar.f10794a;
        }
        return null;
    }

    @Override
    public final long open(m mVar) {
        transferInitializing(mVar);
        this.f10778a = mVar;
        Uri uri = mVar.f10794a;
        long j10 = mVar.f10797f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        u6.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = m0.f8255a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f10779b = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw new w0(r4.c.h("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                this.f10779b = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j11 = mVar.e;
            byte[] bArr = this.f10779b;
            if (j11 <= bArr.length) {
                int i10 = (int) j11;
                this.f10780c = i10;
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
            this.f10779b = null;
            throw new j(2008);
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
        byte[] bArr2 = this.f10779b;
        String str = m0.f8255a;
        System.arraycopy(bArr2, this.f10780c, bArr, i10, min);
        this.f10780c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
