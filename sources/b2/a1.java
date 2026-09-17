package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f1979j;
    public static final String f1980k;
    public static final String f1981l;
    public static final String f1982m;
    public static final String f1983n;
    public static final String f1984o;
    public static final String f1985p;
    public final Object f1986a;
    public final int f1987b;
    public final k0 f1988c;
    public final Object d;
    public final int f1989e;
    public final long f1990f;
    public final long f1991g;
    public final int h;
    public final int f1992i;

    static {
        String str = e2.d0.f8765a;
        f1979j = Integer.toString(0, 36);
        f1980k = Integer.toString(1, 36);
        f1981l = Integer.toString(2, 36);
        f1982m = Integer.toString(3, 36);
        f1983n = Integer.toString(4, 36);
        f1984o = Integer.toString(5, 36);
        f1985p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f1986a = obj;
        this.f1987b = i10;
        this.f1988c = k0Var;
        this.d = obj2;
        this.f1989e = i11;
        this.f1990f = j3;
        this.f1991g = j10;
        this.h = i12;
        this.f1992i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f1987b == a1Var.f1987b && this.f1989e == a1Var.f1989e && this.f1990f == a1Var.f1990f && this.f1991g == a1Var.f1991g && this.h == a1Var.h && this.f1992i == a1Var.f1992i && Objects.equals(this.f1988c, a1Var.f1988c)) {
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
            i10 = this.f1987b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f1988c;
        } else {
            k0Var = null;
        }
        if (z11) {
            i11 = this.f1989e;
        } else {
            i11 = 0;
        }
        long j10 = 0;
        if (z10) {
            j3 = this.f1990f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f1991g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f1992i;
        } else {
            i13 = -1;
        }
        return new a1(this.f1986a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f1987b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f1979j, i11);
        }
        k0 k0Var = this.f1988c;
        if (k0Var != null) {
            bundle.putBundle(f1980k, k0Var.b(false));
        }
        int i12 = this.f1989e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f1981l, i12);
        }
        long j3 = this.f1990f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f1982m, j3);
        }
        long j10 = this.f1991g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f1983n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f1984o, i13);
        }
        int i14 = this.f1992i;
        if (i14 != -1) {
            bundle.putInt(f1985p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f1986a, a1Var.f1986a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1986a, Integer.valueOf(this.f1987b), this.f1988c, this.d, Integer.valueOf(this.f1989e), Long.valueOf(this.f1990f), Long.valueOf(this.f1991g), Integer.valueOf(this.h), Integer.valueOf(this.f1992i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f1987b + ", period=" + this.f1989e + ", pos=" + this.f1990f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder g10 = w.f.g(str, ", contentPos=");
        g10.append(this.f1991g);
        g10.append(", adGroup=");
        g10.append(i10);
        g10.append(", ad=");
        g10.append(this.f1992i);
        return g10.toString();
    }
}
