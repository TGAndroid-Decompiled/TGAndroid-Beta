package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class r1 {
    public static final b2.e1 f16766k;
    public static final r1 f16767l;
    public static final String f16768m;
    public static final String f16769n;
    public static final String f16770o;
    public static final String f16771p;
    public static final String f16772q;
    public static final String f16773r;
    public static final String f16774s;
    public static final String f16775t;
    public static final String f16776u;
    public static final String v;
    public final b2.e1 f16777a;
    public final boolean f16778b;
    public final long f16779c;
    public final long d;
    public final long e;
    public final int f16780f;
    public final long f16781g;
    public final long h;
    public final long f16782i;
    public final long f16783j;

    static {
        b2.e1 e1Var = new b2.e1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16766k = e1Var;
        f16767l = new r1(e1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.m0.f8259a;
        f16768m = Integer.toString(0, 36);
        f16769n = Integer.toString(1, 36);
        f16770o = Integer.toString(2, 36);
        f16771p = Integer.toString(3, 36);
        f16772q = Integer.toString(4, 36);
        f16773r = Integer.toString(5, 36);
        f16774s = Integer.toString(6, 36);
        f16775t = Integer.toString(7, 36);
        f16776u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public r1(b2.e1 e1Var, boolean z10, long j10, long j11, long j12, int i10, long j13, long j14, long j15, long j16) {
        boolean z11;
        if (e1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z10 == z11);
        this.f16777a = e1Var;
        this.f16778b = z10;
        this.f16779c = j10;
        this.d = j11;
        this.e = j12;
        this.f16780f = i10;
        this.f16781g = j13;
        this.h = j14;
        this.f16782i = j15;
        this.f16783j = j16;
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
        b2.e1 b10 = this.f16777a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16778b) {
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
            i10 = this.f16780f;
        }
        if (z10) {
            j12 = this.f16781g;
        } else {
            j12 = 0;
        }
        if (z10) {
            j13 = this.h;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16782i;
        } else {
            j14 = -9223372036854775807L;
        }
        if (z10) {
            j15 = this.f16783j;
        } else {
            j15 = 0;
        }
        return new r1(b10, z12, this.f16779c, j10, j11, i10, j12, j13, j14, j15);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.e1 e1Var = this.f16777a;
        if (i10 < 3 || !f16766k.a(e1Var)) {
            bundle.putBundle(f16768m, e1Var.c(i10));
        }
        boolean z10 = this.f16778b;
        if (z10) {
            bundle.putBoolean(f16769n, z10);
        }
        long j10 = this.f16779c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16770o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f16771p, j11);
        }
        long j12 = this.e;
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(f16772q, j12);
        }
        int i11 = this.f16780f;
        if (i11 != 0) {
            bundle.putInt(f16773r, i11);
        }
        long j13 = this.f16781g;
        if (j13 != 0) {
            bundle.putLong(f16774s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16775t, j14);
        }
        long j15 = this.f16782i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f16776u, j15);
        }
        long j16 = this.f16783j;
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
            if (this.f16779c == r1Var.f16779c && this.f16777a.equals(r1Var.f16777a) && this.f16778b == r1Var.f16778b && this.d == r1Var.d && this.e == r1Var.e && this.f16780f == r1Var.f16780f && this.f16781g == r1Var.f16781g && this.h == r1Var.h && this.f16782i == r1Var.f16782i && this.f16783j == r1Var.f16783j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16777a, Boolean.valueOf(this.f16778b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.e1 e1Var = this.f16777a;
        sb2.append(e1Var.f3739b);
        sb2.append(", periodIndex=");
        sb2.append(e1Var.e);
        sb2.append(", positionMs=");
        sb2.append(e1Var.f3741f);
        sb2.append(", contentPositionMs=");
        sb2.append(e1Var.f3742g);
        sb2.append(", adGroupIndex=");
        sb2.append(e1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(e1Var.f3743i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f16778b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16779c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16780f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16781g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16782i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.r(sb2, this.f16783j, "}");
    }
}
