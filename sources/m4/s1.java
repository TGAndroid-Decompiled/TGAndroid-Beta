package m4;

import a8.yb;
import android.os.Bundle;
import j$.util.Objects;
public final class s1 {
    public static final b2.f1 f18230k;
    public static final s1 f18231l;
    public static final String f18232m;
    public static final String f18233n;
    public static final String f18234o;
    public static final String f18235p;
    public static final String f18236q;
    public static final String f18237r;
    public static final String f18238s;
    public static final String f18239t;
    public static final String f18240u;
    public static final String v;
    public final b2.f1 f18241a;
    public final boolean f18242b;
    public final long f18243c;
    public final long d;
    public final long e;
    public final int f18244f;
    public final long f18245g;
    public final long h;
    public final long f18246i;
    public final long f18247j;

    static {
        b2.f1 f1Var = new b2.f1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f18230k = f1Var;
        f18231l = new s1(f1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.n0.f9691a;
        f18232m = Integer.toString(0, 36);
        f18233n = Integer.toString(1, 36);
        f18234o = Integer.toString(2, 36);
        f18235p = Integer.toString(3, 36);
        f18236q = Integer.toString(4, 36);
        f18237r = Integer.toString(5, 36);
        f18238s = Integer.toString(6, 36);
        f18239t = Integer.toString(7, 36);
        f18240u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public s1(b2.f1 f1Var, boolean z10, long j10, long j11, long j12, int i10, long j13, long j14, long j15, long j16) {
        boolean z11;
        if (f1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.g(z10 == z11);
        this.f18241a = f1Var;
        this.f18242b = z10;
        this.f18243c = j10;
        this.d = j11;
        this.e = j12;
        this.f18244f = i10;
        this.f18245g = j13;
        this.h = j14;
        this.f18246i = j15;
        this.f18247j = j16;
    }

    public final s1 a(boolean z10, boolean z11) {
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
        b2.f1 b10 = this.f18241a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f18242b) {
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
            i10 = this.f18244f;
        }
        if (z10) {
            j12 = this.f18245g;
        } else {
            j12 = 0;
        }
        if (z10) {
            j13 = this.h;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f18246i;
        } else {
            j14 = -9223372036854775807L;
        }
        if (z10) {
            j15 = this.f18247j;
        } else {
            j15 = 0;
        }
        return new s1(b10, z12, this.f18243c, j10, j11, i10, j12, j13, j14, j15);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.f1 f1Var = this.f18241a;
        if (i10 < 3 || !f18230k.a(f1Var)) {
            bundle.putBundle(f18232m, f1Var.c(i10));
        }
        boolean z10 = this.f18242b;
        if (z10) {
            bundle.putBoolean(f18233n, z10);
        }
        long j10 = this.f18243c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f18234o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f18235p, j11);
        }
        long j12 = this.e;
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(f18236q, j12);
        }
        int i11 = this.f18244f;
        if (i11 != 0) {
            bundle.putInt(f18237r, i11);
        }
        long j13 = this.f18245g;
        if (j13 != 0) {
            bundle.putLong(f18238s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f18239t, j14);
        }
        long j15 = this.f18246i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f18240u, j15);
        }
        long j16 = this.f18247j;
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
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.f18243c == s1Var.f18243c && this.f18241a.equals(s1Var.f18241a) && this.f18242b == s1Var.f18242b && this.d == s1Var.d && this.e == s1Var.e && this.f18244f == s1Var.f18244f && this.f18245g == s1Var.f18245g && this.h == s1Var.h && this.f18246i == s1Var.f18246i && this.f18247j == s1Var.f18247j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18241a, Boolean.valueOf(this.f18242b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.f1 f1Var = this.f18241a;
        sb2.append(f1Var.f3202b);
        sb2.append(", periodIndex=");
        sb2.append(f1Var.e);
        sb2.append(", positionMs=");
        sb2.append(f1Var.f3204f);
        sb2.append(", contentPositionMs=");
        sb2.append(f1Var.f3205g);
        sb2.append(", adGroupIndex=");
        sb2.append(f1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(f1Var.f3206i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f18242b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f18243c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f18244f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f18245g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f18246i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.r(sb2, this.f18247j, "}");
    }
}
