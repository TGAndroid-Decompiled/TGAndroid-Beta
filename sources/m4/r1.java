package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class r1 {
    public static final b2.e1 f16704k;
    public static final r1 f16705l;
    public static final String f16706m;
    public static final String f16707n;
    public static final String f16708o;
    public static final String f16709p;
    public static final String f16710q;
    public static final String f16711r;
    public static final String f16712s;
    public static final String f16713t;
    public static final String f16714u;
    public static final String v;
    public final b2.e1 f16715a;
    public final boolean f16716b;
    public final long f16717c;
    public final long d;
    public final long e;
    public final int f16718f;
    public final long f16719g;
    public final long h;
    public final long f16720i;
    public final long f16721j;

    static {
        b2.e1 e1Var = new b2.e1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16704k = e1Var;
        f16705l = new r1(e1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.m0.f8255a;
        f16706m = Integer.toString(0, 36);
        f16707n = Integer.toString(1, 36);
        f16708o = Integer.toString(2, 36);
        f16709p = Integer.toString(3, 36);
        f16710q = Integer.toString(4, 36);
        f16711r = Integer.toString(5, 36);
        f16712s = Integer.toString(6, 36);
        f16713t = Integer.toString(7, 36);
        f16714u = Integer.toString(8, 36);
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
        this.f16715a = e1Var;
        this.f16716b = z10;
        this.f16717c = j10;
        this.d = j11;
        this.e = j12;
        this.f16718f = i10;
        this.f16719g = j13;
        this.h = j14;
        this.f16720i = j15;
        this.f16721j = j16;
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
        b2.e1 b10 = this.f16715a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16716b) {
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
            i10 = this.f16718f;
        }
        if (z10) {
            j12 = this.f16719g;
        } else {
            j12 = 0;
        }
        if (z10) {
            j13 = this.h;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16720i;
        } else {
            j14 = -9223372036854775807L;
        }
        if (z10) {
            j15 = this.f16721j;
        } else {
            j15 = 0;
        }
        return new r1(b10, z12, this.f16717c, j10, j11, i10, j12, j13, j14, j15);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.e1 e1Var = this.f16715a;
        if (i10 < 3 || !f16704k.a(e1Var)) {
            bundle.putBundle(f16706m, e1Var.c(i10));
        }
        boolean z10 = this.f16716b;
        if (z10) {
            bundle.putBoolean(f16707n, z10);
        }
        long j10 = this.f16717c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16708o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f16709p, j11);
        }
        long j12 = this.e;
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(f16710q, j12);
        }
        int i11 = this.f16718f;
        if (i11 != 0) {
            bundle.putInt(f16711r, i11);
        }
        long j13 = this.f16719g;
        if (j13 != 0) {
            bundle.putLong(f16712s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16713t, j14);
        }
        long j15 = this.f16720i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f16714u, j15);
        }
        long j16 = this.f16721j;
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
            if (this.f16717c == r1Var.f16717c && this.f16715a.equals(r1Var.f16715a) && this.f16716b == r1Var.f16716b && this.d == r1Var.d && this.e == r1Var.e && this.f16718f == r1Var.f16718f && this.f16719g == r1Var.f16719g && this.h == r1Var.h && this.f16720i == r1Var.f16720i && this.f16721j == r1Var.f16721j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16715a, Boolean.valueOf(this.f16716b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.e1 e1Var = this.f16715a;
        sb2.append(e1Var.f3736b);
        sb2.append(", periodIndex=");
        sb2.append(e1Var.e);
        sb2.append(", positionMs=");
        sb2.append(e1Var.f3738f);
        sb2.append(", contentPositionMs=");
        sb2.append(e1Var.f3739g);
        sb2.append(", adGroupIndex=");
        sb2.append(e1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(e1Var.f3740i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f16716b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16717c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16718f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16719g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16720i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.r(sb2, this.f16721j, "}");
    }
}
