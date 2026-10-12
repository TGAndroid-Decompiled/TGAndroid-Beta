package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f3356i;
    public static final String f3357j;
    public static final String f3358k;
    public static final String f3359l;
    public static final String f3360m;
    public static final String f3361n;
    public final Uri f3362a;
    public final String f3363b;
    public final String f3364c;
    public final int d;
    public final int f3365e;
    public final String f3366f;
    public final String f3367g;

    static {
        String str = e2.d0.f8529a;
        h = Integer.toString(0, 36);
        f3356i = Integer.toString(1, 36);
        f3357j = Integer.toString(2, 36);
        f3358k = Integer.toString(3, 36);
        f3359l = Integer.toString(4, 36);
        f3360m = Integer.toString(5, 36);
        f3361n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f3362a = (Uri) i0Var.f3337c;
        this.f3363b = (String) i0Var.d;
        this.f3364c = (String) i0Var.f3338e;
        this.d = i0Var.f3335a;
        this.f3365e = i0Var.f3336b;
        this.f3366f = (String) i0Var.f3339f;
        this.f3367g = (String) i0Var.f3340g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3362a.equals(j0Var.f3362a) && Objects.equals(this.f3363b, j0Var.f3363b) && Objects.equals(this.f3364c, j0Var.f3364c) && this.d == j0Var.d && this.f3365e == j0Var.f3365e && Objects.equals(this.f3366f, j0Var.f3366f) && Objects.equals(this.f3367g, j0Var.f3367g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3362a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3363b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3364c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.f3365e) * 31;
        String str3 = this.f3366f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3367g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
