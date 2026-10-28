package b2;

import a8.yb;
import android.os.Bundle;
import j$.util.Objects;
import org.telegram.ui.Components.b10;
public final class f1 {
    public static final String f3194j;
    public static final String f3195k;
    public static final String f3196l;
    public static final String f3197m;
    public static final String f3198n;
    public static final String f3199o;
    public static final String f3200p;
    public final Object f3201a;
    public final int f3202b;
    public final p0 f3203c;
    public final Object d;
    public final int e;
    public final long f3204f;
    public final long f3205g;
    public final int h;
    public final int f3206i;

    static {
        String str = e2.n0.f9691a;
        f3194j = Integer.toString(0, 36);
        f3195k = Integer.toString(1, 36);
        f3196l = Integer.toString(2, 36);
        f3197m = Integer.toString(3, 36);
        f3198n = Integer.toString(4, 36);
        f3199o = Integer.toString(5, 36);
        f3200p = Integer.toString(6, 36);
    }

    public f1(Object obj, int i10, p0 p0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        yb.g(i11 >= 0);
        this.f3201a = obj;
        this.f3202b = i10;
        this.f3203c = p0Var;
        this.d = obj2;
        this.e = i11;
        this.f3204f = j10;
        this.f3205g = j11;
        this.h = i12;
        this.f3206i = i13;
    }

    public final boolean a(f1 f1Var) {
        if (this.f3202b == f1Var.f3202b && this.e == f1Var.e && this.f3204f == f1Var.f3204f && this.f3205g == f1Var.f3205g && this.h == f1Var.h && this.f3206i == f1Var.f3206i && Objects.equals(this.f3203c, f1Var.f3203c)) {
            return true;
        }
        return false;
    }

    public final f1 b(boolean z10, boolean z11) {
        int i10;
        p0 p0Var;
        long j10;
        int i11;
        if (z10 && z11) {
            return this;
        }
        int i12 = 0;
        if (z11) {
            i10 = this.f3202b;
        } else {
            i10 = 0;
        }
        if (z10) {
            p0Var = this.f3203c;
        } else {
            p0Var = null;
        }
        if (z11) {
            i12 = this.e;
        }
        int i13 = i12;
        long j11 = 0;
        if (z10) {
            j10 = this.f3204f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f3205g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f3206i;
        }
        return new f1(this.f3201a, i10, p0Var, this.d, i13, j10, j11, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f3202b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f3194j, i11);
        }
        p0 p0Var = this.f3203c;
        if (p0Var != null) {
            bundle.putBundle(f3195k, p0Var.c(i10, false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f3196l, i12);
        }
        long j10 = this.f3204f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f3197m, j10);
        }
        long j11 = this.f3205g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f3198n, j11);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f3199o, i13);
        }
        int i14 = this.f3206i;
        if (i14 != -1) {
            bundle.putInt(f3200p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (a(f1Var) && Objects.equals(this.f3201a, f1Var.f3201a) && Objects.equals(this.d, f1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3201a, Integer.valueOf(this.f3202b), this.f3203c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f3204f), Long.valueOf(this.f3205g), Integer.valueOf(this.h), Integer.valueOf(this.f3206i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f3202b + ", period=" + this.e + ", pos=" + this.f3204f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder l4 = b10.l(str, ", contentPos=");
        l4.append(this.f3205g);
        l4.append(", adGroup=");
        l4.append(i10);
        l4.append(", ad=");
        l4.append(this.f3206i);
        return l4.toString();
    }
}
