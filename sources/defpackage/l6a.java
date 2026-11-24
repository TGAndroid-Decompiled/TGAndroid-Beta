package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class l6a {
    public static final nc8 k;
    public static final l6a l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final nc8 a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        nc8 nc8Var = new nc8(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = nc8Var;
        l = new l6a(nc8Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = g8c.a;
        m = "0";
        n = "1";
        o = "2";
        p = "3";
        q = "4";
        r = "5";
        s = "6";
        t = "7";
        u = "8";
        v = "9";
    }

    public l6a(nc8 nc8Var, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        boolean z2;
        if (nc8Var.h != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        gre.f(z == z2);
        this.a = nc8Var;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
    }

    public final l6a a(boolean z, boolean z2) {
        boolean z3;
        nc8 nc8Var;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (z && z2) {
            return this;
        }
        nc8 b = this.a.b(z, z2);
        int i = 0;
        if (z && this.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            j = this.d;
            long j7 = this.e;
            i = this.f;
            j4 = this.g;
            j2 = this.h;
            j3 = this.i;
            nc8Var = b;
            j5 = this.j;
            j6 = j7;
        } else {
            nc8Var = b;
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
            j3 = -9223372036854775807L;
            j4 = 0;
            j5 = 0;
            j6 = 0;
        }
        return new l6a(nc8Var, z3, this.c, j, j6, i, j4, j2, j3, j5);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        nc8 nc8Var = this.a;
        if (i < 3 || !k.a(nc8Var)) {
            bundle.putBundle(m, nc8Var.c(i));
        }
        boolean z = this.b;
        if (z) {
            bundle.putBoolean(n, z);
        }
        long j = this.c;
        if (j != -9223372036854775807L) {
            bundle.putLong(o, j);
        }
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(p, j2);
        }
        long j3 = this.e;
        if (i < 3 || j3 != 0) {
            bundle.putLong(q, j3);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt(r, i2);
        }
        long j4 = this.g;
        if (j4 != 0) {
            bundle.putLong(s, j4);
        }
        long j5 = this.h;
        if (j5 != -9223372036854775807L) {
            bundle.putLong(t, j5);
        }
        long j6 = this.i;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(u, j6);
        }
        long j7 = this.j;
        if (i >= 3 && j7 == 0) {
            return bundle;
        }
        bundle.putLong(v, j7);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && l6a.class == obj.getClass()) {
                l6a l6aVar = (l6a) obj;
                if (this.c == l6aVar.c && this.a.equals(l6aVar.a) && this.b == l6aVar.b && this.d == l6aVar.d && this.e == l6aVar.e && this.f == l6aVar.f && this.g == l6aVar.g && this.h == l6aVar.h && this.i == l6aVar.i && this.j == l6aVar.j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        nc8 nc8Var = this.a;
        sb.append(nc8Var.b);
        sb.append(", periodIndex=");
        sb.append(nc8Var.e);
        sb.append(", positionMs=");
        sb.append(nc8Var.f);
        sb.append(", contentPositionMs=");
        sb.append(nc8Var.g);
        sb.append(", adGroupIndex=");
        sb.append(nc8Var.h);
        sb.append(", adIndexInAdGroup=");
        sb.append(nc8Var.i);
        sb.append("}, isPlayingAd=");
        sb.append(this.b);
        sb.append(", eventTimeMs=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.h);
        sb.append(", contentDurationMs=");
        sb.append(this.i);
        sb.append(", contentBufferedPositionMs=");
        return ls6.p(sb, this.j, "}");
    }
}
