package b2;

import android.net.Uri;
import j$.util.Objects;
public class n0 {
    public static final String h;
    public static final String f3847i;
    public static final String f3848j;
    public static final String f3849k;
    public static final String f3850l;
    public static final String f3851m;
    public static final String f3852n;
    public final Uri f3853a;
    public final String f3854b;
    public final String f3855c;
    public final int d;
    public final int e;
    public final String f3856f;
    public final String f3857g;

    static {
        String str = e2.m0.f8252a;
        h = Integer.toString(0, 36);
        f3847i = Integer.toString(1, 36);
        f3848j = Integer.toString(2, 36);
        f3849k = Integer.toString(3, 36);
        f3850l = Integer.toString(4, 36);
        f3851m = Integer.toString(5, 36);
        f3852n = Integer.toString(6, 36);
    }

    public n0(m0 m0Var) {
        this.f3853a = (Uri) m0Var.f3831c;
        this.f3854b = (String) m0Var.d;
        this.f3855c = (String) m0Var.e;
        this.d = m0Var.f3829a;
        this.e = m0Var.f3830b;
        this.f3856f = (String) m0Var.f3832f;
        this.f3857g = (String) m0Var.f3833g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f3853a.equals(n0Var.f3853a) && Objects.equals(this.f3854b, n0Var.f3854b) && Objects.equals(this.f3855c, n0Var.f3855c) && this.d == n0Var.d && this.e == n0Var.e && Objects.equals(this.f3856f, n0Var.f3856f) && Objects.equals(this.f3857g, n0Var.f3857g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3853a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3854b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3855c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3856f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3857g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
