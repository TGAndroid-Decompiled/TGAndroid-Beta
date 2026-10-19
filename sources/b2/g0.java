package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import v7.u6;
public final class g0 {
    public static final String f3757i;
    public static final String f3758j;
    public static final String f3759k;
    public static final String f3760l;
    public static final String f3761m;
    public static final String f3762n;
    public static final String f3763o;
    public static final String f3764p;
    public final UUID f3765a;
    public final Uri f3766b;
    public final e9.q0 f3767c;
    public final boolean d;
    public final boolean e;
    public final boolean f3768f;
    public final e9.n0 f3769g;
    public final byte[] h;

    static {
        String str = e2.m0.f8254a;
        f3757i = Integer.toString(0, 36);
        f3758j = Integer.toString(1, 36);
        f3759k = Integer.toString(2, 36);
        f3760l = Integer.toString(3, 36);
        f3761m = Integer.toString(4, 36);
        f3762n = Integer.toString(5, 36);
        f3763o = Integer.toString(6, 36);
        f3764p = Integer.toString(7, 36);
    }

    public g0(f0 f0Var) {
        boolean z10;
        byte[] bArr;
        if (f0Var.f3755f && f0Var.f3753b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        UUID uuid = f0Var.f3752a;
        uuid.getClass();
        this.f3765a = uuid;
        this.f3766b = f0Var.f3753b;
        this.f3767c = f0Var.f3754c;
        this.d = f0Var.d;
        this.f3768f = f0Var.f3755f;
        this.e = f0Var.e;
        this.f3769g = f0Var.f3756g;
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
        if (this.f3765a.equals(g0Var.f3765a) && Objects.equals(this.f3766b, g0Var.f3766b) && Objects.equals(this.f3767c, g0Var.f3767c) && this.d == g0Var.d && this.f3768f == g0Var.f3768f && this.e == g0Var.e && this.f3769g.equals(g0Var.f3769g) && Arrays.equals(this.h, g0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3765a.hashCode() * 31;
        Uri uri = this.f3766b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3767c.hashCode();
        int hashCode3 = this.f3769g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f3768f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
