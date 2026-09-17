package b2;

import android.os.Bundle;
public final class e0 {
    public static final e0 f2037f = new e0(new d0());
    public static final String f2038g;
    public static final String h;
    public static final String f2039i;
    public static final String f2040j;
    public static final String f2041k;
    public final long f2042a;
    public final long f2043b;
    public final long f2044c;
    public final float d;
    public final float f2045e;

    static {
        String str = e2.d0.f8765a;
        f2038g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f2039i = Integer.toString(2, 36);
        f2040j = Integer.toString(3, 36);
        f2041k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.f2018a;
        long j10 = d0Var.f2019b;
        long j11 = d0Var.f2020c;
        float f7 = d0Var.d;
        float f10 = d0Var.f2021e;
        this.f2042a = j3;
        this.f2043b = j10;
        this.f2044c = j11;
        this.d = f7;
        this.f2045e = f10;
    }

    public final d0 a() {
        ?? obj = new Object();
        obj.f2018a = this.f2042a;
        obj.f2019b = this.f2043b;
        obj.f2020c = this.f2044c;
        obj.d = this.d;
        obj.f2021e = this.f2045e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f2037f;
        long j3 = e0Var.f2042a;
        long j10 = this.f2042a;
        if (j10 != j3) {
            bundle.putLong(f2038g, j10);
        }
        long j11 = e0Var.f2043b;
        long j12 = this.f2043b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.f2044c;
        long j14 = this.f2044c;
        if (j14 != j13) {
            bundle.putLong(f2039i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f2040j, f10);
        }
        float f11 = e0Var.f2045e;
        float f12 = this.f2045e;
        if (f12 != f11) {
            bundle.putFloat(f2041k, f12);
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
        if (this.f2042a == e0Var.f2042a && this.f2043b == e0Var.f2043b && this.f2044c == e0Var.f2044c && this.d == e0Var.d && this.f2045e == e0Var.f2045e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f2042a;
        long j10 = this.f2043b;
        long j11 = this.f2044c;
        int i11 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        int i12 = 0;
        float f7 = this.d;
        if (f7 != 0.0f) {
            i10 = Float.floatToIntBits(f7);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f10 = this.f2045e;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
