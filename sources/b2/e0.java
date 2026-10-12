package b2;

import android.os.Bundle;
public final class e0 {
    public static final e0 f3281f = new e0(new d0());
    public static final String f3282g;
    public static final String h;
    public static final String f3283i;
    public static final String f3284j;
    public static final String f3285k;
    public final long f3286a;
    public final long f3287b;
    public final long f3288c;
    public final float d;
    public final float f3289e;

    static {
        String str = e2.d0.f8529a;
        f3282g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f3283i = Integer.toString(2, 36);
        f3284j = Integer.toString(3, 36);
        f3285k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.f3262a;
        long j10 = d0Var.f3263b;
        long j11 = d0Var.f3264c;
        float f7 = d0Var.d;
        float f10 = d0Var.f3265e;
        this.f3286a = j3;
        this.f3287b = j10;
        this.f3288c = j11;
        this.d = f7;
        this.f3289e = f10;
    }

    public final d0 a() {
        ?? obj = new Object();
        obj.f3262a = this.f3286a;
        obj.f3263b = this.f3287b;
        obj.f3264c = this.f3288c;
        obj.d = this.d;
        obj.f3265e = this.f3289e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f3281f;
        long j3 = e0Var.f3286a;
        long j10 = this.f3286a;
        if (j10 != j3) {
            bundle.putLong(f3282g, j10);
        }
        long j11 = e0Var.f3287b;
        long j12 = this.f3287b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.f3288c;
        long j14 = this.f3288c;
        if (j14 != j13) {
            bundle.putLong(f3283i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f3284j, f10);
        }
        float f11 = e0Var.f3289e;
        float f12 = this.f3289e;
        if (f12 != f11) {
            bundle.putFloat(f3285k, f12);
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
        if (this.f3286a == e0Var.f3286a && this.f3287b == e0Var.f3287b && this.f3288c == e0Var.f3288c && this.d == e0Var.d && this.f3289e == e0Var.f3289e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f3286a;
        long j10 = this.f3287b;
        long j11 = this.f3288c;
        int i11 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f7 = this.d;
        int i12 = 0;
        if (f7 != 0.0f) {
            i10 = Float.floatToIntBits(f7);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f10 = this.f3289e;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
