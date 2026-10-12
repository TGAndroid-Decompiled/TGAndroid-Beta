package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class f0 {
    public static final String f3295i;
    public static final String f3296j;
    public static final String f3297k;
    public static final String f3298l;
    public static final String f3299m;
    public static final String f3300n;
    public static final String f3301o;
    public static final String f3302p;
    public final Uri f3303a;
    public final String f3304b;
    public final c0 f3305c;
    public final x d;
    public final List f3306e;
    public final String f3307f;
    public final e9.i0 f3308g;
    public final long h;

    static {
        String str = e2.d0.f8529a;
        f3295i = Integer.toString(0, 36);
        f3296j = Integer.toString(1, 36);
        f3297k = Integer.toString(2, 36);
        f3298l = Integer.toString(3, 36);
        f3299m = Integer.toString(4, 36);
        f3300n = Integer.toString(5, 36);
        f3301o = Integer.toString(6, 36);
        f3302p = Integer.toString(7, 36);
    }

    public f0(Uri uri, String str, c0 c0Var, x xVar, List list, String str2, e9.i0 i0Var, long j3) {
        this.f3303a = uri;
        this.f3304b = r0.n(str);
        this.f3305c = c0Var;
        this.d = xVar;
        this.f3306e = list;
        this.f3307f = str2;
        this.f3308g = i0Var;
        e9.f0 u10 = e9.i0.u();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j0 j0Var = (j0) i0Var.get(i10);
            ?? obj = new Object();
            obj.f3337c = j0Var.f3362a;
            obj.d = j0Var.f3363b;
            obj.f3338e = j0Var.f3364c;
            obj.f3335a = j0Var.d;
            obj.f3336b = j0Var.f3365e;
            obj.f3339f = j0Var.f3366f;
            obj.f3340g = j0Var.f3367g;
            u10.b(new j0(obj));
        }
        u10.i();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (this.f3303a.equals(f0Var.f3303a) && Objects.equals(this.f3304b, f0Var.f3304b) && Objects.equals(this.f3305c, f0Var.f3305c) && Objects.equals(this.d, f0Var.d) && this.f3306e.equals(f0Var.f3306e) && Objects.equals(this.f3307f, f0Var.f3307f) && this.f3308g.equals(f0Var.f3308g) && this.h == f0Var.h) {
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
        int hashCode4 = this.f3303a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3304b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        c0 c0Var = this.f3305c;
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
        int hashCode5 = (this.f3306e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f3307f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f3308g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
