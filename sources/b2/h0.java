package b2;

import a8.yb;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class h0 {
    public static final String f3213i;
    public static final String f3214j;
    public static final String f3215k;
    public static final String f3216l;
    public static final String f3217m;
    public static final String f3218n;
    public static final String f3219o;
    public static final String f3220p;
    public final UUID f3221a;
    public final Uri f3222b;
    public final f9.l0 f3223c;
    public final boolean d;
    public final boolean e;
    public final boolean f3224f;
    public final f9.i0 f3225g;
    public final byte[] h;

    static {
        String str = e2.n0.f9692a;
        f3213i = Integer.toString(0, 36);
        f3214j = Integer.toString(1, 36);
        f3215k = Integer.toString(2, 36);
        f3216l = Integer.toString(3, 36);
        f3217m = Integer.toString(4, 36);
        f3218n = Integer.toString(5, 36);
        f3219o = Integer.toString(6, 36);
        f3220p = Integer.toString(7, 36);
    }

    public h0(g0 g0Var) {
        boolean z10;
        byte[] bArr;
        if (g0Var.f3210f && g0Var.f3208b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.p(z10);
        UUID uuid = g0Var.f3207a;
        uuid.getClass();
        this.f3221a = uuid;
        this.f3222b = g0Var.f3208b;
        this.f3223c = g0Var.f3209c;
        this.d = g0Var.d;
        this.f3224f = g0Var.f3210f;
        this.e = g0Var.e;
        this.f3225g = g0Var.f3211g;
        byte[] bArr2 = g0Var.h;
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
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f3221a.equals(h0Var.f3221a) && Objects.equals(this.f3222b, h0Var.f3222b) && Objects.equals(this.f3223c, h0Var.f3223c) && this.d == h0Var.d && this.f3224f == h0Var.f3224f && this.e == h0Var.e && this.f3225g.equals(h0Var.f3225g) && Arrays.equals(this.h, h0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3221a.hashCode() * 31;
        Uri uri = this.f3222b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3223c.hashCode();
        int hashCode3 = this.f3225g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f3224f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
