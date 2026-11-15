package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class g0 {
    public static final String f10087i;
    public static final String f10088j;
    public static final String f10089k;
    public static final String f10090l;
    public static final String f10091m;
    public static final String f10092n;
    public static final String f10093o;
    public static final String f10094p;
    public final Uri f10095a;
    public final String f10096b;
    public final d0 f10097c;
    public final y d;
    public final List f10098e;
    public final String f10099f;
    public final h9.i0 f10100g;
    public final long h;

    static {
        String str = h2.l0.f13471a;
        f10087i = Integer.toString(0, 36);
        f10088j = Integer.toString(1, 36);
        f10089k = Integer.toString(2, 36);
        f10090l = Integer.toString(3, 36);
        f10091m = Integer.toString(4, 36);
        f10092n = Integer.toString(5, 36);
        f10093o = Integer.toString(6, 36);
        f10094p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.f10095a = uri;
        this.f10096b = s0.n(str);
        this.f10097c = d0Var;
        this.d = yVar;
        this.f10098e = list;
        this.f10099f = str2;
        this.f10100g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            ?? obj = new Object();
            obj.f10126c = k0Var.f10145a;
            obj.d = k0Var.f10146b;
            obj.f10127e = k0Var.f10147c;
            obj.f10124a = k0Var.d;
            obj.f10125b = k0Var.f10148e;
            obj.f10128f = k0Var.f10149f;
            obj.f10129g = k0Var.f10150g;
            p10.c(new k0(obj));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.f10095a.equals(g0Var.f10095a) && Objects.equals(this.f10096b, g0Var.f10096b) && Objects.equals(this.f10097c, g0Var.f10097c) && Objects.equals(this.d, g0Var.d) && this.f10098e.equals(g0Var.f10098e) && Objects.equals(this.f10099f, g0Var.f10099f) && this.f10100g.equals(g0Var.f10100g) && this.h == g0Var.h) {
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
        int hashCode4 = this.f10095a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10096b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        d0 d0Var = this.f10097c;
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
        int hashCode5 = (this.f10098e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f10099f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (int) (((this.f10100g.hashCode() + ((hashCode5 + i7) * 31)) * 31 * 31) + this.h);
    }
}
