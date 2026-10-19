package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class e1 {
    public static final String f3724j;
    public static final String f3725k;
    public static final String f3726l;
    public static final String f3727m;
    public static final String f3728n;
    public static final String f3729o;
    public static final String f3730p;
    public final Object f3731a;
    public final int f3732b;
    public final o0 f3733c;
    public final Object d;
    public final int e;
    public final long f3734f;
    public final long f3735g;
    public final int h;
    public final int f3736i;

    static {
        String str = e2.m0.f8252a;
        f3724j = Integer.toString(0, 36);
        f3725k = Integer.toString(1, 36);
        f3726l = Integer.toString(2, 36);
        f3727m = Integer.toString(3, 36);
        f3728n = Integer.toString(4, 36);
        f3729o = Integer.toString(5, 36);
        f3730p = Integer.toString(6, 36);
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
        this.f3731a = obj;
        this.f3732b = i10;
        this.f3733c = o0Var;
        this.d = obj2;
        this.e = i11;
        this.f3734f = j10;
        this.f3735g = j11;
        this.h = i12;
        this.f3736i = i13;
    }

    public final boolean a(e1 e1Var) {
        if (this.f3732b == e1Var.f3732b && this.e == e1Var.e && this.f3734f == e1Var.f3734f && this.f3735g == e1Var.f3735g && this.h == e1Var.h && this.f3736i == e1Var.f3736i && Objects.equals(this.f3733c, e1Var.f3733c)) {
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
            i10 = this.f3732b;
        } else {
            i10 = 0;
        }
        if (z10) {
            o0Var = this.f3733c;
        } else {
            o0Var = null;
        }
        if (z11) {
            i12 = this.e;
        }
        int i13 = i12;
        long j11 = 0;
        if (z10) {
            j10 = this.f3734f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f3735g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f3736i;
        }
        return new e1(this.f3731a, i10, o0Var, this.d, i13, j10, j11, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f3732b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f3724j, i11);
        }
        o0 o0Var = this.f3733c;
        if (o0Var != null) {
            bundle.putBundle(f3725k, o0Var.c(i10, false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f3726l, i12);
        }
        long j10 = this.f3734f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f3727m, j10);
        }
        long j11 = this.f3735g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f3728n, j11);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f3729o, i13);
        }
        int i14 = this.f3736i;
        if (i14 != -1) {
            bundle.putInt(f3730p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (a(e1Var) && Objects.equals(this.f3731a, e1Var.f3731a) && Objects.equals(this.d, e1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3731a, Integer.valueOf(this.f3732b), this.f3733c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f3734f), Long.valueOf(this.f3735g), Integer.valueOf(this.h), Integer.valueOf(this.f3736i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f3732b + ", period=" + this.e + ", pos=" + this.f3734f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder i11 = r4.c.i(str, ", contentPos=");
        i11.append(this.f3735g);
        i11.append(", adGroup=");
        i11.append(i10);
        i11.append(", ad=");
        i11.append(this.f3736i);
        return i11.toString();
    }
}
