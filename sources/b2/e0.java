package b2;

import android.os.Bundle;
public final class e0 {
    public static final e0 f2973f = new e0(new d0());
    public static final String f2974g;
    public static final String h;
    public static final String f2975i;
    public static final String f2976j;
    public static final String f2977k;
    public final long f2978a;
    public final long f2979b;
    public final long f2980c;
    public final float d;
    public final float e;

    static {
        String str = e2.d0.f7887a;
        f2974g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f2975i = Integer.toString(2, 36);
        f2976j = Integer.toString(3, 36);
        f2977k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.f2957a;
        long j10 = d0Var.f2958b;
        long j11 = d0Var.f2959c;
        float f7 = d0Var.d;
        float f10 = d0Var.e;
        this.f2978a = j3;
        this.f2979b = j10;
        this.f2980c = j11;
        this.d = f7;
        this.e = f10;
    }

    public final d0 a() {
        ?? obj = new Object();
        obj.f2957a = this.f2978a;
        obj.f2958b = this.f2979b;
        obj.f2959c = this.f2980c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f2973f;
        long j3 = e0Var.f2978a;
        long j10 = this.f2978a;
        if (j10 != j3) {
            bundle.putLong(f2974g, j10);
        }
        long j11 = e0Var.f2979b;
        long j12 = this.f2979b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.f2980c;
        long j14 = this.f2980c;
        if (j14 != j13) {
            bundle.putLong(f2975i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f2976j, f10);
        }
        float f11 = e0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(f2977k, f12);
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
        if (this.f2978a == e0Var.f2978a && this.f2979b == e0Var.f2979b && this.f2980c == e0Var.f2980c && this.d == e0Var.d && this.e == e0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f2978a;
        long j10 = this.f2979b;
        long j11 = this.f2980c;
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
