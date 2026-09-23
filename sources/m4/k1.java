package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class k1 {
    public static final b2.a1 f14582k;
    public static final k1 f14583l;
    public static final String f14584m;
    public static final String f14585n;
    public static final String f14586o;
    public static final String f14587p;
    public static final String f14588q;
    public static final String f14589r;
    public static final String f14590s;
    public static final String f14591t;
    public static final String f14592u;
    public static final String v;
    public final b2.a1 f14593a;
    public final boolean f14594b;
    public final long f14595c;
    public final long d;
    public final long e;
    public final int f14596f;
    public final long f14597g;
    public final long h;
    public final long f14598i;
    public final long f14599j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f14582k = a1Var;
        f14583l = new k1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f7871a;
        f14584m = Integer.toString(0, 36);
        f14585n = Integer.toString(1, 36);
        f14586o = Integer.toString(2, 36);
        f14587p = Integer.toString(3, 36);
        f14588q = Integer.toString(4, 36);
        f14589r = Integer.toString(5, 36);
        f14590s = Integer.toString(6, 36);
        f14591t = Integer.toString(7, 36);
        f14592u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public k1(b2.a1 a1Var, boolean z10, long j3, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (a1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z10 == z11);
        this.f14593a = a1Var;
        this.f14594b = z10;
        this.f14595c = j3;
        this.d = j10;
        this.e = j11;
        this.f14596f = i10;
        this.f14597g = j12;
        this.h = j13;
        this.f14598i = j14;
        this.f14599j = j15;
    }

    public final k1 a(boolean z10, boolean z11) {
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
        b2.a1 b10 = this.f14593a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f14594b) {
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
            i10 = this.f14596f;
        }
        if (z10) {
            j11 = this.f14597g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f14598i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f14599j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new k1(b10, z12, this.f14595c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f14593a;
        if (i10 < 3 || !f14582k.a(a1Var)) {
            bundle.putBundle(f14584m, a1Var.c(i10));
        }
        boolean z10 = this.f14594b;
        if (z10) {
            bundle.putBoolean(f14585n, z10);
        }
        long j3 = this.f14595c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f14586o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f14587p, j10);
        }
        long j11 = this.e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f14588q, j11);
        }
        int i11 = this.f14596f;
        if (i11 != 0) {
            bundle.putInt(f14589r, i11);
        }
        long j12 = this.f14597g;
        if (j12 != 0) {
            bundle.putLong(f14590s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f14591t, j13);
        }
        long j14 = this.f14598i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f14592u, j14);
        }
        long j15 = this.f14599j;
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
        if (obj != null && k1.class == obj.getClass()) {
            k1 k1Var = (k1) obj;
            if (this.f14595c == k1Var.f14595c && this.f14593a.equals(k1Var.f14593a) && this.f14594b == k1Var.f14594b && this.d == k1Var.d && this.e == k1Var.e && this.f14596f == k1Var.f14596f && this.f14597g == k1Var.f14597g && this.h == k1Var.h && this.f14598i == k1Var.f14598i && this.f14599j == k1Var.f14599j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14593a, Boolean.valueOf(this.f14594b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f14593a;
        sb2.append(a1Var.f2922b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f2924f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f2925g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f2926i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f14594b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f14595c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f14596f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f14597g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f14598i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.s(sb2, this.f14599j, "}");
    }
}
