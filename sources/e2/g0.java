package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class g0 {
    public static final String f10402i;
    public static final String f10403j;
    public static final String f10404k;
    public static final String f10405l;
    public static final String f10406m;
    public static final String f10407n;
    public static final String f10408o;
    public static final String f10409p;
    public final Uri f10410a;
    public final String f10411b;
    public final d0 f10412c;
    public final y d;
    public final List f10413e;
    public final String f10414f;
    public final h9.i0 f10415g;
    public final long h;

    static {
        String str = h2.l0.f13783a;
        f10402i = Integer.toString(0, 36);
        f10403j = Integer.toString(1, 36);
        f10404k = Integer.toString(2, 36);
        f10405l = Integer.toString(3, 36);
        f10406m = Integer.toString(4, 36);
        f10407n = Integer.toString(5, 36);
        f10408o = Integer.toString(6, 36);
        f10409p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.f10410a = uri;
        this.f10411b = s0.n(str);
        this.f10412c = d0Var;
        this.d = yVar;
        this.f10413e = list;
        this.f10414f = str2;
        this.f10415g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            ?? obj = new Object();
            obj.f10441c = k0Var.f10460a;
            obj.d = k0Var.f10461b;
            obj.f10442e = k0Var.f10462c;
            obj.f10439a = k0Var.d;
            obj.f10440b = k0Var.f10463e;
            obj.f10443f = k0Var.f10464f;
            obj.f10444g = k0Var.f10465g;
            p10.c(new k0(obj));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.f10410a.equals(g0Var.f10410a) && Objects.equals(this.f10411b, g0Var.f10411b) && Objects.equals(this.f10412c, g0Var.f10412c) && Objects.equals(this.d, g0Var.d) && this.f10413e.equals(g0Var.f10413e) && Objects.equals(this.f10414f, g0Var.f10414f) && this.f10415g.equals(g0Var.f10415g) && this.h == g0Var.h) {
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
        int hashCode4 = this.f10410a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10411b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        d0 d0Var = this.f10412c;
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
        int hashCode5 = (this.f10413e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f10414f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (int) (((this.f10415g.hashCode() + ((hashCode5 + i7) * 31)) * 31 * 31) + this.h);
    }
}
