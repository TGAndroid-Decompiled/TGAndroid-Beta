package e2;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class b1 {
    public static final String f10356j;
    public static final String f10357k;
    public static final String f10358l;
    public static final String f10359m;
    public static final String f10360n;
    public static final String f10361o;
    public static final String f10362p;
    public final Object f10363a;
    public final int f10364b;
    public final l0 f10365c;
    public final Object d;
    public final int f10366e;
    public final long f10367f;
    public final long f10368g;
    public final int h;
    public final int f10369i;

    static {
        String str = h2.l0.f13812a;
        f10356j = Integer.toString(0, 36);
        f10357k = Integer.toString(1, 36);
        f10358l = Integer.toString(2, 36);
        f10359m = Integer.toString(3, 36);
        f10360n = Integer.toString(4, 36);
        f10361o = Integer.toString(5, 36);
        f10362p = Integer.toString(6, 36);
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
        this.f10363a = obj;
        this.f10364b = i7;
        this.f10365c = l0Var;
        this.d = obj2;
        this.f10366e = i10;
        this.f10367f = j3;
        this.f10368g = j10;
        this.h = i11;
        this.f10369i = i12;
    }

    public final boolean a(b1 b1Var) {
        if (this.f10364b == b1Var.f10364b && this.f10366e == b1Var.f10366e && this.f10367f == b1Var.f10367f && this.f10368g == b1Var.f10368g && this.h == b1Var.h && this.f10369i == b1Var.f10369i && Objects.equals(this.f10365c, b1Var.f10365c)) {
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
            i7 = this.f10364b;
        } else {
            i7 = 0;
        }
        if (z10) {
            l0Var = this.f10365c;
        } else {
            l0Var = null;
        }
        if (z11) {
            i11 = this.f10366e;
        }
        int i12 = i11;
        long j10 = 0;
        if (z10) {
            j3 = this.f10367f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f10368g;
        }
        int i13 = -1;
        if (z10) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z10) {
            i13 = this.f10369i;
        }
        return new b1(this.f10363a, i7, l0Var, this.d, i12, j3, j10, i10, i13);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.f10364b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(f10356j, i10);
        }
        l0 l0Var = this.f10365c;
        if (l0Var != null) {
            bundle.putBundle(f10357k, l0Var.c(i7, false));
        }
        int i11 = this.f10366e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(f10358l, i11);
        }
        long j3 = this.f10367f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f10359m, j3);
        }
        long j10 = this.f10368g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(f10360n, j10);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f10361o, i12);
        }
        int i13 = this.f10369i;
        if (i13 != -1) {
            bundle.putInt(f10362p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.f10363a, b1Var.f10363a) && Objects.equals(this.d, b1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10363a, Integer.valueOf(this.f10364b), this.f10365c, this.d, Integer.valueOf(this.f10366e), Long.valueOf(this.f10367f), Long.valueOf(this.f10368g), Integer.valueOf(this.h), Integer.valueOf(this.f10369i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f10364b + ", period=" + this.f10366e + ", pos=" + this.f10367f;
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder n10 = p5.c.n(str, ", contentPos=");
        n10.append(this.f10368g);
        n10.append(", adGroup=");
        n10.append(i7);
        n10.append(", ad=");
        n10.append(this.f10369i);
        return n10.toString();
    }
}
