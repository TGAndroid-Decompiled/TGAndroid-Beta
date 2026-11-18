package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class g0 {
    public static final String f10405i;
    public static final String f10406j;
    public static final String f10407k;
    public static final String f10408l;
    public static final String f10409m;
    public static final String f10410n;
    public static final String f10411o;
    public static final String f10412p;
    public final Uri f10413a;
    public final String f10414b;
    public final d0 f10415c;
    public final y d;
    public final List f10416e;
    public final String f10417f;
    public final h9.i0 f10418g;
    public final long h;

    static {
        String str = h2.l0.f13786a;
        f10405i = Integer.toString(0, 36);
        f10406j = Integer.toString(1, 36);
        f10407k = Integer.toString(2, 36);
        f10408l = Integer.toString(3, 36);
        f10409m = Integer.toString(4, 36);
        f10410n = Integer.toString(5, 36);
        f10411o = Integer.toString(6, 36);
        f10412p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.f10413a = uri;
        this.f10414b = s0.n(str);
        this.f10415c = d0Var;
        this.d = yVar;
        this.f10416e = list;
        this.f10417f = str2;
        this.f10418g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            ?? obj = new Object();
            obj.f10444c = k0Var.f10463a;
            obj.d = k0Var.f10464b;
            obj.f10445e = k0Var.f10465c;
            obj.f10442a = k0Var.d;
            obj.f10443b = k0Var.f10466e;
            obj.f10446f = k0Var.f10467f;
            obj.f10447g = k0Var.f10468g;
            p10.c(new k0(obj));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.f10413a.equals(g0Var.f10413a) && Objects.equals(this.f10414b, g0Var.f10414b) && Objects.equals(this.f10415c, g0Var.f10415c) && Objects.equals(this.d, g0Var.d) && this.f10416e.equals(g0Var.f10416e) && Objects.equals(this.f10417f, g0Var.f10417f) && this.f10418g.equals(g0Var.f10418g) && this.h == g0Var.h) {
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
        int hashCode4 = this.f10413a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10414b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        d0 d0Var = this.f10415c;
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
        int hashCode5 = (this.f10416e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f10417f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (int) (((this.f10418g.hashCode() + ((hashCode5 + i7) * 31)) * 31 * 31) + this.h);
    }
}
