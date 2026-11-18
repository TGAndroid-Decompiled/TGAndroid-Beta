package e2;

import android.net.Uri;
import j$.util.Objects;
public class k0 {
    public static final String h;
    public static final String f10454i;
    public static final String f10455j;
    public static final String f10456k;
    public static final String f10457l;
    public static final String f10458m;
    public static final String f10459n;
    public final Uri f10460a;
    public final String f10461b;
    public final String f10462c;
    public final int d;
    public final int f10463e;
    public final String f10464f;
    public final String f10465g;

    static {
        String str = h2.l0.f13783a;
        h = Integer.toString(0, 36);
        f10454i = Integer.toString(1, 36);
        f10455j = Integer.toString(2, 36);
        f10456k = Integer.toString(3, 36);
        f10457l = Integer.toString(4, 36);
        f10458m = Integer.toString(5, 36);
        f10459n = Integer.toString(6, 36);
    }

    public k0(j0 j0Var) {
        this.f10460a = (Uri) j0Var.f10441c;
        this.f10461b = (String) j0Var.d;
        this.f10462c = (String) j0Var.f10442e;
        this.d = j0Var.f10439a;
        this.f10463e = j0Var.f10440b;
        this.f10464f = (String) j0Var.f10443f;
        this.f10465g = (String) j0Var.f10444g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10460a.equals(k0Var.f10460a) && Objects.equals(this.f10461b, k0Var.f10461b) && Objects.equals(this.f10462c, k0Var.f10462c) && this.d == k0Var.d && this.f10463e == k0Var.f10463e && Objects.equals(this.f10464f, k0Var.f10464f) && Objects.equals(this.f10465g, k0Var.f10465g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f10460a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10461b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10462c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f10463e) * 31;
        String str3 = this.f10464f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f10465g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }
}
