package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f3297i;
    public static final String f3298j;
    public static final String f3299k;
    public static final String f3300l;
    public static final String f3301m;
    public static final String f3302n;
    public static final String f3303o;
    public static final String f3304p;
    public final Uri f3305a;
    public final String f3306b;
    public final c0 f3307c;
    public final x d;
    public final List f3308e;
    public final String f3309f;
    public final e9.i0 f3310g;
    public final long h;

    static {
        String str = e2.d0.f8531a;
        f3297i = Integer.toString(0, 36);
        f3298j = Integer.toString(1, 36);
        f3299k = Integer.toString(2, 36);
        f3300l = Integer.toString(3, 36);
        f3301m = Integer.toString(4, 36);
        f3302n = Integer.toString(5, 36);
        f3303o = Integer.toString(6, 36);
        f3304p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f3305a = uri;
        this.f3306b = r0.n(str);
        this.f3307c = c0Var;
        this.d = xVar;
        this.f3308e = list;
        this.f3309f = str2;
        this.f3310g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f3339c = j0Var.f3364a;
            obj.d = j0Var.f3365b;
            obj.f3340e = j0Var.f3366c;
            obj.f3337a = j0Var.d;
            obj.f3338b = j0Var.f3367e;
            obj.f3341f = j0Var.f3368f;
            obj.f3342g = j0Var.f3369g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f3305a.equals(f0Var.f3305a) && Objects.equals(this.f3306b, f0Var.f3306b) && Objects.equals(this.f3307c, f0Var.f3307c) && Objects.equals(this.d, f0Var.d) && this.f3308e.equals(f0Var.f3308e) && Objects.equals(this.f3309f, f0Var.f3309f) && this.f3310g.equals(f0Var.f3310g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f3305a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3306b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f3307c;
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
        int hashCode5 = (this.f3308e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f3309f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f3310g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
