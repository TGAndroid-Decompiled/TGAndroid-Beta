package b2;

import android.net.Uri;
import j$.util.Objects;
public class n0 {
    public static final String h;
    public static final String f3850i;
    public static final String f3851j;
    public static final String f3852k;
    public static final String f3853l;
    public static final String f3854m;
    public static final String f3855n;
    public final Uri f3856a;
    public final String f3857b;
    public final String f3858c;
    public final int d;
    public final int e;
    public final String f3859f;
    public final String f3860g;

    static {
        String str = e2.m0.f8254a;
        h = Integer.toString(0, 36);
        f3850i = Integer.toString(1, 36);
        f3851j = Integer.toString(2, 36);
        f3852k = Integer.toString(3, 36);
        f3853l = Integer.toString(4, 36);
        f3854m = Integer.toString(5, 36);
        f3855n = Integer.toString(6, 36);
    }

    public n0(m0 m0Var) {
        this.f3856a = (Uri) m0Var.f3834c;
        this.f3857b = (String) m0Var.d;
        this.f3858c = (String) m0Var.e;
        this.d = m0Var.f3832a;
        this.e = m0Var.f3833b;
        this.f3859f = (String) m0Var.f3835f;
        this.f3860g = (String) m0Var.f3836g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f3856a.equals(n0Var.f3856a) && Objects.equals(this.f3857b, n0Var.f3857b) && Objects.equals(this.f3858c, n0Var.f3858c) && this.d == n0Var.d && this.e == n0Var.e && Objects.equals(this.f3859f, n0Var.f3859f) && Objects.equals(this.f3860g, n0Var.f3860g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3856a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3857b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3858c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3859f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3860g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
