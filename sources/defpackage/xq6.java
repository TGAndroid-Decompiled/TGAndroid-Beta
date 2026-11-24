package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class xq6 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final uq6 c;
    public final oq6 d;
    public final List e;
    public final String f;
    public final mm5 g;
    public final long h;

    static {
        String str = g8c.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public xq6(Uri uri, String str, uq6 uq6Var, oq6 oq6Var, List list, String str2, mm5 mm5Var, long j2) {
        this.a = uri;
        this.b = ud7.n(str);
        this.c = uq6Var;
        this.d = oq6Var;
        this.e = list;
        this.f = str2;
        this.g = mm5Var;
        jm5 p2 = mm5.p();
        for (int i2 = 0; i2 < mm5Var.size(); i2++) {
            ar6 ar6Var = (ar6) mm5Var.get(i2);
            ?? obj = new Object();
            obj.c = ar6Var.a;
            obj.d = ar6Var.b;
            obj.e = ar6Var.c;
            obj.a = ar6Var.d;
            obj.b = ar6Var.e;
            obj.f = ar6Var.f;
            obj.g = ar6Var.g;
            p2.c(new ar6(obj));
        }
        p2.f();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xq6) {
                xq6 xq6Var = (xq6) obj;
                if (this.a.equals(xq6Var.a) && Objects.equals(this.b, xq6Var.b) && Objects.equals(this.c, xq6Var.c) && Objects.equals(this.d, xq6Var.d) && this.e.equals(xq6Var.e) && Objects.equals(this.f, xq6Var.f) && this.g.equals(xq6Var.g) && this.h == xq6Var.h) {
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
        int hashCode4 = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (hashCode4 + hashCode) * 31;
        uq6 uq6Var = this.c;
        if (uq6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uq6Var.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        oq6 oq6Var = this.d;
        if (oq6Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = oq6Var.hashCode();
        }
        int hashCode5 = (this.e.hashCode() + ((i4 + hashCode3) * 31)) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (int) (((this.g.hashCode() + ((hashCode5 + i2) * 31)) * 31 * 31) + this.h);
    }
}
