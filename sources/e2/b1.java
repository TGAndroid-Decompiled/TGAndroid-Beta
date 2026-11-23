package e2;

import a8.ma;
import android.os.Bundle;
import j$.util.Objects;
public final class b1 {
    public static final String f10322j;
    public static final String f10323k;
    public static final String f10324l;
    public static final String f10325m;
    public static final String f10326n;
    public static final String f10327o;
    public static final String f10328p;
    public final Object f10329a;
    public final int f10330b;
    public final l0 f10331c;
    public final Object d;
    public final int f10332e;
    public final long f10333f;
    public final long f10334g;
    public final int h;
    public final int f10335i;

    static {
        String str = h2.l0.f13778a;
        f10322j = Integer.toString(0, 36);
        f10323k = Integer.toString(1, 36);
        f10324l = Integer.toString(2, 36);
        f10325m = Integer.toString(3, 36);
        f10326n = Integer.toString(4, 36);
        f10327o = Integer.toString(5, 36);
        f10328p = Integer.toString(6, 36);
    }

    public b1(Object obj, int i7, l0 l0Var, Object obj2, int i10, long j3, long j10, int i11, int i12) {
        boolean z10;
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        ma.f(i10 >= 0);
        this.f10329a = obj;
        this.f10330b = i7;
        this.f10331c = l0Var;
        this.d = obj2;
        this.f10332e = i10;
        this.f10333f = j3;
        this.f10334g = j10;
        this.h = i11;
        this.f10335i = i12;
    }

    public final boolean a(b1 b1Var) {
        if (this.f10330b == b1Var.f10330b && this.f10332e == b1Var.f10332e && this.f10333f == b1Var.f10333f && this.f10334g == b1Var.f10334g && this.h == b1Var.h && this.f10335i == b1Var.f10335i && Objects.equals(this.f10331c, b1Var.f10331c)) {
            return true;
        }
        return false;
    }

    public final b1 b(boolean z10, boolean z11) {
        int i7;
        l0 l0Var;
        long j3;
        int i10;
        if (z10 && z11) {
            return this;
        }
        int i11 = 0;
        if (z11) {
            i7 = this.f10330b;
        } else {
            i7 = 0;
        }
        if (z10) {
            l0Var = this.f10331c;
        } else {
            l0Var = null;
        }
        if (z11) {
            i11 = this.f10332e;
        }
        int i12 = i11;
        long j10 = 0;
        if (z10) {
            j3 = this.f10333f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f10334g;
        }
        int i13 = -1;
        if (z10) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z10) {
            i13 = this.f10335i;
        }
        return new b1(this.f10329a, i7, l0Var, this.d, i12, j3, j10, i10, i13);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.f10330b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(f10322j, i10);
        }
        l0 l0Var = this.f10331c;
        if (l0Var != null) {
            bundle.putBundle(f10323k, l0Var.c(i7, false));
        }
        int i11 = this.f10332e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(f10324l, i11);
        }
        long j3 = this.f10333f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f10325m, j3);
        }
        long j10 = this.f10334g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(f10326n, j10);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f10327o, i12);
        }
        int i13 = this.f10335i;
        if (i13 != -1) {
            bundle.putInt(f10328p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.f10329a, b1Var.f10329a) && Objects.equals(this.d, b1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10329a, Integer.valueOf(this.f10330b), this.f10331c, this.d, Integer.valueOf(this.f10332e), Long.valueOf(this.f10333f), Long.valueOf(this.f10334g), Integer.valueOf(this.h), Integer.valueOf(this.f10335i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f10330b + ", period=" + this.f10332e + ", pos=" + this.f10333f;
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder n10 = p5.c.n(str, ", contentPos=");
        n10.append(this.f10334g);
        n10.append(", adGroup=");
        n10.append(i7);
        n10.append(", ad=");
        n10.append(this.f10335i);
        return n10.toString();
    }
}
