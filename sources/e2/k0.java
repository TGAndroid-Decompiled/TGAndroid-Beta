package e2;

import android.net.Uri;
import j$.util.Objects;
public class k0 {
    public static final String h;
    public static final String f10449i;
    public static final String f10450j;
    public static final String f10451k;
    public static final String f10452l;
    public static final String f10453m;
    public static final String f10454n;
    public final Uri f10455a;
    public final String f10456b;
    public final String f10457c;
    public final int d;
    public final int f10458e;
    public final String f10459f;
    public final String f10460g;

    static {
        String str = h2.l0.f13778a;
        h = Integer.toString(0, 36);
        f10449i = Integer.toString(1, 36);
        f10450j = Integer.toString(2, 36);
        f10451k = Integer.toString(3, 36);
        f10452l = Integer.toString(4, 36);
        f10453m = Integer.toString(5, 36);
        f10454n = Integer.toString(6, 36);
    }

    public k0(j0 j0Var) {
        this.f10455a = (Uri) j0Var.f10436c;
        this.f10456b = (String) j0Var.d;
        this.f10457c = (String) j0Var.f10437e;
        this.d = j0Var.f10434a;
        this.f10458e = j0Var.f10435b;
        this.f10459f = (String) j0Var.f10438f;
        this.f10460g = (String) j0Var.f10439g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10455a.equals(k0Var.f10455a) && Objects.equals(this.f10456b, k0Var.f10456b) && Objects.equals(this.f10457c, k0Var.f10457c) && this.d == k0Var.d && this.f10458e == k0Var.f10458e && Objects.equals(this.f10459f, k0Var.f10459f) && Objects.equals(this.f10460g, k0Var.f10460g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f10455a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10456b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10457c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f10458e) * 31;
        String str3 = this.f10459f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f10460g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }
}
