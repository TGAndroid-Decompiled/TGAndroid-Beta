package b2;

import android.net.Uri;
import j$.util.Objects;
public class j0 {
    public static final String h;
    public static final String f3030i;
    public static final String f3031j;
    public static final String f3032k;
    public static final String f3033l;
    public static final String f3034m;
    public static final String f3035n;
    public final Uri f3036a;
    public final String f3037b;
    public final String f3038c;
    public final int d;
    public final int e;
    public final String f3039f;
    public final String f3040g;

    static {
        String str = e2.d0.f7871a;
        h = Integer.toString(0, 36);
        f3030i = Integer.toString(1, 36);
        f3031j = Integer.toString(2, 36);
        f3032k = Integer.toString(3, 36);
        f3033l = Integer.toString(4, 36);
        f3034m = Integer.toString(5, 36);
        f3035n = Integer.toString(6, 36);
    }

    public j0(i0 i0Var) {
        this.f3036a = (Uri) i0Var.f3014c;
        this.f3037b = (String) i0Var.d;
        this.f3038c = (String) i0Var.e;
        this.d = i0Var.f3012a;
        this.e = i0Var.f3013b;
        this.f3039f = (String) i0Var.f3015f;
        this.f3040g = (String) i0Var.f3016g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3036a.equals(j0Var.f3036a) && Objects.equals(this.f3037b, j0Var.f3037b) && Objects.equals(this.f3038c, j0Var.f3038c) && this.d == j0Var.d && this.e == j0Var.e && Objects.equals(this.f3039f, j0Var.f3039f) && Objects.equals(this.f3040g, j0Var.f3040g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f3036a.hashCode() * 31;
        int i10 = 0;
        String str = this.f3037b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f3038c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f3039f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f3040g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
