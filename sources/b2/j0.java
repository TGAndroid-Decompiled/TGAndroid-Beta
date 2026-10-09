package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f3358i;
    public static final String f3359j;
    public static final String f3360k;
    public static final String f3361l;
    public static final String f3362m;
    public static final String f3363n;
    public final Uri f3364a;
    public final String f3365b;
    public final String f3366c;
    public final int d;
    public final int f3367e;
    public final String f3368f;
    public final String f3369g;

    static {
        String str = e2.d0.f8532a;
        h = Integer.toString(0, 36);
        f3358i = Integer.toString(1, 36);
        f3359j = Integer.toString(2, 36);
        f3360k = Integer.toString(3, 36);
        f3361l = Integer.toString(4, 36);
        f3362m = Integer.toString(5, 36);
        f3363n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f3364a = (Uri) i0Var.f3339c;
        this.f3365b = (String) i0Var.d;
        this.f3366c = (String) i0Var.f3340e;
        this.d = i0Var.f3337a;
        this.f3367e = i0Var.f3338b;
        this.f3368f = (String) i0Var.f3341f;
        this.f3369g = (String) i0Var.f3342g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3364a.equals(j0Var.f3364a) && Objects.equals(this.f3365b, j0Var.f3365b) && Objects.equals(this.f3366c, j0Var.f3366c) && this.d == j0Var.d && this.f3367e == j0Var.f3367e && Objects.equals(this.f3368f, j0Var.f3368f) && Objects.equals(this.f3369g, j0Var.f3369g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3364a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3365b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3366c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.f3367e) * 31;
        String str3 = this.f3368f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3369g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
