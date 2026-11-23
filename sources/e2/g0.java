package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class g0 {
    public static final String f10397i;
    public static final String f10398j;
    public static final String f10399k;
    public static final String f10400l;
    public static final String f10401m;
    public static final String f10402n;
    public static final String f10403o;
    public static final String f10404p;
    public final Uri f10405a;
    public final String f10406b;
    public final d0 f10407c;
    public final y d;
    public final List f10408e;
    public final String f10409f;
    public final h9.i0 f10410g;
    public final long h;

    static {
        String str = h2.l0.f13778a;
        f10397i = Integer.toString(0, 36);
        f10398j = Integer.toString(1, 36);
        f10399k = Integer.toString(2, 36);
        f10400l = Integer.toString(3, 36);
        f10401m = Integer.toString(4, 36);
        f10402n = Integer.toString(5, 36);
        f10403o = Integer.toString(6, 36);
        f10404p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.f10405a = uri;
        this.f10406b = s0.n(str);
        this.f10407c = d0Var;
        this.d = yVar;
        this.f10408e = list;
        this.f10409f = str2;
        this.f10410g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            ?? obj = new Object();
            obj.f10436c = k0Var.f10455a;
            obj.d = k0Var.f10456b;
            obj.f10437e = k0Var.f10457c;
            obj.f10434a = k0Var.d;
            obj.f10435b = k0Var.f10458e;
            obj.f10438f = k0Var.f10459f;
            obj.f10439g = k0Var.f10460g;
            p10.c(new k0(obj));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.f10405a.equals(g0Var.f10405a) && Objects.equals(this.f10406b, g0Var.f10406b) && Objects.equals(this.f10407c, g0Var.f10407c) && Objects.equals(this.d, g0Var.d) && this.f10408e.equals(g0Var.f10408e) && Objects.equals(this.f10409f, g0Var.f10409f) && this.f10410g.equals(g0Var.f10410g) && this.h == g0Var.h) {
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
        int hashCode4 = this.f10405a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10406b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        d0 d0Var = this.f10407c;
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
        int hashCode5 = (this.f10408e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f10409f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (int) (((this.f10410g.hashCode() + ((hashCode5 + i7) * 31)) * 31 * 31) + this.h);
    }
}
