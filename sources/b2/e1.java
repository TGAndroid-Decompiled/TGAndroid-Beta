package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class e1 {
    public static final String f3731j;
    public static final String f3732k;
    public static final String f3733l;
    public static final String f3734m;
    public static final String f3735n;
    public static final String f3736o;
    public static final String f3737p;
    public final Object f3738a;
    public final int f3739b;
    public final o0 f3740c;
    public final Object d;
    public final int e;
    public final long f3741f;
    public final long f3742g;
    public final int h;
    public final int f3743i;

    static {
        String str = e2.m0.f8259a;
        f3731j = Integer.toString(0, 36);
        f3732k = Integer.toString(1, 36);
        f3733l = Integer.toString(2, 36);
        f3734m = Integer.toString(3, 36);
        f3735n = Integer.toString(4, 36);
        f3736o = Integer.toString(5, 36);
        f3737p = Integer.toString(6, 36);
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
        this.f3738a = obj;
        this.f3739b = i10;
        this.f3740c = o0Var;
        this.d = obj2;
        this.e = i11;
        this.f3741f = j10;
        this.f3742g = j11;
        this.h = i12;
        this.f3743i = i13;
    }

    public final boolean a(e1 e1Var) {
        if (this.f3739b == e1Var.f3739b && this.e == e1Var.e && this.f3741f == e1Var.f3741f && this.f3742g == e1Var.f3742g && this.h == e1Var.h && this.f3743i == e1Var.f3743i && Objects.equals(this.f3740c, e1Var.f3740c)) {
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
            i10 = this.f3739b;
        } else {
            i10 = 0;
        }
        if (z10) {
            o0Var = this.f3740c;
        } else {
            o0Var = null;
        }
        if (z11) {
            i12 = this.e;
        }
        int i13 = i12;
        long j11 = 0;
        if (z10) {
            j10 = this.f3741f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f3742g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f3743i;
        }
        return new e1(this.f3738a, i10, o0Var, this.d, i13, j10, j11, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f3739b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f3731j, i11);
        }
        o0 o0Var = this.f3740c;
        if (o0Var != null) {
            bundle.putBundle(f3732k, o0Var.c(i10, false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f3733l, i12);
        }
        long j10 = this.f3741f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f3734m, j10);
        }
        long j11 = this.f3742g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f3735n, j11);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f3736o, i13);
        }
        int i14 = this.f3743i;
        if (i14 != -1) {
            bundle.putInt(f3737p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (a(e1Var) && Objects.equals(this.f3738a, e1Var.f3738a) && Objects.equals(this.d, e1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3738a, Integer.valueOf(this.f3739b), this.f3740c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f3741f), Long.valueOf(this.f3742g), Integer.valueOf(this.h), Integer.valueOf(this.f3743i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f3739b + ", period=" + this.e + ", pos=" + this.f3741f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder i11 = si.o0.i(str, ", contentPos=");
        i11.append(this.f3742g);
        i11.append(", adGroup=");
        i11.append(i10);
        i11.append(", ad=");
        i11.append(this.f3743i);
        return i11.toString();
    }
}
