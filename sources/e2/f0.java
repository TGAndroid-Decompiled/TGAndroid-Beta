package e2;

import android.os.Bundle;
public final class f0 {
    public static final f0 f10236f = new f0(new e0());
    public static final String f10237g;
    public static final String h;
    public static final String f10238i;
    public static final String f10239j;
    public static final String f10240k;
    public final long f10241a;
    public final long f10242b;
    public final long f10243c;
    public final float d;
    public final float f10244e;

    static {
        String str = h2.m0.f14112a;
        f10237g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f10238i = Integer.toString(2, 36);
        f10239j = Integer.toString(3, 36);
        f10240k = Integer.toString(4, 36);
    }

    public f0(e0 e0Var) {
        long j3 = e0Var.f10229a;
        long j10 = e0Var.f10230b;
        long j11 = e0Var.f10231c;
        float f10 = e0Var.d;
        float f11 = e0Var.f10232e;
        this.f10241a = j3;
        this.f10242b = j10;
        this.f10243c = j11;
        this.d = f10;
        this.f10244e = f11;
    }

    public final e0 a() {
        ?? obj = new Object();
        obj.f10229a = this.f10241a;
        obj.f10230b = this.f10242b;
        obj.f10231c = this.f10243c;
        obj.d = this.d;
        obj.f10232e = this.f10244e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        f0 f0Var = f10236f;
        long j3 = f0Var.f10241a;
        long j10 = this.f10241a;
        if (j10 != j3) {
            bundle.putLong(f10237g, j10);
        }
        long j11 = f0Var.f10242b;
        long j12 = this.f10242b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = f0Var.f10243c;
        long j14 = this.f10243c;
        if (j14 != j13) {
            bundle.putLong(f10238i, j14);
        }
        float f10 = f0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(f10239j, f11);
        }
        float f12 = f0Var.f10244e;
        float f13 = this.f10244e;
        if (f13 != f12) {
            bundle.putFloat(f10240k, f13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f10241a == f0Var.f10241a && this.f10242b == f0Var.f10242b && this.f10243c == f0Var.f10243c && this.d == f0Var.d && this.f10244e == f0Var.f10244e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.f10241a;
        long j10 = this.f10242b;
        long j11 = this.f10243c;
        int i10 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.d;
        int i11 = 0;
        if (f10 != 0.0f) {
            i7 = Float.floatToIntBits(f10);
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        float f11 = this.f10244e;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return i12 + i11;
    }
}
