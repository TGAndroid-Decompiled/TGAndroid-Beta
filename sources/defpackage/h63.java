package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
public final class h63 extends qf0 {
    public u63 a;
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
        u63 u63Var = this.a;
        if (u63Var != null) {
            return u63Var.a;
        }
        return null;
    }

    @Override
    public final long open(u63 u63Var) {
        byte[] decode;
        transferInitializing(u63Var);
        this.a = u63Var;
        Uri uri = u63Var.a;
        long j = u63Var.f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        gre.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = g8c.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    decode = Base64.decode(str2, 0);
                    this.b = decode;
                } catch (IllegalArgumentException e) {
                    throw new av7(b00.h("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                decode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
                this.b = decode;
            }
            long j2 = u63Var.e;
            if (j2 <= decode.length) {
                int i = (int) j2;
                this.c = i;
                int length = decode.length - i;
                this.d = length;
                int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i2 != 0) {
                    this.d = (int) Math.min(length, j);
                }
                transferStarted(u63Var);
                if (i2 != 0) {
                    return j;
                }
                return this.d;
            }
            this.b = null;
            throw new r63(2008);
        }
        throw new av7("Unexpected URI format: " + normalizeScheme, null, true, 0);
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
        String str = g8c.a;
        System.arraycopy(bArr2, this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
