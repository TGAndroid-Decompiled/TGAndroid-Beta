package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 {
    public static final b2.a1 f16191k;
    public static final j1 f16192l;
    public static final String f16193m;
    public static final String f16194n;
    public static final String f16195o;
    public static final String f16196p;
    public static final String f16197q;
    public static final String f16198r;
    public static final String f16199s;
    public static final String f16200t;
    public static final String f16201u;
    public static final String v;
    public final b2.a1 f16202a;
    public final boolean f16203b;
    public final long f16204c;
    public final long d;
    public final long f16205e;
    public final int f16206f;
    public final long f16207g;
    public final long h;
    public final long f16208i;
    public final long f16209j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16191k = a1Var;
        f16192l = new j1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f8538a;
        f16193m = Integer.toString(0, 36);
        f16194n = Integer.toString(1, 36);
        f16195o = Integer.toString(2, 36);
        f16196p = Integer.toString(3, 36);
        f16197q = Integer.toString(4, 36);
        f16198r = Integer.toString(5, 36);
        f16199s = Integer.toString(6, 36);
        f16200t = Integer.toString(7, 36);
        f16201u = Integer.toString(8, 36);
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
        this.f16202a = a1Var;
        this.f16203b = z10;
        this.f16204c = j3;
        this.d = j10;
        this.f16205e = j11;
        this.f16206f = i10;
        this.f16207g = j12;
        this.h = j13;
        this.f16208i = j14;
        this.f16209j = j15;
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
        b2.a1 b10 = this.f16202a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16203b) {
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
            j10 = this.f16205e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f16206f;
        }
        if (z10) {
            j11 = this.f16207g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f16208i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16209j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new j1(b10, z12, this.f16204c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f16202a;
        if (i10 < 3 || !f16191k.a(a1Var)) {
            bundle.putBundle(f16193m, a1Var.c(i10));
        }
        boolean z10 = this.f16203b;
        if (z10) {
            bundle.putBoolean(f16194n, z10);
        }
        long j3 = this.f16204c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f16195o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16196p, j10);
        }
        long j11 = this.f16205e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f16197q, j11);
        }
        int i11 = this.f16206f;
        if (i11 != 0) {
            bundle.putInt(f16198r, i11);
        }
        long j12 = this.f16207g;
        if (j12 != 0) {
            bundle.putLong(f16199s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f16200t, j13);
        }
        long j14 = this.f16208i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16201u, j14);
        }
        long j15 = this.f16209j;
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
            if (this.f16204c == j1Var.f16204c && this.f16202a.equals(j1Var.f16202a) && this.f16203b == j1Var.f16203b && this.d == j1Var.d && this.f16205e == j1Var.f16205e && this.f16206f == j1Var.f16206f && this.f16207g == j1Var.f16207g && this.h == j1Var.h && this.f16208i == j1Var.f16208i && this.f16209j == j1Var.f16209j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16202a, Boolean.valueOf(this.f16203b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f16202a;
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
        sb2.append(this.f16203b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16204c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f16205e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16206f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16207g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16208i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.s(sb2, this.f16209j, "}");
    }
}
