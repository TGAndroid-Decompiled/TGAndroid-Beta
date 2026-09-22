package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class c0 {
    public static final String f2942i;
    public static final String f2943j;
    public static final String f2944k;
    public static final String f2945l;
    public static final String f2946m;
    public static final String f2947n;
    public static final String f2948o;
    public static final String f2949p;
    public final UUID f2950a;
    public final Uri f2951b;
    public final e9.k0 f2952c;
    public final boolean d;
    public final boolean e;
    public final boolean f2953f;
    public final e9.i0 f2954g;
    public final byte[] h;

    static {
        String str = e2.d0.f7887a;
        f2942i = Integer.toString(0, 36);
        f2943j = Integer.toString(1, 36);
        f2944k = Integer.toString(2, 36);
        f2945l = Integer.toString(3, 36);
        f2946m = Integer.toString(4, 36);
        f2947n = Integer.toString(5, 36);
        f2948o = Integer.toString(6, 36);
        f2949p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        boolean z10;
        byte[] bArr;
        if (b0Var.f2940f && b0Var.f2938b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        UUID uuid = b0Var.f2937a;
        uuid.getClass();
        this.f2950a = uuid;
        this.f2951b = b0Var.f2938b;
        this.f2952c = b0Var.f2939c;
        this.d = b0Var.d;
        this.f2953f = b0Var.f2940f;
        this.e = b0Var.e;
        this.f2954g = b0Var.f2941g;
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
        if (this.f2950a.equals(c0Var.f2950a) && Objects.equals(this.f2951b, c0Var.f2951b) && Objects.equals(this.f2952c, c0Var.f2952c) && this.d == c0Var.d && this.f2953f == c0Var.f2953f && this.e == c0Var.e && this.f2954g.equals(c0Var.f2954g) && Arrays.equals(this.h, c0Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2950a.hashCode() * 31;
        Uri uri = this.f2951b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f2952c.hashCode();
        int hashCode3 = this.f2954g.hashCode();
        return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f2953f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
