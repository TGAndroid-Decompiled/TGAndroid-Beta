package e2;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class b1 {
    public static final String f10359j;
    public static final String f10360k;
    public static final String f10361l;
    public static final String f10362m;
    public static final String f10363n;
    public static final String f10364o;
    public static final String f10365p;
    public final Object f10366a;
    public final int f10367b;
    public final l0 f10368c;
    public final Object d;
    public final int f10369e;
    public final long f10370f;
    public final long f10371g;
    public final int h;
    public final int f10372i;

    static {
        String str = h2.l0.f13815a;
        f10359j = Integer.toString(0, 36);
        f10360k = Integer.toString(1, 36);
        f10361l = Integer.toString(2, 36);
        f10362m = Integer.toString(3, 36);
        f10363n = Integer.toString(4, 36);
        f10364o = Integer.toString(5, 36);
        f10365p = Integer.toString(6, 36);
    }

    public b1(Object obj, int i7, l0 l0Var, Object obj2, int i10, long j3, long j10, int i11, int i12) {
        boolean z10;
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        la.f(i10 >= 0);
        this.f10366a = obj;
        this.f10367b = i7;
        this.f10368c = l0Var;
        this.d = obj2;
        this.f10369e = i10;
        this.f10370f = j3;
        this.f10371g = j10;
        this.h = i11;
        this.f10372i = i12;
    }

    public final boolean a(b1 b1Var) {
        if (this.f10367b == b1Var.f10367b && this.f10369e == b1Var.f10369e && this.f10370f == b1Var.f10370f && this.f10371g == b1Var.f10371g && this.h == b1Var.h && this.f10372i == b1Var.f10372i && Objects.equals(this.f10368c, b1Var.f10368c)) {
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
            i7 = this.f10367b;
        } else {
            i7 = 0;
        }
        if (z10) {
            l0Var = this.f10368c;
        } else {
            l0Var = null;
        }
        if (z11) {
            i11 = this.f10369e;
        }
        int i12 = i11;
        long j10 = 0;
        if (z10) {
            j3 = this.f10370f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f10371g;
        }
        int i13 = -1;
        if (z10) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z10) {
            i13 = this.f10372i;
        }
        return new b1(this.f10366a, i7, l0Var, this.d, i12, j3, j10, i10, i13);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.f10367b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(f10359j, i10);
        }
        l0 l0Var = this.f10368c;
        if (l0Var != null) {
            bundle.putBundle(f10360k, l0Var.c(i7, false));
        }
        int i11 = this.f10369e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(f10361l, i11);
        }
        long j3 = this.f10370f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f10362m, j3);
        }
        long j10 = this.f10371g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(f10363n, j10);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f10364o, i12);
        }
        int i13 = this.f10372i;
        if (i13 != -1) {
            bundle.putInt(f10365p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.f10366a, b1Var.f10366a) && Objects.equals(this.d, b1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10366a, Integer.valueOf(this.f10367b), this.f10368c, this.d, Integer.valueOf(this.f10369e), Long.valueOf(this.f10370f), Long.valueOf(this.f10371g), Integer.valueOf(this.h), Integer.valueOf(this.f10372i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f10367b + ", period=" + this.f10369e + ", pos=" + this.f10370f;
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder n10 = p5.c.n(str, ", contentPos=");
        n10.append(this.f10371g);
        n10.append(", adGroup=");
        n10.append(i7);
        n10.append(", ad=");
        n10.append(this.f10372i);
        return n10.toString();
    }
}
