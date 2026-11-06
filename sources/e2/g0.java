package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class g0 {
    public static final String f10251i;
    public static final String f10252j;
    public static final String f10253k;
    public static final String f10254l;
    public static final String f10255m;
    public static final String f10256n;
    public static final String f10257o;
    public static final String f10258p;
    public final Uri f10259a;
    public final String f10260b;
    public final d0 f10261c;
    public final y d;
    public final List f10262e;
    public final String f10263f;
    public final h9.i0 f10264g;
    public final long h;

    static {
        String str = h2.m0.f14112a;
        f10251i = Integer.toString(0, 36);
        f10252j = Integer.toString(1, 36);
        f10253k = Integer.toString(2, 36);
        f10254l = Integer.toString(3, 36);
        f10255m = Integer.toString(4, 36);
        f10256n = Integer.toString(5, 36);
        f10257o = Integer.toString(6, 36);
        f10258p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.f10259a = uri;
        this.f10260b = s0.n(str);
        this.f10261c = d0Var;
        this.d = yVar;
        this.f10262e = list;
        this.f10263f = str2;
        this.f10264g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            ?? obj = new Object();
            obj.f10290c = k0Var.f10309a;
            obj.d = k0Var.f10310b;
            obj.f10291e = k0Var.f10311c;
            obj.f10288a = k0Var.d;
            obj.f10289b = k0Var.f10312e;
            obj.f10292f = k0Var.f10313f;
            obj.f10293g = k0Var.f10314g;
            p10.c(new k0(obj));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.f10259a.equals(g0Var.f10259a) && Objects.equals(this.f10260b, g0Var.f10260b) && Objects.equals(this.f10261c, g0Var.f10261c) && Objects.equals(this.d, g0Var.d) && this.f10262e.equals(g0Var.f10262e) && Objects.equals(this.f10263f, g0Var.f10263f) && this.f10264g.equals(g0Var.f10264g) && this.h == g0Var.h) {
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
        int hashCode4 = this.f10259a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10260b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        d0 d0Var = this.f10261c;
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
        int hashCode5 = (this.f10262e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f10263f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (int) (((this.f10264g.hashCode() + ((hashCode5 + i7) * 31)) * 31 * 31) + this.h);
    }
}
