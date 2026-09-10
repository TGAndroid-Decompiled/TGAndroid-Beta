package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f1678i;
    public static final String f1679j;
    public static final String f1680k;
    public static final String f1681l;
    public static final String f1682m;
    public static final String f1683n;
    public static final String f1684o;
    public static final String f1685p;
    public final Uri f1686a;
    public final String f1687b;
    public final c0 f1688c;
    public final x d;
    public final List e;
    public final String f1689f;
    public final e9.i0 f1690g;
    public final long h;

    static {
        String str = e2.d0.f7188a;
        f1678i = Integer.toString(0, 36);
        f1679j = Integer.toString(1, 36);
        f1680k = Integer.toString(2, 36);
        f1681l = Integer.toString(3, 36);
        f1682m = Integer.toString(4, 36);
        f1683n = Integer.toString(5, 36);
        f1684o = Integer.toString(6, 36);
        f1685p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f1686a = uri;
        this.f1687b = r0.n(str);
        this.f1688c = c0Var;
        this.d = xVar;
        this.e = list;
        this.f1689f = str2;
        this.f1690g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f1715c = j0Var.f1737a;
            obj.d = j0Var.f1738b;
            obj.e = j0Var.f1739c;
            obj.f1713a = j0Var.d;
            obj.f1714b = j0Var.e;
            obj.f1716f = j0Var.f1740f;
            obj.f1717g = j0Var.f1741g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f1686a.equals(f0Var.f1686a) && Objects.equals(this.f1687b, f0Var.f1687b) && Objects.equals(this.f1688c, f0Var.f1688c) && Objects.equals(this.d, f0Var.d) && this.e.equals(f0Var.e) && Objects.equals(this.f1689f, f0Var.f1689f) && this.f1690g.equals(f0Var.f1690g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f1686a.hashCode() * 31;
        int i10 = 0;
        String str = this.f1687b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f1688c;
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
        int hashCode5 = (this.e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f1689f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f1690g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
