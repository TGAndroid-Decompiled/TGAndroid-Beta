package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class j0 {
    public static final String f3796i;
    public static final String f3797j;
    public static final String f3798k;
    public static final String f3799l;
    public static final String f3800m;
    public static final String f3801n;
    public static final String f3802o;
    public static final String f3803p;
    public final Uri f3804a;
    public final String f3805b;
    public final g0 f3806c;
    public final b0 d;
    public final List e;
    public final String f3807f;
    public final e9.n0 f3808g;
    public final long h;

    static {
        String str = e2.m0.f8259a;
        f3796i = Integer.toString(0, 36);
        f3797j = Integer.toString(1, 36);
        f3798k = Integer.toString(2, 36);
        f3799l = Integer.toString(3, 36);
        f3800m = Integer.toString(4, 36);
        f3801n = Integer.toString(5, 36);
        f3802o = Integer.toString(6, 36);
        f3803p = Integer.toString(7, 36);
    }

    public j0(Uri uri, String str, g0 g0Var, b0 b0Var, List list, String str2, e9.n0 n0Var, long j10) {
        this.f3804a = uri;
        this.f3805b = v0.n(str);
        this.f3806c = g0Var;
        this.d = b0Var;
        this.e = list;
        this.f3807f = str2;
        this.f3808g = n0Var;
        e9.k0 t10 = e9.n0.t();
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            n0 n0Var2 = (n0) n0Var.get(i10);
            ?? obj = new Object();
            obj.f3838c = n0Var2.f3860a;
            obj.d = n0Var2.f3861b;
            obj.e = n0Var2.f3862c;
            obj.f3836a = n0Var2.d;
            obj.f3837b = n0Var2.e;
            obj.f3839f = n0Var2.f3863f;
            obj.f3840g = n0Var2.f3864g;
            t10.c(new n0(obj));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                if (this.f3804a.equals(j0Var.f3804a) && Objects.equals(this.f3805b, j0Var.f3805b) && Objects.equals(this.f3806c, j0Var.f3806c) && Objects.equals(this.d, j0Var.d) && this.e.equals(j0Var.e) && Objects.equals(this.f3807f, j0Var.f3807f) && this.f3808g.equals(j0Var.f3808g) && this.h == j0Var.h) {
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
        int hashCode4 = this.f3804a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3805b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        g0 g0Var = this.f3806c;
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
        String str2 = this.f3807f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f3808g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
