package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import v7.u6;
public final class g0 {
    public static final String f3759i;
    public static final String f3760j;
    public static final String f3761k;
    public static final String f3762l;
    public static final String f3763m;
    public static final String f3764n;
    public static final String f3765o;
    public static final String f3766p;
    public final UUID f3767a;
    public final Uri f3768b;
    public final e9.q0 f3769c;
    public final boolean d;
    public final boolean e;
    public final boolean f3770f;
    public final e9.n0 f3771g;
    public final byte[] h;

    static {
        String str = e2.m0.f8255a;
        f3759i = Integer.toString(0, 36);
        f3760j = Integer.toString(1, 36);
        f3761k = Integer.toString(2, 36);
        f3762l = Integer.toString(3, 36);
        f3763m = Integer.toString(4, 36);
        f3764n = Integer.toString(5, 36);
        f3765o = Integer.toString(6, 36);
        f3766p = Integer.toString(7, 36);
    }

    public g0(f0 f0Var) {
        boolean z10;
        byte[] bArr;
        if (f0Var.f3757f && f0Var.f3755b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        UUID uuid = f0Var.f3754a;
        uuid.getClass();
        this.f3767a = uuid;
        this.f3768b = f0Var.f3755b;
        this.f3769c = f0Var.f3756c;
        this.d = f0Var.d;
        this.f3770f = f0Var.f3757f;
        this.e = f0Var.e;
        this.f3771g = f0Var.f3758g;
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
        if (this.f3767a.equals(g0Var.f3767a) && Objects.equals(this.f3768b, g0Var.f3768b) && Objects.equals(this.f3769c, g0Var.f3769c) && this.d == g0Var.d && this.f3770f == g0Var.f3770f && this.e == g0Var.e && this.f3771g.equals(g0Var.f3771g) && Arrays.equals(this.h, g0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3767a.hashCode() * 31;
        Uri uri = this.f3768b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3769c.hashCode();
        int hashCode3 = this.f3771g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f3770f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
