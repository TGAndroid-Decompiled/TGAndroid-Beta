package e2;

import android.net.Uri;
import j$.util.Objects;
public class k0 {
    public static final String h;
    public static final String f10483i;
    public static final String f10484j;
    public static final String f10485k;
    public static final String f10486l;
    public static final String f10487m;
    public static final String f10488n;
    public final Uri f10489a;
    public final String f10490b;
    public final String f10491c;
    public final int d;
    public final int f10492e;
    public final String f10493f;
    public final String f10494g;

    static {
        String str = h2.l0.f13812a;
        h = Integer.toString(0, 36);
        f10483i = Integer.toString(1, 36);
        f10484j = Integer.toString(2, 36);
        f10485k = Integer.toString(3, 36);
        f10486l = Integer.toString(4, 36);
        f10487m = Integer.toString(5, 36);
        f10488n = Integer.toString(6, 36);
    }

    public k0(j0 j0Var) {
        this.f10489a = (Uri) j0Var.f10470c;
        this.f10490b = (String) j0Var.d;
        this.f10491c = (String) j0Var.f10471e;
        this.d = j0Var.f10468a;
        this.f10492e = j0Var.f10469b;
        this.f10493f = (String) j0Var.f10472f;
        this.f10494g = (String) j0Var.f10473g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10489a.equals(k0Var.f10489a) && Objects.equals(this.f10490b, k0Var.f10490b) && Objects.equals(this.f10491c, k0Var.f10491c) && this.d == k0Var.d && this.f10492e == k0Var.f10492e && Objects.equals(this.f10493f, k0Var.f10493f) && Objects.equals(this.f10494g, k0Var.f10494g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f10489a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10490b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10491c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f10492e) * 31;
        String str3 = this.f10493f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f10494g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }
}
