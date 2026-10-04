package b2;

import android.os.Bundle;
public final class e0 {
    public static final e0 f3204f = new e0(new d0());
    public static final String f3205g;
    public static final String h;
    public static final String f3206i;
    public static final String f3207j;
    public static final String f3208k;
    public final long f3209a;
    public final long f3210b;
    public final long f3211c;
    public final float d;
    public final float f3212e;

    static {
        String str = e2.d0.f8537a;
        f3205g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f3206i = Integer.toString(2, 36);
        f3207j = Integer.toString(3, 36);
        f3208k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.f3185a;
        long j10 = d0Var.f3186b;
        long j11 = d0Var.f3187c;
        float f7 = d0Var.d;
        float f10 = d0Var.f3188e;
        this.f3209a = j3;
        this.f3210b = j10;
        this.f3211c = j11;
        this.d = f7;
        this.f3212e = f10;
    }

    public final d0 a() {
        ?? obj = new Object();
        obj.f3185a = this.f3209a;
        obj.f3186b = this.f3210b;
        obj.f3187c = this.f3211c;
        obj.d = this.d;
        obj.f3188e = this.f3212e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f3204f;
        long j3 = e0Var.f3209a;
        long j10 = this.f3209a;
        if (j10 != j3) {
            bundle.putLong(f3205g, j10);
        }
        long j11 = e0Var.f3210b;
        long j12 = this.f3210b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.f3211c;
        long j14 = this.f3211c;
        if (j14 != j13) {
            bundle.putLong(f3206i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f3207j, f10);
        }
        float f11 = e0Var.f3212e;
        float f12 = this.f3212e;
        if (f12 != f11) {
            bundle.putFloat(f3208k, f12);
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
        if (this.f3209a == e0Var.f3209a && this.f3210b == e0Var.f3210b && this.f3211c == e0Var.f3211c && this.d == e0Var.d && this.f3212e == e0Var.f3212e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f3209a;
        long j10 = this.f3210b;
        long j11 = this.f3211c;
        int i11 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        int i12 = 0;
        float f7 = this.d;
        if (f7 != 0.0f) {
            i10 = Float.floatToIntBits(f7);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f10 = this.f3212e;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
