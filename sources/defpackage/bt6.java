package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;
public final class bt6 {
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
    public final ys6 c;
    public final ss6 d;
    public final List e;
    public final String f;
    public final po5 g;
    public final long h;

    static {
        String str = gcc.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public bt6(Uri uri, String str, ys6 ys6Var, ss6 ss6Var, List list, String str2, po5 po5Var, long j2) {
        this.a = uri;
        this.b = dg7.n(str);
        this.c = ys6Var;
        this.d = ss6Var;
        this.e = list;
        this.f = str2;
        this.g = po5Var;
        mo5 p2 = po5.p();
        for (int i2 = 0; i2 < po5Var.size(); i2++) {
            et6 et6Var = (et6) po5Var.get(i2);
            ?? obj = new Object();
            obj.c = et6Var.a;
            obj.d = et6Var.b;
            obj.e = et6Var.c;
            obj.a = et6Var.d;
            obj.b = et6Var.e;
            obj.f = et6Var.f;
            obj.g = et6Var.g;
            p2.c(new et6(obj));
        }
        p2.f();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bt6) {
                bt6 bt6Var = (bt6) obj;
                if (this.a.equals(bt6Var.a) && Objects.equals(this.b, bt6Var.b) && Objects.equals(this.c, bt6Var.c) && Objects.equals(this.d, bt6Var.d) && this.e.equals(bt6Var.e) && Objects.equals(this.f, bt6Var.f) && this.g.equals(bt6Var.g) && this.h == bt6Var.h) {
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
        ys6 ys6Var = this.c;
        if (ys6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ys6Var.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        ss6 ss6Var = this.d;
        if (ss6Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ss6Var.hashCode();
        }
        int hashCode5 = (this.e.hashCode() + ((i4 + hashCode3) * 31)) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (int) (((this.g.hashCode() + ((hashCode5 + i2) * 31)) * 31 * 31) + this.h);
    }
}
