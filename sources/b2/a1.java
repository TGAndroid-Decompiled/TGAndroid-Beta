package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f2921j;
    public static final String f2922k;
    public static final String f2923l;
    public static final String f2924m;
    public static final String f2925n;
    public static final String f2926o;
    public static final String f2927p;
    public final Object f2928a;
    public final int f2929b;
    public final k0 f2930c;
    public final Object d;
    public final int e;
    public final long f2931f;
    public final long f2932g;
    public final int h;
    public final int f2933i;

    static {
        String str = e2.d0.f7887a;
        f2921j = Integer.toString(0, 36);
        f2922k = Integer.toString(1, 36);
        f2923l = Integer.toString(2, 36);
        f2924m = Integer.toString(3, 36);
        f2925n = Integer.toString(4, 36);
        f2926o = Integer.toString(5, 36);
        f2927p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f2928a = obj;
        this.f2929b = i10;
        this.f2930c = k0Var;
        this.d = obj2;
        this.e = i11;
        this.f2931f = j3;
        this.f2932g = j10;
        this.h = i12;
        this.f2933i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f2929b == a1Var.f2929b && this.e == a1Var.e && this.f2931f == a1Var.f2931f && this.f2932g == a1Var.f2932g && this.h == a1Var.h && this.f2933i == a1Var.f2933i && Objects.equals(this.f2930c, a1Var.f2930c)) {
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
            i10 = this.f2929b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f2930c;
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
            j3 = this.f2931f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f2932g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f2933i;
        } else {
            i13 = -1;
        }
        return new a1(this.f2928a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f2929b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f2921j, i11);
        }
        k0 k0Var = this.f2930c;
        if (k0Var != null) {
            bundle.putBundle(f2922k, k0Var.b(false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f2923l, i12);
        }
        long j3 = this.f2931f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f2924m, j3);
        }
        long j10 = this.f2932g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f2925n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f2926o, i13);
        }
        int i14 = this.f2933i;
        if (i14 != -1) {
            bundle.putInt(f2927p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f2928a, a1Var.f2928a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2928a, Integer.valueOf(this.f2929b), this.f2930c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f2931f), Long.valueOf(this.f2932g), Integer.valueOf(this.h), Integer.valueOf(this.f2933i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f2929b + ", period=" + this.e + ", pos=" + this.f2931f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder h = v7.j0.h(str, ", contentPos=");
        h.append(this.f2932g);
        h.append(", adGroup=");
        h.append(i10);
        h.append(", ad=");
        h.append(this.f2933i);
        return h.toString();
    }
}
