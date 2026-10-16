package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class k0 {
    public static final String f2184i;
    public static final String f2185j;
    public static final String f2186k;
    public static final String f2187l;
    public static final String f2188m;
    public static final String f2189n;
    public static final String f2190o;
    public static final String f2191p;
    public final Uri f2192a;
    public final String f2193b;
    public final h0 f2194c;
    public final c0 d;
    public final List e;
    public final String f2195f;
    public final e9.n0 f2196g;
    public final long h;

    static {
        String str = e2.m0.f8375a;
        f2184i = Integer.toString(0, 36);
        f2185j = Integer.toString(1, 36);
        f2186k = Integer.toString(2, 36);
        f2187l = Integer.toString(3, 36);
        f2188m = Integer.toString(4, 36);
        f2189n = Integer.toString(5, 36);
        f2190o = Integer.toString(6, 36);
        f2191p = Integer.toString(7, 36);
    }

    public k0(Uri uri, String str, h0 h0Var, c0 c0Var, List list, String str2, e9.n0 n0Var, long j10) {
        this.f2192a = uri;
        this.f2193b = w0.n(str);
        this.f2194c = h0Var;
        this.d = c0Var;
        this.e = list;
        this.f2195f = str2;
        this.f2196g = n0Var;
        e9.k0 t10 = e9.n0.t();
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            o0 o0Var = (o0) n0Var.get(i10);
            ?? obj = new Object();
            obj.f2226c = o0Var.f2248a;
            obj.d = o0Var.f2249b;
            obj.e = o0Var.f2250c;
            obj.f2224a = o0Var.d;
            obj.f2225b = o0Var.e;
            obj.f2227f = o0Var.f2251f;
            obj.f2228g = o0Var.f2252g;
            t10.c(new o0(obj));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (this.f2192a.equals(k0Var.f2192a) && Objects.equals(this.f2193b, k0Var.f2193b) && Objects.equals(this.f2194c, k0Var.f2194c) && Objects.equals(this.d, k0Var.d) && this.e.equals(k0Var.e) && Objects.equals(this.f2195f, k0Var.f2195f) && this.f2196g.equals(k0Var.f2196g) && this.h == k0Var.h) {
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
        int hashCode4 = this.f2192a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2193b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        h0 h0Var = this.f2194c;
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
        String str2 = this.f2195f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f2196g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
