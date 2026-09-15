package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f2980i;
    public static final String f2981j;
    public static final String f2982k;
    public static final String f2983l;
    public static final String f2984m;
    public static final String f2985n;
    public static final String f2986o;
    public static final String f2987p;
    public final Uri f2988a;
    public final String f2989b;
    public final c0 f2990c;
    public final x d;
    public final List e;
    public final String f2991f;
    public final e9.i0 f2992g;
    public final long h;

    static {
        String str = e2.d0.f7883a;
        f2980i = Integer.toString(0, 36);
        f2981j = Integer.toString(1, 36);
        f2982k = Integer.toString(2, 36);
        f2983l = Integer.toString(3, 36);
        f2984m = Integer.toString(4, 36);
        f2985n = Integer.toString(5, 36);
        f2986o = Integer.toString(6, 36);
        f2987p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f2988a = uri;
        this.f2989b = r0.n(str);
        this.f2990c = c0Var;
        this.d = xVar;
        this.e = list;
        this.f2991f = str2;
        this.f2992g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f3017c = j0Var.f3039a;
            obj.d = j0Var.f3040b;
            obj.e = j0Var.f3041c;
            obj.f3015a = j0Var.d;
            obj.f3016b = j0Var.e;
            obj.f3018f = j0Var.f3042f;
            obj.f3019g = j0Var.f3043g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f2988a.equals(f0Var.f2988a) && Objects.equals(this.f2989b, f0Var.f2989b) && Objects.equals(this.f2990c, f0Var.f2990c) && Objects.equals(this.d, f0Var.d) && this.e.equals(f0Var.e) && Objects.equals(this.f2991f, f0Var.f2991f) && this.f2992g.equals(f0Var.f2992g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f2988a.hashCode() * 31;
        int i10 = 0;
        String str = this.f2989b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f2990c;
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
        String str2 = this.f2991f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f2992g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
