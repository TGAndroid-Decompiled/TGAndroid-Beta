package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f3033i;
    public static final String f3034j;
    public static final String f3035k;
    public static final String f3036l;
    public static final String f3037m;
    public static final String f3038n;
    public final Uri f3039a;
    public final String f3040b;
    public final String f3041c;
    public final int d;
    public final int e;
    public final String f3042f;
    public final String f3043g;

    static {
        String str = e2.d0.f7883a;
        h = Integer.toString(0, 36);
        f3033i = Integer.toString(1, 36);
        f3034j = Integer.toString(2, 36);
        f3035k = Integer.toString(3, 36);
        f3036l = Integer.toString(4, 36);
        f3037m = Integer.toString(5, 36);
        f3038n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f3039a = (Uri) i0Var.f3017c;
        this.f3040b = (String) i0Var.d;
        this.f3041c = (String) i0Var.e;
        this.d = i0Var.f3015a;
        this.e = i0Var.f3016b;
        this.f3042f = (String) i0Var.f3018f;
        this.f3043g = (String) i0Var.f3019g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3039a.equals(j0Var.f3039a) && Objects.equals(this.f3040b, j0Var.f3040b) && Objects.equals(this.f3041c, j0Var.f3041c) && this.d == j0Var.d && this.e == j0Var.e && Objects.equals(this.f3042f, j0Var.f3042f) && Objects.equals(this.f3043g, j0Var.f3043g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3039a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3040b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3041c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3042f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3043g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
