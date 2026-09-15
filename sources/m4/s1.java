package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class s1 {
    public static final String f14682i;
    public static final String f14683j;
    public static final String f14684k;
    public static final String f14685l;
    public static final String f14686m;
    public static final String f14687n;
    public static final String f14688o;
    public static final String f14689p;
    public static final String f14690q;
    public static final String f14691r;
    public final int f14692a;
    public final int f14693b;
    public final int f14694c;
    public final String d;
    public final String e;
    public final IBinder f14695f;
    public final Bundle f14696g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7883a;
        f14682i = Integer.toString(0, 36);
        f14683j = Integer.toString(1, 36);
        f14684k = Integer.toString(2, 36);
        f14685l = Integer.toString(3, 36);
        f14686m = Integer.toString(4, 36);
        f14687n = Integer.toString(5, 36);
        f14688o = Integer.toString(6, 36);
        f14689p = Integer.toString(7, 36);
        f14690q = Integer.toString(8, 36);
        f14691r = Integer.toString(9, 36);
    }

    public s1(int i10, String str, g1 g1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14692a = i10;
        this.f14693b = 1008001300;
        this.f14694c = 5;
        this.d = str;
        this.e = "";
        this.f14695f = g1Var;
        this.f14696g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            if (this.f14692a == s1Var.f14692a && this.f14693b == s1Var.f14693b && this.f14694c == s1Var.f14694c && TextUtils.equals(this.d, s1Var.d) && TextUtils.equals(this.e, s1Var.e) && Objects.equals(this.f14695f, s1Var.f14695f) && Objects.equals(this.h, s1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14692a), 0, Integer.valueOf(this.f14693b), Integer.valueOf(this.f14694c), this.d, this.e, null, this.f14695f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14693b + " interfaceVersion=" + this.f14694c + " service=" + this.e + " IMediaSession=" + this.f14695f + " extras=" + this.f14696g + "}";
    }
}
