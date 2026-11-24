package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
public final class t73 extends qg0 {
    public g83 a;
    public byte[] b;
    public int c;
    public int d;

    @Override
    public final void close() {
        if (this.b != null) {
            this.b = null;
            transferEnded();
        }
        this.a = null;
    }

    @Override
    public final Uri getUri() {
        g83 g83Var = this.a;
        if (g83Var != null) {
            return g83Var.a;
        }
        return null;
    }

    @Override
    public final long open(g83 g83Var) {
        byte[] decode;
        transferInitializing(g83Var);
        this.a = g83Var;
        Uri uri = g83Var.a;
        long j = g83Var.f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        jte.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = hac.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    decode = Base64.decode(str2, 0);
                    this.b = decode;
                } catch (IllegalArgumentException e) {
                    throw new bx7(b10.h("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                decode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
                this.b = decode;
            }
            long j2 = g83Var.e;
            if (j2 <= decode.length) {
                int i = (int) j2;
                this.c = i;
                int length = decode.length - i;
                this.d = length;
                int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i2 != 0) {
                    this.d = (int) Math.min(length, j);
                }
                transferStarted(g83Var);
                if (i2 != 0) {
                    return j;
                }
                return this.d;
            }
            this.b = null;
            throw new d83(2008);
        }
        throw new bx7("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.b;
        String str = hac.a;
        System.arraycopy(bArr2, this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
