package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f2984i;
    public static final String f2985j;
    public static final String f2986k;
    public static final String f2987l;
    public static final String f2988m;
    public static final String f2989n;
    public static final String f2990o;
    public static final String f2991p;
    public final Uri f2992a;
    public final String f2993b;
    public final c0 f2994c;
    public final x d;
    public final List e;
    public final String f2995f;
    public final e9.i0 f2996g;
    public final long h;

    static {
        String str = e2.d0.f7887a;
        f2984i = Integer.toString(0, 36);
        f2985j = Integer.toString(1, 36);
        f2986k = Integer.toString(2, 36);
        f2987l = Integer.toString(3, 36);
        f2988m = Integer.toString(4, 36);
        f2989n = Integer.toString(5, 36);
        f2990o = Integer.toString(6, 36);
        f2991p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f2992a = uri;
        this.f2993b = r0.n(str);
        this.f2994c = c0Var;
        this.d = xVar;
        this.e = list;
        this.f2995f = str2;
        this.f2996g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f3021c = j0Var.f3043a;
            obj.d = j0Var.f3044b;
            obj.e = j0Var.f3045c;
            obj.f3019a = j0Var.d;
            obj.f3020b = j0Var.e;
            obj.f3022f = j0Var.f3046f;
            obj.f3023g = j0Var.f3047g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f2992a.equals(f0Var.f2992a) && Objects.equals(this.f2993b, f0Var.f2993b) && Objects.equals(this.f2994c, f0Var.f2994c) && Objects.equals(this.d, f0Var.d) && this.e.equals(f0Var.e) && Objects.equals(this.f2995f, f0Var.f2995f) && this.f2996g.equals(f0Var.f2996g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f2992a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2993b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f2994c;
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
        String str2 = this.f2995f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f2996g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
