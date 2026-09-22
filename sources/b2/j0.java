package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f3037i;
    public static final String f3038j;
    public static final String f3039k;
    public static final String f3040l;
    public static final String f3041m;
    public static final String f3042n;
    public final Uri f3043a;
    public final String f3044b;
    public final String f3045c;
    public final int d;
    public final int e;
    public final String f3046f;
    public final String f3047g;

    static {
        String str = e2.d0.f7887a;
        h = Integer.toString(0, 36);
        f3037i = Integer.toString(1, 36);
        f3038j = Integer.toString(2, 36);
        f3039k = Integer.toString(3, 36);
        f3040l = Integer.toString(4, 36);
        f3041m = Integer.toString(5, 36);
        f3042n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f3043a = (Uri) i0Var.f3021c;
        this.f3044b = (String) i0Var.d;
        this.f3045c = (String) i0Var.e;
        this.d = i0Var.f3019a;
        this.e = i0Var.f3020b;
        this.f3046f = (String) i0Var.f3022f;
        this.f3047g = (String) i0Var.f3023g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3043a.equals(j0Var.f3043a) && Objects.equals(this.f3044b, j0Var.f3044b) && Objects.equals(this.f3045c, j0Var.f3045c) && this.d == j0Var.d && this.e == j0Var.e && Objects.equals(this.f3046f, j0Var.f3046f) && Objects.equals(this.f3047g, j0Var.f3047g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3043a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3044b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3045c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3046f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3047g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
