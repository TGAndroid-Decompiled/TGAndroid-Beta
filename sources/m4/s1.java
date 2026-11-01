package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;
public final class s1 {
    public static final b2.e1 f12929k;
    public static final s1 f12930l;
    public static final String f12931m;
    public static final String f12932n;
    public static final String f12933o;
    public static final String f12934p;
    public static final String f12935q;
    public static final String f12936r;
    public static final String f12937s;
    public static final String f12938t;
    public static final String f12939u;
    public static final String v;
    public final b2.e1 f12940a;
    public final boolean f12941b;
    public final long f12942c;
    public final long d;
    public final long e;
    public final int f12943f;
    public final long f12944g;
    public final long h;
    public final long f12945i;
    public final long f12946j;

    static {
        b2.e1 e1Var = new b2.e1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f12929k = e1Var;
        f12930l = new s1(e1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.l0.f6165a;
        f12931m = Integer.toString(0, 36);
        f12932n = Integer.toString(1, 36);
        f12933o = Integer.toString(2, 36);
        f12934p = Integer.toString(3, 36);
        f12935q = Integer.toString(4, 36);
        f12936r = Integer.toString(5, 36);
        f12937s = Integer.toString(6, 36);
        f12938t = Integer.toString(7, 36);
        f12939u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public s1(b2.e1 e1Var, boolean z10, long j10, long j11, long j12, int i10, long j13, long j14, long j15, long j16) {
        boolean z11;
        if (e1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6.f(z10 == z11);
        this.f12940a = e1Var;
        this.f12941b = z10;
        this.f12942c = j10;
        this.d = j11;
        this.e = j12;
        this.f12943f = i10;
        this.f12944g = j13;
        this.h = j14;
        this.f12945i = j15;
        this.f12946j = j16;
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
        b2.e1 b10 = this.f12940a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f12941b) {
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
            i10 = this.f12943f;
        }
        if (z10) {
            j12 = this.f12944g;
        } else {
            j12 = 0;
        }
        if (z10) {
            j13 = this.h;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f12945i;
        } else {
            j14 = -9223372036854775807L;
        }
        if (z10) {
            j15 = this.f12946j;
        } else {
            j15 = 0;
        }
        return new s1(b10, z12, this.f12942c, j10, j11, i10, j12, j13, j14, j15);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.e1 e1Var = this.f12940a;
        if (i10 < 3 || !f12929k.a(e1Var)) {
            bundle.putBundle(f12931m, e1Var.c(i10));
        }
        boolean z10 = this.f12941b;
        if (z10) {
            bundle.putBoolean(f12932n, z10);
        }
        long j10 = this.f12942c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f12933o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f12934p, j11);
        }
        long j12 = this.e;
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(f12935q, j12);
        }
        int i11 = this.f12943f;
        if (i11 != 0) {
            bundle.putInt(f12936r, i11);
        }
        long j13 = this.f12944g;
        if (j13 != 0) {
            bundle.putLong(f12937s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f12938t, j14);
        }
        long j15 = this.f12945i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f12939u, j15);
        }
        long j16 = this.f12946j;
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
            if (this.f12942c == s1Var.f12942c && this.f12940a.equals(s1Var.f12940a) && this.f12941b == s1Var.f12941b && this.d == s1Var.d && this.e == s1Var.e && this.f12943f == s1Var.f12943f && this.f12944g == s1Var.f12944g && this.h == s1Var.h && this.f12945i == s1Var.f12945i && this.f12946j == s1Var.f12946j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12940a, Boolean.valueOf(this.f12941b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.e1 e1Var = this.f12940a;
        sb2.append(e1Var.f2022b);
        sb2.append(", periodIndex=");
        sb2.append(e1Var.e);
        sb2.append(", positionMs=");
        sb2.append(e1Var.f2024f);
        sb2.append(", contentPositionMs=");
        sb2.append(e1Var.f2025g);
        sb2.append(", adGroupIndex=");
        sb2.append(e1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(e1Var.f2026i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f12941b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f12942c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f12943f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f12944g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f12945i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.q(sb2, this.f12946j, "}");
    }
}
