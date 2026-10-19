package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class j0 {
    public static final String f3789i;
    public static final String f3790j;
    public static final String f3791k;
    public static final String f3792l;
    public static final String f3793m;
    public static final String f3794n;
    public static final String f3795o;
    public static final String f3796p;
    public final Uri f3797a;
    public final String f3798b;
    public final g0 f3799c;
    public final b0 d;
    public final List e;
    public final String f3800f;
    public final e9.n0 f3801g;
    public final long h;

    static {
        String str = e2.m0.f8252a;
        f3789i = Integer.toString(0, 36);
        f3790j = Integer.toString(1, 36);
        f3791k = Integer.toString(2, 36);
        f3792l = Integer.toString(3, 36);
        f3793m = Integer.toString(4, 36);
        f3794n = Integer.toString(5, 36);
        f3795o = Integer.toString(6, 36);
        f3796p = Integer.toString(7, 36);
    }

    public j0(Uri uri, String str, g0 g0Var, b0 b0Var, List list, String str2, e9.n0 n0Var, long j10) {
        this.f3797a = uri;
        this.f3798b = v0.n(str);
        this.f3799c = g0Var;
        this.d = b0Var;
        this.e = list;
        this.f3800f = str2;
        this.f3801g = n0Var;
        e9.k0 t10 = e9.n0.t();
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            n0 n0Var2 = (n0) n0Var.get(i10);
            ?? obj = new Object();
            obj.f3831c = n0Var2.f3853a;
            obj.d = n0Var2.f3854b;
            obj.e = n0Var2.f3855c;
            obj.f3829a = n0Var2.d;
            obj.f3830b = n0Var2.e;
            obj.f3832f = n0Var2.f3856f;
            obj.f3833g = n0Var2.f3857g;
            t10.c(new n0(obj));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                if (this.f3797a.equals(j0Var.f3797a) && Objects.equals(this.f3798b, j0Var.f3798b) && Objects.equals(this.f3799c, j0Var.f3799c) && Objects.equals(this.d, j0Var.d) && this.e.equals(j0Var.e) && Objects.equals(this.f3800f, j0Var.f3800f) && this.f3801g.equals(j0Var.f3801g) && this.h == j0Var.h) {
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
        int hashCode4 = this.f3797a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3798b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        g0 g0Var = this.f3799c;
        if (g0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = g0Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        b0 b0Var = this.d;
        if (b0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = b0Var.hashCode();
        }
        int hashCode5 = (this.e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
        String str2 = this.f3800f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f3801g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
