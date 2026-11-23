package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class g0 {
    public static final String f10395i;
    public static final String f10396j;
    public static final String f10397k;
    public static final String f10398l;
    public static final String f10399m;
    public static final String f10400n;
    public static final String f10401o;
    public static final String f10402p;
    public final Uri f10403a;
    public final String f10404b;
    public final d0 f10405c;
    public final y d;
    public final List f10406e;
    public final String f10407f;
    public final h9.i0 f10408g;
    public final long h;

    static {
        String str = h2.l0.f13778a;
        f10395i = Integer.toString(0, 36);
        f10396j = Integer.toString(1, 36);
        f10397k = Integer.toString(2, 36);
        f10398l = Integer.toString(3, 36);
        f10399m = Integer.toString(4, 36);
        f10400n = Integer.toString(5, 36);
        f10401o = Integer.toString(6, 36);
        f10402p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.f10403a = uri;
        this.f10404b = s0.n(str);
        this.f10405c = d0Var;
        this.d = yVar;
        this.f10406e = list;
        this.f10407f = str2;
        this.f10408g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            ?? obj = new Object();
            obj.f10434c = k0Var.f10453a;
            obj.d = k0Var.f10454b;
            obj.f10435e = k0Var.f10455c;
            obj.f10432a = k0Var.d;
            obj.f10433b = k0Var.f10456e;
            obj.f10436f = k0Var.f10457f;
            obj.f10437g = k0Var.f10458g;
            p10.c(new k0(obj));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.f10403a.equals(g0Var.f10403a) && Objects.equals(this.f10404b, g0Var.f10404b) && Objects.equals(this.f10405c, g0Var.f10405c) && Objects.equals(this.d, g0Var.d) && this.f10406e.equals(g0Var.f10406e) && Objects.equals(this.f10407f, g0Var.f10407f) && this.f10408g.equals(g0Var.f10408g) && this.h == g0Var.h) {
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
        int hashCode4 = this.f10403a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10404b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        d0 d0Var = this.f10405c;
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
        int hashCode5 = (this.f10406e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f10407f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (int) (((this.f10408g.hashCode() + ((hashCode5 + i7) * 31)) * 31 * 31) + this.h);
    }
}
