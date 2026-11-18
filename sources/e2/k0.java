package e2;

import android.net.Uri;
import j$.util.Objects;
public class k0 {
    public static final String h;
    public static final String f10457i;
    public static final String f10458j;
    public static final String f10459k;
    public static final String f10460l;
    public static final String f10461m;
    public static final String f10462n;
    public final Uri f10463a;
    public final String f10464b;
    public final String f10465c;
    public final int d;
    public final int f10466e;
    public final String f10467f;
    public final String f10468g;

    static {
        String str = h2.l0.f13786a;
        h = Integer.toString(0, 36);
        f10457i = Integer.toString(1, 36);
        f10458j = Integer.toString(2, 36);
        f10459k = Integer.toString(3, 36);
        f10460l = Integer.toString(4, 36);
        f10461m = Integer.toString(5, 36);
        f10462n = Integer.toString(6, 36);
    }

    public k0(j0 j0Var) {
        this.f10463a = (Uri) j0Var.f10444c;
        this.f10464b = (String) j0Var.d;
        this.f10465c = (String) j0Var.f10445e;
        this.d = j0Var.f10442a;
        this.f10466e = j0Var.f10443b;
        this.f10467f = (String) j0Var.f10446f;
        this.f10468g = (String) j0Var.f10447g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10463a.equals(k0Var.f10463a) && Objects.equals(this.f10464b, k0Var.f10464b) && Objects.equals(this.f10465c, k0Var.f10465c) && this.d == k0Var.d && this.f10466e == k0Var.f10466e && Objects.equals(this.f10467f, k0Var.f10467f) && Objects.equals(this.f10468g, k0Var.f10468g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f10463a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10464b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10465c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f10466e) * 31;
        String str3 = this.f10467f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f10468g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }
}
