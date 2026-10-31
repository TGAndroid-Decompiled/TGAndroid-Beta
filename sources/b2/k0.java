package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class k0 {
    public static final String f2083i;
    public static final String f2084j;
    public static final String f2085k;
    public static final String f2086l;
    public static final String f2087m;
    public static final String f2088n;
    public static final String f2089o;
    public static final String f2090p;
    public final Uri f2091a;
    public final String f2092b;
    public final h0 f2093c;
    public final c0 d;
    public final List e;
    public final String f2094f;
    public final e9.n0 f2095g;
    public final long h;

    static {
        String str = e2.l0.f6165a;
        f2083i = Integer.toString(0, 36);
        f2084j = Integer.toString(1, 36);
        f2085k = Integer.toString(2, 36);
        f2086l = Integer.toString(3, 36);
        f2087m = Integer.toString(4, 36);
        f2088n = Integer.toString(5, 36);
        f2089o = Integer.toString(6, 36);
        f2090p = Integer.toString(7, 36);
    }

    public k0(Uri uri, String str, h0 h0Var, c0 c0Var, List list, String str2, e9.n0 n0Var, long j10) {
        this.f2091a = uri;
        this.f2092b = v0.n(str);
        this.f2093c = h0Var;
        this.d = c0Var;
        this.e = list;
        this.f2094f = str2;
        this.f2095g = n0Var;
        e9.k0 t10 = e9.n0.t();
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            o0 o0Var = (o0) n0Var.get(i10);
            ?? obj = new Object();
            obj.f2125c = o0Var.f2167a;
            obj.d = o0Var.f2168b;
            obj.e = o0Var.f2169c;
            obj.f2123a = o0Var.d;
            obj.f2124b = o0Var.e;
            obj.f2126f = o0Var.f2170f;
            obj.f2127g = o0Var.f2171g;
            t10.c(new o0(obj));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (this.f2091a.equals(k0Var.f2091a) && Objects.equals(this.f2092b, k0Var.f2092b) && Objects.equals(this.f2093c, k0Var.f2093c) && Objects.equals(this.d, k0Var.d) && this.e.equals(k0Var.e) && Objects.equals(this.f2094f, k0Var.f2094f) && this.f2095g.equals(k0Var.f2095g) && this.h == k0Var.h) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
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
        h0 h0Var = this.f2093c;
        if (h0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = h0Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        c0 c0Var = this.d;
        if (c0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c0Var.hashCode();
        }
        int hashCode5 = (this.e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f2094f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f2095g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
