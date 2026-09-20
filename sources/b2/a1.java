package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f2922j;
    public static final String f2923k;
    public static final String f2924l;
    public static final String f2925m;
    public static final String f2926n;
    public static final String f2927o;
    public static final String f2928p;
    public final Object f2929a;
    public final int f2930b;
    public final k0 f2931c;
    public final Object d;
    public final int e;
    public final long f2932f;
    public final long f2933g;
    public final int h;
    public final int f2934i;

    static {
        String str = e2.d0.f7888a;
        f2922j = Integer.toString(0, 36);
        f2923k = Integer.toString(1, 36);
        f2924l = Integer.toString(2, 36);
        f2925m = Integer.toString(3, 36);
        f2926n = Integer.toString(4, 36);
        f2927o = Integer.toString(5, 36);
        f2928p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f2929a = obj;
        this.f2930b = i10;
        this.f2931c = k0Var;
        this.d = obj2;
        this.e = i11;
        this.f2932f = j3;
        this.f2933g = j10;
        this.h = i12;
        this.f2934i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f2930b == a1Var.f2930b && this.e == a1Var.e && this.f2932f == a1Var.f2932f && this.f2933g == a1Var.f2933g && this.h == a1Var.h && this.f2934i == a1Var.f2934i && Objects.equals(this.f2931c, a1Var.f2931c)) {
            return true;
        }
        return false;
    }

    public final a1 b(boolean z10, boolean z11) {
        int i10;
        k0 k0Var;
        int i11;
        long j3;
        int i12;
        int i13;
        if (z10 && z11) {
            return this;
        }
        if (z11) {
            i10 = this.f2930b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f2931c;
        } else {
            k0Var = null;
        }
        if (z11) {
            i11 = this.e;
        } else {
            i11 = 0;
        }
        long j10 = 0;
        if (z10) {
            j3 = this.f2932f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f2933g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f2934i;
        } else {
            i13 = -1;
        }
        return new a1(this.f2929a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f2930b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f2922j, i11);
        }
        k0 k0Var = this.f2931c;
        if (k0Var != null) {
            bundle.putBundle(f2923k, k0Var.b(false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f2924l, i12);
        }
        long j3 = this.f2932f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f2925m, j3);
        }
        long j10 = this.f2933g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f2926n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f2927o, i13);
        }
        int i14 = this.f2934i;
        if (i14 != -1) {
            bundle.putInt(f2928p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f2929a, a1Var.f2929a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2929a, Integer.valueOf(this.f2930b), this.f2931c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f2932f), Long.valueOf(this.f2933g), Integer.valueOf(this.h), Integer.valueOf(this.f2934i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f2930b + ", period=" + this.e + ", pos=" + this.f2932f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder h = v7.j0.h(str, ", contentPos=");
        h.append(this.f2933g);
        h.append(", adGroup=");
        h.append(i10);
        h.append(", ad=");
        h.append(this.f2934i);
        return h.toString();
    }
}
