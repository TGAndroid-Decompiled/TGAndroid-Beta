package b2;

import android.os.Bundle;
public final class j0 {
    public static final j0 f2072f = new j0(new i0());
    public static final String f2073g;
    public static final String h;
    public static final String f2074i;
    public static final String f2075j;
    public static final String f2076k;
    public final long f2077a;
    public final long f2078b;
    public final long f2079c;
    public final float d;
    public final float e;

    static {
        String str = e2.l0.f6165a;
        f2073g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f2074i = Integer.toString(2, 36);
        f2075j = Integer.toString(3, 36);
        f2076k = Integer.toString(4, 36);
    }

    public j0(i0 i0Var) {
        long j10 = i0Var.f2064a;
        long j11 = i0Var.f2065b;
        long j12 = i0Var.f2066c;
        float f7 = i0Var.d;
        float f10 = i0Var.e;
        this.f2077a = j10;
        this.f2078b = j11;
        this.f2079c = j12;
        this.d = f7;
        this.e = f10;
    }

    public final i0 a() {
        ?? obj = new Object();
        obj.f2064a = this.f2077a;
        obj.f2065b = this.f2078b;
        obj.f2066c = this.f2079c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        j0 j0Var = f2072f;
        long j10 = j0Var.f2077a;
        long j11 = this.f2077a;
        if (j11 != j10) {
            bundle.putLong(f2073g, j11);
        }
        long j12 = j0Var.f2078b;
        long j13 = this.f2078b;
        if (j13 != j12) {
            bundle.putLong(h, j13);
        }
        long j14 = j0Var.f2079c;
        long j15 = this.f2079c;
        if (j15 != j14) {
            bundle.putLong(f2074i, j15);
        }
        float f7 = j0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f2075j, f10);
        }
        float f11 = j0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(f2076k, f12);
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
        if (this.f2077a == j0Var.f2077a && this.f2078b == j0Var.f2078b && this.f2079c == j0Var.f2079c && this.d == j0Var.d && this.e == j0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f2077a;
        long j11 = this.f2078b;
        long j12 = this.f2079c;
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
