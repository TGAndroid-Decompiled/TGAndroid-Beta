package e2;

import android.net.Uri;
import j$.util.Objects;
public class k0 {
    public static final String h;
    public static final String f10303i;
    public static final String f10304j;
    public static final String f10305k;
    public static final String f10306l;
    public static final String f10307m;
    public static final String f10308n;
    public final Uri f10309a;
    public final String f10310b;
    public final String f10311c;
    public final int d;
    public final int f10312e;
    public final String f10313f;
    public final String f10314g;

    static {
        String str = h2.m0.f14112a;
        h = Integer.toString(0, 36);
        f10303i = Integer.toString(1, 36);
        f10304j = Integer.toString(2, 36);
        f10305k = Integer.toString(3, 36);
        f10306l = Integer.toString(4, 36);
        f10307m = Integer.toString(5, 36);
        f10308n = Integer.toString(6, 36);
    }

    public k0(j0 j0Var) {
        this.f10309a = (Uri) j0Var.f10290c;
        this.f10310b = (String) j0Var.d;
        this.f10311c = (String) j0Var.f10291e;
        this.d = j0Var.f10288a;
        this.f10312e = j0Var.f10289b;
        this.f10313f = (String) j0Var.f10292f;
        this.f10314g = (String) j0Var.f10293g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10309a.equals(k0Var.f10309a) && Objects.equals(this.f10310b, k0Var.f10310b) && Objects.equals(this.f10311c, k0Var.f10311c) && this.d == k0Var.d && this.f10312e == k0Var.f10312e && Objects.equals(this.f10313f, k0Var.f10313f) && Objects.equals(this.f10314g, k0Var.f10314g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f10309a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10310b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10311c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f10312e) * 31;
        String str3 = this.f10313f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f10314g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }
}
