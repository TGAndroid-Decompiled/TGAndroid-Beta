package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f2914j;
    public static final String f2915k;
    public static final String f2916l;
    public static final String f2917m;
    public static final String f2918n;
    public static final String f2919o;
    public static final String f2920p;
    public final Object f2921a;
    public final int f2922b;
    public final k0 f2923c;
    public final Object d;
    public final int e;
    public final long f2924f;
    public final long f2925g;
    public final int h;
    public final int f2926i;

    static {
        String str = e2.d0.f7870a;
        f2914j = Integer.toString(0, 36);
        f2915k = Integer.toString(1, 36);
        f2916l = Integer.toString(2, 36);
        f2917m = Integer.toString(3, 36);
        f2918n = Integer.toString(4, 36);
        f2919o = Integer.toString(5, 36);
        f2920p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f2921a = obj;
        this.f2922b = i10;
        this.f2923c = k0Var;
        this.d = obj2;
        this.e = i11;
        this.f2924f = j3;
        this.f2925g = j10;
        this.h = i12;
        this.f2926i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f2922b == a1Var.f2922b && this.e == a1Var.e && this.f2924f == a1Var.f2924f && this.f2925g == a1Var.f2925g && this.h == a1Var.h && this.f2926i == a1Var.f2926i && Objects.equals(this.f2923c, a1Var.f2923c)) {
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
            i10 = this.f2922b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f2923c;
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
            j3 = this.f2924f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f2925g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f2926i;
        } else {
            i13 = -1;
        }
        return new a1(this.f2921a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f2922b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f2914j, i11);
        }
        k0 k0Var = this.f2923c;
        if (k0Var != null) {
            bundle.putBundle(f2915k, k0Var.b(false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f2916l, i12);
        }
        long j3 = this.f2924f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f2917m, j3);
        }
        long j10 = this.f2925g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f2918n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f2919o, i13);
        }
        int i14 = this.f2926i;
        if (i14 != -1) {
            bundle.putInt(f2920p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f2921a, a1Var.f2921a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2921a, Integer.valueOf(this.f2922b), this.f2923c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f2924f), Long.valueOf(this.f2925g), Integer.valueOf(this.h), Integer.valueOf(this.f2926i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f2922b + ", period=" + this.e + ", pos=" + this.f2924f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder h = v7.j.h(str, ", contentPos=");
        h.append(this.f2925g);
        h.append(", adGroup=");
        h.append(i10);
        h.append(", ad=");
        h.append(this.f2926i);
        return h.toString();
    }
}
