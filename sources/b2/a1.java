package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f3225j;
    public static final String f3226k;
    public static final String f3227l;
    public static final String f3228m;
    public static final String f3229n;
    public static final String f3230o;
    public static final String f3231p;
    public final Object f3232a;
    public final int f3233b;
    public final k0 f3234c;
    public final Object d;
    public final int f3235e;
    public final long f3236f;
    public final long f3237g;
    public final int h;
    public final int f3238i;

    static {
        String str = e2.d0.f8532a;
        f3225j = Integer.toString(0, 36);
        f3226k = Integer.toString(1, 36);
        f3227l = Integer.toString(2, 36);
        f3228m = Integer.toString(3, 36);
        f3229n = Integer.toString(4, 36);
        f3230o = Integer.toString(5, 36);
        f3231p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f3232a = obj;
        this.f3233b = i10;
        this.f3234c = k0Var;
        this.d = obj2;
        this.f3235e = i11;
        this.f3236f = j3;
        this.f3237g = j10;
        this.h = i12;
        this.f3238i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f3233b == a1Var.f3233b && this.f3235e == a1Var.f3235e && this.f3236f == a1Var.f3236f && this.f3237g == a1Var.f3237g && this.h == a1Var.h && this.f3238i == a1Var.f3238i && Objects.equals(this.f3234c, a1Var.f3234c)) {
            return true;
        }
        return false;
    }

    public final a1 b(boolean z10, boolean z11) {
        int i10;
        k0 k0Var;
        long j3;
        int i11;
        if (z10 && z11) {
            return this;
        }
        int i12 = 0;
        if (z11) {
            i10 = this.f3233b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f3234c;
        } else {
            k0Var = null;
        }
        if (z11) {
            i12 = this.f3235e;
        }
        int i13 = i12;
        long j10 = 0;
        if (z10) {
            j3 = this.f3236f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f3237g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f3238i;
        }
        return new a1(this.f3232a, i10, k0Var, this.d, i13, j3, j10, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f3233b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f3225j, i11);
        }
        k0 k0Var = this.f3234c;
        if (k0Var != null) {
            bundle.putBundle(f3226k, k0Var.b(false));
        }
        int i12 = this.f3235e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f3227l, i12);
        }
        long j3 = this.f3236f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f3228m, j3);
        }
        long j10 = this.f3237g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f3229n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f3230o, i13);
        }
        int i14 = this.f3238i;
        if (i14 != -1) {
            bundle.putInt(f3231p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f3232a, a1Var.f3232a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3232a, Integer.valueOf(this.f3233b), this.f3234c, this.d, Integer.valueOf(this.f3235e), Long.valueOf(this.f3236f), Long.valueOf(this.f3237g), Integer.valueOf(this.h), Integer.valueOf(this.f3238i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f3233b + ", period=" + this.f3235e + ", pos=" + this.f3236f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder j3 = sc.v.j(str, ", contentPos=");
        j3.append(this.f3237g);
        j3.append(", adGroup=");
        j3.append(i10);
        j3.append(", ad=");
        j3.append(this.f3238i);
        return j3.toString();
    }
}
