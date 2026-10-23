package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import v7.u6;
public final class g0 {
    public static final String f3762i;
    public static final String f3763j;
    public static final String f3764k;
    public static final String f3765l;
    public static final String f3766m;
    public static final String f3767n;
    public static final String f3768o;
    public static final String f3769p;
    public final UUID f3770a;
    public final Uri f3771b;
    public final e9.q0 f3772c;
    public final boolean d;
    public final boolean e;
    public final boolean f3773f;
    public final e9.n0 f3774g;
    public final byte[] h;

    static {
        String str = e2.m0.f8259a;
        f3762i = Integer.toString(0, 36);
        f3763j = Integer.toString(1, 36);
        f3764k = Integer.toString(2, 36);
        f3765l = Integer.toString(3, 36);
        f3766m = Integer.toString(4, 36);
        f3767n = Integer.toString(5, 36);
        f3768o = Integer.toString(6, 36);
        f3769p = Integer.toString(7, 36);
    }

    public g0(f0 f0Var) {
        boolean z10;
        byte[] bArr;
        if (f0Var.f3760f && f0Var.f3758b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        UUID uuid = f0Var.f3757a;
        uuid.getClass();
        this.f3770a = uuid;
        this.f3771b = f0Var.f3758b;
        this.f3772c = f0Var.f3759c;
        this.d = f0Var.d;
        this.f3773f = f0Var.f3760f;
        this.e = f0Var.e;
        this.f3774g = f0Var.f3761g;
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
        if (this.f3770a.equals(g0Var.f3770a) && Objects.equals(this.f3771b, g0Var.f3771b) && Objects.equals(this.f3772c, g0Var.f3772c) && this.d == g0Var.d && this.f3773f == g0Var.f3773f && this.e == g0Var.e && this.f3774g.equals(g0Var.f3774g) && Arrays.equals(this.h, g0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3770a.hashCode() * 31;
        Uri uri = this.f3771b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3772c.hashCode();
        int hashCode3 = this.f3774g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f3773f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
