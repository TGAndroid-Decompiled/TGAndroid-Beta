package b2;

import android.os.Bundle;
public final class e0 {
    public static final e0 f3283f = new e0(new d0());
    public static final String f3284g;
    public static final String h;
    public static final String f3285i;
    public static final String f3286j;
    public static final String f3287k;
    public final long f3288a;
    public final long f3289b;
    public final long f3290c;
    public final float d;
    public final float f3291e;

    static {
        String str = e2.d0.f8532a;
        f3284g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f3285i = Integer.toString(2, 36);
        f3286j = Integer.toString(3, 36);
        f3287k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.f3264a;
        long j10 = d0Var.f3265b;
        long j11 = d0Var.f3266c;
        float f7 = d0Var.d;
        float f10 = d0Var.f3267e;
        this.f3288a = j3;
        this.f3289b = j10;
        this.f3290c = j11;
        this.d = f7;
        this.f3291e = f10;
    }

    public final d0 a() {
        ?? obj = new Object();
        obj.f3264a = this.f3288a;
        obj.f3265b = this.f3289b;
        obj.f3266c = this.f3290c;
        obj.d = this.d;
        obj.f3267e = this.f3291e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f3283f;
        long j3 = e0Var.f3288a;
        long j10 = this.f3288a;
        if (j10 != j3) {
            bundle.putLong(f3284g, j10);
        }
        long j11 = e0Var.f3289b;
        long j12 = this.f3289b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.f3290c;
        long j14 = this.f3290c;
        if (j14 != j13) {
            bundle.putLong(f3285i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f3286j, f10);
        }
        float f11 = e0Var.f3291e;
        float f12 = this.f3291e;
        if (f12 != f11) {
            bundle.putFloat(f3287k, f12);
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
        if (this.f3288a == e0Var.f3288a && this.f3289b == e0Var.f3289b && this.f3290c == e0Var.f3290c && this.d == e0Var.d && this.f3291e == e0Var.f3291e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f3288a;
        long j10 = this.f3289b;
        long j11 = this.f3290c;
        int i11 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f7 = this.d;
        int i12 = 0;
        if (f7 != 0.0f) {
            i10 = Float.floatToIntBits(f7);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f10 = this.f3291e;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
