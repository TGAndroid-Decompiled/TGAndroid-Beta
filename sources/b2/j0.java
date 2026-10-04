package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f3279i;
    public static final String f3280j;
    public static final String f3281k;
    public static final String f3282l;
    public static final String f3283m;
    public static final String f3284n;
    public final Uri f3285a;
    public final String f3286b;
    public final String f3287c;
    public final int d;
    public final int f3288e;
    public final String f3289f;
    public final String f3290g;

    static {
        String str = e2.d0.f8537a;
        h = Integer.toString(0, 36);
        f3279i = Integer.toString(1, 36);
        f3280j = Integer.toString(2, 36);
        f3281k = Integer.toString(3, 36);
        f3282l = Integer.toString(4, 36);
        f3283m = Integer.toString(5, 36);
        f3284n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f3285a = (Uri) i0Var.f3260c;
        this.f3286b = (String) i0Var.d;
        this.f3287c = (String) i0Var.f3261e;
        this.d = i0Var.f3258a;
        this.f3288e = i0Var.f3259b;
        this.f3289f = (String) i0Var.f3262f;
        this.f3290g = (String) i0Var.f3263g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3285a.equals(j0Var.f3285a) && Objects.equals(this.f3286b, j0Var.f3286b) && Objects.equals(this.f3287c, j0Var.f3287c) && this.d == j0Var.d && this.f3288e == j0Var.f3288e && Objects.equals(this.f3289f, j0Var.f3289f) && Objects.equals(this.f3290g, j0Var.f3290g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3285a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3286b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3287c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.f3288e) * 31;
        String str3 = this.f3289f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3290g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
