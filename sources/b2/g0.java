package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import v7.u6;
public final class g0 {
    public static final String f3758i;
    public static final String f3759j;
    public static final String f3760k;
    public static final String f3761l;
    public static final String f3762m;
    public static final String f3763n;
    public static final String f3764o;
    public static final String f3765p;
    public final UUID f3766a;
    public final Uri f3767b;
    public final e9.q0 f3768c;
    public final boolean d;
    public final boolean e;
    public final boolean f3769f;
    public final e9.n0 f3770g;
    public final byte[] h;

    static {
        String str = e2.m0.f8254a;
        f3758i = Integer.toString(0, 36);
        f3759j = Integer.toString(1, 36);
        f3760k = Integer.toString(2, 36);
        f3761l = Integer.toString(3, 36);
        f3762m = Integer.toString(4, 36);
        f3763n = Integer.toString(5, 36);
        f3764o = Integer.toString(6, 36);
        f3765p = Integer.toString(7, 36);
    }

    public g0(f0 f0Var) {
        boolean z10;
        byte[] bArr;
        if (f0Var.f3756f && f0Var.f3754b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        UUID uuid = f0Var.f3753a;
        uuid.getClass();
        this.f3766a = uuid;
        this.f3767b = f0Var.f3754b;
        this.f3768c = f0Var.f3755c;
        this.d = f0Var.d;
        this.f3769f = f0Var.f3756f;
        this.e = f0Var.e;
        this.f3770g = f0Var.f3757g;
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
        if (this.f3766a.equals(g0Var.f3766a) && Objects.equals(this.f3767b, g0Var.f3767b) && Objects.equals(this.f3768c, g0Var.f3768c) && this.d == g0Var.d && this.f3769f == g0Var.f3769f && this.e == g0Var.e && this.f3770g.equals(g0Var.f3770g) && Arrays.equals(this.h, g0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3766a.hashCode() * 31;
        Uri uri = this.f3767b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3768c.hashCode();
        int hashCode3 = this.f3770g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f3769f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
