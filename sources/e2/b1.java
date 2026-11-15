package e2;

import a8.ja;
import android.os.Bundle;
import j$.util.Objects;
public final class b1 {
    public static final String f10012j;
    public static final String f10013k;
    public static final String f10014l;
    public static final String f10015m;
    public static final String f10016n;
    public static final String f10017o;
    public static final String f10018p;
    public final Object f10019a;
    public final int f10020b;
    public final l0 f10021c;
    public final Object d;
    public final int f10022e;
    public final long f10023f;
    public final long f10024g;
    public final int h;
    public final int f10025i;

    static {
        String str = h2.l0.f13471a;
        f10012j = Integer.toString(0, 36);
        f10013k = Integer.toString(1, 36);
        f10014l = Integer.toString(2, 36);
        f10015m = Integer.toString(3, 36);
        f10016n = Integer.toString(4, 36);
        f10017o = Integer.toString(5, 36);
        f10018p = Integer.toString(6, 36);
    }

    public b1(Object obj, int i7, l0 l0Var, Object obj2, int i10, long j3, long j10, int i11, int i12) {
        boolean z10;
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        ja.f(i10 >= 0);
        this.f10019a = obj;
        this.f10020b = i7;
        this.f10021c = l0Var;
        this.d = obj2;
        this.f10022e = i10;
        this.f10023f = j3;
        this.f10024g = j10;
        this.h = i11;
        this.f10025i = i12;
    }

    public final boolean a(b1 b1Var) {
        if (this.f10020b == b1Var.f10020b && this.f10022e == b1Var.f10022e && this.f10023f == b1Var.f10023f && this.f10024g == b1Var.f10024g && this.h == b1Var.h && this.f10025i == b1Var.f10025i && Objects.equals(this.f10021c, b1Var.f10021c)) {
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
            i7 = this.f10020b;
        } else {
            i7 = 0;
        }
        if (z10) {
            l0Var = this.f10021c;
        } else {
            l0Var = null;
        }
        if (z11) {
            i11 = this.f10022e;
        }
        int i12 = i11;
        long j10 = 0;
        if (z10) {
            j3 = this.f10023f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f10024g;
        }
        int i13 = -1;
        if (z10) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z10) {
            i13 = this.f10025i;
        }
        return new b1(this.f10019a, i7, l0Var, this.d, i12, j3, j10, i10, i13);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.f10020b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(f10012j, i10);
        }
        l0 l0Var = this.f10021c;
        if (l0Var != null) {
            bundle.putBundle(f10013k, l0Var.c(i7, false));
        }
        int i11 = this.f10022e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(f10014l, i11);
        }
        long j3 = this.f10023f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f10015m, j3);
        }
        long j10 = this.f10024g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(f10016n, j10);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f10017o, i12);
        }
        int i13 = this.f10025i;
        if (i13 != -1) {
            bundle.putInt(f10018p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.f10019a, b1Var.f10019a) && Objects.equals(this.d, b1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10019a, Integer.valueOf(this.f10020b), this.f10021c, this.d, Integer.valueOf(this.f10022e), Long.valueOf(this.f10023f), Long.valueOf(this.f10024g), Integer.valueOf(this.h), Integer.valueOf(this.f10025i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f10020b + ", period=" + this.f10022e + ", pos=" + this.f10023f;
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder m10 = r.b.m(str, ", contentPos=");
        m10.append(this.f10024g);
        m10.append(", adGroup=");
        m10.append(i7);
        m10.append(", ad=");
        m10.append(this.f10025i);
        return m10.toString();
    }
}
