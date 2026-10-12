package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class k0 {
    public static final String f2180i;
    public static final String f2181j;
    public static final String f2182k;
    public static final String f2183l;
    public static final String f2184m;
    public static final String f2185n;
    public static final String f2186o;
    public static final String f2187p;
    public final Uri f2188a;
    public final String f2189b;
    public final h0 f2190c;
    public final c0 d;
    public final List e;
    public final String f2191f;
    public final e9.n0 f2192g;
    public final long h;

    static {
        String str = e2.m0.f8372a;
        f2180i = Integer.toString(0, 36);
        f2181j = Integer.toString(1, 36);
        f2182k = Integer.toString(2, 36);
        f2183l = Integer.toString(3, 36);
        f2184m = Integer.toString(4, 36);
        f2185n = Integer.toString(5, 36);
        f2186o = Integer.toString(6, 36);
        f2187p = Integer.toString(7, 36);
    }

    public k0(Uri uri, String str, h0 h0Var, c0 c0Var, List list, String str2, e9.n0 n0Var, long j10) {
        this.f2188a = uri;
        this.f2189b = w0.n(str);
        this.f2190c = h0Var;
        this.d = c0Var;
        this.e = list;
        this.f2191f = str2;
        this.f2192g = n0Var;
        e9.k0 t10 = e9.n0.t();
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            o0 o0Var = (o0) n0Var.get(i10);
            ?? obj = new Object();
            obj.f2222c = o0Var.f2244a;
            obj.d = o0Var.f2245b;
            obj.e = o0Var.f2246c;
            obj.f2220a = o0Var.d;
            obj.f2221b = o0Var.e;
            obj.f2223f = o0Var.f2247f;
            obj.f2224g = o0Var.f2248g;
            t10.c(new o0(obj));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (this.f2188a.equals(k0Var.f2188a) && Objects.equals(this.f2189b, k0Var.f2189b) && Objects.equals(this.f2190c, k0Var.f2190c) && Objects.equals(this.d, k0Var.d) && this.e.equals(k0Var.e) && Objects.equals(this.f2191f, k0Var.f2191f) && this.f2192g.equals(k0Var.f2192g) && this.h == k0Var.h) {
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
        int hashCode4 = this.f2188a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2189b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        h0 h0Var = this.f2190c;
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
        String str2 = this.f2191f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f2192g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
