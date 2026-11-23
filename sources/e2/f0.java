package e2;

import android.os.Bundle;
public final class f0 {
    public static final f0 f10419f = new f0(new e0());
    public static final String f10420g;
    public static final String h;
    public static final String f10421i;
    public static final String f10422j;
    public static final String f10423k;
    public final long f10424a;
    public final long f10425b;
    public final long f10426c;
    public final float d;
    public final float f10427e;

    static {
        String str = h2.l0.f13815a;
        f10420g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f10421i = Integer.toString(2, 36);
        f10422j = Integer.toString(3, 36);
        f10423k = Integer.toString(4, 36);
    }

    public f0(e0 e0Var) {
        long j3 = e0Var.f10412a;
        long j10 = e0Var.f10413b;
        long j11 = e0Var.f10414c;
        float f10 = e0Var.d;
        float f11 = e0Var.f10415e;
        this.f10424a = j3;
        this.f10425b = j10;
        this.f10426c = j11;
        this.d = f10;
        this.f10427e = f11;
    }

    public final e0 a() {
        ?? obj = new Object();
        obj.f10412a = this.f10424a;
        obj.f10413b = this.f10425b;
        obj.f10414c = this.f10426c;
        obj.d = this.d;
        obj.f10415e = this.f10427e;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        f0 f0Var = f10419f;
        long j3 = f0Var.f10424a;
        long j10 = this.f10424a;
        if (j10 != j3) {
            bundle.putLong(f10420g, j10);
        }
        long j11 = f0Var.f10425b;
        long j12 = this.f10425b;
        if (j12 != j11) {
            bundle.putLong(h, j12);
        }
        long j13 = f0Var.f10426c;
        long j14 = this.f10426c;
        if (j14 != j13) {
            bundle.putLong(f10421i, j14);
        }
        float f10 = f0Var.d;
        float f11 = this.d;
        if (f11 != f10) {
            bundle.putFloat(f10422j, f11);
        }
        float f12 = f0Var.f10427e;
        float f13 = this.f10427e;
        if (f13 != f12) {
            bundle.putFloat(f10423k, f13);
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
        if (this.f10424a == f0Var.f10424a && this.f10425b == f0Var.f10425b && this.f10426c == f0Var.f10426c && this.d == f0Var.d && this.f10427e == f0Var.f10427e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.f10424a;
        long j10 = this.f10425b;
        long j11 = this.f10426c;
        int i10 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.d;
        int i11 = 0;
        if (f10 != 0.0f) {
            i7 = Float.floatToIntBits(f10);
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        float f11 = this.f10427e;
        if (f11 != 0.0f) {
            i11 = Float.floatToIntBits(f11);
        }
        return i12 + i11;
    }
}
