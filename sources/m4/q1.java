package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class q1 {
    public static final b2.a1 f13480k;
    public static final q1 f13481l;
    public static final String f13482m;
    public static final String f13483n;
    public static final String f13484o;
    public static final String f13485p;
    public static final String f13486q;
    public static final String f13487r;
    public static final String f13488s;
    public static final String f13489t;
    public static final String f13490u;
    public static final String v;
    public final b2.a1 f13491a;
    public final boolean f13492b;
    public final long f13493c;
    public final long d;
    public final long e;
    public final int f13494f;
    public final long f13495g;
    public final long h;
    public final long f13496i;
    public final long f13497j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f13480k = a1Var;
        f13481l = new q1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f7188a;
        f13482m = Integer.toString(0, 36);
        f13483n = Integer.toString(1, 36);
        f13484o = Integer.toString(2, 36);
        f13485p = Integer.toString(3, 36);
        f13486q = Integer.toString(4, 36);
        f13487r = Integer.toString(5, 36);
        f13488s = Integer.toString(6, 36);
        f13489t = Integer.toString(7, 36);
        f13490u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public q1(b2.a1 a1Var, boolean z10, long j3, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (a1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z10 == z11);
        this.f13491a = a1Var;
        this.f13492b = z10;
        this.f13493c = j3;
        this.d = j10;
        this.e = j11;
        this.f13494f = i10;
        this.f13495g = j12;
        this.h = j13;
        this.f13496i = j14;
        this.f13497j = j15;
    }

    public final q1 a(boolean z10, boolean z11) {
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
        b2.a1 b10 = this.f13491a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f13492b) {
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
            i10 = this.f13494f;
        }
        if (z10) {
            j11 = this.f13495g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f13496i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f13497j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new q1(b10, z12, this.f13493c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f13491a;
        if (i10 < 3 || !f13480k.a(a1Var)) {
            bundle.putBundle(f13482m, a1Var.c(i10));
        }
        boolean z10 = this.f13492b;
        if (z10) {
            bundle.putBoolean(f13483n, z10);
        }
        long j3 = this.f13493c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f13484o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f13485p, j10);
        }
        long j11 = this.e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f13486q, j11);
        }
        int i11 = this.f13494f;
        if (i11 != 0) {
            bundle.putInt(f13487r, i11);
        }
        long j12 = this.f13495g;
        if (j12 != 0) {
            bundle.putLong(f13488s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f13489t, j13);
        }
        long j14 = this.f13496i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f13490u, j14);
        }
        long j15 = this.f13497j;
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
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f13493c == q1Var.f13493c && this.f13491a.equals(q1Var.f13491a) && this.f13492b == q1Var.f13492b && this.d == q1Var.d && this.e == q1Var.e && this.f13494f == q1Var.f13494f && this.f13495g == q1Var.f13495g && this.h == q1Var.h && this.f13496i == q1Var.f13496i && this.f13497j == q1Var.f13497j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13491a, Boolean.valueOf(this.f13492b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f13491a;
        sb2.append(a1Var.f1623b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f1625f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f1626g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f1627i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f13492b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f13493c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f13494f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f13495g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f13496i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.r(sb2, this.f13497j, "}");
    }
}
