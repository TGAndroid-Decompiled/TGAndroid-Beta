package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f2024i;
    public static final String f2025j;
    public static final String f2026k;
    public static final String f2027l;
    public static final String f2028m;
    public static final String f2029n;
    public static final String f2030o;
    public static final String f2031p;
    public final Uri f2032a;
    public final String f2033b;
    public final c0 f2034c;
    public final x d;
    public final List f2035e;
    public final String f2036f;
    public final e9.i0 f2037g;
    public final long h;

    static {
        String str = e2.d0.f8737a;
        f2024i = Integer.toString(0, 36);
        f2025j = Integer.toString(1, 36);
        f2026k = Integer.toString(2, 36);
        f2027l = Integer.toString(3, 36);
        f2028m = Integer.toString(4, 36);
        f2029n = Integer.toString(5, 36);
        f2030o = Integer.toString(6, 36);
        f2031p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f2032a = uri;
        this.f2033b = r0.n(str);
        this.f2034c = c0Var;
        this.d = xVar;
        this.f2035e = list;
        this.f2036f = str2;
        this.f2037g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f2066c = j0Var.f2091a;
            obj.d = j0Var.f2092b;
            obj.f2067e = j0Var.f2093c;
            obj.f2064a = j0Var.d;
            obj.f2065b = j0Var.f2094e;
            obj.f2068f = j0Var.f2095f;
            obj.f2069g = j0Var.f2096g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f2032a.equals(f0Var.f2032a) && Objects.equals(this.f2033b, f0Var.f2033b) && Objects.equals(this.f2034c, f0Var.f2034c) && Objects.equals(this.d, f0Var.d) && this.f2035e.equals(f0Var.f2035e) && Objects.equals(this.f2036f, f0Var.f2036f) && this.f2037g.equals(f0Var.f2037g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f2032a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2033b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f2034c;
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
        int hashCode5 = (this.f2035e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f2036f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f2037g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
