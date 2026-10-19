package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class e1 {
    public static final String f3726j;
    public static final String f3727k;
    public static final String f3728l;
    public static final String f3729m;
    public static final String f3730n;
    public static final String f3731o;
    public static final String f3732p;
    public final Object f3733a;
    public final int f3734b;
    public final o0 f3735c;
    public final Object d;
    public final int e;
    public final long f3736f;
    public final long f3737g;
    public final int h;
    public final int f3738i;

    static {
        String str = e2.m0.f8254a;
        f3726j = Integer.toString(0, 36);
        f3727k = Integer.toString(1, 36);
        f3728l = Integer.toString(2, 36);
        f3729m = Integer.toString(3, 36);
        f3730n = Integer.toString(4, 36);
        f3731o = Integer.toString(5, 36);
        f3732p = Integer.toString(6, 36);
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
        this.f3733a = obj;
        this.f3734b = i10;
        this.f3735c = o0Var;
        this.d = obj2;
        this.e = i11;
        this.f3736f = j10;
        this.f3737g = j11;
        this.h = i12;
        this.f3738i = i13;
    }

    public final boolean a(e1 e1Var) {
        if (this.f3734b == e1Var.f3734b && this.e == e1Var.e && this.f3736f == e1Var.f3736f && this.f3737g == e1Var.f3737g && this.h == e1Var.h && this.f3738i == e1Var.f3738i && Objects.equals(this.f3735c, e1Var.f3735c)) {
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
            i10 = this.f3734b;
        } else {
            i10 = 0;
        }
        if (z10) {
            o0Var = this.f3735c;
        } else {
            o0Var = null;
        }
        if (z11) {
            i12 = this.e;
        }
        int i13 = i12;
        long j11 = 0;
        if (z10) {
            j10 = this.f3736f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f3737g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f3738i;
        }
        return new e1(this.f3733a, i10, o0Var, this.d, i13, j10, j11, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f3734b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f3726j, i11);
        }
        o0 o0Var = this.f3735c;
        if (o0Var != null) {
            bundle.putBundle(f3727k, o0Var.c(i10, false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f3728l, i12);
        }
        long j10 = this.f3736f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f3729m, j10);
        }
        long j11 = this.f3737g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f3730n, j11);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f3731o, i13);
        }
        int i14 = this.f3738i;
        if (i14 != -1) {
            bundle.putInt(f3732p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (a(e1Var) && Objects.equals(this.f3733a, e1Var.f3733a) && Objects.equals(this.d, e1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3733a, Integer.valueOf(this.f3734b), this.f3735c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f3736f), Long.valueOf(this.f3737g), Integer.valueOf(this.h), Integer.valueOf(this.f3738i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f3734b + ", period=" + this.e + ", pos=" + this.f3736f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder i11 = r4.c.i(str, ", contentPos=");
        i11.append(this.f3737g);
        i11.append(", adGroup=");
        i11.append(i10);
        i11.append(", ad=");
        i11.append(this.f3738i);
        return i11.toString();
    }
}
