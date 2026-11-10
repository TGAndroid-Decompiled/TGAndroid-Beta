package e2;

import android.os.Bundle;
public final class f0 {
    public static final f0 f10241f = new f0(new e0());
    public static final String f10242g;
    public static final String h;
    public static final String f10243i;
    public static final String f10244j;
    public static final String f10245k;
    public final long f10246a;
    public final long f10247b;
    public final long f10248c;
    public final float d;
    public final float f10249e;

    static {
        String str = h2.m0.f14114a;
        f10242g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f10243i = Integer.toString(2, 36);
        f10244j = Integer.toString(3, 36);
        f10245k = Integer.toString(4, 36);
    }

    public f0(e0 e0Var) {
        long j3 = e0Var.f10234a;
        long j10 = e0Var.f10235b;
        long j11 = e0Var.f10236c;
        float f10 = e0Var.d;
        float f11 = e0Var.f10237e;
        this.f10246a = j3;
        this.f10247b = j10;
        this.f10248c = j11;
        this.d = f10;
        this.f10249e = f11;
    }

    public final e0 a() {
        ?? obj = new Object();
        obj.f10234a = this.f10246a;
        obj.f10235b = this.f10247b;
        obj.f10236c = this.f10248c;
        obj.d = this.d;
        obj.f10237e = this.f10249e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        f0 f0Var = f10241f;
        long j3 = f0Var.f10246a;
        long j10 = this.f10246a;
        if (j10 != j3) {
            bundle.putLong(f10242g, j10);
        }
        long j11 = f0Var.f10247b;
        long j12 = this.f10247b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = f0Var.f10248c;
        long j14 = this.f10248c;
        if (j14 != j13) {
            bundle.putLong(f10243i, j14);
        }
        float f10 = f0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(f10244j, f11);
        }
        float f12 = f0Var.f10249e;
        float f13 = this.f10249e;
        if (f13 != f12) {
            bundle.putFloat(f10245k, f13);
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
        if (this.f10246a == f0Var.f10246a && this.f10247b == f0Var.f10247b && this.f10248c == f0Var.f10248c && this.d == f0Var.d && this.f10249e == f0Var.f10249e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.f10246a;
        long j10 = this.f10247b;
        long j11 = this.f10248c;
        int i10 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.d;
        int i11 = 0;
        if (f10 != 0.0f) {
            i7 = Float.floatToIntBits(f10);
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        float f11 = this.f10249e;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return i12 + i11;
    }
}
