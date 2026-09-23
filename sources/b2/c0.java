package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f2935i;
    public static final String f2936j;
    public static final String f2937k;
    public static final String f2938l;
    public static final String f2939m;
    public static final String f2940n;
    public static final String f2941o;
    public static final String f2942p;
    public final UUID f2943a;
    public final Uri f2944b;
    public final e9.k0 f2945c;
    public final boolean d;
    public final boolean e;
    public final boolean f2946f;
    public final e9.i0 f2947g;
    public final byte[] h;

    static {
        String str = e2.d0.f7871a;
        f2935i = Integer.toString(0, 36);
        f2936j = Integer.toString(1, 36);
        f2937k = Integer.toString(2, 36);
        f2938l = Integer.toString(3, 36);
        f2939m = Integer.toString(4, 36);
        f2940n = Integer.toString(5, 36);
        f2941o = Integer.toString(6, 36);
        f2942p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f2933f && b0Var.f2931b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f2930a;
        uuid.getClass();
        this.f2943a = uuid;
        this.f2944b = b0Var.f2931b;
        this.f2945c = b0Var.f2932c;
        this.d = b0Var.d;
        this.f2946f = b0Var.f2933f;
        this.e = b0Var.e;
        this.f2947g = b0Var.f2934g;
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
        if (this.f2943a.equals(c0Var.f2943a) && Objects.equals(this.f2944b, c0Var.f2944b) && Objects.equals(this.f2945c, c0Var.f2945c) && this.d == c0Var.d && this.f2946f == c0Var.f2946f && this.e == c0Var.e && this.f2947g.equals(c0Var.f2947g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2943a.hashCode() * 31;
        Uri uri = this.f2944b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2945c.hashCode();
        int hashCode3 = this.f2947g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2946f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
