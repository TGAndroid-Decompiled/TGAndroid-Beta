package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class e1 {
    public static final String f3728j;
    public static final String f3729k;
    public static final String f3730l;
    public static final String f3731m;
    public static final String f3732n;
    public static final String f3733o;
    public static final String f3734p;
    public final Object f3735a;
    public final int f3736b;
    public final o0 f3737c;
    public final Object d;
    public final int e;
    public final long f3738f;
    public final long f3739g;
    public final int h;
    public final int f3740i;

    static {
        String str = e2.m0.f8255a;
        f3728j = Integer.toString(0, 36);
        f3729k = Integer.toString(1, 36);
        f3730l = Integer.toString(2, 36);
        f3731m = Integer.toString(3, 36);
        f3732n = Integer.toString(4, 36);
        f3733o = Integer.toString(5, 36);
        f3734p = Integer.toString(6, 36);
    }

    public e1(Object obj, int i10, o0 o0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        u6.g(i11 >= 0);
        this.f3735a = obj;
        this.f3736b = i10;
        this.f3737c = o0Var;
        this.d = obj2;
        this.e = i11;
        this.f3738f = j10;
        this.f3739g = j11;
        this.h = i12;
        this.f3740i = i13;
    }

    public final boolean a(e1 e1Var) {
        if (this.f3736b == e1Var.f3736b && this.e == e1Var.e && this.f3738f == e1Var.f3738f && this.f3739g == e1Var.f3739g && this.h == e1Var.h && this.f3740i == e1Var.f3740i && Objects.equals(this.f3737c, e1Var.f3737c)) {
            return true;
        }
        return false;
    }

    public final e1 b(boolean z10, boolean z11) {
        int i10;
        o0 o0Var;
        long j10;
        int i11;
        if (z10 && z11) {
            return this;
        }
        int i12 = 0;
        if (z11) {
            i10 = this.f3736b;
        } else {
            i10 = 0;
        }
        if (z10) {
            o0Var = this.f3737c;
        } else {
            o0Var = null;
        }
        if (z11) {
            i12 = this.e;
        }
        int i13 = i12;
        long j11 = 0;
        if (z10) {
            j10 = this.f3738f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f3739g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f3740i;
        }
        return new e1(this.f3735a, i10, o0Var, this.d, i13, j10, j11, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f3736b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f3728j, i11);
        }
        o0 o0Var = this.f3737c;
        if (o0Var != null) {
            bundle.putBundle(f3729k, o0Var.c(i10, false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f3730l, i12);
        }
        long j10 = this.f3738f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f3731m, j10);
        }
        long j11 = this.f3739g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f3732n, j11);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f3733o, i13);
        }
        int i14 = this.f3740i;
        if (i14 != -1) {
            bundle.putInt(f3734p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (a(e1Var) && Objects.equals(this.f3735a, e1Var.f3735a) && Objects.equals(this.d, e1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3735a, Integer.valueOf(this.f3736b), this.f3737c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f3738f), Long.valueOf(this.f3739g), Integer.valueOf(this.h), Integer.valueOf(this.f3740i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f3736b + ", period=" + this.e + ", pos=" + this.f3738f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder i11 = r4.c.i(str, ", contentPos=");
        i11.append(this.f3739g);
        i11.append(", adGroup=");
        i11.append(i10);
        i11.append(", ad=");
        i11.append(this.f3740i);
        return i11.toString();
    }
}
