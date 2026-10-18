package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class j0 {
    public static final String f3793i;
    public static final String f3794j;
    public static final String f3795k;
    public static final String f3796l;
    public static final String f3797m;
    public static final String f3798n;
    public static final String f3799o;
    public static final String f3800p;
    public final Uri f3801a;
    public final String f3802b;
    public final g0 f3803c;
    public final b0 d;
    public final List e;
    public final String f3804f;
    public final e9.n0 f3805g;
    public final long h;

    static {
        String str = e2.m0.f8255a;
        f3793i = Integer.toString(0, 36);
        f3794j = Integer.toString(1, 36);
        f3795k = Integer.toString(2, 36);
        f3796l = Integer.toString(3, 36);
        f3797m = Integer.toString(4, 36);
        f3798n = Integer.toString(5, 36);
        f3799o = Integer.toString(6, 36);
        f3800p = Integer.toString(7, 36);
    }

    public j0(Uri uri, String str, g0 g0Var, b0 b0Var, List list, String str2, e9.n0 n0Var, long j10) {
        this.f3801a = uri;
        this.f3802b = v0.n(str);
        this.f3803c = g0Var;
        this.d = b0Var;
        this.e = list;
        this.f3804f = str2;
        this.f3805g = n0Var;
        e9.k0 t10 = e9.n0.t();
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            n0 n0Var2 = (n0) n0Var.get(i10);
            ?? obj = new Object();
            obj.f3835c = n0Var2.f3857a;
            obj.d = n0Var2.f3858b;
            obj.e = n0Var2.f3859c;
            obj.f3833a = n0Var2.d;
            obj.f3834b = n0Var2.e;
            obj.f3836f = n0Var2.f3860f;
            obj.f3837g = n0Var2.f3861g;
            t10.c(new n0(obj));
        }
        t10.f();
        this.h = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                if (this.f3801a.equals(j0Var.f3801a) && Objects.equals(this.f3802b, j0Var.f3802b) && Objects.equals(this.f3803c, j0Var.f3803c) && Objects.equals(this.d, j0Var.d) && this.e.equals(j0Var.e) && Objects.equals(this.f3804f, j0Var.f3804f) && this.f3805g.equals(j0Var.f3805g) && this.h == j0Var.h) {
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
        int hashCode4 = this.f3801a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3802b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        g0 g0Var = this.f3803c;
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
        String str2 = this.f3804f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (int) (((this.f3805g.hashCode() + ((hashCode5 + i10) * 31)) * 31 * 31) + this.h);
    }
}
