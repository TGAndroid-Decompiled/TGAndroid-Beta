package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f3035i;
    public static final String f3036j;
    public static final String f3037k;
    public static final String f3038l;
    public static final String f3039m;
    public static final String f3040n;
    public final Uri f3041a;
    public final String f3042b;
    public final String f3043c;
    public final int d;
    public final int e;
    public final String f3044f;
    public final String f3045g;

    static {
        String str = e2.d0.f7885a;
        h = Integer.toString(0, 36);
        f3035i = Integer.toString(1, 36);
        f3036j = Integer.toString(2, 36);
        f3037k = Integer.toString(3, 36);
        f3038l = Integer.toString(4, 36);
        f3039m = Integer.toString(5, 36);
        f3040n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f3041a = (Uri) i0Var.f3019c;
        this.f3042b = (String) i0Var.d;
        this.f3043c = (String) i0Var.e;
        this.d = i0Var.f3017a;
        this.e = i0Var.f3018b;
        this.f3044f = (String) i0Var.f3020f;
        this.f3045g = (String) i0Var.f3021g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3041a.equals(j0Var.f3041a) && Objects.equals(this.f3042b, j0Var.f3042b) && Objects.equals(this.f3043c, j0Var.f3043c) && this.d == j0Var.d && this.e == j0Var.e && Objects.equals(this.f3044f, j0Var.f3044f) && Objects.equals(this.f3045g, j0Var.f3045g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3041a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3042b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3043c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3044f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3045g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
