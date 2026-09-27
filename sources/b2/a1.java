package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f2916j;
    public static final String f2917k;
    public static final String f2918l;
    public static final String f2919m;
    public static final String f2920n;
    public static final String f2921o;
    public static final String f2922p;
    public final Object f2923a;
    public final int f2924b;
    public final k0 f2925c;
    public final Object d;
    public final int e;
    public final long f2926f;
    public final long f2927g;
    public final int h;
    public final int f2928i;

    static {
        String str = e2.d0.f7872a;
        f2916j = Integer.toString(0, 36);
        f2917k = Integer.toString(1, 36);
        f2918l = Integer.toString(2, 36);
        f2919m = Integer.toString(3, 36);
        f2920n = Integer.toString(4, 36);
        f2921o = Integer.toString(5, 36);
        f2922p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f2923a = obj;
        this.f2924b = i10;
        this.f2925c = k0Var;
        this.d = obj2;
        this.e = i11;
        this.f2926f = j3;
        this.f2927g = j10;
        this.h = i12;
        this.f2928i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f2924b == a1Var.f2924b && this.e == a1Var.e && this.f2926f == a1Var.f2926f && this.f2927g == a1Var.f2927g && this.h == a1Var.h && this.f2928i == a1Var.f2928i && Objects.equals(this.f2925c, a1Var.f2925c)) {
            return true;
        }
        return false;
    }

    public final a1 b(boolean z10, boolean z11) {
        int i10;
        k0 k0Var;
        int i11;
        long j3;
        int i12;
        int i13;
        if (z10 && z11) {
            return this;
        }
        if (z11) {
            i10 = this.f2924b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f2925c;
        } else {
            k0Var = null;
        }
        if (z11) {
            i11 = this.e;
        } else {
            i11 = 0;
        }
        long j10 = 0;
        if (z10) {
            j3 = this.f2926f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f2927g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f2928i;
        } else {
            i13 = -1;
        }
        return new a1(this.f2923a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f2924b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f2916j, i11);
        }
        k0 k0Var = this.f2925c;
        if (k0Var != null) {
            bundle.putBundle(f2917k, k0Var.b(false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f2918l, i12);
        }
        long j3 = this.f2926f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f2919m, j3);
        }
        long j10 = this.f2927g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f2920n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f2921o, i13);
        }
        int i14 = this.f2928i;
        if (i14 != -1) {
            bundle.putInt(f2922p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f2923a, a1Var.f2923a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2923a, Integer.valueOf(this.f2924b), this.f2925c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f2926f), Long.valueOf(this.f2927g), Integer.valueOf(this.h), Integer.valueOf(this.f2928i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f2924b + ", period=" + this.e + ", pos=" + this.f2926f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder h = v7.k0.h(str, ", contentPos=");
        h.append(this.f2927g);
        h.append(", adGroup=");
        h.append(i10);
        h.append(", ad=");
        h.append(this.f2928i);
        return h.toString();
    }
}
