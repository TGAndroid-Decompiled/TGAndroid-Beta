package e2;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class b1 {
    public static final String f10330j;
    public static final String f10331k;
    public static final String f10332l;
    public static final String f10333m;
    public static final String f10334n;
    public static final String f10335o;
    public static final String f10336p;
    public final Object f10337a;
    public final int f10338b;
    public final l0 f10339c;
    public final Object d;
    public final int f10340e;
    public final long f10341f;
    public final long f10342g;
    public final int h;
    public final int f10343i;

    static {
        String str = h2.l0.f13786a;
        f10330j = Integer.toString(0, 36);
        f10331k = Integer.toString(1, 36);
        f10332l = Integer.toString(2, 36);
        f10333m = Integer.toString(3, 36);
        f10334n = Integer.toString(4, 36);
        f10335o = Integer.toString(5, 36);
        f10336p = Integer.toString(6, 36);
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
        this.f10337a = obj;
        this.f10338b = i7;
        this.f10339c = l0Var;
        this.d = obj2;
        this.f10340e = i10;
        this.f10341f = j3;
        this.f10342g = j10;
        this.h = i11;
        this.f10343i = i12;
    }

    public final boolean a(b1 b1Var) {
        if (this.f10338b == b1Var.f10338b && this.f10340e == b1Var.f10340e && this.f10341f == b1Var.f10341f && this.f10342g == b1Var.f10342g && this.h == b1Var.h && this.f10343i == b1Var.f10343i && Objects.equals(this.f10339c, b1Var.f10339c)) {
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
            i7 = this.f10338b;
        } else {
            i7 = 0;
        }
        if (z10) {
            l0Var = this.f10339c;
        } else {
            l0Var = null;
        }
        if (z11) {
            i11 = this.f10340e;
        }
        int i12 = i11;
        long j10 = 0;
        if (z10) {
            j3 = this.f10341f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f10342g;
        }
        int i13 = -1;
        if (z10) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z10) {
            i13 = this.f10343i;
        }
        return new b1(this.f10337a, i7, l0Var, this.d, i12, j3, j10, i10, i13);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.f10338b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(f10330j, i10);
        }
        l0 l0Var = this.f10339c;
        if (l0Var != null) {
            bundle.putBundle(f10331k, l0Var.c(i7, false));
        }
        int i11 = this.f10340e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(f10332l, i11);
        }
        long j3 = this.f10341f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f10333m, j3);
        }
        long j10 = this.f10342g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(f10334n, j10);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f10335o, i12);
        }
        int i13 = this.f10343i;
        if (i13 != -1) {
            bundle.putInt(f10336p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.f10337a, b1Var.f10337a) && Objects.equals(this.d, b1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10337a, Integer.valueOf(this.f10338b), this.f10339c, this.d, Integer.valueOf(this.f10340e), Long.valueOf(this.f10341f), Long.valueOf(this.f10342g), Integer.valueOf(this.h), Integer.valueOf(this.f10343i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f10338b + ", period=" + this.f10340e + ", pos=" + this.f10341f;
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder n10 = p5.c.n(str, ", contentPos=");
        n10.append(this.f10342g);
        n10.append(", adGroup=");
        n10.append(i7);
        n10.append(", ad=");
        n10.append(this.f10343i);
        return n10.toString();
    }
}
