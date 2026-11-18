package e2;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class b1 {
    public static final String f10327j;
    public static final String f10328k;
    public static final String f10329l;
    public static final String f10330m;
    public static final String f10331n;
    public static final String f10332o;
    public static final String f10333p;
    public final Object f10334a;
    public final int f10335b;
    public final l0 f10336c;
    public final Object d;
    public final int f10337e;
    public final long f10338f;
    public final long f10339g;
    public final int h;
    public final int f10340i;

    static {
        String str = h2.l0.f13783a;
        f10327j = Integer.toString(0, 36);
        f10328k = Integer.toString(1, 36);
        f10329l = Integer.toString(2, 36);
        f10330m = Integer.toString(3, 36);
        f10331n = Integer.toString(4, 36);
        f10332o = Integer.toString(5, 36);
        f10333p = Integer.toString(6, 36);
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
        this.f10334a = obj;
        this.f10335b = i7;
        this.f10336c = l0Var;
        this.d = obj2;
        this.f10337e = i10;
        this.f10338f = j3;
        this.f10339g = j10;
        this.h = i11;
        this.f10340i = i12;
    }

    public final boolean a(b1 b1Var) {
        if (this.f10335b == b1Var.f10335b && this.f10337e == b1Var.f10337e && this.f10338f == b1Var.f10338f && this.f10339g == b1Var.f10339g && this.h == b1Var.h && this.f10340i == b1Var.f10340i && Objects.equals(this.f10336c, b1Var.f10336c)) {
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
            i7 = this.f10335b;
        } else {
            i7 = 0;
        }
        if (z10) {
            l0Var = this.f10336c;
        } else {
            l0Var = null;
        }
        if (z11) {
            i11 = this.f10337e;
        }
        int i12 = i11;
        long j10 = 0;
        if (z10) {
            j3 = this.f10338f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f10339g;
        }
        int i13 = -1;
        if (z10) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z10) {
            i13 = this.f10340i;
        }
        return new b1(this.f10334a, i7, l0Var, this.d, i12, j3, j10, i10, i13);
    }

    public final Bundle c(int i7) {
        Bundle bundle = new Bundle();
        int i10 = this.f10335b;
        if (i7 < 3 || i10 != 0) {
            bundle.putInt(f10327j, i10);
        }
        l0 l0Var = this.f10336c;
        if (l0Var != null) {
            bundle.putBundle(f10328k, l0Var.c(i7, false));
        }
        int i11 = this.f10337e;
        if (i7 < 3 || i11 != 0) {
            bundle.putInt(f10329l, i11);
        }
        long j3 = this.f10338f;
        if (i7 < 3 || j3 != 0) {
            bundle.putLong(f10330m, j3);
        }
        long j10 = this.f10339g;
        if (i7 < 3 || j10 != 0) {
            bundle.putLong(f10331n, j10);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f10332o, i12);
        }
        int i13 = this.f10340i;
        if (i13 != -1) {
            bundle.putInt(f10333p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (a(b1Var) && Objects.equals(this.f10334a, b1Var.f10334a) && Objects.equals(this.d, b1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10334a, Integer.valueOf(this.f10335b), this.f10336c, this.d, Integer.valueOf(this.f10337e), Long.valueOf(this.f10338f), Long.valueOf(this.f10339g), Integer.valueOf(this.h), Integer.valueOf(this.f10340i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f10335b + ", period=" + this.f10337e + ", pos=" + this.f10338f;
        int i7 = this.h;
        if (i7 == -1) {
            return str;
        }
        StringBuilder n10 = p5.c.n(str, ", contentPos=");
        n10.append(this.f10339g);
        n10.append(", adGroup=");
        n10.append(i7);
        n10.append(", ad=");
        n10.append(this.f10340i);
        return n10.toString();
    }
}
