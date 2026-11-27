package defpackage;

import android.net.Uri;
import j$.util.Objects;
public class et6 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        String str = gcc.a;
        h = "0";
        i = "1";
        j = "2";
        k = "3";
        l = "4";
        m = "5";
        n = "6";
    }

    public et6(t95 t95Var) {
        this.a = (Uri) t95Var.c;
        this.b = (String) t95Var.d;
        this.c = (String) t95Var.e;
        this.d = t95Var.a;
        this.e = t95Var.b;
        this.f = (String) t95Var.f;
        this.g = (String) t95Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et6)) {
            return false;
        }
        et6 et6Var = (et6) obj;
        if (this.a.equals(et6Var.a) && Objects.equals(this.b, et6Var.b) && Objects.equals(this.c, et6Var.c) && this.d == et6Var.d && this.e == et6Var.e && Objects.equals(this.f, et6Var.f) && Objects.equals(this.g, et6Var.g)) {
            return true;
        }
        return false;
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
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (((((i3 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i5 + i2;
    }
}
