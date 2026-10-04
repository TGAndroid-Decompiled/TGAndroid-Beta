package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f3218i;
    public static final String f3219j;
    public static final String f3220k;
    public static final String f3221l;
    public static final String f3222m;
    public static final String f3223n;
    public static final String f3224o;
    public static final String f3225p;
    public final Uri f3226a;
    public final String f3227b;
    public final c0 f3228c;
    public final x d;
    public final List f3229e;
    public final String f3230f;
    public final e9.i0 f3231g;
    public final long h;

    static {
        String str = e2.d0.f8537a;
        f3218i = Integer.toString(0, 36);
        f3219j = Integer.toString(1, 36);
        f3220k = Integer.toString(2, 36);
        f3221l = Integer.toString(3, 36);
        f3222m = Integer.toString(4, 36);
        f3223n = Integer.toString(5, 36);
        f3224o = Integer.toString(6, 36);
        f3225p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f3226a = uri;
        this.f3227b = r0.n(str);
        this.f3228c = c0Var;
        this.d = xVar;
        this.f3229e = list;
        this.f3230f = str2;
        this.f3231g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f3260c = j0Var.f3285a;
            obj.d = j0Var.f3286b;
            obj.f3261e = j0Var.f3287c;
            obj.f3258a = j0Var.d;
            obj.f3259b = j0Var.f3288e;
            obj.f3262f = j0Var.f3289f;
            obj.f3263g = j0Var.f3290g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f3226a.equals(f0Var.f3226a) && Objects.equals(this.f3227b, f0Var.f3227b) && Objects.equals(this.f3228c, f0Var.f3228c) && Objects.equals(this.d, f0Var.d) && this.f3229e.equals(f0Var.f3229e) && Objects.equals(this.f3230f, f0Var.f3230f) && this.f3231g.equals(f0Var.f3231g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f3226a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3227b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f3228c;
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
        int hashCode5 = (this.f3229e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f3230f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f3231g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
