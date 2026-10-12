package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final b2.a1 f15884k;
    public static final l1 f15885l;
    public static final String f15886m;
    public static final String f15887n;
    public static final String f15888o;
    public static final String f15889p;
    public static final String f15890q;
    public static final String f15891r;
    public static final String f15892s;
    public static final String f15893t;
    public static final String f15894u;
    public static final String v;
    public final b2.a1 f15895a;
    public final boolean f15896b;
    public final long f15897c;
    public final long d;
    public final long f15898e;
    public final int f15899f;
    public final long f15900g;
    public final long h;
    public final long f15901i;
    public final long f15902j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f15884k = a1Var;
        f15885l = new l1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f8529a;
        f15886m = Integer.toString(0, 36);
        f15887n = Integer.toString(1, 36);
        f15888o = Integer.toString(2, 36);
        f15889p = Integer.toString(3, 36);
        f15890q = Integer.toString(4, 36);
        f15891r = Integer.toString(5, 36);
        f15892s = Integer.toString(6, 36);
        f15893t = Integer.toString(7, 36);
        f15894u = Integer.toString(8, 36);
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
        this.f15895a = a1Var;
        this.f15896b = z10;
        this.f15897c = j3;
        this.d = j10;
        this.f15898e = j11;
        this.f15899f = i10;
        this.f15900g = j12;
        this.h = j13;
        this.f15901i = j14;
        this.f15902j = j15;
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
        b2.a1 b10 = this.f15895a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f15896b) {
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
            j10 = this.f15898e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f15899f;
        }
        if (z10) {
            j11 = this.f15900g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f15901i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f15902j;
        } else {
            j14 = 0;
        }
        return new l1(b10, z12, this.f15897c, j3, j10, i10, j11, j12, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f15895a;
        if (i10 < 3 || !f15884k.a(a1Var)) {
            bundle.putBundle(f15886m, a1Var.c(i10));
        }
        boolean z10 = this.f15896b;
        if (z10) {
            bundle.putBoolean(f15887n, z10);
        }
        long j3 = this.f15897c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f15888o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f15889p, j10);
        }
        long j11 = this.f15898e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f15890q, j11);
        }
        int i11 = this.f15899f;
        if (i11 != 0) {
            bundle.putInt(f15891r, i11);
        }
        long j12 = this.f15900g;
        if (j12 != 0) {
            bundle.putLong(f15892s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f15893t, j13);
        }
        long j14 = this.f15901i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f15894u, j14);
        }
        long j15 = this.f15902j;
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
            if (this.f15897c == l1Var.f15897c && this.f15895a.equals(l1Var.f15895a) && this.f15896b == l1Var.f15896b && this.d == l1Var.d && this.f15898e == l1Var.f15898e && this.f15899f == l1Var.f15899f && this.f15900g == l1Var.f15900g && this.h == l1Var.h && this.f15901i == l1Var.f15901i && this.f15902j == l1Var.f15902j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15895a, Boolean.valueOf(this.f15896b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f15895a;
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
        sb2.append(this.f15896b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f15897c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f15898e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f15899f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f15900g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f15901i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.s(sb2, this.f15902j, "}");
    }
}
