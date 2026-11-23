package e2;

import android.net.Uri;
import j$.util.Objects;
public class k0 {
    public static final String h;
    public static final String f10486i;
    public static final String f10487j;
    public static final String f10488k;
    public static final String f10489l;
    public static final String f10490m;
    public static final String f10491n;
    public final Uri f10492a;
    public final String f10493b;
    public final String f10494c;
    public final int d;
    public final int f10495e;
    public final String f10496f;
    public final String f10497g;

    static {
        String str = h2.l0.f13815a;
        h = Integer.toString(0, 36);
        f10486i = Integer.toString(1, 36);
        f10487j = Integer.toString(2, 36);
        f10488k = Integer.toString(3, 36);
        f10489l = Integer.toString(4, 36);
        f10490m = Integer.toString(5, 36);
        f10491n = Integer.toString(6, 36);
    }

    public k0(j0 j0Var) {
        this.f10492a = (Uri) j0Var.f10473c;
        this.f10493b = (String) j0Var.d;
        this.f10494c = (String) j0Var.f10474e;
        this.d = j0Var.f10471a;
        this.f10495e = j0Var.f10472b;
        this.f10496f = (String) j0Var.f10475f;
        this.f10497g = (String) j0Var.f10476g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10492a.equals(k0Var.f10492a) && Objects.equals(this.f10493b, k0Var.f10493b) && Objects.equals(this.f10494c, k0Var.f10494c) && this.d == k0Var.d && this.f10495e == k0Var.f10495e && Objects.equals(this.f10496f, k0Var.f10496f) && Objects.equals(this.f10497g, k0Var.f10497g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f10492a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10493b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10494c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f10495e) * 31;
        String str3 = this.f10496f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f10497g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }
}
