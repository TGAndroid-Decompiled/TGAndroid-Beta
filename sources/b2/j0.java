package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f2112i;
    public static final String f2113j;
    public static final String f2114k;
    public static final String f2115l;
    public static final String f2116m;
    public static final String f2117n;
    public final Uri f2118a;
    public final String f2119b;
    public final String f2120c;
    public final int d;
    public final int f2121e;
    public final String f2122f;
    public final String f2123g;

    static {
        String str = e2.d0.f8765a;
        h = Integer.toString(0, 36);
        f2112i = Integer.toString(1, 36);
        f2113j = Integer.toString(2, 36);
        f2114k = Integer.toString(3, 36);
        f2115l = Integer.toString(4, 36);
        f2116m = Integer.toString(5, 36);
        f2117n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f2118a = (Uri) i0Var.f2093c;
        this.f2119b = (String) i0Var.d;
        this.f2120c = (String) i0Var.f2094e;
        this.d = i0Var.f2091a;
        this.f2121e = i0Var.f2092b;
        this.f2122f = (String) i0Var.f2095f;
        this.f2123g = (String) i0Var.f2096g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f2118a.equals(j0Var.f2118a) && Objects.equals(this.f2119b, j0Var.f2119b) && Objects.equals(this.f2120c, j0Var.f2120c) && this.d == j0Var.d && this.f2121e == j0Var.f2121e && Objects.equals(this.f2122f, j0Var.f2122f) && Objects.equals(this.f2123g, j0Var.f2123g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f2118a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2119b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f2120c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.f2121e) * 31;
        String str3 = this.f2122f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f2123g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
