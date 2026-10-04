package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f3146j;
    public static final String f3147k;
    public static final String f3148l;
    public static final String f3149m;
    public static final String f3150n;
    public static final String f3151o;
    public static final String f3152p;
    public final Object f3153a;
    public final int f3154b;
    public final k0 f3155c;
    public final Object d;
    public final int f3156e;
    public final long f3157f;
    public final long f3158g;
    public final int h;
    public final int f3159i;

    static {
        String str = e2.d0.f8537a;
        f3146j = Integer.toString(0, 36);
        f3147k = Integer.toString(1, 36);
        f3148l = Integer.toString(2, 36);
        f3149m = Integer.toString(3, 36);
        f3150n = Integer.toString(4, 36);
        f3151o = Integer.toString(5, 36);
        f3152p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f3153a = obj;
        this.f3154b = i10;
        this.f3155c = k0Var;
        this.d = obj2;
        this.f3156e = i11;
        this.f3157f = j3;
        this.f3158g = j10;
        this.h = i12;
        this.f3159i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f3154b == a1Var.f3154b && this.f3156e == a1Var.f3156e && this.f3157f == a1Var.f3157f && this.f3158g == a1Var.f3158g && this.h == a1Var.h && this.f3159i == a1Var.f3159i && Objects.equals(this.f3155c, a1Var.f3155c)) {
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
            i10 = this.f3154b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f3155c;
        } else {
            k0Var = null;
        }
        if (z11) {
            i11 = this.f3156e;
        } else {
            i11 = 0;
        }
        long j10 = 0;
        if (z10) {
            j3 = this.f3157f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f3158g;
        }
        if (z10) {
            i12 = this.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = this.f3159i;
        } else {
            i13 = -1;
        }
        return new a1(this.f3153a, i10, k0Var, this.d, i11, j3, j10, i12, i13);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f3154b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f3146j, i11);
        }
        k0 k0Var = this.f3155c;
        if (k0Var != null) {
            bundle.putBundle(f3147k, k0Var.b(false));
        }
        int i12 = this.f3156e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f3148l, i12);
        }
        long j3 = this.f3157f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f3149m, j3);
        }
        long j10 = this.f3158g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f3150n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f3151o, i13);
        }
        int i14 = this.f3159i;
        if (i14 != -1) {
            bundle.putInt(f3152p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f3153a, a1Var.f3153a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3153a, Integer.valueOf(this.f3154b), this.f3155c, this.d, Integer.valueOf(this.f3156e), Long.valueOf(this.f3157f), Long.valueOf(this.f3158g), Integer.valueOf(this.h), Integer.valueOf(this.f3159i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f3154b + ", period=" + this.f3156e + ", pos=" + this.f3157f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder j3 = t8.b.j(str, ", contentPos=");
        j3.append(this.f3158g);
        j3.append(", adGroup=");
        j3.append(i10);
        j3.append(", ad=");
        j3.append(this.f3159i);
        return j3.toString();
    }
}
