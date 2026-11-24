package defpackage;

import android.net.Uri;
import j$.util.Objects;
public class at6 {
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
        String str = hac.a;
        h = "0";
        i = "1";
        j = "2";
        k = "3";
        l = "4";
        m = "5";
        n = "6";
    }

    public at6(q95 q95Var) {
        this.a = (Uri) q95Var.c;
        this.b = (String) q95Var.d;
        this.c = (String) q95Var.e;
        this.d = q95Var.a;
        this.e = q95Var.b;
        this.f = (String) q95Var.f;
        this.g = (String) q95Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at6)) {
            return false;
        }
        at6 at6Var = (at6) obj;
        if (this.a.equals(at6Var.a) && Objects.equals(this.b, at6Var.b) && Objects.equals(this.c, at6Var.c) && this.d == at6Var.d && this.e == at6Var.e && Objects.equals(this.f, at6Var.f) && Objects.equals(this.g, at6Var.g)) {
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
