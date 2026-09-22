package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class r1 {
    public static final String f14907i;
    public static final String f14908j;
    public static final String f14909k;
    public static final String f14910l;
    public static final String f14911m;
    public static final String f14912n;
    public static final String f14913o;
    public static final String f14914p;
    public static final String f14915q;
    public static final String f14916r;
    public final int f14917a;
    public final int f14918b;
    public final int f14919c;
    public final String d;
    public final String e;
    public final IBinder f14920f;
    public final Bundle f14921g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7887a;
        f14907i = Integer.toString(0, 36);
        f14908j = Integer.toString(1, 36);
        f14909k = Integer.toString(2, 36);
        f14910l = Integer.toString(3, 36);
        f14911m = Integer.toString(4, 36);
        f14912n = Integer.toString(5, 36);
        f14913o = Integer.toString(6, 36);
        f14914p = Integer.toString(7, 36);
        f14915q = Integer.toString(8, 36);
        f14916r = Integer.toString(9, 36);
    }

    public r1(int i10, String str, f1 f1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14917a = i10;
        this.f14918b = 1008001300;
        this.f14919c = 5;
        this.d = str;
        this.e = "";
        this.f14920f = f1Var;
        this.f14921g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            if (this.f14917a == r1Var.f14917a && this.f14918b == r1Var.f14918b && this.f14919c == r1Var.f14919c && TextUtils.equals(this.d, r1Var.d) && TextUtils.equals(this.e, r1Var.e) && Objects.equals(this.f14920f, r1Var.f14920f) && Objects.equals(this.h, r1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14917a), 0, Integer.valueOf(this.f14918b), Integer.valueOf(this.f14919c), this.d, this.e, null, this.f14920f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14918b + " interfaceVersion=" + this.f14919c + " service=" + this.e + " IMediaSession=" + this.f14920f + " extras=" + this.f14921g + "}";
    }
}
