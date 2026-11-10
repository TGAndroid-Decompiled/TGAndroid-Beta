package e2;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class g0 {
    public static final String f10256i;
    public static final String f10257j;
    public static final String f10258k;
    public static final String f10259l;
    public static final String f10260m;
    public static final String f10261n;
    public static final String f10262o;
    public static final String f10263p;
    public final Uri f10264a;
    public final String f10265b;
    public final d0 f10266c;
    public final y d;
    public final List f10267e;
    public final String f10268f;
    public final h9.i0 f10269g;
    public final long h;

    static {
        String str = h2.m0.f14114a;
        f10256i = Integer.toString(0, 36);
        f10257j = Integer.toString(1, 36);
        f10258k = Integer.toString(2, 36);
        f10259l = Integer.toString(3, 36);
        f10260m = Integer.toString(4, 36);
        f10261n = Integer.toString(5, 36);
        f10262o = Integer.toString(6, 36);
        f10263p = Integer.toString(7, 36);
    }

    public g0(Uri uri, String str, d0 d0Var, y yVar, List list, String str2, h9.i0 i0Var, long j3) {
        this.f10264a = uri;
        this.f10265b = s0.n(str);
        this.f10266c = d0Var;
        this.d = yVar;
        this.f10267e = list;
        this.f10268f = str2;
        this.f10269g = i0Var;
        h9.f0 p10 = h9.i0.p();
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            k0 k0Var = (k0) i0Var.get(i7);
            ?? obj = new Object();
            obj.f10295c = k0Var.f10314a;
            obj.d = k0Var.f10315b;
            obj.f10296e = k0Var.f10316c;
            obj.f10293a = k0Var.d;
            obj.f10294b = k0Var.f10317e;
            obj.f10297f = k0Var.f10318f;
            obj.f10298g = k0Var.f10319g;
            p10.c(new k0(obj));
        }
        p10.f();
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.f10264a.equals(g0Var.f10264a) && Objects.equals(this.f10265b, g0Var.f10265b) && Objects.equals(this.f10266c, g0Var.f10266c) && Objects.equals(this.d, g0Var.d) && this.f10267e.equals(g0Var.f10267e) && Objects.equals(this.f10268f, g0Var.f10268f) && this.f10269g.equals(g0Var.f10269g) && this.h == g0Var.h) {
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
        int hashCode4 = this.f10264a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10265b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        d0 d0Var = this.f10266c;
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
        int hashCode5 = (this.f10267e.hashCode() + ((i11 + hashCode3) * 31)) * 31;
        String str2 = this.f10268f;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return (int) (((this.f10269g.hashCode() + ((hashCode5 + i7) * 31)) * 31 * 31) + this.h);
    }
}
