package b2;

import android.net.Uri;
import j$.util.Objects;
public class n0 {
    public static final String h;
    public static final String f3849i;
    public static final String f3850j;
    public static final String f3851k;
    public static final String f3852l;
    public static final String f3853m;
    public static final String f3854n;
    public final Uri f3855a;
    public final String f3856b;
    public final String f3857c;
    public final int d;
    public final int e;
    public final String f3858f;
    public final String f3859g;

    static {
        String str = e2.m0.f8254a;
        h = Integer.toString(0, 36);
        f3849i = Integer.toString(1, 36);
        f3850j = Integer.toString(2, 36);
        f3851k = Integer.toString(3, 36);
        f3852l = Integer.toString(4, 36);
        f3853m = Integer.toString(5, 36);
        f3854n = Integer.toString(6, 36);
    }

    public n0(m0 m0Var) {
        this.f3855a = (Uri) m0Var.f3833c;
        this.f3856b = (String) m0Var.d;
        this.f3857c = (String) m0Var.e;
        this.d = m0Var.f3831a;
        this.e = m0Var.f3832b;
        this.f3858f = (String) m0Var.f3834f;
        this.f3859g = (String) m0Var.f3835g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f3855a.equals(n0Var.f3855a) && Objects.equals(this.f3856b, n0Var.f3856b) && Objects.equals(this.f3857c, n0Var.f3857c) && this.d == n0Var.d && this.e == n0Var.e && Objects.equals(this.f3858f, n0Var.f3858f) && Objects.equals(this.f3859g, n0Var.f3859g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3855a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3856b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3857c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3858f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3859g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
