package d2;

import android.os.Bundle;
public final class h0 {
    public static final h0 f8116f = new h0(new g0());
    public static final String f8117g;
    public static final String h;
    public static final String f8118i;
    public static final String f8119j;
    public static final String f8120k;
    public final long f8121a;
    public final long f8122b;
    public final long f8123c;
    public final float d;
    public final float f8124e;

    static {
        String str = g2.n0.f11873a;
        f8117g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f8118i = Integer.toString(2, 36);
        f8119j = Integer.toString(3, 36);
        f8120k = Integer.toString(4, 36);
    }

    public h0(g0 g0Var) {
        long j10 = g0Var.f8108a;
        long j11 = g0Var.f8109b;
        long j12 = g0Var.f8110c;
        float f10 = g0Var.d;
        float f11 = g0Var.f8111e;
        this.f8121a = j10;
        this.f8122b = j11;
        this.f8123c = j12;
        this.d = f10;
        this.f8124e = f11;
    }

    public final g0 a() {
        ?? obj = new Object();
        obj.f8108a = this.f8121a;
        obj.f8109b = this.f8122b;
        obj.f8110c = this.f8123c;
        obj.d = this.d;
        obj.f8111e = this.f8124e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        h0 h0Var = f8116f;
        long j10 = h0Var.f8121a;
        long j11 = this.f8121a;
        if (j11 != j10) {
            bundle.putLong(f8117g, j11);
        }
        long j12 = h0Var.f8122b;
        long j13 = this.f8122b;
        if (j13 != j12) {
            bundle.putLong(h, j13);
        }
        long j14 = h0Var.f8123c;
        long j15 = this.f8123c;
        if (j15 != j14) {
            bundle.putLong(f8118i, j15);
        }
        float f10 = h0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(f8119j, f11);
        }
        float f12 = h0Var.f8124e;
        float f13 = this.f8124e;
        if (f13 != f12) {
            bundle.putFloat(f8120k, f13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f8121a == h0Var.f8121a && this.f8122b == h0Var.f8122b && this.f8123c == h0Var.f8123c && this.d == h0Var.d && this.f8124e == h0Var.f8124e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        long j10 = this.f8121a;
        long j11 = this.f8122b;
        long j12 = this.f8123c;
        int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.d;
        int i11 = 0;
        if (f10 != 0.0f) {
            i3 = Float.floatToIntBits(f10);
        } else {
            i3 = 0;
        }
        int i12 = (i10 + i3) * 31;
        float f11 = this.f8124e;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return i12 + i11;
    }
}
