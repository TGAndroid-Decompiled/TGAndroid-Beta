package o4;

import android.os.Bundle;
import b8.zb;
import j$.util.Objects;
public final class q1 {
    public static final d2.d1 f20806k;
    public static final q1 f20807l;
    public static final String f20808m;
    public static final String f20809n;
    public static final String f20810o;
    public static final String f20811p;
    public static final String f20812q;
    public static final String f20813r;
    public static final String f20814s;
    public static final String f20815t;
    public static final String f20816u;
    public static final String v;
    public final d2.d1 f20817a;
    public final boolean f20818b;
    public final long f20819c;
    public final long d;
    public final long f20820e;
    public final int f20821f;
    public final long f20822g;
    public final long h;
    public final long f20823i;
    public final long f20824j;

    static {
        d2.d1 d1Var = new d2.d1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f20806k = d1Var;
        f20807l = new q1(d1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = g2.n0.f11873a;
        f20808m = Integer.toString(0, 36);
        f20809n = Integer.toString(1, 36);
        f20810o = Integer.toString(2, 36);
        f20811p = Integer.toString(3, 36);
        f20812q = Integer.toString(4, 36);
        f20813r = Integer.toString(5, 36);
        f20814s = Integer.toString(6, 36);
        f20815t = Integer.toString(7, 36);
        f20816u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public q1(d2.d1 d1Var, boolean z10, long j10, long j11, long j12, int i3, long j13, long j14, long j15, long j16) {
        boolean z11;
        if (d1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.f(z10 == z11);
        this.f20817a = d1Var;
        this.f20818b = z10;
        this.f20819c = j10;
        this.d = j11;
        this.f20820e = j12;
        this.f20821f = i3;
        this.f20822g = j13;
        this.h = j14;
        this.f20823i = j15;
        this.f20824j = j16;
    }

    public final q1 a(boolean z10, boolean z11) {
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
        d2.d1 b10 = this.f20817a.b(z10, z11);
        int i3 = 0;
        if (z10 && this.f20818b) {
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
            j11 = this.f20820e;
        } else {
            j11 = 0;
        }
        if (z10) {
            i3 = this.f20821f;
        }
        if (z10) {
            j12 = this.f20822g;
        } else {
            j12 = 0;
        }
        if (z10) {
            j13 = this.h;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f20823i;
        } else {
            j14 = -9223372036854775807L;
        }
        if (z10) {
            j15 = this.f20824j;
        } else {
            j15 = 0;
        }
        return new q1(b10, z12, this.f20819c, j10, j11, i3, j12, j13, j14, j15);
    }

    public final Bundle b(int i3) {
        Bundle bundle = new Bundle();
        d2.d1 d1Var = this.f20817a;
        if (i3 < 3 || !f20806k.a(d1Var)) {
            bundle.putBundle(f20808m, d1Var.c(i3));
        }
        boolean z10 = this.f20818b;
        if (z10) {
            bundle.putBoolean(f20809n, z10);
        }
        long j10 = this.f20819c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f20810o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f20811p, j11);
        }
        long j12 = this.f20820e;
        if (i3 < 3 || j12 != 0) {
            bundle.putLong(f20812q, j12);
        }
        int i10 = this.f20821f;
        if (i10 != 0) {
            bundle.putInt(f20813r, i10);
        }
        long j13 = this.f20822g;
        if (j13 != 0) {
            bundle.putLong(f20814s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f20815t, j14);
        }
        long j15 = this.f20823i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f20816u, j15);
        }
        long j16 = this.f20824j;
        if (i3 >= 3 && j16 == 0) {
            return bundle;
        }
        bundle.putLong(v, j16);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f20819c == q1Var.f20819c && this.f20817a.equals(q1Var.f20817a) && this.f20818b == q1Var.f20818b && this.d == q1Var.d && this.f20820e == q1Var.f20820e && this.f20821f == q1Var.f20821f && this.f20822g == q1Var.f20822g && this.h == q1Var.h && this.f20823i == q1Var.f20823i && this.f20824j == q1Var.f20824j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20817a, Boolean.valueOf(this.f20818b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        d2.d1 d1Var = this.f20817a;
        sb2.append(d1Var.f8067b);
        sb2.append(", periodIndex=");
        sb2.append(d1Var.f8069e);
        sb2.append(", positionMs=");
        sb2.append(d1Var.f8070f);
        sb2.append(", contentPositionMs=");
        sb2.append(d1Var.f8071g);
        sb2.append(", adGroupIndex=");
        sb2.append(d1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(d1Var.f8072i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f20818b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f20819c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f20820e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f20821f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f20822g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f20823i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.r(sb2, this.f20824j, "}");
    }
}
