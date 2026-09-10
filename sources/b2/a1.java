package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f1615j;
    public static final String f1616k;
    public static final String f1617l;
    public static final String f1618m;
    public static final String f1619n;
    public static final String f1620o;
    public static final String f1621p;
    public final Object f1622a;
    public final int f1623b;
    public final k0 f1624c;
    public final Object d;
    public final int e;
    public final long f1625f;
    public final long f1626g;
    public final int h;
    public final int f1627i;

    static {
        String str = e2.d0.f7188a;
        f1615j = Integer.toString(0, 36);
        f1616k = Integer.toString(1, 36);
        f1617l = Integer.toString(2, 36);
        f1618m = Integer.toString(3, 36);
        f1619n = Integer.toString(4, 36);
        f1620o = Integer.toString(5, 36);
        f1621p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f1622a = obj;
        this.f1623b = i10;
        this.f1624c = k0Var;
        this.d = obj2;
        this.e = i11;
        this.f1625f = j3;
        this.f1626g = j10;
        this.h = i12;
        this.f1627i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f1623b == a1Var.f1623b && this.e == a1Var.e && this.f1625f == a1Var.f1625f && this.f1626g == a1Var.f1626g && this.h == a1Var.h && this.f1627i == a1Var.f1627i && Objects.equals(this.f1624c, a1Var.f1624c)) {
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
            i10 = this.f1623b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f1624c;
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
            j3 = this.f1625f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f1626g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f1627i;
        } else {
            i13 = -1;
        }
        return new a1(this.f1622a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f1623b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f1615j, i11);
        }
        k0 k0Var = this.f1624c;
        if (k0Var != null) {
            bundle.putBundle(f1616k, k0Var.b(false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f1617l, i12);
        }
        long j3 = this.f1625f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f1618m, j3);
        }
        long j10 = this.f1626g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f1619n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f1620o, i13);
        }
        int i14 = this.f1627i;
        if (i14 != -1) {
            bundle.putInt(f1621p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f1622a, a1Var.f1622a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1622a, Integer.valueOf(this.f1623b), this.f1624c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f1625f), Long.valueOf(this.f1626g), Integer.valueOf(this.h), Integer.valueOf(this.f1627i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f1623b + ", period=" + this.e + ", pos=" + this.f1625f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder g10 = w.f.g(str, ", contentPos=");
        g10.append(this.f1626g);
        g10.append(", adGroup=");
        g10.append(i10);
        g10.append(", ad=");
        g10.append(this.f1627i);
        return g10.toString();
    }
}
