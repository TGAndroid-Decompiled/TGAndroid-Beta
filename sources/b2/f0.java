package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f2979i;
    public static final String f2980j;
    public static final String f2981k;
    public static final String f2982l;
    public static final String f2983m;
    public static final String f2984n;
    public static final String f2985o;
    public static final String f2986p;
    public final Uri f2987a;
    public final String f2988b;
    public final c0 f2989c;
    public final x d;
    public final List e;
    public final String f2990f;
    public final e9.i0 f2991g;
    public final long h;

    static {
        String str = e2.d0.f7872a;
        f2979i = Integer.toString(0, 36);
        f2980j = Integer.toString(1, 36);
        f2981k = Integer.toString(2, 36);
        f2982l = Integer.toString(3, 36);
        f2983m = Integer.toString(4, 36);
        f2984n = Integer.toString(5, 36);
        f2985o = Integer.toString(6, 36);
        f2986p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f2987a = uri;
        this.f2988b = r0.n(str);
        this.f2989c = c0Var;
        this.d = xVar;
        this.e = list;
        this.f2990f = str2;
        this.f2991g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f3016c = j0Var.f3038a;
            obj.d = j0Var.f3039b;
            obj.e = j0Var.f3040c;
            obj.f3014a = j0Var.d;
            obj.f3015b = j0Var.e;
            obj.f3017f = j0Var.f3041f;
            obj.f3018g = j0Var.f3042g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f2987a.equals(f0Var.f2987a) && Objects.equals(this.f2988b, f0Var.f2988b) && Objects.equals(this.f2989c, f0Var.f2989c) && Objects.equals(this.d, f0Var.d) && this.e.equals(f0Var.e) && Objects.equals(this.f2990f, f0Var.f2990f) && this.f2991g.equals(f0Var.f2991g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f2987a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2988b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f2989c;
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
        String str2 = this.f2990f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f2991g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
