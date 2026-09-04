package b2;

import android.os.Bundle;
public final class e0 {
    public static final e0 f2010f = new e0(new d0());
    public static final String f2011g;
    public static final String h;
    public static final String f2012i;
    public static final String f2013j;
    public static final String f2014k;
    public final long f2015a;
    public final long f2016b;
    public final long f2017c;
    public final float d;
    public final float f2018e;

    static {
        String str = e2.d0.f8737a;
        f2011g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f2012i = Integer.toString(2, 36);
        f2013j = Integer.toString(3, 36);
        f2014k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.f1991a;
        long j10 = d0Var.f1992b;
        long j11 = d0Var.f1993c;
        float f7 = d0Var.d;
        float f10 = d0Var.f1994e;
        this.f2015a = j3;
        this.f2016b = j10;
        this.f2017c = j11;
        this.d = f7;
        this.f2018e = f10;
    }

    public final d0 a() {
        ?? obj = new Object();
        obj.f1991a = this.f2015a;
        obj.f1992b = this.f2016b;
        obj.f1993c = this.f2017c;
        obj.d = this.d;
        obj.f1994e = this.f2018e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f2010f;
        long j3 = e0Var.f2015a;
        long j10 = this.f2015a;
        if (j10 != j3) {
            bundle.putLong(f2011g, j10);
        }
        long j11 = e0Var.f2016b;
        long j12 = this.f2016b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.f2017c;
        long j14 = this.f2017c;
        if (j14 != j13) {
            bundle.putLong(f2012i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f2013j, f10);
        }
        float f11 = e0Var.f2018e;
        float f12 = this.f2018e;
        if (f12 != f11) {
            bundle.putFloat(f2014k, f12);
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
        if (this.f2015a == e0Var.f2015a && this.f2016b == e0Var.f2016b && this.f2017c == e0Var.f2017c && this.d == e0Var.d && this.f2018e == e0Var.f2018e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f2015a;
        long j10 = this.f2016b;
        long j11 = this.f2017c;
        int i11 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        int i12 = 0;
        float f7 = this.d;
        if (f7 != 0.0f) {
            i10 = Float.floatToIntBits(f7);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f10 = this.f2018e;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
