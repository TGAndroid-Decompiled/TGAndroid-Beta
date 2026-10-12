package b2;

import android.net.Uri;
import j$.util.Objects;
public class o0 {
    public static final String h;
    public static final String f2238i;
    public static final String f2239j;
    public static final String f2240k;
    public static final String f2241l;
    public static final String f2242m;
    public static final String f2243n;
    public final Uri f2244a;
    public final String f2245b;
    public final String f2246c;
    public final int d;
    public final int e;
    public final String f2247f;
    public final String f2248g;

    static {
        String str = e2.m0.f8372a;
        h = Integer.toString(0, 36);
        f2238i = Integer.toString(1, 36);
        f2239j = Integer.toString(2, 36);
        f2240k = Integer.toString(3, 36);
        f2241l = Integer.toString(4, 36);
        f2242m = Integer.toString(5, 36);
        f2243n = Integer.toString(6, 36);
    }

    public o0(n0 n0Var) {
        this.f2244a = (Uri) n0Var.f2222c;
        this.f2245b = (String) n0Var.d;
        this.f2246c = (String) n0Var.e;
        this.d = n0Var.f2220a;
        this.e = n0Var.f2221b;
        this.f2247f = (String) n0Var.f2223f;
        this.f2248g = (String) n0Var.f2224g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f2244a.equals(o0Var.f2244a) && Objects.equals(this.f2245b, o0Var.f2245b) && Objects.equals(this.f2246c, o0Var.f2246c) && this.d == o0Var.d && this.e == o0Var.e && Objects.equals(this.f2247f, o0Var.f2247f) && Objects.equals(this.f2248g, o0Var.f2248g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f2244a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2245b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f2246c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f2247f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f2248g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
