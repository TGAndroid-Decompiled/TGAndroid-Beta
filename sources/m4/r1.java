package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class r1 {
    public static final b2.e1 f16697k;
    public static final r1 f16698l;
    public static final String f16699m;
    public static final String f16700n;
    public static final String f16701o;
    public static final String f16702p;
    public static final String f16703q;
    public static final String f16704r;
    public static final String f16705s;
    public static final String f16706t;
    public static final String f16707u;
    public static final String v;
    public final b2.e1 f16708a;
    public final boolean f16709b;
    public final long f16710c;
    public final long d;
    public final long e;
    public final int f16711f;
    public final long f16712g;
    public final long h;
    public final long f16713i;
    public final long f16714j;

    static {
        b2.e1 e1Var = new b2.e1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16697k = e1Var;
        f16698l = new r1(e1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.m0.f8254a;
        f16699m = Integer.toString(0, 36);
        f16700n = Integer.toString(1, 36);
        f16701o = Integer.toString(2, 36);
        f16702p = Integer.toString(3, 36);
        f16703q = Integer.toString(4, 36);
        f16704r = Integer.toString(5, 36);
        f16705s = Integer.toString(6, 36);
        f16706t = Integer.toString(7, 36);
        f16707u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public r1(b2.e1 e1Var, boolean z10, long j10, long j11, long j12, int i10, long j13, long j14, long j15, long j16) {
        boolean z11;
        if (e1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z10 == z11);
        this.f16708a = e1Var;
        this.f16709b = z10;
        this.f16710c = j10;
        this.d = j11;
        this.e = j12;
        this.f16711f = i10;
        this.f16712g = j13;
        this.h = j14;
        this.f16713i = j15;
        this.f16714j = j16;
    }

    public final r1 a(boolean z10, boolean z11) {
        boolean z12;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        if (z10 && z11) {
            return this;
        }
        b2.e1 b10 = this.f16708a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16709b) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            j10 = this.d;
        } else {
            j10 = -9223372036854775807L;
        }
        if (z10) {
            j11 = this.e;
        } else {
            j11 = 0;
        }
        if (z10) {
            i10 = this.f16711f;
        }
        if (z10) {
            j12 = this.f16712g;
        } else {
            j12 = 0;
        }
        if (z10) {
            j13 = this.h;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16713i;
        } else {
            j14 = -9223372036854775807L;
        }
        if (z10) {
            j15 = this.f16714j;
        } else {
            j15 = 0;
        }
        return new r1(b10, z12, this.f16710c, j10, j11, i10, j12, j13, j14, j15);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.e1 e1Var = this.f16708a;
        if (i10 < 3 || !f16697k.a(e1Var)) {
            bundle.putBundle(f16699m, e1Var.c(i10));
        }
        boolean z10 = this.f16709b;
        if (z10) {
            bundle.putBoolean(f16700n, z10);
        }
        long j10 = this.f16710c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16701o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f16702p, j11);
        }
        long j12 = this.e;
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(f16703q, j12);
        }
        int i11 = this.f16711f;
        if (i11 != 0) {
            bundle.putInt(f16704r, i11);
        }
        long j13 = this.f16712g;
        if (j13 != 0) {
            bundle.putLong(f16705s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16706t, j14);
        }
        long j15 = this.f16713i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f16707u, j15);
        }
        long j16 = this.f16714j;
        if (i10 >= 3 && j16 == 0) {
            return bundle;
        }
        bundle.putLong(v, j16);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f16710c == r1Var.f16710c && this.f16708a.equals(r1Var.f16708a) && this.f16709b == r1Var.f16709b && this.d == r1Var.d && this.e == r1Var.e && this.f16711f == r1Var.f16711f && this.f16712g == r1Var.f16712g && this.h == r1Var.h && this.f16713i == r1Var.f16713i && this.f16714j == r1Var.f16714j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16708a, Boolean.valueOf(this.f16709b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.e1 e1Var = this.f16708a;
        sb2.append(e1Var.f3735b);
        sb2.append(", periodIndex=");
        sb2.append(e1Var.e);
        sb2.append(", positionMs=");
        sb2.append(e1Var.f3737f);
        sb2.append(", contentPositionMs=");
        sb2.append(e1Var.f3738g);
        sb2.append(", adGroupIndex=");
        sb2.append(e1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(e1Var.f3739i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f16709b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16710c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16711f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16712g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16713i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.r(sb2, this.f16714j, "}");
    }
}
