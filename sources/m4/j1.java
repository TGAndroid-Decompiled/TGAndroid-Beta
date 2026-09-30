package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 {
    public static final b2.a1 f14832k;
    public static final j1 f14833l;
    public static final String f14834m;
    public static final String f14835n;
    public static final String f14836o;
    public static final String f14837p;
    public static final String f14838q;
    public static final String f14839r;
    public static final String f14840s;
    public static final String f14841t;
    public static final String f14842u;
    public static final String v;
    public final b2.a1 f14843a;
    public final boolean f14844b;
    public final long f14845c;
    public final long d;
    public final long e;
    public final int f14846f;
    public final long f14847g;
    public final long h;
    public final long f14848i;
    public final long f14849j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f14832k = a1Var;
        f14833l = new j1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f7870a;
        f14834m = Integer.toString(0, 36);
        f14835n = Integer.toString(1, 36);
        f14836o = Integer.toString(2, 36);
        f14837p = Integer.toString(3, 36);
        f14838q = Integer.toString(4, 36);
        f14839r = Integer.toString(5, 36);
        f14840s = Integer.toString(6, 36);
        f14841t = Integer.toString(7, 36);
        f14842u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public j1(b2.a1 a1Var, boolean z10, long j3, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (a1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z10 == z11);
        this.f14843a = a1Var;
        this.f14844b = z10;
        this.f14845c = j3;
        this.d = j10;
        this.e = j11;
        this.f14846f = i10;
        this.f14847g = j12;
        this.h = j13;
        this.f14848i = j14;
        this.f14849j = j15;
    }

    public final j1 a(boolean z10, boolean z11) {
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
        b2.a1 b10 = this.f14843a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f14844b) {
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
            i10 = this.f14846f;
        }
        if (z10) {
            j11 = this.f14847g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f14848i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f14849j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new j1(b10, z12, this.f14845c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f14843a;
        if (i10 < 3 || !f14832k.a(a1Var)) {
            bundle.putBundle(f14834m, a1Var.c(i10));
        }
        boolean z10 = this.f14844b;
        if (z10) {
            bundle.putBoolean(f14835n, z10);
        }
        long j3 = this.f14845c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f14836o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f14837p, j10);
        }
        long j11 = this.e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f14838q, j11);
        }
        int i11 = this.f14846f;
        if (i11 != 0) {
            bundle.putInt(f14839r, i11);
        }
        long j12 = this.f14847g;
        if (j12 != 0) {
            bundle.putLong(f14840s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f14841t, j13);
        }
        long j14 = this.f14848i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f14842u, j14);
        }
        long j15 = this.f14849j;
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
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f14845c == j1Var.f14845c && this.f14843a.equals(j1Var.f14843a) && this.f14844b == j1Var.f14844b && this.d == j1Var.d && this.e == j1Var.e && this.f14846f == j1Var.f14846f && this.f14847g == j1Var.f14847g && this.h == j1Var.h && this.f14848i == j1Var.f14848i && this.f14849j == j1Var.f14849j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14843a, Boolean.valueOf(this.f14844b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f14843a;
        sb2.append(a1Var.f2922b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f2924f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f2925g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f2926i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f14844b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f14845c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f14846f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f14847g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f14848i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.s(sb2, this.f14849j, "}");
    }
}
