package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;
public final class s1 {
    public static final b2.e1 f12928k;
    public static final s1 f12929l;
    public static final String f12930m;
    public static final String f12931n;
    public static final String f12932o;
    public static final String f12933p;
    public static final String f12934q;
    public static final String f12935r;
    public static final String f12936s;
    public static final String f12937t;
    public static final String f12938u;
    public static final String v;
    public final b2.e1 f12939a;
    public final boolean f12940b;
    public final long f12941c;
    public final long d;
    public final long e;
    public final int f12942f;
    public final long f12943g;
    public final long h;
    public final long f12944i;
    public final long f12945j;

    static {
        b2.e1 e1Var = new b2.e1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f12928k = e1Var;
        f12929l = new s1(e1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.l0.f6165a;
        f12930m = Integer.toString(0, 36);
        f12931n = Integer.toString(1, 36);
        f12932o = Integer.toString(2, 36);
        f12933p = Integer.toString(3, 36);
        f12934q = Integer.toString(4, 36);
        f12935r = Integer.toString(5, 36);
        f12936s = Integer.toString(6, 36);
        f12937t = Integer.toString(7, 36);
        f12938u = Integer.toString(8, 36);
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
        this.f12939a = e1Var;
        this.f12940b = z10;
        this.f12941c = j10;
        this.d = j11;
        this.e = j12;
        this.f12942f = i10;
        this.f12943g = j13;
        this.h = j14;
        this.f12944i = j15;
        this.f12945j = j16;
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
        b2.e1 b10 = this.f12939a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f12940b) {
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
            i10 = this.f12942f;
        }
        if (z10) {
            j12 = this.f12943g;
        } else {
            j12 = 0;
        }
        if (z10) {
            j13 = this.h;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f12944i;
        } else {
            j14 = -9223372036854775807L;
        }
        if (z10) {
            j15 = this.f12945j;
        } else {
            j15 = 0;
        }
        return new s1(b10, z12, this.f12941c, j10, j11, i10, j12, j13, j14, j15);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.e1 e1Var = this.f12939a;
        if (i10 < 3 || !f12928k.a(e1Var)) {
            bundle.putBundle(f12930m, e1Var.c(i10));
        }
        boolean z10 = this.f12940b;
        if (z10) {
            bundle.putBoolean(f12931n, z10);
        }
        long j10 = this.f12941c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f12932o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f12933p, j11);
        }
        long j12 = this.e;
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(f12934q, j12);
        }
        int i11 = this.f12942f;
        if (i11 != 0) {
            bundle.putInt(f12935r, i11);
        }
        long j13 = this.f12943g;
        if (j13 != 0) {
            bundle.putLong(f12936s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f12937t, j14);
        }
        long j15 = this.f12944i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f12938u, j15);
        }
        long j16 = this.f12945j;
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
            if (this.f12941c == s1Var.f12941c && this.f12939a.equals(s1Var.f12939a) && this.f12940b == s1Var.f12940b && this.d == s1Var.d && this.e == s1Var.e && this.f12942f == s1Var.f12942f && this.f12943g == s1Var.f12943g && this.h == s1Var.h && this.f12944i == s1Var.f12944i && this.f12945j == s1Var.f12945j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12939a, Boolean.valueOf(this.f12940b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.e1 e1Var = this.f12939a;
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
        sb2.append(this.f12940b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f12941c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f12942f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f12943g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f12944i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.q(sb2, this.f12945j, "}");
    }
}
