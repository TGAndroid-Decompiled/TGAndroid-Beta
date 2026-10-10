package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class k1 {
    public static final b2.a1 f16133k;
    public static final k1 f16134l;
    public static final String f16135m;
    public static final String f16136n;
    public static final String f16137o;
    public static final String f16138p;
    public static final String f16139q;
    public static final String f16140r;
    public static final String f16141s;
    public static final String f16142t;
    public static final String f16143u;
    public static final String v;
    public final b2.a1 f16144a;
    public final boolean f16145b;
    public final long f16146c;
    public final long d;
    public final long f16147e;
    public final int f16148f;
    public final long f16149g;
    public final long h;
    public final long f16150i;
    public final long f16151j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16133k = a1Var;
        f16134l = new k1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f8532a;
        f16135m = Integer.toString(0, 36);
        f16136n = Integer.toString(1, 36);
        f16137o = Integer.toString(2, 36);
        f16138p = Integer.toString(3, 36);
        f16139q = Integer.toString(4, 36);
        f16140r = Integer.toString(5, 36);
        f16141s = Integer.toString(6, 36);
        f16142t = Integer.toString(7, 36);
        f16143u = Integer.toString(8, 36);
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
        this.f16144a = a1Var;
        this.f16145b = z10;
        this.f16146c = j3;
        this.d = j10;
        this.f16147e = j11;
        this.f16148f = i10;
        this.f16149g = j12;
        this.h = j13;
        this.f16150i = j14;
        this.f16151j = j15;
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
        b2.a1 b10 = this.f16144a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16145b) {
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
            j10 = this.f16147e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f16148f;
        }
        if (z10) {
            j11 = this.f16149g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f16150i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16151j;
        } else {
            j14 = 0;
        }
        return new k1(b10, z12, this.f16146c, j3, j10, i10, j11, j12, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f16144a;
        if (i10 < 3 || !f16133k.a(a1Var)) {
            bundle.putBundle(f16135m, a1Var.c(i10));
        }
        boolean z10 = this.f16145b;
        if (z10) {
            bundle.putBoolean(f16136n, z10);
        }
        long j3 = this.f16146c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f16137o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16138p, j10);
        }
        long j11 = this.f16147e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f16139q, j11);
        }
        int i11 = this.f16148f;
        if (i11 != 0) {
            bundle.putInt(f16140r, i11);
        }
        long j12 = this.f16149g;
        if (j12 != 0) {
            bundle.putLong(f16141s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f16142t, j13);
        }
        long j14 = this.f16150i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16143u, j14);
        }
        long j15 = this.f16151j;
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
            if (this.f16146c == k1Var.f16146c && this.f16144a.equals(k1Var.f16144a) && this.f16145b == k1Var.f16145b && this.d == k1Var.d && this.f16147e == k1Var.f16147e && this.f16148f == k1Var.f16148f && this.f16149g == k1Var.f16149g && this.h == k1Var.h && this.f16150i == k1Var.f16150i && this.f16151j == k1Var.f16151j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16144a, Boolean.valueOf(this.f16145b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f16144a;
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
        sb2.append(this.f16145b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16146c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f16147e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16148f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16149g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16150i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.g.s(sb2, this.f16151j, "}");
    }
}
