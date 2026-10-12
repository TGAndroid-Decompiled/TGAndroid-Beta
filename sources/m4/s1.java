package m4;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class s1 {
    public static final b2.f1 f15615k;
    public static final s1 f15616l;
    public static final String f15617m;
    public static final String f15618n;
    public static final String f15619o;
    public static final String f15620p;
    public static final String f15621q;
    public static final String f15622r;
    public static final String f15623s;
    public static final String f15624t;
    public static final String f15625u;
    public static final String v;
    public final b2.f1 f15626a;
    public final boolean f15627b;
    public final long f15628c;
    public final long d;
    public final long e;
    public final int f15629f;
    public final long f15630g;
    public final long h;
    public final long f15631i;
    public final long f15632j;

    static {
        b2.f1 f1Var = new b2.f1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f15615k = f1Var;
        f15616l = new s1(f1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.m0.f8372a;
        f15617m = Integer.toString(0, 36);
        f15618n = Integer.toString(1, 36);
        f15619o = Integer.toString(2, 36);
        f15620p = Integer.toString(3, 36);
        f15621q = Integer.toString(4, 36);
        f15622r = Integer.toString(5, 36);
        f15623s = Integer.toString(6, 36);
        f15624t = Integer.toString(7, 36);
        f15625u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public s1(b2.f1 f1Var, boolean z10, long j10, long j11, long j12, int i10, long j13, long j14, long j15, long j16) {
        boolean z11;
        if (f1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z10 == z11);
        this.f15626a = f1Var;
        this.f15627b = z10;
        this.f15628c = j10;
        this.d = j11;
        this.e = j12;
        this.f15629f = i10;
        this.f15630g = j13;
        this.h = j14;
        this.f15631i = j15;
        this.f15632j = j16;
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
        b2.f1 b10 = this.f15626a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f15627b) {
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
            i10 = this.f15629f;
        }
        if (z10) {
            j12 = this.f15630g;
        } else {
            j12 = 0;
        }
        if (z10) {
            j13 = this.h;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f15631i;
        } else {
            j14 = -9223372036854775807L;
        }
        if (z10) {
            j15 = this.f15632j;
        } else {
            j15 = 0;
        }
        return new s1(b10, z12, this.f15628c, j10, j11, i10, j12, j13, j14, j15);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.f1 f1Var = this.f15626a;
        if (i10 < 3 || !f15615k.a(f1Var)) {
            bundle.putBundle(f15617m, f1Var.c(i10));
        }
        boolean z10 = this.f15627b;
        if (z10) {
            bundle.putBoolean(f15618n, z10);
        }
        long j10 = this.f15628c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f15619o, j10);
        }
        long j11 = this.d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f15620p, j11);
        }
        long j12 = this.e;
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(f15621q, j12);
        }
        int i11 = this.f15629f;
        if (i11 != 0) {
            bundle.putInt(f15622r, i11);
        }
        long j13 = this.f15630g;
        if (j13 != 0) {
            bundle.putLong(f15623s, j13);
        }
        long j14 = this.h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f15624t, j14);
        }
        long j15 = this.f15631i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f15625u, j15);
        }
        long j16 = this.f15632j;
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
            if (this.f15628c == s1Var.f15628c && this.f15626a.equals(s1Var.f15626a) && this.f15627b == s1Var.f15627b && this.d == s1Var.d && this.e == s1Var.e && this.f15629f == s1Var.f15629f && this.f15630g == s1Var.f15630g && this.h == s1Var.h && this.f15631i == s1Var.f15631i && this.f15632j == s1Var.f15632j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f15626a, Boolean.valueOf(this.f15627b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.f1 f1Var = this.f15626a;
        sb2.append(f1Var.f2135b);
        sb2.append(", periodIndex=");
        sb2.append(f1Var.e);
        sb2.append(", positionMs=");
        sb2.append(f1Var.f2137f);
        sb2.append(", contentPositionMs=");
        sb2.append(f1Var.f2138g);
        sb2.append(", adGroupIndex=");
        sb2.append(f1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(f1Var.f2139i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f15627b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f15628c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f15629f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f15630g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f15631i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.r(sb2, this.f15632j, "}");
    }
}
