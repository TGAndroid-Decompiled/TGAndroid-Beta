package o4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class t1 {
    public static final String f20861i;
    public static final String f20862j;
    public static final String f20863k;
    public static final String f20864l;
    public static final String f20865m;
    public static final String f20866n;
    public static final String f20867o;
    public static final String f20868p;
    public static final String f20869q;
    public static final String f20870r;
    public final int f20871a;
    public final int f20872b;
    public final int f20873c;
    public final String d;
    public final String f20874e;
    public final IBinder f20875f;
    public final Bundle f20876g;
    public final MediaSession.Token h;

    static {
        String str = g2.n0.f11873a;
        f20861i = Integer.toString(0, 36);
        f20862j = Integer.toString(1, 36);
        f20863k = Integer.toString(2, 36);
        f20864l = Integer.toString(3, 36);
        f20865m = Integer.toString(4, 36);
        f20866n = Integer.toString(5, 36);
        f20867o = Integer.toString(6, 36);
        f20868p = Integer.toString(7, 36);
        f20869q = Integer.toString(8, 36);
        f20870r = Integer.toString(9, 36);
    }

    public t1(int i3, String str, h1 h1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f20871a = i3;
        this.f20872b = 1010001300;
        this.f20873c = 9;
        this.d = str;
        this.f20874e = "";
        this.f20875f = h1Var;
        this.f20876g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (this.f20871a == t1Var.f20871a && this.f20872b == t1Var.f20872b && this.f20873c == t1Var.f20873c && TextUtils.equals(this.d, t1Var.d) && TextUtils.equals(this.f20874e, t1Var.f20874e) && Objects.equals(this.f20875f, t1Var.f20875f) && Objects.equals(this.h, t1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f20871a), 0, Integer.valueOf(this.f20872b), Integer.valueOf(this.f20873c), this.d, this.f20874e, null, this.f20875f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f20872b + " interfaceVersion=" + this.f20873c + " service=" + this.f20874e + " IMediaSession=" + this.f20875f + " extras=" + this.f20876g + "}";
    }
}
