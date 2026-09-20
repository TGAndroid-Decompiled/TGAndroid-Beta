package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class o1 {
    public static final b2.a1 f14853k;
    public static final o1 f14854l;
    public static final String f14855m;
    public static final String f14856n;
    public static final String f14857o;
    public static final String f14858p;
    public static final String f14859q;
    public static final String f14860r;
    public static final String f14861s;
    public static final String f14862t;
    public static final String f14863u;
    public static final String v;
    public final b2.a1 f14864a;
    public final boolean f14865b;
    public final long f14866c;
    public final long d;
    public final long e;
    public final int f14867f;
    public final long f14868g;
    public final long h;
    public final long f14869i;
    public final long f14870j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f14853k = a1Var;
        f14854l = new o1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f7888a;
        f14855m = Integer.toString(0, 36);
        f14856n = Integer.toString(1, 36);
        f14857o = Integer.toString(2, 36);
        f14858p = Integer.toString(3, 36);
        f14859q = Integer.toString(4, 36);
        f14860r = Integer.toString(5, 36);
        f14861s = Integer.toString(6, 36);
        f14862t = Integer.toString(7, 36);
        f14863u = Integer.toString(8, 36);
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
        this.f14864a = a1Var;
        this.f14865b = z10;
        this.f14866c = j3;
        this.d = j10;
        this.e = j11;
        this.f14867f = i10;
        this.f14868g = j12;
        this.h = j13;
        this.f14869i = j14;
        this.f14870j = j15;
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
        b2.a1 b10 = this.f14864a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f14865b) {
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
            j10 = this.e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f14867f;
        }
        if (z10) {
            j11 = this.f14868g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f14869i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f14870j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new o1(b10, z12, this.f14866c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f14864a;
        if (i10 < 3 || !f14853k.a(a1Var)) {
            bundle.putBundle(f14855m, a1Var.c(i10));
        }
        boolean z10 = this.f14865b;
        if (z10) {
            bundle.putBoolean(f14856n, z10);
        }
        long j3 = this.f14866c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f14857o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f14858p, j10);
        }
        long j11 = this.e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f14859q, j11);
        }
        int i11 = this.f14867f;
        if (i11 != 0) {
            bundle.putInt(f14860r, i11);
        }
        long j12 = this.f14868g;
        if (j12 != 0) {
            bundle.putLong(f14861s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f14862t, j13);
        }
        long j14 = this.f14869i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f14863u, j14);
        }
        long j15 = this.f14870j;
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
            if (this.f14866c == o1Var.f14866c && this.f14864a.equals(o1Var.f14864a) && this.f14865b == o1Var.f14865b && this.d == o1Var.d && this.e == o1Var.e && this.f14867f == o1Var.f14867f && this.f14868g == o1Var.f14868g && this.h == o1Var.h && this.f14869i == o1Var.f14869i && this.f14870j == o1Var.f14870j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14864a, Boolean.valueOf(this.f14865b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f14864a;
        sb2.append(a1Var.f2930b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f2932f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f2933g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f2934i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f14865b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f14866c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f14867f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f14868g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f14869i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.r(sb2, this.f14870j, "}");
    }
}
