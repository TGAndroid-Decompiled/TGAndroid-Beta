package e2;

import android.os.Bundle;
public final class f0 {
    public static final f0 f10382f = new f0(new e0());
    public static final String f10383g;
    public static final String h;
    public static final String f10384i;
    public static final String f10385j;
    public static final String f10386k;
    public final long f10387a;
    public final long f10388b;
    public final long f10389c;
    public final float d;
    public final float f10390e;

    static {
        String str = h2.l0.f13778a;
        f10383g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f10384i = Integer.toString(2, 36);
        f10385j = Integer.toString(3, 36);
        f10386k = Integer.toString(4, 36);
    }

    public f0(e0 e0Var) {
        long j3 = e0Var.f10375a;
        long j10 = e0Var.f10376b;
        long j11 = e0Var.f10377c;
        float f10 = e0Var.d;
        float f11 = e0Var.f10378e;
        this.f10387a = j3;
        this.f10388b = j10;
        this.f10389c = j11;
        this.d = f10;
        this.f10390e = f11;
    }

    public final e0 a() {
        ?? obj = new Object();
        obj.f10375a = this.f10387a;
        obj.f10376b = this.f10388b;
        obj.f10377c = this.f10389c;
        obj.d = this.d;
        obj.f10378e = this.f10390e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        f0 f0Var = f10382f;
        long j3 = f0Var.f10387a;
        long j10 = this.f10387a;
        if (j10 != j3) {
            bundle.putLong(f10383g, j10);
        }
        long j11 = f0Var.f10388b;
        long j12 = this.f10388b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = f0Var.f10389c;
        long j14 = this.f10389c;
        if (j14 != j13) {
            bundle.putLong(f10384i, j14);
        }
        float f10 = f0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(f10385j, f11);
        }
        float f12 = f0Var.f10390e;
        float f13 = this.f10390e;
        if (f13 != f12) {
            bundle.putFloat(f10386k, f13);
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
        if (this.f10387a == f0Var.f10387a && this.f10388b == f0Var.f10388b && this.f10389c == f0Var.f10389c && this.d == f0Var.d && this.f10390e == f0Var.f10390e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.f10387a;
        long j10 = this.f10388b;
        long j11 = this.f10389c;
        int i10 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.d;
        int i11 = 0;
        if (f10 != 0.0f) {
            i7 = Float.floatToIntBits(f10);
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        float f11 = this.f10390e;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return i12 + i11;
    }
}
