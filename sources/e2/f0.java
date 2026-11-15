package e2;

import android.os.Bundle;
public final class f0 {
    public static final f0 f10072f = new f0(new e0());
    public static final String f10073g;
    public static final String h;
    public static final String f10074i;
    public static final String f10075j;
    public static final String f10076k;
    public final long f10077a;
    public final long f10078b;
    public final long f10079c;
    public final float d;
    public final float f10080e;

    static {
        String str = h2.l0.f13471a;
        f10073g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f10074i = Integer.toString(2, 36);
        f10075j = Integer.toString(3, 36);
        f10076k = Integer.toString(4, 36);
    }

    public f0(e0 e0Var) {
        long j3 = e0Var.f10065a;
        long j10 = e0Var.f10066b;
        long j11 = e0Var.f10067c;
        float f10 = e0Var.d;
        float f11 = e0Var.f10068e;
        this.f10077a = j3;
        this.f10078b = j10;
        this.f10079c = j11;
        this.d = f10;
        this.f10080e = f11;
    }

    public final e0 a() {
        ?? obj = new Object();
        obj.f10065a = this.f10077a;
        obj.f10066b = this.f10078b;
        obj.f10067c = this.f10079c;
        obj.d = this.d;
        obj.f10068e = this.f10080e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        f0 f0Var = f10072f;
        long j3 = f0Var.f10077a;
        long j10 = this.f10077a;
        if (j10 != j3) {
            bundle.putLong(f10073g, j10);
        }
        long j11 = f0Var.f10078b;
        long j12 = this.f10078b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = f0Var.f10079c;
        long j14 = this.f10079c;
        if (j14 != j13) {
            bundle.putLong(f10074i, j14);
        }
        float f10 = f0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(f10075j, f11);
        }
        float f12 = f0Var.f10080e;
        float f13 = this.f10080e;
        if (f13 != f12) {
            bundle.putFloat(f10076k, f13);
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
        if (this.f10077a == f0Var.f10077a && this.f10078b == f0Var.f10078b && this.f10079c == f0Var.f10079c && this.d == f0Var.d && this.f10080e == f0Var.f10080e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.f10077a;
        long j10 = this.f10078b;
        long j11 = this.f10079c;
        int i10 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.d;
        int i11 = 0;
        if (f10 != 0.0f) {
            i7 = Float.floatToIntBits(f10);
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        float f11 = this.f10080e;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return i12 + i11;
    }
}
