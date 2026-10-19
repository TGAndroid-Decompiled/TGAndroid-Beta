package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class j0 {
    public static final String f3791i;
    public static final String f3792j;
    public static final String f3793k;
    public static final String f3794l;
    public static final String f3795m;
    public static final String f3796n;
    public static final String f3797o;
    public static final String f3798p;
    public final Uri f3799a;
    public final String f3800b;
    public final g0 f3801c;
    public final b0 d;
    public final List e;
    public final String f3802f;
    public final e9.n0 f3803g;
    public final long h;

    static {
        String str = e2.m0.f8254a;
        f3791i = Integer.toString(0, 36);
        f3792j = Integer.toString(1, 36);
        f3793k = Integer.toString(2, 36);
        f3794l = Integer.toString(3, 36);
        f3795m = Integer.toString(4, 36);
        f3796n = Integer.toString(5, 36);
        f3797o = Integer.toString(6, 36);
        f3798p = Integer.toString(7, 36);
    }

    public j0(Uri uri, String str, g0 g0Var, b0 b0Var, List list, String str2, e9.n0 n0Var, long j10) {
        this.f3799a = uri;
        this.f3800b = v0.n(str);
        this.f3801c = g0Var;
        this.d = b0Var;
        this.e = list;
        this.f3802f = str2;
        this.f3803g = n0Var;
        e9.k0 t10 = e9.n0.t();
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            n0 n0Var2 = (n0) n0Var.get(i10);
            ?? obj = new Object();
            obj.f3833c = n0Var2.f3855a;
            obj.d = n0Var2.f3856b;
            obj.e = n0Var2.f3857c;
            obj.f3831a = n0Var2.d;
            obj.f3832b = n0Var2.e;
            obj.f3834f = n0Var2.f3858f;
            obj.f3835g = n0Var2.f3859g;
            t10.c(new n0(obj));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                if (this.f3799a.equals(j0Var.f3799a) && Objects.equals(this.f3800b, j0Var.f3800b) && Objects.equals(this.f3801c, j0Var.f3801c) && Objects.equals(this.d, j0Var.d) && this.e.equals(j0Var.e) && Objects.equals(this.f3802f, j0Var.f3802f) && this.f3803g.equals(j0Var.f3803g) && this.h == j0Var.h) {
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
        int hashCode4 = this.f3799a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3800b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        g0 g0Var = this.f3801c;
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
        String str2 = this.f3802f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f3803g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
