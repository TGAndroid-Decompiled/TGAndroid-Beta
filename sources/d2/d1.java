package d2;

import android.os.Bundle;
import b8.zb;
import j$.util.Objects;
public final class d1 {
    public static final String f8059j;
    public static final String f8060k;
    public static final String f8061l;
    public static final String f8062m;
    public static final String f8063n;
    public static final String f8064o;
    public static final String f8065p;
    public final Object f8066a;
    public final int f8067b;
    public final n0 f8068c;
    public final Object d;
    public final int f8069e;
    public final long f8070f;
    public final long f8071g;
    public final int h;
    public final int f8072i;

    static {
        String str = g2.n0.f11873a;
        f8059j = Integer.toString(0, 36);
        f8060k = Integer.toString(1, 36);
        f8061l = Integer.toString(2, 36);
        f8062m = Integer.toString(3, 36);
        f8063n = Integer.toString(4, 36);
        f8064o = Integer.toString(5, 36);
        f8065p = Integer.toString(6, 36);
    }

    public d1(Object obj, int i3, n0 n0Var, Object obj2, int i10, long j10, long j11, int i11, int i12) {
        boolean z10;
        if (i3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        zb.f(i10 >= 0);
        this.f8066a = obj;
        this.f8067b = i3;
        this.f8068c = n0Var;
        this.d = obj2;
        this.f8069e = i10;
        this.f8070f = j10;
        this.f8071g = j11;
        this.h = i11;
        this.f8072i = i12;
    }

    public final boolean a(d1 d1Var) {
        if (this.f8067b == d1Var.f8067b && this.f8069e == d1Var.f8069e && this.f8070f == d1Var.f8070f && this.f8071g == d1Var.f8071g && this.h == d1Var.h && this.f8072i == d1Var.f8072i && Objects.equals(this.f8068c, d1Var.f8068c)) {
            return true;
        }
        return false;
    }

    public final d1 b(boolean z10, boolean z11) {
        int i3;
        n0 n0Var;
        long j10;
        int i10;
        if (z10 && z11) {
            return this;
        }
        int i11 = 0;
        if (z11) {
            i3 = this.f8067b;
        } else {
            i3 = 0;
        }
        if (z10) {
            n0Var = this.f8068c;
        } else {
            n0Var = null;
        }
        if (z11) {
            i11 = this.f8069e;
        }
        int i12 = i11;
        long j11 = 0;
        if (z10) {
            j10 = this.f8070f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f8071g;
        }
        int i13 = -1;
        if (z10) {
            i10 = this.h;
        } else {
            i10 = -1;
        }
        if (z10) {
            i13 = this.f8072i;
        }
        return new d1(this.f8066a, i3, n0Var, this.d, i12, j10, j11, i10, i13);
    }

    public final Bundle c(int i3) {
        Bundle bundle = new Bundle();
        int i10 = this.f8067b;
        if (i3 < 3 || i10 != 0) {
            bundle.putInt(f8059j, i10);
        }
        n0 n0Var = this.f8068c;
        if (n0Var != null) {
            bundle.putBundle(f8060k, n0Var.c(i3, false));
        }
        int i11 = this.f8069e;
        if (i3 < 3 || i11 != 0) {
            bundle.putInt(f8061l, i11);
        }
        long j10 = this.f8070f;
        if (i3 < 3 || j10 != 0) {
            bundle.putLong(f8062m, j10);
        }
        long j11 = this.f8071g;
        if (i3 < 3 || j11 != 0) {
            bundle.putLong(f8063n, j11);
        }
        int i12 = this.h;
        if (i12 != -1) {
            bundle.putInt(f8064o, i12);
        }
        int i13 = this.f8072i;
        if (i13 != -1) {
            bundle.putInt(f8065p, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (a(d1Var) && Objects.equals(this.f8066a, d1Var.f8066a) && Objects.equals(this.d, d1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8066a, Integer.valueOf(this.f8067b), this.f8068c, this.d, Integer.valueOf(this.f8069e), Long.valueOf(this.f8070f), Long.valueOf(this.f8071g), Integer.valueOf(this.h), Integer.valueOf(this.f8072i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f8067b + ", period=" + this.f8069e + ", pos=" + this.f8070f;
        int i3 = this.h;
        if (i3 == -1) {
            return str;
        }
        StringBuilder h = t4.c.h(str, ", contentPos=");
        h.append(this.f8071g);
        h.append(", adGroup=");
        h.append(i3);
        h.append(", ad=");
        h.append(this.f8072i);
        return h.toString();
    }
}
