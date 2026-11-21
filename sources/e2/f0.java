package e2;

import android.os.Bundle;
public final class f0 {
    public static final f0 f10416f = new f0(new e0());
    public static final String f10417g;
    public static final String h;
    public static final String f10418i;
    public static final String f10419j;
    public static final String f10420k;
    public final long f10421a;
    public final long f10422b;
    public final long f10423c;
    public final float d;
    public final float f10424e;

    static {
        String str = h2.l0.f13812a;
        f10417g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f10418i = Integer.toString(2, 36);
        f10419j = Integer.toString(3, 36);
        f10420k = Integer.toString(4, 36);
    }

    public f0(e0 e0Var) {
        long j3 = e0Var.f10409a;
        long j10 = e0Var.f10410b;
        long j11 = e0Var.f10411c;
        float f10 = e0Var.d;
        float f11 = e0Var.f10412e;
        this.f10421a = j3;
        this.f10422b = j10;
        this.f10423c = j11;
        this.d = f10;
        this.f10424e = f11;
    }

    public final e0 a() {
        ?? obj = new Object();
        obj.f10409a = this.f10421a;
        obj.f10410b = this.f10422b;
        obj.f10411c = this.f10423c;
        obj.d = this.d;
        obj.f10412e = this.f10424e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        f0 f0Var = f10416f;
        long j3 = f0Var.f10421a;
        long j10 = this.f10421a;
        if (j10 != j3) {
            bundle.putLong(f10417g, j10);
        }
        long j11 = f0Var.f10422b;
        long j12 = this.f10422b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = f0Var.f10423c;
        long j14 = this.f10423c;
        if (j14 != j13) {
            bundle.putLong(f10418i, j14);
        }
        float f10 = f0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(f10419j, f11);
        }
        float f12 = f0Var.f10424e;
        float f13 = this.f10424e;
        if (f13 != f12) {
            bundle.putFloat(f10420k, f13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f10421a == f0Var.f10421a && this.f10422b == f0Var.f10422b && this.f10423c == f0Var.f10423c && this.d == f0Var.d && this.f10424e == f0Var.f10424e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.f10421a;
        long j10 = this.f10422b;
        long j11 = this.f10423c;
        int i10 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.d;
        int i11 = 0;
        if (f10 != 0.0f) {
            i7 = Float.floatToIntBits(f10);
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        float f11 = this.f10424e;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return i12 + i11;
    }
}
