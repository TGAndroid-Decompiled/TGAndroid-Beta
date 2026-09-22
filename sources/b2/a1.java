package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f2919j;
    public static final String f2920k;
    public static final String f2921l;
    public static final String f2922m;
    public static final String f2923n;
    public static final String f2924o;
    public static final String f2925p;
    public final Object f2926a;
    public final int f2927b;
    public final k0 f2928c;
    public final Object d;
    public final int e;
    public final long f2929f;
    public final long f2930g;
    public final int h;
    public final int f2931i;

    static {
        String str = e2.d0.f7885a;
        f2919j = Integer.toString(0, 36);
        f2920k = Integer.toString(1, 36);
        f2921l = Integer.toString(2, 36);
        f2922m = Integer.toString(3, 36);
        f2923n = Integer.toString(4, 36);
        f2924o = Integer.toString(5, 36);
        f2925p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f2926a = obj;
        this.f2927b = i10;
        this.f2928c = k0Var;
        this.d = obj2;
        this.e = i11;
        this.f2929f = j3;
        this.f2930g = j10;
        this.h = i12;
        this.f2931i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f2927b == a1Var.f2927b && this.e == a1Var.e && this.f2929f == a1Var.f2929f && this.f2930g == a1Var.f2930g && this.h == a1Var.h && this.f2931i == a1Var.f2931i && Objects.equals(this.f2928c, a1Var.f2928c)) {
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
            i10 = this.f2927b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f2928c;
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
            j3 = this.f2929f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f2930g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f2931i;
        } else {
            i13 = -1;
        }
        return new a1(this.f2926a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f2927b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f2919j, i11);
        }
        k0 k0Var = this.f2928c;
        if (k0Var != null) {
            bundle.putBundle(f2920k, k0Var.b(false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f2921l, i12);
        }
        long j3 = this.f2929f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f2922m, j3);
        }
        long j10 = this.f2930g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f2923n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f2924o, i13);
        }
        int i14 = this.f2931i;
        if (i14 != -1) {
            bundle.putInt(f2925p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f2926a, a1Var.f2926a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2926a, Integer.valueOf(this.f2927b), this.f2928c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f2929f), Long.valueOf(this.f2930g), Integer.valueOf(this.h), Integer.valueOf(this.f2931i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f2927b + ", period=" + this.e + ", pos=" + this.f2929f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder h = w.c.h(str, ", contentPos=");
        h.append(this.f2930g);
        h.append(", adGroup=");
        h.append(i10);
        h.append(", ad=");
        h.append(this.f2931i);
        return h.toString();
    }
}
