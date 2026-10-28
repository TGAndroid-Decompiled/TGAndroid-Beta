package b2;

import android.os.Bundle;
public final class j0 {
    public static final j0 f3234f = new j0(new i0());
    public static final String f3235g;
    public static final String h;
    public static final String f3236i;
    public static final String f3237j;
    public static final String f3238k;
    public final long f3239a;
    public final long f3240b;
    public final long f3241c;
    public final float d;
    public final float e;

    static {
        String str = e2.n0.f9691a;
        f3235g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f3236i = Integer.toString(2, 36);
        f3237j = Integer.toString(3, 36);
        f3238k = Integer.toString(4, 36);
    }

    public j0(i0 i0Var) {
        long j10 = i0Var.f3228a;
        long j11 = i0Var.f3229b;
        long j12 = i0Var.f3230c;
        float f7 = i0Var.d;
        float f10 = i0Var.e;
        this.f3239a = j10;
        this.f3240b = j11;
        this.f3241c = j12;
        this.d = f7;
        this.e = f10;
    }

    public final i0 a() {
        ?? obj = new Object();
        obj.f3228a = this.f3239a;
        obj.f3229b = this.f3240b;
        obj.f3230c = this.f3241c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        j0 j0Var = f3234f;
        long j10 = j0Var.f3239a;
        long j11 = this.f3239a;
        if (j11 != j10) {
            bundle.putLong(f3235g, j11);
        }
        long j12 = j0Var.f3240b;
        long j13 = this.f3240b;
        if (j13 != j12) {
            bundle.putLong(h, j13);
        }
        long j14 = j0Var.f3241c;
        long j15 = this.f3241c;
        if (j15 != j14) {
            bundle.putLong(f3236i, j15);
        }
        float f7 = j0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f3237j, f10);
        }
        float f11 = j0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(f3238k, f12);
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
        if (this.f3239a == j0Var.f3239a && this.f3240b == j0Var.f3240b && this.f3241c == j0Var.f3241c && this.d == j0Var.d && this.e == j0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f3239a;
        long j11 = this.f3240b;
        long j12 = this.f3241c;
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
