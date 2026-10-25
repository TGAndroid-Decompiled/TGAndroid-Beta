package b2;

import android.net.Uri;
import j$.util.Objects;
public class o0 {
    public static final String h;
    public static final String f3305i;
    public static final String f3306j;
    public static final String f3307k;
    public static final String f3308l;
    public static final String f3309m;
    public static final String f3310n;
    public final Uri f3311a;
    public final String f3312b;
    public final String f3313c;
    public final int d;
    public final int e;
    public final String f3314f;
    public final String f3315g;

    static {
        String str = e2.n0.f9692a;
        h = Integer.toString(0, 36);
        f3305i = Integer.toString(1, 36);
        f3306j = Integer.toString(2, 36);
        f3307k = Integer.toString(3, 36);
        f3308l = Integer.toString(4, 36);
        f3309m = Integer.toString(5, 36);
        f3310n = Integer.toString(6, 36);
    }

    public o0(n0 n0Var) {
        this.f3311a = (Uri) n0Var.f3289c;
        this.f3312b = (String) n0Var.d;
        this.f3313c = (String) n0Var.e;
        this.d = n0Var.f3287a;
        this.e = n0Var.f3288b;
        this.f3314f = (String) n0Var.f3290f;
        this.f3315g = (String) n0Var.f3291g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f3311a.equals(o0Var.f3311a) && Objects.equals(this.f3312b, o0Var.f3312b) && Objects.equals(this.f3313c, o0Var.f3313c) && this.d == o0Var.d && this.e == o0Var.e && Objects.equals(this.f3314f, o0Var.f3314f) && Objects.equals(this.f3315g, o0Var.f3315g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3311a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3312b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3313c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3314f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3315g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
