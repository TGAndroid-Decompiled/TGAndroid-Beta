package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f2051i;
    public static final String f2052j;
    public static final String f2053k;
    public static final String f2054l;
    public static final String f2055m;
    public static final String f2056n;
    public static final String f2057o;
    public static final String f2058p;
    public final Uri f2059a;
    public final String f2060b;
    public final c0 f2061c;
    public final x d;
    public final List f2062e;
    public final String f2063f;
    public final e9.i0 f2064g;
    public final long h;

    static {
        String str = e2.d0.f8765a;
        f2051i = Integer.toString(0, 36);
        f2052j = Integer.toString(1, 36);
        f2053k = Integer.toString(2, 36);
        f2054l = Integer.toString(3, 36);
        f2055m = Integer.toString(4, 36);
        f2056n = Integer.toString(5, 36);
        f2057o = Integer.toString(6, 36);
        f2058p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f2059a = uri;
        this.f2060b = r0.n(str);
        this.f2061c = c0Var;
        this.d = xVar;
        this.f2062e = list;
        this.f2063f = str2;
        this.f2064g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f2093c = j0Var.f2118a;
            obj.d = j0Var.f2119b;
            obj.f2094e = j0Var.f2120c;
            obj.f2091a = j0Var.d;
            obj.f2092b = j0Var.f2121e;
            obj.f2095f = j0Var.f2122f;
            obj.f2096g = j0Var.f2123g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f2059a.equals(f0Var.f2059a) && Objects.equals(this.f2060b, f0Var.f2060b) && Objects.equals(this.f2061c, f0Var.f2061c) && Objects.equals(this.d, f0Var.d) && this.f2062e.equals(f0Var.f2062e) && Objects.equals(this.f2063f, f0Var.f2063f) && this.f2064g.equals(f0Var.f2064g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f2059a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2060b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f2061c;
        if (c0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        x xVar = this.d;
        if (xVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = xVar.hashCode();
        }
        int hashCode5 = (this.f2062e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f2063f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f2064g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
