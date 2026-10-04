package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f3170i;
    public static final String f3171j;
    public static final String f3172k;
    public static final String f3173l;
    public static final String f3174m;
    public static final String f3175n;
    public static final String f3176o;
    public static final String f3177p;
    public final UUID f3178a;
    public final Uri f3179b;
    public final e9.k0 f3180c;
    public final boolean d;
    public final boolean f3181e;
    public final boolean f3182f;
    public final e9.i0 f3183g;
    public final byte[] h;

    static {
        String str = e2.d0.f8537a;
        f3170i = Integer.toString(0, 36);
        f3171j = Integer.toString(1, 36);
        f3172k = Integer.toString(2, 36);
        f3173l = Integer.toString(3, 36);
        f3174m = Integer.toString(4, 36);
        f3175n = Integer.toString(5, 36);
        f3176o = Integer.toString(6, 36);
        f3177p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f3168f && b0Var.f3165b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f3164a;
        uuid.getClass();
        this.f3178a = uuid;
        this.f3179b = b0Var.f3165b;
        this.f3180c = b0Var.f3166c;
        this.d = b0Var.d;
        this.f3182f = b0Var.f3168f;
        this.f3181e = b0Var.f3167e;
        this.f3183g = b0Var.f3169g;
        byte[] bArr2 = b0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f3178a.equals(c0Var.f3178a) && Objects.equals(this.f3179b, c0Var.f3179b) && Objects.equals(this.f3180c, c0Var.f3180c) && this.d == c0Var.d && this.f3182f == c0Var.f3182f && this.f3181e == c0Var.f3181e && this.f3183g.equals(c0Var.f3183g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3178a.hashCode() * 31;
        Uri uri = this.f3179b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3180c.hashCode();
        int hashCode3 = this.f3183g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f3182f ? 1 : 0)) * 31) + (this.f3181e ? 1 : 0)) * 31)) * 31);
    }
}
