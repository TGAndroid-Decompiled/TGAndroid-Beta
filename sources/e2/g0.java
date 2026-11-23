package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class g0 {
    public static final String f10434i;
    public static final String f10435j;
    public static final String f10436k;
    public static final String f10437l;
    public static final String f10438m;
    public static final String f10439n;
    public static final String f10440o;
    public static final String f10441p;
    public final Uri f10442a;
    public final String f10443b;
    public final d0 f10444c;
    public final y d;
    public final List f10445e;
    public final String f10446f;
    public final h9.i0 f10447g;
    public final long h;

    static {
        String str = h2.l0.f13815a;
        f10434i = Integer.toString(0, 36);
        f10435j = Integer.toString(1, 36);
        f10436k = Integer.toString(2, 36);
        f10437l = Integer.toString(3, 36);
        f10438m = Integer.toString(4, 36);
        f10439n = Integer.toString(5, 36);
        f10440o = Integer.toString(6, 36);
        f10441p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.f10442a = uri;
        this.f10443b = s0.n(str);
        this.f10444c = d0Var;
        this.d = yVar;
        this.f10445e = list;
        this.f10446f = str2;
        this.f10447g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            ?? obj = new Object();
            obj.f10473c = k0Var.f10492a;
            obj.d = k0Var.f10493b;
            obj.f10474e = k0Var.f10494c;
            obj.f10471a = k0Var.d;
            obj.f10472b = k0Var.f10495e;
            obj.f10475f = k0Var.f10496f;
            obj.f10476g = k0Var.f10497g;
            p10.c(new k0(obj));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.f10442a.equals(g0Var.f10442a) && Objects.equals(this.f10443b, g0Var.f10443b) && Objects.equals(this.f10444c, g0Var.f10444c) && Objects.equals(this.d, g0Var.d) && this.f10445e.equals(g0Var.f10445e) && Objects.equals(this.f10446f, g0Var.f10446f) && this.f10447g.equals(g0Var.f10447g) && this.h == g0Var.h) {
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
        int hashCode4 = this.f10442a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10443b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        d0 d0Var = this.f10444c;
        if (d0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d0Var.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        y yVar = this.d;
        if (yVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = yVar.hashCode();
        }
        int hashCode5 = (this.f10445e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f10446f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (int) (((this.f10447g.hashCode() + ((hashCode5 + i7) * 31)) * 31 * 31) + this.h);
    }
}
