package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 {
    public static final b2.a1 f14858k;
    public static final j1 f14859l;
    public static final String f14860m;
    public static final String f14861n;
    public static final String f14862o;
    public static final String f14863p;
    public static final String f14864q;
    public static final String f14865r;
    public static final String f14866s;
    public static final String f14867t;
    public static final String f14868u;
    public static final String v;
    public final b2.a1 f14869a;
    public final boolean f14870b;
    public final long f14871c;
    public final long d;
    public final long e;
    public final int f14872f;
    public final long f14873g;
    public final long h;
    public final long f14874i;
    public final long f14875j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f14858k = a1Var;
        f14859l = new j1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f7872a;
        f14860m = Integer.toString(0, 36);
        f14861n = Integer.toString(1, 36);
        f14862o = Integer.toString(2, 36);
        f14863p = Integer.toString(3, 36);
        f14864q = Integer.toString(4, 36);
        f14865r = Integer.toString(5, 36);
        f14866s = Integer.toString(6, 36);
        f14867t = Integer.toString(7, 36);
        f14868u = Integer.toString(8, 36);
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
        this.f14869a = a1Var;
        this.f14870b = z10;
        this.f14871c = j3;
        this.d = j10;
        this.e = j11;
        this.f14872f = i10;
        this.f14873g = j12;
        this.h = j13;
        this.f14874i = j14;
        this.f14875j = j15;
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
        b2.a1 b10 = this.f14869a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f14870b) {
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
            i10 = this.f14872f;
        }
        if (z10) {
            j11 = this.f14873g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f14874i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f14875j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new j1(b10, z12, this.f14871c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f14869a;
        if (i10 < 3 || !f14858k.a(a1Var)) {
            bundle.putBundle(f14860m, a1Var.c(i10));
        }
        boolean z10 = this.f14870b;
        if (z10) {
            bundle.putBoolean(f14861n, z10);
        }
        long j3 = this.f14871c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f14862o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f14863p, j10);
        }
        long j11 = this.e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f14864q, j11);
        }
        int i11 = this.f14872f;
        if (i11 != 0) {
            bundle.putInt(f14865r, i11);
        }
        long j12 = this.f14873g;
        if (j12 != 0) {
            bundle.putLong(f14866s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f14867t, j13);
        }
        long j14 = this.f14874i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f14868u, j14);
        }
        long j15 = this.f14875j;
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
            if (this.f14871c == j1Var.f14871c && this.f14869a.equals(j1Var.f14869a) && this.f14870b == j1Var.f14870b && this.d == j1Var.d && this.e == j1Var.e && this.f14872f == j1Var.f14872f && this.f14873g == j1Var.f14873g && this.h == j1Var.h && this.f14874i == j1Var.f14874i && this.f14875j == j1Var.f14875j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14869a, Boolean.valueOf(this.f14870b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f14869a;
        sb2.append(a1Var.f2924b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f2926f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f2927g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f2928i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f14870b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f14871c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f14872f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f14873g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f14874i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.r(sb2, this.f14875j, "}");
    }
}
