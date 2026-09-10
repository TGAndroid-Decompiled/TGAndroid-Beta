package b2;

import android.os.Bundle;
public final class e0 {
    public static final e0 f1666f = new e0(new d0());
    public static final String f1667g;
    public static final String h;
    public static final String f1668i;
    public static final String f1669j;
    public static final String f1670k;
    public final long f1671a;
    public final long f1672b;
    public final long f1673c;
    public final float d;
    public final float e;

    static {
        String str = e2.d0.f7188a;
        f1667g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f1668i = Integer.toString(2, 36);
        f1669j = Integer.toString(3, 36);
        f1670k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.f1650a;
        long j10 = d0Var.f1651b;
        long j11 = d0Var.f1652c;
        float f7 = d0Var.d;
        float f10 = d0Var.e;
        this.f1671a = j3;
        this.f1672b = j10;
        this.f1673c = j11;
        this.d = f7;
        this.e = f10;
    }

    public final d0 a() {
        ?? obj = new Object();
        obj.f1650a = this.f1671a;
        obj.f1651b = this.f1672b;
        obj.f1652c = this.f1673c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f1666f;
        long j3 = e0Var.f1671a;
        long j10 = this.f1671a;
        if (j10 != j3) {
            bundle.putLong(f1667g, j10);
        }
        long j11 = e0Var.f1672b;
        long j12 = this.f1672b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.f1673c;
        long j14 = this.f1673c;
        if (j14 != j13) {
            bundle.putLong(f1668i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f1669j, f10);
        }
        float f11 = e0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(f1670k, f12);
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
        if (this.f1671a == e0Var.f1671a && this.f1672b == e0Var.f1672b && this.f1673c == e0Var.f1673c && this.d == e0Var.d && this.e == e0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f1671a;
        long j10 = this.f1672b;
        long j11 = this.f1673c;
        int i11 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        int i12 = 0;
        float f7 = this.d;
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
