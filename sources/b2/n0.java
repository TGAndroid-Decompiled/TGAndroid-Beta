package b2;

import android.net.Uri;
import j$.util.Objects;
public class n0 {
    public static final String h;
    public static final String f3854i;
    public static final String f3855j;
    public static final String f3856k;
    public static final String f3857l;
    public static final String f3858m;
    public static final String f3859n;
    public final Uri f3860a;
    public final String f3861b;
    public final String f3862c;
    public final int d;
    public final int e;
    public final String f3863f;
    public final String f3864g;

    static {
        String str = e2.m0.f8259a;
        h = Integer.toString(0, 36);
        f3854i = Integer.toString(1, 36);
        f3855j = Integer.toString(2, 36);
        f3856k = Integer.toString(3, 36);
        f3857l = Integer.toString(4, 36);
        f3858m = Integer.toString(5, 36);
        f3859n = Integer.toString(6, 36);
    }

    public n0(m0 m0Var) {
        this.f3860a = (Uri) m0Var.f3838c;
        this.f3861b = (String) m0Var.d;
        this.f3862c = (String) m0Var.e;
        this.d = m0Var.f3836a;
        this.e = m0Var.f3837b;
        this.f3863f = (String) m0Var.f3839f;
        this.f3864g = (String) m0Var.f3840g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f3860a.equals(n0Var.f3860a) && Objects.equals(this.f3861b, n0Var.f3861b) && Objects.equals(this.f3862c, n0Var.f3862c) && this.d == n0Var.d && this.e == n0Var.e && Objects.equals(this.f3863f, n0Var.f3863f) && Objects.equals(this.f3864g, n0Var.f3864g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3860a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3861b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3862c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3863f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3864g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
