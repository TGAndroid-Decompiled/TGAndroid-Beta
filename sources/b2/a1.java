package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f1952j;
    public static final String f1953k;
    public static final String f1954l;
    public static final String f1955m;
    public static final String f1956n;
    public static final String f1957o;
    public static final String f1958p;
    public final Object f1959a;
    public final int f1960b;
    public final k0 f1961c;
    public final Object d;
    public final int f1962e;
    public final long f1963f;
    public final long f1964g;
    public final int h;
    public final int f1965i;

    static {
        String str = e2.d0.f8737a;
        f1952j = Integer.toString(0, 36);
        f1953k = Integer.toString(1, 36);
        f1954l = Integer.toString(2, 36);
        f1955m = Integer.toString(3, 36);
        f1956n = Integer.toString(4, 36);
        f1957o = Integer.toString(5, 36);
        f1958p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f1959a = obj;
        this.f1960b = i10;
        this.f1961c = k0Var;
        this.d = obj2;
        this.f1962e = i11;
        this.f1963f = j3;
        this.f1964g = j10;
        this.h = i12;
        this.f1965i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f1960b == a1Var.f1960b && this.f1962e == a1Var.f1962e && this.f1963f == a1Var.f1963f && this.f1964g == a1Var.f1964g && this.h == a1Var.h && this.f1965i == a1Var.f1965i && Objects.equals(this.f1961c, a1Var.f1961c)) {
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
            i10 = this.f1960b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f1961c;
        } else {
            k0Var = null;
        }
        if (z11) {
            i11 = this.f1962e;
        } else {
            i11 = 0;
        }
        long j10 = 0;
        if (z10) {
            j3 = this.f1963f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f1964g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f1965i;
        } else {
            i13 = -1;
        }
        return new a1(this.f1959a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f1960b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f1952j, i11);
        }
        k0 k0Var = this.f1961c;
        if (k0Var != null) {
            bundle.putBundle(f1953k, k0Var.b(false));
        }
        int i12 = this.f1962e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f1954l, i12);
        }
        long j3 = this.f1963f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f1955m, j3);
        }
        long j10 = this.f1964g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f1956n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f1957o, i13);
        }
        int i14 = this.f1965i;
        if (i14 != -1) {
            bundle.putInt(f1958p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f1959a, a1Var.f1959a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1959a, Integer.valueOf(this.f1960b), this.f1961c, this.d, Integer.valueOf(this.f1962e), Long.valueOf(this.f1963f), Long.valueOf(this.f1964g), Integer.valueOf(this.h), Integer.valueOf(this.f1965i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f1960b + ", period=" + this.f1962e + ", pos=" + this.f1963f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder g10 = w.f.g(str, ", contentPos=");
        g10.append(this.f1964g);
        g10.append(", adGroup=");
        g10.append(i10);
        g10.append(", ad=");
        g10.append(this.f1965i);
        return g10.toString();
    }
}
