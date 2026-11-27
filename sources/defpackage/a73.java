package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
public final class a73 extends sf0 {
    public n73 a;
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
        n73 n73Var = this.a;
        if (n73Var != null) {
            return n73Var.a;
        }
        return null;
    }

    @Override
    public final long open(n73 n73Var) {
        byte[] decode;
        transferInitializing(n73Var);
        this.a = n73Var;
        Uri uri = n73Var.a;
        long j = n73Var.f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        yve.h("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = gcc.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    decode = Base64.decode(str2, 0);
                    this.b = decode;
                } catch (IllegalArgumentException e) {
                    throw new hy7(c00.i("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                decode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
                this.b = decode;
            }
            long j2 = n73Var.e;
            if (j2 <= decode.length) {
                int i = (int) j2;
                this.c = i;
                int length = decode.length - i;
                this.d = length;
                int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i2 != 0) {
                    this.d = (int) Math.min(length, j);
                }
                transferStarted(n73Var);
                if (i2 != 0) {
                    return j;
                }
                return this.d;
            }
            this.b = null;
            throw new k73(2008);
        }
        throw new hy7("Unexpected URI format: " + normalizeScheme, null, true, 0);
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
        String str = gcc.a;
        System.arraycopy(bArr2, this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        bytesTransferred(min);
        return min;
    }
}
