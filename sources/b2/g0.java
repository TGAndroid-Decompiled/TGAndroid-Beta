package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import v7.u6;
public final class g0 {
    public static final String f3755i;
    public static final String f3756j;
    public static final String f3757k;
    public static final String f3758l;
    public static final String f3759m;
    public static final String f3760n;
    public static final String f3761o;
    public static final String f3762p;
    public final UUID f3763a;
    public final Uri f3764b;
    public final e9.q0 f3765c;
    public final boolean d;
    public final boolean e;
    public final boolean f3766f;
    public final e9.n0 f3767g;
    public final byte[] h;

    static {
        String str = e2.m0.f8252a;
        f3755i = Integer.toString(0, 36);
        f3756j = Integer.toString(1, 36);
        f3757k = Integer.toString(2, 36);
        f3758l = Integer.toString(3, 36);
        f3759m = Integer.toString(4, 36);
        f3760n = Integer.toString(5, 36);
        f3761o = Integer.toString(6, 36);
        f3762p = Integer.toString(7, 36);
    }

    public g0(f0 f0Var) {
        boolean z10;
        byte[] bArr;
        if (f0Var.f3753f && f0Var.f3751b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        UUID uuid = f0Var.f3750a;
        uuid.getClass();
        this.f3763a = uuid;
        this.f3764b = f0Var.f3751b;
        this.f3765c = f0Var.f3752c;
        this.d = f0Var.d;
        this.f3766f = f0Var.f3753f;
        this.e = f0Var.e;
        this.f3767g = f0Var.f3754g;
        byte[] bArr2 = f0Var.h;
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
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f3763a.equals(g0Var.f3763a) && Objects.equals(this.f3764b, g0Var.f3764b) && Objects.equals(this.f3765c, g0Var.f3765c) && this.d == g0Var.d && this.f3766f == g0Var.f3766f && this.e == g0Var.e && this.f3767g.equals(g0Var.f3767g) && Arrays.equals(this.h, g0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3763a.hashCode() * 31;
        Uri uri = this.f3764b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3765c.hashCode();
        int hashCode3 = this.f3767g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f3766f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
