package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class r1 {
    public static final b2.f1 f15345k;
    public static final r1 f15346l;
    public static final String f15347m;
    public static final String f15348n;
    public static final String f15349o;
    public static final String f15350p;
    public static final String f15351q;
    public static final String f15352r;
    public static final String f15353s;
    public static final String f15354t;
    public static final String f15355u;
    public static final String v;
    public final b2.f1 f15356a;
    public final boolean f15357b;
    public final long f15358c;
    public final long d;
    public final long e;
    public final int f15359f;
    public final long f15360g;
    public final long h;
    public final long f15361i;
    public final long f15362j;

    static {
        b2.f1 f1Var = new b2.f1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f15345k = f1Var;
        f15346l = new r1(f1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.m0.f8375a;
        f15347m = Integer.toString(0, 36);
        f15348n = Integer.toString(1, 36);
        f15349o = Integer.toString(2, 36);
        f15350p = Integer.toString(3, 36);
        f15351q = Integer.toString(4, 36);
        f15352r = Integer.toString(5, 36);
        f15353s = Integer.toString(6, 36);
        f15354t = Integer.toString(7, 36);
        f15355u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public r1(b2.f1 f1Var, boolean z10, long j10, long j11, long j12, int i10, long j13, long j14, long j15, long j16) {
        boolean z11;
        if (f1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z10 == z11);
        this.f15356a = f1Var;
        this.f15357b = z10;
        this.f15358c = j10;
        this.d = j11;
        this.e = j12;
        this.f15359f = i10;
        this.f15360g = j13;
        this.h = j14;
        this.f15361i = j15;
        this.f15362j = j16;
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
        b2.f1 b10 = this.f15356a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f15357b) {
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
            i10 = this.f15359f;
        }
        if (z10) {
            j12 = this.f15360g;
        } else {
            j12 = 0;
        }
        if (z10) {
            j13 = this.h;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f15361i;
        } else {
            j14 = -9223372036854775807L;
        }
        if (z10) {
            j15 = this.f15362j;
        } else {
            j15 = 0;
        }
        return new r1(b10, z12, this.f15358c, j10, j11, i10, j12, j13, j14, j15);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.f1 f1Var = this.f15356a;
        if (i10 < 3 || !f15345k.a(f1Var)) {
            bundle.putBundle(f15347m, f1Var.c(i10));
        }
        boolean z10 = this.f15357b;
        if (z10) {
            bundle.putBoolean(f15348n, z10);
        }
        long j10 = this.f15358c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f15349o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f15350p, j11);
        }
        long j12 = this.e;
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(f15351q, j12);
        }
        int i11 = this.f15359f;
        if (i11 != 0) {
            bundle.putInt(f15352r, i11);
        }
        long j13 = this.f15360g;
        if (j13 != 0) {
            bundle.putLong(f15353s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f15354t, j14);
        }
        long j15 = this.f15361i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f15355u, j15);
        }
        long j16 = this.f15362j;
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
            if (this.f15358c == r1Var.f15358c && this.f15356a.equals(r1Var.f15356a) && this.f15357b == r1Var.f15357b && this.d == r1Var.d && this.e == r1Var.e && this.f15359f == r1Var.f15359f && this.f15360g == r1Var.f15360g && this.h == r1Var.h && this.f15361i == r1Var.f15361i && this.f15362j == r1Var.f15362j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15356a, Boolean.valueOf(this.f15357b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.f1 f1Var = this.f15356a;
        sb2.append(f1Var.f2139b);
        sb2.append(", periodIndex=");
        sb2.append(f1Var.e);
        sb2.append(", positionMs=");
        sb2.append(f1Var.f2141f);
        sb2.append(", contentPositionMs=");
        sb2.append(f1Var.f2142g);
        sb2.append(", adGroupIndex=");
        sb2.append(f1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(f1Var.f2143i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f15357b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f15358c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f15359f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f15360g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f15361i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.r(sb2, this.f15362j, "}");
    }
}
