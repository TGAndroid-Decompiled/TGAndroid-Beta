package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class u1 {
    public static final String f16743i;
    public static final String f16744j;
    public static final String f16745k;
    public static final String f16746l;
    public static final String f16747m;
    public static final String f16748n;
    public static final String f16749o;
    public static final String f16750p;
    public static final String f16751q;
    public static final String f16752r;
    public final int f16753a;
    public final int f16754b;
    public final int f16755c;
    public final String d;
    public final String e;
    public final IBinder f16756f;
    public final Bundle f16757g;
    public final MediaSession.Token h;

    static {
        String str = e2.m0.f8252a;
        f16743i = Integer.toString(0, 36);
        f16744j = Integer.toString(1, 36);
        f16745k = Integer.toString(2, 36);
        f16746l = Integer.toString(3, 36);
        f16747m = Integer.toString(4, 36);
        f16748n = Integer.toString(5, 36);
        f16749o = Integer.toString(6, 36);
        f16750p = Integer.toString(7, 36);
        f16751q = Integer.toString(8, 36);
        f16752r = Integer.toString(9, 36);
    }

    public u1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f16753a = i10;
        this.f16754b = 1010001300;
        this.f16755c = 9;
        this.d = str;
        this.e = "";
        this.f16756f = i1Var;
        this.f16757g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (this.f16753a == u1Var.f16753a && this.f16754b == u1Var.f16754b && this.f16755c == u1Var.f16755c && TextUtils.equals(this.d, u1Var.d) && TextUtils.equals(this.e, u1Var.e) && Objects.equals(this.f16756f, u1Var.f16756f) && Objects.equals(this.h, u1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16753a), 0, Integer.valueOf(this.f16754b), Integer.valueOf(this.f16755c), this.d, this.e, null, this.f16756f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16754b + " interfaceVersion=" + this.f16755c + " service=" + this.e + " IMediaSession=" + this.f16756f + " extras=" + this.f16757g + "}";
    }
}
