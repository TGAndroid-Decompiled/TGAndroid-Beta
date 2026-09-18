package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f3038i;
    public static final String f3039j;
    public static final String f3040k;
    public static final String f3041l;
    public static final String f3042m;
    public static final String f3043n;
    public final Uri f3044a;
    public final String f3045b;
    public final String f3046c;
    public final int d;
    public final int e;
    public final String f3047f;
    public final String f3048g;

    static {
        String str = e2.d0.f7887a;
        h = Integer.toString(0, 36);
        f3038i = Integer.toString(1, 36);
        f3039j = Integer.toString(2, 36);
        f3040k = Integer.toString(3, 36);
        f3041l = Integer.toString(4, 36);
        f3042m = Integer.toString(5, 36);
        f3043n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f3044a = (Uri) i0Var.f3022c;
        this.f3045b = (String) i0Var.d;
        this.f3046c = (String) i0Var.e;
        this.d = i0Var.f3020a;
        this.e = i0Var.f3021b;
        this.f3047f = (String) i0Var.f3023f;
        this.f3048g = (String) i0Var.f3024g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3044a.equals(j0Var.f3044a) && Objects.equals(this.f3045b, j0Var.f3045b) && Objects.equals(this.f3046c, j0Var.f3046c) && this.d == j0Var.d && this.e == j0Var.e && Objects.equals(this.f3047f, j0Var.f3047f) && Objects.equals(this.f3048g, j0Var.f3048g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3044a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3045b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3046c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3047f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3048g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
