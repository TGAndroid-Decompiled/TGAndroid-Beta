package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class p1 {
    public static final b2.a1 f14652k;
    public static final p1 f14653l;
    public static final String f14654m;
    public static final String f14655n;
    public static final String f14656o;
    public static final String f14657p;
    public static final String f14658q;
    public static final String f14659r;
    public static final String f14660s;
    public static final String f14661t;
    public static final String f14662u;
    public static final String v;
    public final b2.a1 f14663a;
    public final boolean f14664b;
    public final long f14665c;
    public final long d;
    public final long e;
    public final int f14666f;
    public final long f14667g;
    public final long h;
    public final long f14668i;
    public final long f14669j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f14652k = a1Var;
        f14653l = new p1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f7888a;
        f14654m = Integer.toString(0, 36);
        f14655n = Integer.toString(1, 36);
        f14656o = Integer.toString(2, 36);
        f14657p = Integer.toString(3, 36);
        f14658q = Integer.toString(4, 36);
        f14659r = Integer.toString(5, 36);
        f14660s = Integer.toString(6, 36);
        f14661t = Integer.toString(7, 36);
        f14662u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public p1(b2.a1 a1Var, boolean z10, long j3, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (a1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z10 == z11);
        this.f14663a = a1Var;
        this.f14664b = z10;
        this.f14665c = j3;
        this.d = j10;
        this.e = j11;
        this.f14666f = i10;
        this.f14667g = j12;
        this.h = j13;
        this.f14668i = j14;
        this.f14669j = j15;
    }

    public final p1 a(boolean z10, boolean z11) {
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
        b2.a1 b10 = this.f14663a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f14664b) {
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
            i10 = this.f14666f;
        }
        if (z10) {
            j11 = this.f14667g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f14668i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f14669j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new p1(b10, z12, this.f14665c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f14663a;
        if (i10 < 3 || !f14652k.a(a1Var)) {
            bundle.putBundle(f14654m, a1Var.c(i10));
        }
        boolean z10 = this.f14664b;
        if (z10) {
            bundle.putBoolean(f14655n, z10);
        }
        long j3 = this.f14665c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f14656o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f14657p, j10);
        }
        long j11 = this.e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f14658q, j11);
        }
        int i11 = this.f14666f;
        if (i11 != 0) {
            bundle.putInt(f14659r, i11);
        }
        long j12 = this.f14667g;
        if (j12 != 0) {
            bundle.putLong(f14660s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f14661t, j13);
        }
        long j14 = this.f14668i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f14662u, j14);
        }
        long j15 = this.f14669j;
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
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f14665c == p1Var.f14665c && this.f14663a.equals(p1Var.f14663a) && this.f14664b == p1Var.f14664b && this.d == p1Var.d && this.e == p1Var.e && this.f14666f == p1Var.f14666f && this.f14667g == p1Var.f14667g && this.h == p1Var.h && this.f14668i == p1Var.f14668i && this.f14669j == p1Var.f14669j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14663a, Boolean.valueOf(this.f14664b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f14663a;
        sb2.append(a1Var.f2930b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f2932f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f2933g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f2934i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f14664b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f14665c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f14666f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f14667g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f14668i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.r(sb2, this.f14669j, "}");
    }
}
