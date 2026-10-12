package b2;

import android.os.Bundle;
public final class j0 {
    public static final j0 f2167f = new j0(new i0());
    public static final String f2168g;
    public static final String h;
    public static final String f2169i;
    public static final String f2170j;
    public static final String f2171k;
    public final long f2172a;
    public final long f2173b;
    public final long f2174c;
    public final float d;
    public final float e;

    static {
        String str = e2.m0.f8372a;
        f2168g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f2169i = Integer.toString(2, 36);
        f2170j = Integer.toString(3, 36);
        f2171k = Integer.toString(4, 36);
    }

    public j0(i0 i0Var) {
        long j10 = i0Var.f2161a;
        long j11 = i0Var.f2162b;
        long j12 = i0Var.f2163c;
        float f7 = i0Var.d;
        float f10 = i0Var.e;
        this.f2172a = j10;
        this.f2173b = j11;
        this.f2174c = j12;
        this.d = f7;
        this.e = f10;
    }

    public final i0 a() {
        ?? obj = new Object();
        obj.f2161a = this.f2172a;
        obj.f2162b = this.f2173b;
        obj.f2163c = this.f2174c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        j0 j0Var = f2167f;
        long j10 = j0Var.f2172a;
        long j11 = this.f2172a;
        if (j11 != j10) {
            bundle.putLong(f2168g, j11);
        }
        long j12 = j0Var.f2173b;
        long j13 = this.f2173b;
        if (j13 != j12) {
            bundle.putLong(h, j13);
        }
        long j14 = j0Var.f2174c;
        long j15 = this.f2174c;
        if (j15 != j14) {
            bundle.putLong(f2169i, j15);
        }
        float f7 = j0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f2170j, f10);
        }
        float f11 = j0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(f2171k, f12);
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
        if (this.f2172a == j0Var.f2172a && this.f2173b == j0Var.f2173b && this.f2174c == j0Var.f2174c && this.d == j0Var.d && this.e == j0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f2172a;
        long j11 = this.f2173b;
        long j12 = this.f2174c;
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
