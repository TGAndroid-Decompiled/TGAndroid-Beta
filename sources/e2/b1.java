package e2;

import a8.ma;
import android.os.Bundle;
import j$.util.Objects;
public final class b1 {
    public static final String f10320j;
    public static final String f10321k;
    public static final String f10322l;
    public static final String f10323m;
    public static final String f10324n;
    public static final String f10325o;
    public static final String f10326p;
    public final Object f10327a;
    public final int f10328b;
    public final l0 f10329c;
    public final Object d;
    public final int f10330e;
    public final long f10331f;
    public final long f10332g;
    public final int h;
    public final int f10333i;

    static {
        String str = h2.l0.f13778a;
        f10320j = Integer.toString(0, 36);
        f10321k = Integer.toString(1, 36);
        f10322l = Integer.toString(2, 36);
        f10323m = Integer.toString(3, 36);
        f10324n = Integer.toString(4, 36);
        f10325o = Integer.toString(5, 36);
        f10326p = Integer.toString(6, 36);
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
        this.f10327a = obj;
        this.f10328b = i7;
        this.f10329c = l0Var;
        this.d = obj2;
        this.f10330e = i10;
        this.f10331f = j3;
        this.f10332g = j10;
        this.h = i11;
        this.f10333i = i12;
    }

    public final boolean a(b1 b1Var) {
        if (this.f10328b == b1Var.f10328b && this.f10330e == b1Var.f10330e && this.f10331f == b1Var.f10331f && this.f10332g == b1Var.f10332g && this.h == b1Var.h && this.f10333i == b1Var.f10333i && Objects.equals(this.f10329c, b1Var.f10329c)) {
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
            i7 = this.f10328b;
        } else {
            i7 = 0;
        }
        if (z10) {
            l0Var = this.f10329c;
        } else {
            l0Var = null;
        }
        if (z11) {
            i11 = this.f10330e;
        }
        int i12 = i11;
        long j10 = 0;
        if (z10) {
            j3 = this.f10331f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f10332g;
        }
        int i13 = -1;
        if (z10) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z10) {
            i13 = this.f10333i;
        }
        return new b1(this.f10327a, i7, l0Var, this.d, i12, j3, j10, i10, i13);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.f10328b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(f10320j, i10);
        }
        l0 l0Var = this.f10329c;
        if (l0Var != null) {
            bundle.putBundle(f10321k, l0Var.c(i7, false));
        }
        int i11 = this.f10330e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(f10322l, i11);
        }
        long j3 = this.f10331f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f10323m, j3);
        }
        long j10 = this.f10332g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(f10324n, j10);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f10325o, i12);
        }
        int i13 = this.f10333i;
        if (i13 != -1) {
            bundle.putInt(f10326p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.f10327a, b1Var.f10327a) && Objects.equals(this.d, b1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10327a, Integer.valueOf(this.f10328b), this.f10329c, this.d, Integer.valueOf(this.f10330e), Long.valueOf(this.f10331f), Long.valueOf(this.f10332g), Integer.valueOf(this.h), Integer.valueOf(this.f10333i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f10328b + ", period=" + this.f10330e + ", pos=" + this.f10331f;
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder n10 = p5.c.n(str, ", contentPos=");
        n10.append(this.f10332g);
        n10.append(", adGroup=");
        n10.append(i7);
        n10.append(", ad=");
        n10.append(this.f10333i);
        return n10.toString();
    }
}
