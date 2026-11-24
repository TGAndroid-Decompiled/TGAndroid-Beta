package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class xs6 {
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
    public final us6 c;
    public final os6 d;
    public final List e;
    public final String f;
    public final mo5 g;
    public final long h;

    static {
        String str = hac.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public xs6(Uri uri, String str, us6 us6Var, os6 os6Var, List list, String str2, mo5 mo5Var, long j2) {
        this.a = uri;
        this.b = wf7.n(str);
        this.c = us6Var;
        this.d = os6Var;
        this.e = list;
        this.f = str2;
        this.g = mo5Var;
        jo5 p2 = mo5.p();
        for (int i2 = 0; i2 < mo5Var.size(); i2++) {
            at6 at6Var = (at6) mo5Var.get(i2);
            ?? obj = new Object();
            obj.c = at6Var.a;
            obj.d = at6Var.b;
            obj.e = at6Var.c;
            obj.a = at6Var.d;
            obj.b = at6Var.e;
            obj.f = at6Var.f;
            obj.g = at6Var.g;
            p2.c(new at6(obj));
        }
        p2.f();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xs6) {
                xs6 xs6Var = (xs6) obj;
                if (this.a.equals(xs6Var.a) && Objects.equals(this.b, xs6Var.b) && Objects.equals(this.c, xs6Var.c) && Objects.equals(this.d, xs6Var.d) && this.e.equals(xs6Var.e) && Objects.equals(this.f, xs6Var.f) && this.g.equals(xs6Var.g) && this.h == xs6Var.h) {
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
        us6 us6Var = this.c;
        if (us6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = us6Var.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        os6 os6Var = this.d;
        if (os6Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = os6Var.hashCode();
        }
        int hashCode5 = (this.e.hashCode() + ((i4 + hashCode3) * 31)) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (int) (((this.g.hashCode() + ((hashCode5 + i2) * 31)) * 31 * 31) + this.h);
    }
}
