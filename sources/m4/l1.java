package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final b2.a1 f15885k;
    public static final l1 f15886l;
    public static final String f15887m;
    public static final String f15888n;
    public static final String f15889o;
    public static final String f15890p;
    public static final String f15891q;
    public static final String f15892r;
    public static final String f15893s;
    public static final String f15894t;
    public static final String f15895u;
    public static final String v;
    public final b2.a1 f15896a;
    public final boolean f15897b;
    public final long f15898c;
    public final long d;
    public final long f15899e;
    public final int f15900f;
    public final long f15901g;
    public final long h;
    public final long f15902i;
    public final long f15903j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f15885k = a1Var;
        f15886l = new l1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f8529a;
        f15887m = Integer.toString(0, 36);
        f15888n = Integer.toString(1, 36);
        f15889o = Integer.toString(2, 36);
        f15890p = Integer.toString(3, 36);
        f15891q = Integer.toString(4, 36);
        f15892r = Integer.toString(5, 36);
        f15893s = Integer.toString(6, 36);
        f15894t = Integer.toString(7, 36);
        f15895u = Integer.toString(8, 36);
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
        this.f15896a = a1Var;
        this.f15897b = z10;
        this.f15898c = j3;
        this.d = j10;
        this.f15899e = j11;
        this.f15900f = i10;
        this.f15901g = j12;
        this.h = j13;
        this.f15902i = j14;
        this.f15903j = j15;
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
        b2.a1 b10 = this.f15896a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f15897b) {
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
            j10 = this.f15899e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f15900f;
        }
        if (z10) {
            j11 = this.f15901g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f15902i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f15903j;
        } else {
            j14 = 0;
        }
        return new l1(b10, z12, this.f15898c, j3, j10, i10, j11, j12, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f15896a;
        if (i10 < 3 || !f15885k.a(a1Var)) {
            bundle.putBundle(f15887m, a1Var.c(i10));
        }
        boolean z10 = this.f15897b;
        if (z10) {
            bundle.putBoolean(f15888n, z10);
        }
        long j3 = this.f15898c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f15889o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f15890p, j10);
        }
        long j11 = this.f15899e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f15891q, j11);
        }
        int i11 = this.f15900f;
        if (i11 != 0) {
            bundle.putInt(f15892r, i11);
        }
        long j12 = this.f15901g;
        if (j12 != 0) {
            bundle.putLong(f15893s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f15894t, j13);
        }
        long j14 = this.f15902i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f15895u, j14);
        }
        long j15 = this.f15903j;
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
            if (this.f15898c == l1Var.f15898c && this.f15896a.equals(l1Var.f15896a) && this.f15897b == l1Var.f15897b && this.d == l1Var.d && this.f15899e == l1Var.f15899e && this.f15900f == l1Var.f15900f && this.f15901g == l1Var.f15901g && this.h == l1Var.h && this.f15902i == l1Var.f15902i && this.f15903j == l1Var.f15903j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15896a, Boolean.valueOf(this.f15897b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f15896a;
        sb2.append(a1Var.f3231b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.f3233e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f3234f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f3235g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f3236i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f15897b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f15898c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f15899e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f15900f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f15901g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f15902i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.s(sb2, this.f15903j, "}");
    }
}
