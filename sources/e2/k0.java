package e2;

import android.net.Uri;
import j$.util.Objects;
public class k0 {
    public static final String h;
    public static final String f10308i;
    public static final String f10309j;
    public static final String f10310k;
    public static final String f10311l;
    public static final String f10312m;
    public static final String f10313n;
    public final Uri f10314a;
    public final String f10315b;
    public final String f10316c;
    public final int d;
    public final int f10317e;
    public final String f10318f;
    public final String f10319g;

    static {
        String str = h2.m0.f14114a;
        h = Integer.toString(0, 36);
        f10308i = Integer.toString(1, 36);
        f10309j = Integer.toString(2, 36);
        f10310k = Integer.toString(3, 36);
        f10311l = Integer.toString(4, 36);
        f10312m = Integer.toString(5, 36);
        f10313n = Integer.toString(6, 36);
    }

    public k0(j0 j0Var) {
        this.f10314a = (Uri) j0Var.f10295c;
        this.f10315b = (String) j0Var.d;
        this.f10316c = (String) j0Var.f10296e;
        this.d = j0Var.f10293a;
        this.f10317e = j0Var.f10294b;
        this.f10318f = (String) j0Var.f10297f;
        this.f10319g = (String) j0Var.f10298g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10314a.equals(k0Var.f10314a) && Objects.equals(this.f10315b, k0Var.f10315b) && Objects.equals(this.f10316c, k0Var.f10316c) && this.d == k0Var.d && this.f10317e == k0Var.f10317e && Objects.equals(this.f10318f, k0Var.f10318f) && Objects.equals(this.f10319g, k0Var.f10319g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f10314a.hashCode() * 31;
        int i7 = 0;
        String str = this.f10315b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        String str2 = this.f10316c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (((((i10 + hashCode2) * 31) + this.d) * 31) + this.f10317e) * 31;
        String str3 = this.f10318f;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f10319g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 + i7;
    }
}
