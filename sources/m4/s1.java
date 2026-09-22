package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class s1 {
    public static final String f14680i;
    public static final String f14681j;
    public static final String f14682k;
    public static final String f14683l;
    public static final String f14684m;
    public static final String f14685n;
    public static final String f14686o;
    public static final String f14687p;
    public static final String f14688q;
    public static final String f14689r;
    public final int f14690a;
    public final int f14691b;
    public final int f14692c;
    public final String d;
    public final String e;
    public final IBinder f14693f;
    public final Bundle f14694g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7885a;
        f14680i = Integer.toString(0, 36);
        f14681j = Integer.toString(1, 36);
        f14682k = Integer.toString(2, 36);
        f14683l = Integer.toString(3, 36);
        f14684m = Integer.toString(4, 36);
        f14685n = Integer.toString(5, 36);
        f14686o = Integer.toString(6, 36);
        f14687p = Integer.toString(7, 36);
        f14688q = Integer.toString(8, 36);
        f14689r = Integer.toString(9, 36);
    }

    public s1(int i10, String str, g1 g1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14690a = i10;
        this.f14691b = 1008001300;
        this.f14692c = 5;
        this.d = str;
        this.e = "";
        this.f14693f = g1Var;
        this.f14694g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            if (this.f14690a == s1Var.f14690a && this.f14691b == s1Var.f14691b && this.f14692c == s1Var.f14692c && TextUtils.equals(this.d, s1Var.d) && TextUtils.equals(this.e, s1Var.e) && Objects.equals(this.f14693f, s1Var.f14693f) && Objects.equals(this.h, s1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14690a), 0, Integer.valueOf(this.f14691b), Integer.valueOf(this.f14692c), this.d, this.e, null, this.f14693f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14691b + " interfaceVersion=" + this.f14692c + " service=" + this.e + " IMediaSession=" + this.f14693f + " extras=" + this.f14694g + "}";
    }
}
