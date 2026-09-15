package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f2917j;
    public static final String f2918k;
    public static final String f2919l;
    public static final String f2920m;
    public static final String f2921n;
    public static final String f2922o;
    public static final String f2923p;
    public final Object f2924a;
    public final int f2925b;
    public final k0 f2926c;
    public final Object d;
    public final int e;
    public final long f2927f;
    public final long f2928g;
    public final int h;
    public final int f2929i;

    static {
        String str = e2.d0.f7883a;
        f2917j = Integer.toString(0, 36);
        f2918k = Integer.toString(1, 36);
        f2919l = Integer.toString(2, 36);
        f2920m = Integer.toString(3, 36);
        f2921n = Integer.toString(4, 36);
        f2922o = Integer.toString(5, 36);
        f2923p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f2924a = obj;
        this.f2925b = i10;
        this.f2926c = k0Var;
        this.d = obj2;
        this.e = i11;
        this.f2927f = j3;
        this.f2928g = j10;
        this.h = i12;
        this.f2929i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f2925b == a1Var.f2925b && this.e == a1Var.e && this.f2927f == a1Var.f2927f && this.f2928g == a1Var.f2928g && this.h == a1Var.h && this.f2929i == a1Var.f2929i && Objects.equals(this.f2926c, a1Var.f2926c)) {
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
            i10 = this.f2925b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f2926c;
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
            j3 = this.f2927f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f2928g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f2929i;
        } else {
            i13 = -1;
        }
        return new a1(this.f2924a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f2925b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f2917j, i11);
        }
        k0 k0Var = this.f2926c;
        if (k0Var != null) {
            bundle.putBundle(f2918k, k0Var.b(false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f2919l, i12);
        }
        long j3 = this.f2927f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f2920m, j3);
        }
        long j10 = this.f2928g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f2921n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f2922o, i13);
        }
        int i14 = this.f2929i;
        if (i14 != -1) {
            bundle.putInt(f2923p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f2924a, a1Var.f2924a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2924a, Integer.valueOf(this.f2925b), this.f2926c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f2927f), Long.valueOf(this.f2928g), Integer.valueOf(this.h), Integer.valueOf(this.f2929i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f2925b + ", period=" + this.e + ", pos=" + this.f2927f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder g10 = w.f.g(str, ", contentPos=");
        g10.append(this.f2928g);
        g10.append(", adGroup=");
        g10.append(i10);
        g10.append(", ad=");
        g10.append(this.f2929i);
        return g10.toString();
    }
}
