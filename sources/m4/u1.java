package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class u1 {
    public static final String f16742i;
    public static final String f16743j;
    public static final String f16744k;
    public static final String f16745l;
    public static final String f16746m;
    public static final String f16747n;
    public static final String f16748o;
    public static final String f16749p;
    public static final String f16750q;
    public static final String f16751r;
    public final int f16752a;
    public final int f16753b;
    public final int f16754c;
    public final String d;
    public final String e;
    public final IBinder f16755f;
    public final Bundle f16756g;
    public final MediaSession.Token h;

    static {
        String str = e2.m0.f8253a;
        f16742i = Integer.toString(0, 36);
        f16743j = Integer.toString(1, 36);
        f16744k = Integer.toString(2, 36);
        f16745l = Integer.toString(3, 36);
        f16746m = Integer.toString(4, 36);
        f16747n = Integer.toString(5, 36);
        f16748o = Integer.toString(6, 36);
        f16749p = Integer.toString(7, 36);
        f16750q = Integer.toString(8, 36);
        f16751r = Integer.toString(9, 36);
    }

    public u1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f16752a = i10;
        this.f16753b = 1010001300;
        this.f16754c = 9;
        this.d = str;
        this.e = "";
        this.f16755f = i1Var;
        this.f16756g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (this.f16752a == u1Var.f16752a && this.f16753b == u1Var.f16753b && this.f16754c == u1Var.f16754c && TextUtils.equals(this.d, u1Var.d) && TextUtils.equals(this.e, u1Var.e) && Objects.equals(this.f16755f, u1Var.f16755f) && Objects.equals(this.h, u1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16752a), 0, Integer.valueOf(this.f16753b), Integer.valueOf(this.f16754c), this.d, this.e, null, this.f16755f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16753b + " interfaceVersion=" + this.f16754c + " service=" + this.e + " IMediaSession=" + this.f16755f + " extras=" + this.f16756g + "}";
    }
}
