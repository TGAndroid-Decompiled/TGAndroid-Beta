package b2;

import android.net.Uri;
import j$.util.Objects;
public class o0 {
    public static final String h;
    public static final String f2242i;
    public static final String f2243j;
    public static final String f2244k;
    public static final String f2245l;
    public static final String f2246m;
    public static final String f2247n;
    public final Uri f2248a;
    public final String f2249b;
    public final String f2250c;
    public final int d;
    public final int e;
    public final String f2251f;
    public final String f2252g;

    static {
        String str = e2.m0.f8375a;
        h = Integer.toString(0, 36);
        f2242i = Integer.toString(1, 36);
        f2243j = Integer.toString(2, 36);
        f2244k = Integer.toString(3, 36);
        f2245l = Integer.toString(4, 36);
        f2246m = Integer.toString(5, 36);
        f2247n = Integer.toString(6, 36);
    }

    public o0(n0 n0Var) {
        this.f2248a = (Uri) n0Var.f2226c;
        this.f2249b = (String) n0Var.d;
        this.f2250c = (String) n0Var.e;
        this.d = n0Var.f2224a;
        this.e = n0Var.f2225b;
        this.f2251f = (String) n0Var.f2227f;
        this.f2252g = (String) n0Var.f2228g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f2248a.equals(o0Var.f2248a) && Objects.equals(this.f2249b, o0Var.f2249b) && Objects.equals(this.f2250c, o0Var.f2250c) && this.d == o0Var.d && this.e == o0Var.e && Objects.equals(this.f2251f, o0Var.f2251f) && Objects.equals(this.f2252g, o0Var.f2252g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f2248a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2249b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f2250c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f2251f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f2252g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
