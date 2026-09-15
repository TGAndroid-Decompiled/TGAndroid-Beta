package b2;

import android.os.Bundle;
public final class e0 {
    public static final e0 f2968f = new e0(new d0());
    public static final String f2969g;
    public static final String h;
    public static final String f2970i;
    public static final String f2971j;
    public static final String f2972k;
    public final long f2973a;
    public final long f2974b;
    public final long f2975c;
    public final float d;
    public final float e;

    static {
        String str = e2.d0.f7883a;
        f2969g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f2970i = Integer.toString(2, 36);
        f2971j = Integer.toString(3, 36);
        f2972k = Integer.toString(4, 36);
    }

    public e0(d0 d0Var) {
        long j3 = d0Var.f2952a;
        long j10 = d0Var.f2953b;
        long j11 = d0Var.f2954c;
        float f7 = d0Var.d;
        float f10 = d0Var.e;
        this.f2973a = j3;
        this.f2974b = j10;
        this.f2975c = j11;
        this.d = f7;
        this.e = f10;
    }

    public final d0 a() {
        ?? obj = new Object();
        obj.f2952a = this.f2973a;
        obj.f2953b = this.f2974b;
        obj.f2954c = this.f2975c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e0 e0Var = f2968f;
        long j3 = e0Var.f2973a;
        long j10 = this.f2973a;
        if (j10 != j3) {
            bundle.putLong(f2969g, j10);
        }
        long j11 = e0Var.f2974b;
        long j12 = this.f2974b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = e0Var.f2975c;
        long j14 = this.f2975c;
        if (j14 != j13) {
            bundle.putLong(f2970i, j14);
        }
        float f7 = e0Var.d;
        float f10 = this.d;
        if (f10 != f7) {
            bundle.putFloat(f2971j, f10);
        }
        float f11 = e0Var.e;
        float f12 = this.e;
        if (f12 != f11) {
            bundle.putFloat(f2972k, f12);
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
        if (this.f2973a == e0Var.f2973a && this.f2974b == e0Var.f2974b && this.f2975c == e0Var.f2975c && this.d == e0Var.d && this.e == e0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f2973a;
        long j10 = this.f2974b;
        long j11 = this.f2975c;
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
