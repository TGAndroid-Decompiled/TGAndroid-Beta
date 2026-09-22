package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class o1 {
    public static final b2.a1 f14868k;
    public static final o1 f14869l;
    public static final String f14870m;
    public static final String f14871n;
    public static final String f14872o;
    public static final String f14873p;
    public static final String f14874q;
    public static final String f14875r;
    public static final String f14876s;
    public static final String f14877t;
    public static final String f14878u;
    public static final String v;
    public final b2.a1 f14879a;
    public final boolean f14880b;
    public final long f14881c;
    public final long d;
    public final long e;
    public final int f14882f;
    public final long f14883g;
    public final long h;
    public final long f14884i;
    public final long f14885j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f14868k = a1Var;
        f14869l = new o1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f7887a;
        f14870m = Integer.toString(0, 36);
        f14871n = Integer.toString(1, 36);
        f14872o = Integer.toString(2, 36);
        f14873p = Integer.toString(3, 36);
        f14874q = Integer.toString(4, 36);
        f14875r = Integer.toString(5, 36);
        f14876s = Integer.toString(6, 36);
        f14877t = Integer.toString(7, 36);
        f14878u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public o1(b2.a1 a1Var, boolean z10, long j3, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (a1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z10 == z11);
        this.f14879a = a1Var;
        this.f14880b = z10;
        this.f14881c = j3;
        this.d = j10;
        this.e = j11;
        this.f14882f = i10;
        this.f14883g = j12;
        this.h = j13;
        this.f14884i = j14;
        this.f14885j = j15;
    }

    public final o1 a(boolean z10, boolean z11) {
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
        b2.a1 b10 = this.f14879a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f14880b) {
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
            i10 = this.f14882f;
        }
        if (z10) {
            j11 = this.f14883g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f14884i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f14885j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new o1(b10, z12, this.f14881c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f14879a;
        if (i10 < 3 || !f14868k.a(a1Var)) {
            bundle.putBundle(f14870m, a1Var.c(i10));
        }
        boolean z10 = this.f14880b;
        if (z10) {
            bundle.putBoolean(f14871n, z10);
        }
        long j3 = this.f14881c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f14872o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f14873p, j10);
        }
        long j11 = this.e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f14874q, j11);
        }
        int i11 = this.f14882f;
        if (i11 != 0) {
            bundle.putInt(f14875r, i11);
        }
        long j12 = this.f14883g;
        if (j12 != 0) {
            bundle.putLong(f14876s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f14877t, j13);
        }
        long j14 = this.f14884i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f14878u, j14);
        }
        long j15 = this.f14885j;
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
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f14881c == o1Var.f14881c && this.f14879a.equals(o1Var.f14879a) && this.f14880b == o1Var.f14880b && this.d == o1Var.d && this.e == o1Var.e && this.f14882f == o1Var.f14882f && this.f14883g == o1Var.f14883g && this.h == o1Var.h && this.f14884i == o1Var.f14884i && this.f14885j == o1Var.f14885j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14879a, Boolean.valueOf(this.f14880b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f14879a;
        sb2.append(a1Var.f2929b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f2931f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f2932g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f2933i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f14880b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f14881c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f14882f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f14883g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f14884i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.r(sb2, this.f14885j, "}");
    }
}
