package m4;

import android.os.Bundle;
import j$.util.Objects;
public final class o1 {
    public static final b2.a1 f16047k;
    public static final o1 f16048l;
    public static final String f16049m;
    public static final String f16050n;
    public static final String f16051o;
    public static final String f16052p;
    public static final String f16053q;
    public static final String f16054r;
    public static final String f16055s;
    public static final String f16056t;
    public static final String f16057u;
    public static final String v;
    public final b2.a1 f16058a;
    public final boolean f16059b;
    public final long f16060c;
    public final long d;
    public final long f16061e;
    public final int f16062f;
    public final long f16063g;
    public final long h;
    public final long f16064i;
    public final long f16065j;

    static {
        b2.a1 a1Var = new b2.a1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f16047k = a1Var;
        f16048l = new o1(a1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e2.d0.f8765a;
        f16049m = Integer.toString(0, 36);
        f16050n = Integer.toString(1, 36);
        f16051o = Integer.toString(2, 36);
        f16052p = Integer.toString(3, 36);
        f16053q = Integer.toString(4, 36);
        f16054r = Integer.toString(5, 36);
        f16055s = Integer.toString(6, 36);
        f16056t = Integer.toString(7, 36);
        f16057u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public o1(b2.a1 a1Var, boolean z10, long j3, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (a1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z10 == z11);
        this.f16058a = a1Var;
        this.f16059b = z10;
        this.f16060c = j3;
        this.d = j10;
        this.f16061e = j11;
        this.f16062f = i10;
        this.f16063g = j12;
        this.h = j13;
        this.f16064i = j14;
        this.f16065j = j15;
    }

    public final o1 a(boolean z10, boolean z11) {
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
        b2.a1 b10 = this.f16058a.b(z10, z11);
        int i10 = 0;
        if (z10 && this.f16059b) {
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
            j10 = this.f16061e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i10 = this.f16062f;
        }
        if (z10) {
            j11 = this.f16063g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f16064i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f16065j;
        } else {
            j14 = 0;
        }
        long j15 = j12;
        return new o1(b10, z12, this.f16060c, j3, j10, i10, j11, j15, j13, j14);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        b2.a1 a1Var = this.f16058a;
        if (i10 < 3 || !f16047k.a(a1Var)) {
            bundle.putBundle(f16049m, a1Var.c(i10));
        }
        boolean z10 = this.f16059b;
        if (z10) {
            bundle.putBoolean(f16050n, z10);
        }
        long j3 = this.f16060c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f16051o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f16052p, j10);
        }
        long j11 = this.f16061e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f16053q, j11);
        }
        int i11 = this.f16062f;
        if (i11 != 0) {
            bundle.putInt(f16054r, i11);
        }
        long j12 = this.f16063g;
        if (j12 != 0) {
            bundle.putLong(f16055s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f16056t, j13);
        }
        long j14 = this.f16064i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f16057u, j14);
        }
        long j15 = this.f16065j;
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
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f16060c == o1Var.f16060c && this.f16058a.equals(o1Var.f16058a) && this.f16059b == o1Var.f16059b && this.d == o1Var.d && this.f16061e == o1Var.f16061e && this.f16062f == o1Var.f16062f && this.f16063g == o1Var.f16063g && this.h == o1Var.h && this.f16064i == o1Var.f16064i && this.f16065j == o1Var.f16065j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16058a, Boolean.valueOf(this.f16059b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        b2.a1 a1Var = this.f16058a;
        sb2.append(a1Var.f1987b);
        sb2.append(", periodIndex=");
        sb2.append(a1Var.f1989e);
        sb2.append(", positionMs=");
        sb2.append(a1Var.f1990f);
        sb2.append(", contentPositionMs=");
        sb2.append(a1Var.f1991g);
        sb2.append(", adGroupIndex=");
        sb2.append(a1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(a1Var.f1992i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f16059b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f16060c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f16061e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f16062f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f16063g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f16064i);
        sb2.append(", contentBufferedPositionMs=");
        return a4.a.r(sb2, this.f16065j, "}");
    }
}
