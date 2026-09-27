package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f3032i;
    public static final String f3033j;
    public static final String f3034k;
    public static final String f3035l;
    public static final String f3036m;
    public static final String f3037n;
    public final Uri f3038a;
    public final String f3039b;
    public final String f3040c;
    public final int d;
    public final int e;
    public final String f3041f;
    public final String f3042g;

    static {
        String str = e2.d0.f7872a;
        h = Integer.toString(0, 36);
        f3032i = Integer.toString(1, 36);
        f3033j = Integer.toString(2, 36);
        f3034k = Integer.toString(3, 36);
        f3035l = Integer.toString(4, 36);
        f3036m = Integer.toString(5, 36);
        f3037n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f3038a = (Uri) i0Var.f3016c;
        this.f3039b = (String) i0Var.d;
        this.f3040c = (String) i0Var.e;
        this.d = i0Var.f3014a;
        this.e = i0Var.f3015b;
        this.f3041f = (String) i0Var.f3017f;
        this.f3042g = (String) i0Var.f3018g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3038a.equals(j0Var.f3038a) && Objects.equals(this.f3039b, j0Var.f3039b) && Objects.equals(this.f3040c, j0Var.f3040c) && this.d == j0Var.d && this.e == j0Var.e && Objects.equals(this.f3041f, j0Var.f3041f) && Objects.equals(this.f3042g, j0Var.f3042g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3038a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3039b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3040c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3041f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3042g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
