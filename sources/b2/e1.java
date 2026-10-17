package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class e1 {
    public static final String f3727j;
    public static final String f3728k;
    public static final String f3729l;
    public static final String f3730m;
    public static final String f3731n;
    public static final String f3732o;
    public static final String f3733p;
    public final Object f3734a;
    public final int f3735b;
    public final o0 f3736c;
    public final Object d;
    public final int e;
    public final long f3737f;
    public final long f3738g;
    public final int h;
    public final int f3739i;

    static {
        String str = e2.m0.f8254a;
        f3727j = Integer.toString(0, 36);
        f3728k = Integer.toString(1, 36);
        f3729l = Integer.toString(2, 36);
        f3730m = Integer.toString(3, 36);
        f3731n = Integer.toString(4, 36);
        f3732o = Integer.toString(5, 36);
        f3733p = Integer.toString(6, 36);
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
        this.f3734a = obj;
        this.f3735b = i10;
        this.f3736c = o0Var;
        this.d = obj2;
        this.e = i11;
        this.f3737f = j10;
        this.f3738g = j11;
        this.h = i12;
        this.f3739i = i13;
    }

    public final boolean a(e1 e1Var) {
        if (this.f3735b == e1Var.f3735b && this.e == e1Var.e && this.f3737f == e1Var.f3737f && this.f3738g == e1Var.f3738g && this.h == e1Var.h && this.f3739i == e1Var.f3739i && Objects.equals(this.f3736c, e1Var.f3736c)) {
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
            i10 = this.f3735b;
        } else {
            i10 = 0;
        }
        if (z10) {
            o0Var = this.f3736c;
        } else {
            o0Var = null;
        }
        if (z11) {
            i12 = this.e;
        }
        int i13 = i12;
        long j11 = 0;
        if (z10) {
            j10 = this.f3737f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f3738g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f3739i;
        }
        return new e1(this.f3734a, i10, o0Var, this.d, i13, j10, j11, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f3735b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f3727j, i11);
        }
        o0 o0Var = this.f3736c;
        if (o0Var != null) {
            bundle.putBundle(f3728k, o0Var.c(i10, false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f3729l, i12);
        }
        long j10 = this.f3737f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f3730m, j10);
        }
        long j11 = this.f3738g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f3731n, j11);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f3732o, i13);
        }
        int i14 = this.f3739i;
        if (i14 != -1) {
            bundle.putInt(f3733p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (a(e1Var) && Objects.equals(this.f3734a, e1Var.f3734a) && Objects.equals(this.d, e1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3734a, Integer.valueOf(this.f3735b), this.f3736c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f3737f), Long.valueOf(this.f3738g), Integer.valueOf(this.h), Integer.valueOf(this.f3739i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f3735b + ", period=" + this.e + ", pos=" + this.f3737f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder i11 = r.c.i(str, ", contentPos=");
        i11.append(this.f3738g);
        i11.append(", adGroup=");
        i11.append(i10);
        i11.append(", ad=");
        i11.append(this.f3739i);
        return i11.toString();
    }
}
