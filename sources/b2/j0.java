package b2;

import android.os.Bundle;
public final class j0 {
    public static final j0 f2171f = new j0(new i0());
    public static final String f2172g;
    public static final String h;
    public static final String f2173i;
    public static final String f2174j;
    public static final String f2175k;
    public final long f2176a;
    public final long f2177b;
    public final long f2178c;
    public final float d;
    public final float e;

    static {
        String str = e2.m0.f8375a;
        f2172g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f2173i = Integer.toString(2, 36);
        f2174j = Integer.toString(3, 36);
        f2175k = Integer.toString(4, 36);
    }

    public j0(i0 i0Var) {
        long j10 = i0Var.f2165a;
        long j11 = i0Var.f2166b;
        long j12 = i0Var.f2167c;
        float f7 = i0Var.d;
        float f10 = i0Var.e;
        this.f2176a = j10;
        this.f2177b = j11;
        this.f2178c = j12;
        this.d = f7;
        this.e = f10;
    }

    public final i0 a() {
        ?? obj = new Object();
        obj.f2165a = this.f2176a;
        obj.f2166b = this.f2177b;
        obj.f2167c = this.f2178c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        j0 j0Var = f2171f;
        long j10 = j0Var.f2176a;
        long j11 = this.f2176a;
        if (j11 != j10) {
            bundle.putLong(f2172g, j11);
        }
        long j12 = j0Var.f2177b;
        long j13 = this.f2177b;
        if (j13 != j12) {
            bundle.putLong(h, j13);
        }
        long j14 = j0Var.f2178c;
        long j15 = this.f2178c;
        if (j15 != j14) {
            bundle.putLong(f2173i, j15);
        }
        float f7 = j0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f2174j, f10);
        }
        float f11 = j0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(f2175k, f12);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f2176a == j0Var.f2176a && this.f2177b == j0Var.f2177b && this.f2178c == j0Var.f2178c && this.d == j0Var.d && this.e == j0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f2176a;
        long j11 = this.f2177b;
        long j12 = this.f2178c;
        int i11 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f7 = this.d;
        int i12 = 0;
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
