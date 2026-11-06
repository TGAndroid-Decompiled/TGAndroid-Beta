package e2;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class b1 {
    public static final String f10176j;
    public static final String f10177k;
    public static final String f10178l;
    public static final String f10179m;
    public static final String f10180n;
    public static final String f10181o;
    public static final String f10182p;
    public final Object f10183a;
    public final int f10184b;
    public final l0 f10185c;
    public final Object d;
    public final int f10186e;
    public final long f10187f;
    public final long f10188g;
    public final int h;
    public final int f10189i;

    static {
        String str = h2.m0.f14112a;
        f10176j = Integer.toString(0, 36);
        f10177k = Integer.toString(1, 36);
        f10178l = Integer.toString(2, 36);
        f10179m = Integer.toString(3, 36);
        f10180n = Integer.toString(4, 36);
        f10181o = Integer.toString(5, 36);
        f10182p = Integer.toString(6, 36);
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
        this.f10183a = obj;
        this.f10184b = i7;
        this.f10185c = l0Var;
        this.d = obj2;
        this.f10186e = i10;
        this.f10187f = j3;
        this.f10188g = j10;
        this.h = i11;
        this.f10189i = i12;
    }

    public final boolean a(b1 b1Var) {
        if (this.f10184b == b1Var.f10184b && this.f10186e == b1Var.f10186e && this.f10187f == b1Var.f10187f && this.f10188g == b1Var.f10188g && this.h == b1Var.h && this.f10189i == b1Var.f10189i && Objects.equals(this.f10185c, b1Var.f10185c)) {
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
            i7 = this.f10184b;
        } else {
            i7 = 0;
        }
        if (z9) {
            l0Var = this.f10185c;
        } else {
            l0Var = null;
        }
        if (z10) {
            i11 = this.f10186e;
        }
        int i12 = i11;
        long j10 = 0;
        if (z9) {
            j3 = this.f10187f;
        } else {
            j3 = 0;
        }
        if (z9) {
            j10 = this.f10188g;
        }
        int i13 = -1;
        if (z9) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z9) {
            i13 = this.f10189i;
        }
        return new b1(this.f10183a, i7, l0Var, this.d, i12, j3, j10, i10, i13);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.f10184b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(f10176j, i10);
        }
        l0 l0Var = this.f10185c;
        if (l0Var != null) {
            bundle.putBundle(f10177k, l0Var.c(i7, false));
        }
        int i11 = this.f10186e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(f10178l, i11);
        }
        long j3 = this.f10187f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f10179m, j3);
        }
        long j10 = this.f10188g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(f10180n, j10);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f10181o, i12);
        }
        int i13 = this.f10189i;
        if (i13 != -1) {
            bundle.putInt(f10182p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.f10183a, b1Var.f10183a) && Objects.equals(this.d, b1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10183a, Integer.valueOf(this.f10184b), this.f10185c, this.d, Integer.valueOf(this.f10186e), Long.valueOf(this.f10187f), Long.valueOf(this.f10188g), Integer.valueOf(this.h), Integer.valueOf(this.f10189i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f10184b + ", period=" + this.f10186e + ", pos=" + this.f10187f;
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder j3 = rf.b.j(str, ", contentPos=");
        j3.append(this.f10188g);
        j3.append(", adGroup=");
        j3.append(i7);
        j3.append(", ad=");
        j3.append(this.f10189i);
        return j3.toString();
    }
}
