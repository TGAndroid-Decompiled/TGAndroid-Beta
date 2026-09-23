package b2;

import android.os.Bundle;
public final class e0 {
    public static final e0 f2965f = new e0(new d0());
    public static final String f2966g;
    public static final String h;
    public static final String f2967i;
    public static final String f2968j;
    public static final String f2969k;
    public final long f2970a;
    public final long f2971b;
    public final long f2972c;
    public final float d;
    public final float e;

    static {
        String str = e2.d0.f7871a;
        f2966g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f2967i = Integer.toString(2, 36);
        f2968j = Integer.toString(3, 36);
        f2969k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.f2949a;
        long j10 = d0Var.f2950b;
        long j11 = d0Var.f2951c;
        float f7 = d0Var.d;
        float f10 = d0Var.e;
        this.f2970a = j3;
        this.f2971b = j10;
        this.f2972c = j11;
        this.d = f7;
        this.e = f10;
    }

    public final d0 a() {
        ?? obj = new Object();
        obj.f2949a = this.f2970a;
        obj.f2950b = this.f2971b;
        obj.f2951c = this.f2972c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f2965f;
        long j3 = e0Var.f2970a;
        long j10 = this.f2970a;
        if (j10 != j3) {
            bundle.putLong(f2966g, j10);
        }
        long j11 = e0Var.f2971b;
        long j12 = this.f2971b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.f2972c;
        long j14 = this.f2972c;
        if (j14 != j13) {
            bundle.putLong(f2967i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f2968j, f10);
        }
        float f11 = e0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(f2969k, f12);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f2970a == e0Var.f2970a && this.f2971b == e0Var.f2971b && this.f2972c == e0Var.f2972c && this.d == e0Var.d && this.e == e0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f2970a;
        long j10 = this.f2971b;
        long j11 = this.f2972c;
        int i11 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        int i12 = 0;
        float f7 = this.d;
        if (f7 != 0.0f) {
            i10 = Float.floatToIntBits(f7);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f10 = this.e;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
