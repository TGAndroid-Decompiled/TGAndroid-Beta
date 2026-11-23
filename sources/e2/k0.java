package e2;

import android.net.Uri;
import j$.util.Objects;
public class k0 {
    public static final String h;
    public static final String f10447i;
    public static final String f10448j;
    public static final String f10449k;
    public static final String f10450l;
    public static final String f10451m;
    public static final String f10452n;
    public final Uri f10453a;
    public final String f10454b;
    public final String f10455c;
    public final int d;
    public final int f10456e;
    public final String f10457f;
    public final String f10458g;

    static {
        String str = h2.l0.f13778a;
        h = Integer.toString(0, 36);
        f10447i = Integer.toString(1, 36);
        f10448j = Integer.toString(2, 36);
        f10449k = Integer.toString(3, 36);
        f10450l = Integer.toString(4, 36);
        f10451m = Integer.toString(5, 36);
        f10452n = Integer.toString(6, 36);
    }

    public k0(j0 j0Var) {
        this.f10453a = (Uri) j0Var.f10434c;
        this.f10454b = (String) j0Var.d;
        this.f10455c = (String) j0Var.f10435e;
        this.d = j0Var.f10432a;
        this.f10456e = j0Var.f10433b;
        this.f10457f = (String) j0Var.f10436f;
        this.f10458g = (String) j0Var.f10437g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10453a.equals(k0Var.f10453a) && Objects.equals(this.f10454b, k0Var.f10454b) && Objects.equals(this.f10455c, k0Var.f10455c) && this.d == k0Var.d && this.f10456e == k0Var.f10456e && Objects.equals(this.f10457f, k0Var.f10457f) && Objects.equals(this.f10458g, k0Var.f10458g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f10453a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10454b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10455c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f10456e) * 31;
        String str3 = this.f10457f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f10458g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }
}
