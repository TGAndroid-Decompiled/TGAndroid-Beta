package e2;

import android.os.Bundle;
public final class f0 {
    public static final f0 f10380f = new f0(new e0());
    public static final String f10381g;
    public static final String h;
    public static final String f10382i;
    public static final String f10383j;
    public static final String f10384k;
    public final long f10385a;
    public final long f10386b;
    public final long f10387c;
    public final float d;
    public final float f10388e;

    static {
        String str = h2.l0.f13778a;
        f10381g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f10382i = Integer.toString(2, 36);
        f10383j = Integer.toString(3, 36);
        f10384k = Integer.toString(4, 36);
    }

    public f0(e0 e0Var) {
        long j3 = e0Var.f10373a;
        long j10 = e0Var.f10374b;
        long j11 = e0Var.f10375c;
        float f10 = e0Var.d;
        float f11 = e0Var.f10376e;
        this.f10385a = j3;
        this.f10386b = j10;
        this.f10387c = j11;
        this.d = f10;
        this.f10388e = f11;
    }

    public final e0 a() {
        ?? obj = new Object();
        obj.f10373a = this.f10385a;
        obj.f10374b = this.f10386b;
        obj.f10375c = this.f10387c;
        obj.d = this.d;
        obj.f10376e = this.f10388e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        f0 f0Var = f10380f;
        long j3 = f0Var.f10385a;
        long j10 = this.f10385a;
        if (j10 != j3) {
            bundle.putLong(f10381g, j10);
        }
        long j11 = f0Var.f10386b;
        long j12 = this.f10386b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = f0Var.f10387c;
        long j14 = this.f10387c;
        if (j14 != j13) {
            bundle.putLong(f10382i, j14);
        }
        float f10 = f0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(f10383j, f11);
        }
        float f12 = f0Var.f10388e;
        float f13 = this.f10388e;
        if (f13 != f12) {
            bundle.putFloat(f10384k, f13);
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
        if (this.f10385a == f0Var.f10385a && this.f10386b == f0Var.f10386b && this.f10387c == f0Var.f10387c && this.d == f0Var.d && this.f10388e == f0Var.f10388e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.f10385a;
        long j10 = this.f10386b;
        long j11 = this.f10387c;
        int i10 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.d;
        int i11 = 0;
        if (f10 != 0.0f) {
            i7 = Float.floatToIntBits(f10);
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        float f11 = this.f10388e;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return i12 + i11;
    }
}
