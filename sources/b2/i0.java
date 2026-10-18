package b2;

import android.os.Bundle;
public final class i0 {
    public static final i0 f3780f = new i0(new h0());
    public static final String f3781g;
    public static final String h;
    public static final String f3782i;
    public static final String f3783j;
    public static final String f3784k;
    public final long f3785a;
    public final long f3786b;
    public final long f3787c;
    public final float d;
    public final float e;

    static {
        String str = e2.m0.f8253a;
        f3781g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f3782i = Integer.toString(2, 36);
        f3783j = Integer.toString(3, 36);
        f3784k = Integer.toString(4, 36);
    }

    public i0(h0 h0Var) {
        long j10 = h0Var.f3774a;
        long j11 = h0Var.f3775b;
        long j12 = h0Var.f3776c;
        float f7 = h0Var.d;
        float f10 = h0Var.e;
        this.f3785a = j10;
        this.f3786b = j11;
        this.f3787c = j12;
        this.d = f7;
        this.e = f10;
    }

    public final h0 a() {
        ?? obj = new Object();
        obj.f3774a = this.f3785a;
        obj.f3775b = this.f3786b;
        obj.f3776c = this.f3787c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        i0 i0Var = f3780f;
        long j10 = i0Var.f3785a;
        long j11 = this.f3785a;
        if (j11 != j10) {
            bundle.putLong(f3781g, j11);
        }
        long j12 = i0Var.f3786b;
        long j13 = this.f3786b;
        if (j13 != j12) {
            bundle.putLong(h, j13);
        }
        long j14 = i0Var.f3787c;
        long j15 = this.f3787c;
        if (j15 != j14) {
            bundle.putLong(f3782i, j15);
        }
        float f7 = i0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f3783j, f10);
        }
        float f11 = i0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(f3784k, f12);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f3785a == i0Var.f3785a && this.f3786b == i0Var.f3786b && this.f3787c == i0Var.f3787c && this.d == i0Var.d && this.e == i0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f3785a;
        long j11 = this.f3786b;
        long j12 = this.f3787c;
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
