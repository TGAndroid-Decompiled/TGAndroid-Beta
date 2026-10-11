package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final b2.a1 f16212k;
    public static final l1 f16213l;
    public static final String f16214m;
    public static final String f16215n;
    public static final String f16216o;
    public static final String f16217p;
    public static final String f16218q;
    public static final String f16219r;
    public static final String f16220s;
    public static final String f16221t;
    public static final String f16222u;
    public static final String v;
    public final b2.a1 f16223a;
    public final boolean f16224b;
    public final long f16225c;
    public final long d;
    public final long f16226e;
    public final int f16227f;
    public final long f16228g;
    public final long h;
    public final long f16229i;
    public final long f16230j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16212k = a1Var;
        f16213l = new l1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f8531a;
        f16214m = Integer.toString(0, 36);
        f16215n = Integer.toString(1, 36);
        f16216o = Integer.toString(2, 36);
        f16217p = Integer.toString(3, 36);
        f16218q = Integer.toString(4, 36);
        f16219r = Integer.toString(5, 36);
        f16220s = Integer.toString(6, 36);
        f16221t = Integer.toString(7, 36);
        f16222u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public l1(b2.a1 a1Var, boolean z10, long j3, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (a1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z10 == z11);
        this.f16223a = a1Var;
        this.f16224b = z10;
        this.f16225c = j3;
        this.d = j10;
        this.f16226e = j11;
        this.f16227f = i10;
        this.f16228g = j12;
        this.h = j13;
        this.f16229i = j14;
        this.f16230j = j15;
    }

    public final l1 a(boolean z10, boolean z11) {
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
        b2.a1 b10 = this.f16223a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16224b) {
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
            j10 = this.f16226e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f16227f;
        }
        if (z10) {
            j11 = this.f16228g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f16229i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16230j;
        } else {
            j14 = 0;
        }
        return new l1(b10, z12, this.f16225c, j3, j10, i10, j11, j12, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f16223a;
        if (i10 < 3 || !f16212k.a(a1Var)) {
            bundle.putBundle(f16214m, a1Var.c(i10));
        }
        boolean z10 = this.f16224b;
        if (z10) {
            bundle.putBoolean(f16215n, z10);
        }
        long j3 = this.f16225c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f16216o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16217p, j10);
        }
        long j11 = this.f16226e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f16218q, j11);
        }
        int i11 = this.f16227f;
        if (i11 != 0) {
            bundle.putInt(f16219r, i11);
        }
        long j12 = this.f16228g;
        if (j12 != 0) {
            bundle.putLong(f16220s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f16221t, j13);
        }
        long j14 = this.f16229i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16222u, j14);
        }
        long j15 = this.f16230j;
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
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f16225c == l1Var.f16225c && this.f16223a.equals(l1Var.f16223a) && this.f16224b == l1Var.f16224b && this.d == l1Var.d && this.f16226e == l1Var.f16226e && this.f16227f == l1Var.f16227f && this.f16228g == l1Var.f16228g && this.h == l1Var.h && this.f16229i == l1Var.f16229i && this.f16230j == l1Var.f16230j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16223a, Boolean.valueOf(this.f16224b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f16223a;
        sb2.append(a1Var.f3233b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.f3235e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f3236f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f3237g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f3238i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f16224b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16225c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f16226e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16227f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16228g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16229i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.s(sb2, this.f16230j, "}");
    }
}
