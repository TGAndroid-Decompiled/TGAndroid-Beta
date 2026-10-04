package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 {
    public static final b2.a1 f16187k;
    public static final j1 f16188l;
    public static final String f16189m;
    public static final String f16190n;
    public static final String f16191o;
    public static final String f16192p;
    public static final String f16193q;
    public static final String f16194r;
    public static final String f16195s;
    public static final String f16196t;
    public static final String f16197u;
    public static final String v;
    public final b2.a1 f16198a;
    public final boolean f16199b;
    public final long f16200c;
    public final long d;
    public final long f16201e;
    public final int f16202f;
    public final long f16203g;
    public final long h;
    public final long f16204i;
    public final long f16205j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16187k = a1Var;
        f16188l = new j1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f8537a;
        f16189m = Integer.toString(0, 36);
        f16190n = Integer.toString(1, 36);
        f16191o = Integer.toString(2, 36);
        f16192p = Integer.toString(3, 36);
        f16193q = Integer.toString(4, 36);
        f16194r = Integer.toString(5, 36);
        f16195s = Integer.toString(6, 36);
        f16196t = Integer.toString(7, 36);
        f16197u = Integer.toString(8, 36);
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
        this.f16198a = a1Var;
        this.f16199b = z10;
        this.f16200c = j3;
        this.d = j10;
        this.f16201e = j11;
        this.f16202f = i10;
        this.f16203g = j12;
        this.h = j13;
        this.f16204i = j14;
        this.f16205j = j15;
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
        b2.a1 b10 = this.f16198a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16199b) {
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
            j10 = this.f16201e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f16202f;
        }
        if (z10) {
            j11 = this.f16203g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f16204i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16205j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new j1(b10, z12, this.f16200c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f16198a;
        if (i10 < 3 || !f16187k.a(a1Var)) {
            bundle.putBundle(f16189m, a1Var.c(i10));
        }
        boolean z10 = this.f16199b;
        if (z10) {
            bundle.putBoolean(f16190n, z10);
        }
        long j3 = this.f16200c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f16191o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16192p, j10);
        }
        long j11 = this.f16201e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f16193q, j11);
        }
        int i11 = this.f16202f;
        if (i11 != 0) {
            bundle.putInt(f16194r, i11);
        }
        long j12 = this.f16203g;
        if (j12 != 0) {
            bundle.putLong(f16195s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f16196t, j13);
        }
        long j14 = this.f16204i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16197u, j14);
        }
        long j15 = this.f16205j;
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
            if (this.f16200c == j1Var.f16200c && this.f16198a.equals(j1Var.f16198a) && this.f16199b == j1Var.f16199b && this.d == j1Var.d && this.f16201e == j1Var.f16201e && this.f16202f == j1Var.f16202f && this.f16203g == j1Var.f16203g && this.h == j1Var.h && this.f16204i == j1Var.f16204i && this.f16205j == j1Var.f16205j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16198a, Boolean.valueOf(this.f16199b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f16198a;
        sb2.append(a1Var.f3154b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.f3156e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f3157f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f3158g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f3159i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f16199b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16200c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f16201e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16202f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16203g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16204i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.r(sb2, this.f16205j, "}");
    }
}
