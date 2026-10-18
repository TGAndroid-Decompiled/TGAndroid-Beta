package b2;

import android.net.Uri;
import j$.util.Objects;
public class n0 {
    public static final String h;
    public static final String f3851i;
    public static final String f3852j;
    public static final String f3853k;
    public static final String f3854l;
    public static final String f3855m;
    public static final String f3856n;
    public final Uri f3857a;
    public final String f3858b;
    public final String f3859c;
    public final int d;
    public final int e;
    public final String f3860f;
    public final String f3861g;

    static {
        String str = e2.m0.f8255a;
        h = Integer.toString(0, 36);
        f3851i = Integer.toString(1, 36);
        f3852j = Integer.toString(2, 36);
        f3853k = Integer.toString(3, 36);
        f3854l = Integer.toString(4, 36);
        f3855m = Integer.toString(5, 36);
        f3856n = Integer.toString(6, 36);
    }

    public n0(m0 m0Var) {
        this.f3857a = (Uri) m0Var.f3835c;
        this.f3858b = (String) m0Var.d;
        this.f3859c = (String) m0Var.e;
        this.d = m0Var.f3833a;
        this.e = m0Var.f3834b;
        this.f3860f = (String) m0Var.f3836f;
        this.f3861g = (String) m0Var.f3837g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f3857a.equals(n0Var.f3857a) && Objects.equals(this.f3858b, n0Var.f3858b) && Objects.equals(this.f3859c, n0Var.f3859c) && this.d == n0Var.d && this.e == n0Var.e && Objects.equals(this.f3860f, n0Var.f3860f) && Objects.equals(this.f3861g, n0Var.f3861g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3857a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3858b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3859c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3860f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3861g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
