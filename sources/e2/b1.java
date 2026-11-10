package e2;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class b1 {
    public static final String f10181j;
    public static final String f10182k;
    public static final String f10183l;
    public static final String f10184m;
    public static final String f10185n;
    public static final String f10186o;
    public static final String f10187p;
    public final Object f10188a;
    public final int f10189b;
    public final l0 f10190c;
    public final Object d;
    public final int f10191e;
    public final long f10192f;
    public final long f10193g;
    public final int h;
    public final int f10194i;

    static {
        String str = h2.m0.f14114a;
        f10181j = Integer.toString(0, 36);
        f10182k = Integer.toString(1, 36);
        f10183l = Integer.toString(2, 36);
        f10184m = Integer.toString(3, 36);
        f10185n = Integer.toString(4, 36);
        f10186o = Integer.toString(5, 36);
        f10187p = Integer.toString(6, 36);
    }

    public b1(Object obj, int i7, l0 l0Var, Object obj2, int i10, long j3, long j10, int i11, int i12) {
        boolean z9;
        if (i7 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        ia.f(i10 >= 0);
        this.f10188a = obj;
        this.f10189b = i7;
        this.f10190c = l0Var;
        this.d = obj2;
        this.f10191e = i10;
        this.f10192f = j3;
        this.f10193g = j10;
        this.h = i11;
        this.f10194i = i12;
    }

    public final boolean a(b1 b1Var) {
        if (this.f10189b == b1Var.f10189b && this.f10191e == b1Var.f10191e && this.f10192f == b1Var.f10192f && this.f10193g == b1Var.f10193g && this.h == b1Var.h && this.f10194i == b1Var.f10194i && Objects.equals(this.f10190c, b1Var.f10190c)) {
            return true;
        }
        return false;
    }

    public final b1 b(boolean z9, boolean z10) {
        int i7;
        l0 l0Var;
        long j3;
        int i10;
        if (z9 && z10) {
            return this;
        }
        int i11 = 0;
        if (z10) {
            i7 = this.f10189b;
        } else {
            i7 = 0;
        }
        if (z9) {
            l0Var = this.f10190c;
        } else {
            l0Var = null;
        }
        if (z10) {
            i11 = this.f10191e;
        }
        int i12 = i11;
        long j10 = 0;
        if (z9) {
            j3 = this.f10192f;
        } else {
            j3 = 0;
        }
        if (z9) {
            j10 = this.f10193g;
        }
        int i13 = -1;
        if (z9) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z9) {
            i13 = this.f10194i;
        }
        return new b1(this.f10188a, i7, l0Var, this.d, i12, j3, j10, i10, i13);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.f10189b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(f10181j, i10);
        }
        l0 l0Var = this.f10190c;
        if (l0Var != null) {
            bundle.putBundle(f10182k, l0Var.c(i7, false));
        }
        int i11 = this.f10191e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(f10183l, i11);
        }
        long j3 = this.f10192f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f10184m, j3);
        }
        long j10 = this.f10193g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(f10185n, j10);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f10186o, i12);
        }
        int i13 = this.f10194i;
        if (i13 != -1) {
            bundle.putInt(f10187p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.f10188a, b1Var.f10188a) && Objects.equals(this.d, b1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10188a, Integer.valueOf(this.f10189b), this.f10190c, this.d, Integer.valueOf(this.f10191e), Long.valueOf(this.f10192f), Long.valueOf(this.f10193g), Integer.valueOf(this.h), Integer.valueOf(this.f10194i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f10189b + ", period=" + this.f10191e + ", pos=" + this.f10192f;
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder j3 = rf.b.j(str, ", contentPos=");
        j3.append(this.f10193g);
        j3.append(", adGroup=");
        j3.append(i7);
        j3.append(", ad=");
        j3.append(this.f10194i);
        return j3.toString();
    }
}
