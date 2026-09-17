package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f2085i;
    public static final String f2086j;
    public static final String f2087k;
    public static final String f2088l;
    public static final String f2089m;
    public static final String f2090n;
    public final Uri f2091a;
    public final String f2092b;
    public final String f2093c;
    public final int d;
    public final int f2094e;
    public final String f2095f;
    public final String f2096g;

    static {
        String str = e2.d0.f8737a;
        h = Integer.toString(0, 36);
        f2085i = Integer.toString(1, 36);
        f2086j = Integer.toString(2, 36);
        f2087k = Integer.toString(3, 36);
        f2088l = Integer.toString(4, 36);
        f2089m = Integer.toString(5, 36);
        f2090n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f2091a = (Uri) i0Var.f2066c;
        this.f2092b = (String) i0Var.d;
        this.f2093c = (String) i0Var.f2067e;
        this.d = i0Var.f2064a;
        this.f2094e = i0Var.f2065b;
        this.f2095f = (String) i0Var.f2068f;
        this.f2096g = (String) i0Var.f2069g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f2091a.equals(j0Var.f2091a) && Objects.equals(this.f2092b, j0Var.f2092b) && Objects.equals(this.f2093c, j0Var.f2093c) && this.d == j0Var.d && this.f2094e == j0Var.f2094e && Objects.equals(this.f2095f, j0Var.f2095f) && Objects.equals(this.f2096g, j0Var.f2096g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f2091a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2092b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f2093c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.f2094e) * 31;
        String str3 = this.f2095f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f2096g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
