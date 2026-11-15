package e2;

import android.net.Uri;
import j$.util.Objects;
public class k0 {
    public static final String h;
    public static final String f10139i;
    public static final String f10140j;
    public static final String f10141k;
    public static final String f10142l;
    public static final String f10143m;
    public static final String f10144n;
    public final Uri f10145a;
    public final String f10146b;
    public final String f10147c;
    public final int d;
    public final int f10148e;
    public final String f10149f;
    public final String f10150g;

    static {
        String str = h2.l0.f13471a;
        h = Integer.toString(0, 36);
        f10139i = Integer.toString(1, 36);
        f10140j = Integer.toString(2, 36);
        f10141k = Integer.toString(3, 36);
        f10142l = Integer.toString(4, 36);
        f10143m = Integer.toString(5, 36);
        f10144n = Integer.toString(6, 36);
    }

    public k0(j0 j0Var) {
        this.f10145a = (Uri) j0Var.f10126c;
        this.f10146b = (String) j0Var.d;
        this.f10147c = (String) j0Var.f10127e;
        this.d = j0Var.f10124a;
        this.f10148e = j0Var.f10125b;
        this.f10149f = (String) j0Var.f10128f;
        this.f10150g = (String) j0Var.f10129g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10145a.equals(k0Var.f10145a) && Objects.equals(this.f10146b, k0Var.f10146b) && Objects.equals(this.f10147c, k0Var.f10147c) && this.d == k0Var.d && this.f10148e == k0Var.f10148e && Objects.equals(this.f10149f, k0Var.f10149f) && Objects.equals(this.f10150g, k0Var.f10150g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f10145a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10146b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10147c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f10148e) * 31;
        String str3 = this.f10149f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f10150g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }
}
