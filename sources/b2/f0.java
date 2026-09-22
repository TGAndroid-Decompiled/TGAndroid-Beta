package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f2982i;
    public static final String f2983j;
    public static final String f2984k;
    public static final String f2985l;
    public static final String f2986m;
    public static final String f2987n;
    public static final String f2988o;
    public static final String f2989p;
    public final Uri f2990a;
    public final String f2991b;
    public final c0 f2992c;
    public final x d;
    public final List e;
    public final String f2993f;
    public final e9.i0 f2994g;
    public final long h;

    static {
        String str = e2.d0.f7885a;
        f2982i = Integer.toString(0, 36);
        f2983j = Integer.toString(1, 36);
        f2984k = Integer.toString(2, 36);
        f2985l = Integer.toString(3, 36);
        f2986m = Integer.toString(4, 36);
        f2987n = Integer.toString(5, 36);
        f2988o = Integer.toString(6, 36);
        f2989p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f2990a = uri;
        this.f2991b = r0.n(str);
        this.f2992c = c0Var;
        this.d = xVar;
        this.e = list;
        this.f2993f = str2;
        this.f2994g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f3019c = j0Var.f3041a;
            obj.d = j0Var.f3042b;
            obj.e = j0Var.f3043c;
            obj.f3017a = j0Var.d;
            obj.f3018b = j0Var.e;
            obj.f3020f = j0Var.f3044f;
            obj.f3021g = j0Var.f3045g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f2990a.equals(f0Var.f2990a) && Objects.equals(this.f2991b, f0Var.f2991b) && Objects.equals(this.f2992c, f0Var.f2992c) && Objects.equals(this.d, f0Var.d) && this.e.equals(f0Var.e) && Objects.equals(this.f2993f, f0Var.f2993f) && this.f2994g.equals(f0Var.f2994g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f2990a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2991b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f2992c;
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
        String str2 = this.f2993f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f2994g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
