package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final b2.a1 f16176k;
    public static final l1 f16177l;
    public static final String f16178m;
    public static final String f16179n;
    public static final String f16180o;
    public static final String f16181p;
    public static final String f16182q;
    public static final String f16183r;
    public static final String f16184s;
    public static final String f16185t;
    public static final String f16186u;
    public static final String v;
    public final b2.a1 f16187a;
    public final boolean f16188b;
    public final long f16189c;
    public final long d;
    public final long f16190e;
    public final int f16191f;
    public final long f16192g;
    public final long h;
    public final long f16193i;
    public final long f16194j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16176k = a1Var;
        f16177l = new l1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f8531a;
        f16178m = Integer.toString(0, 36);
        f16179n = Integer.toString(1, 36);
        f16180o = Integer.toString(2, 36);
        f16181p = Integer.toString(3, 36);
        f16182q = Integer.toString(4, 36);
        f16183r = Integer.toString(5, 36);
        f16184s = Integer.toString(6, 36);
        f16185t = Integer.toString(7, 36);
        f16186u = Integer.toString(8, 36);
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
        this.f16187a = a1Var;
        this.f16188b = z10;
        this.f16189c = j3;
        this.d = j10;
        this.f16190e = j11;
        this.f16191f = i10;
        this.f16192g = j12;
        this.h = j13;
        this.f16193i = j14;
        this.f16194j = j15;
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
        b2.a1 b10 = this.f16187a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16188b) {
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
            j10 = this.f16190e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f16191f;
        }
        if (z10) {
            j11 = this.f16192g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f16193i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16194j;
        } else {
            j14 = 0;
        }
        return new l1(b10, z12, this.f16189c, j3, j10, i10, j11, j12, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f16187a;
        if (i10 < 3 || !f16176k.a(a1Var)) {
            bundle.putBundle(f16178m, a1Var.c(i10));
        }
        boolean z10 = this.f16188b;
        if (z10) {
            bundle.putBoolean(f16179n, z10);
        }
        long j3 = this.f16189c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f16180o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16181p, j10);
        }
        long j11 = this.f16190e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f16182q, j11);
        }
        int i11 = this.f16191f;
        if (i11 != 0) {
            bundle.putInt(f16183r, i11);
        }
        long j12 = this.f16192g;
        if (j12 != 0) {
            bundle.putLong(f16184s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f16185t, j13);
        }
        long j14 = this.f16193i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16186u, j14);
        }
        long j15 = this.f16194j;
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
            if (this.f16189c == l1Var.f16189c && this.f16187a.equals(l1Var.f16187a) && this.f16188b == l1Var.f16188b && this.d == l1Var.d && this.f16190e == l1Var.f16190e && this.f16191f == l1Var.f16191f && this.f16192g == l1Var.f16192g && this.h == l1Var.h && this.f16193i == l1Var.f16193i && this.f16194j == l1Var.f16194j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16187a, Boolean.valueOf(this.f16188b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f16187a;
        sb2.append(a1Var.f3233b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.f3235e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f3236f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f3237g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f3238i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f16188b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16189c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f16190e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16191f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16192g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16193i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.s(sb2, this.f16194j, "}");
    }
}
