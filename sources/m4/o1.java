package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class o1 {
    public static final b2.a1 f16020k;
    public static final o1 f16021l;
    public static final String f16022m;
    public static final String f16023n;
    public static final String f16024o;
    public static final String f16025p;
    public static final String f16026q;
    public static final String f16027r;
    public static final String f16028s;
    public static final String f16029t;
    public static final String f16030u;
    public static final String v;
    public final b2.a1 f16031a;
    public final boolean f16032b;
    public final long f16033c;
    public final long d;
    public final long f16034e;
    public final int f16035f;
    public final long f16036g;
    public final long h;
    public final long f16037i;
    public final long f16038j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16020k = a1Var;
        f16021l = new o1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f8737a;
        f16022m = Integer.toString(0, 36);
        f16023n = Integer.toString(1, 36);
        f16024o = Integer.toString(2, 36);
        f16025p = Integer.toString(3, 36);
        f16026q = Integer.toString(4, 36);
        f16027r = Integer.toString(5, 36);
        f16028s = Integer.toString(6, 36);
        f16029t = Integer.toString(7, 36);
        f16030u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public o1(b2.a1 a1Var, boolean z10, long j3, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (a1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z10 == z11);
        this.f16031a = a1Var;
        this.f16032b = z10;
        this.f16033c = j3;
        this.d = j10;
        this.f16034e = j11;
        this.f16035f = i10;
        this.f16036g = j12;
        this.h = j13;
        this.f16037i = j14;
        this.f16038j = j15;
    }

    public final o1 a(boolean z10, boolean z11) {
        boolean z12;
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (z10 && z11) {
            return this;
        }
        b2.a1 b10 = this.f16031a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16032b) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            j3 = this.d;
        } else {
            j3 = -9223372036854775807L;
        }
        if (z10) {
            j10 = this.f16034e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f16035f;
        }
        if (z10) {
            j11 = this.f16036g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f16037i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16038j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new o1(b10, z12, this.f16033c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f16031a;
        if (i10 < 3 || !f16020k.a(a1Var)) {
            bundle.putBundle(f16022m, a1Var.c(i10));
        }
        boolean z10 = this.f16032b;
        if (z10) {
            bundle.putBoolean(f16023n, z10);
        }
        long j3 = this.f16033c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f16024o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16025p, j10);
        }
        long j11 = this.f16034e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f16026q, j11);
        }
        int i11 = this.f16035f;
        if (i11 != 0) {
            bundle.putInt(f16027r, i11);
        }
        long j12 = this.f16036g;
        if (j12 != 0) {
            bundle.putLong(f16028s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f16029t, j13);
        }
        long j14 = this.f16037i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16030u, j14);
        }
        long j15 = this.f16038j;
        if (i10 >= 3 && j15 == 0) {
            return bundle;
        }
        bundle.putLong(v, j15);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f16033c == o1Var.f16033c && this.f16031a.equals(o1Var.f16031a) && this.f16032b == o1Var.f16032b && this.d == o1Var.d && this.f16034e == o1Var.f16034e && this.f16035f == o1Var.f16035f && this.f16036g == o1Var.f16036g && this.h == o1Var.h && this.f16037i == o1Var.f16037i && this.f16038j == o1Var.f16038j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16031a, Boolean.valueOf(this.f16032b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f16031a;
        sb2.append(a1Var.f1960b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.f1962e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f1963f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f1964g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f1965i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f16032b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16033c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f16034e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16035f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16036g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16037i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.r(sb2, this.f16038j, "}");
    }
}
