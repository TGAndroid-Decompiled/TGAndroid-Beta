package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class g0 {
    public static final String f10431i;
    public static final String f10432j;
    public static final String f10433k;
    public static final String f10434l;
    public static final String f10435m;
    public static final String f10436n;
    public static final String f10437o;
    public static final String f10438p;
    public final Uri f10439a;
    public final String f10440b;
    public final d0 f10441c;
    public final y d;
    public final List f10442e;
    public final String f10443f;
    public final h9.i0 f10444g;
    public final long h;

    static {
        String str = h2.l0.f13812a;
        f10431i = Integer.toString(0, 36);
        f10432j = Integer.toString(1, 36);
        f10433k = Integer.toString(2, 36);
        f10434l = Integer.toString(3, 36);
        f10435m = Integer.toString(4, 36);
        f10436n = Integer.toString(5, 36);
        f10437o = Integer.toString(6, 36);
        f10438p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.f10439a = uri;
        this.f10440b = s0.n(str);
        this.f10441c = d0Var;
        this.d = yVar;
        this.f10442e = list;
        this.f10443f = str2;
        this.f10444g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            ?? obj = new Object();
            obj.f10470c = k0Var.f10489a;
            obj.d = k0Var.f10490b;
            obj.f10471e = k0Var.f10491c;
            obj.f10468a = k0Var.d;
            obj.f10469b = k0Var.f10492e;
            obj.f10472f = k0Var.f10493f;
            obj.f10473g = k0Var.f10494g;
            p10.c(new k0(obj));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.f10439a.equals(g0Var.f10439a) && Objects.equals(this.f10440b, g0Var.f10440b) && Objects.equals(this.f10441c, g0Var.f10441c) && Objects.equals(this.d, g0Var.d) && this.f10442e.equals(g0Var.f10442e) && Objects.equals(this.f10443f, g0Var.f10443f) && this.f10444g.equals(g0Var.f10444g) && this.h == g0Var.h) {
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
        int hashCode4 = this.f10439a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10440b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        d0 d0Var = this.f10441c;
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
        int hashCode5 = (this.f10442e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f10443f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (int) (((this.f10444g.hashCode() + ((hashCode5 + i7) * 31)) * 31 * 31) + this.h);
    }
}
