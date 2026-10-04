package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final String f16248i;
    public static final String f16249j;
    public static final String f16250k;
    public static final String f16251l;
    public static final String f16252m;
    public static final String f16253n;
    public static final String f16254o;
    public static final String f16255p;
    public static final String f16256q;
    public static final String f16257r;
    public final int f16258a;
    public final int f16259b;
    public final int f16260c;
    public final String d;
    public final String f16261e;
    public final IBinder f16262f;
    public final Bundle f16263g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8538a;
        f16248i = Integer.toString(0, 36);
        f16249j = Integer.toString(1, 36);
        f16250k = Integer.toString(2, 36);
        f16251l = Integer.toString(3, 36);
        f16252m = Integer.toString(4, 36);
        f16253n = Integer.toString(5, 36);
        f16254o = Integer.toString(6, 36);
        f16255p = Integer.toString(7, 36);
        f16256q = Integer.toString(8, 36);
        f16257r = Integer.toString(9, 36);
    }

    public m1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f16258a = i10;
        this.f16259b = 1008001300;
        this.f16260c = 5;
        this.d = str;
        this.f16261e = "";
        this.f16262f = a1Var;
        this.f16263g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f16258a == m1Var.f16258a && this.f16259b == m1Var.f16259b && this.f16260c == m1Var.f16260c && TextUtils.equals(this.d, m1Var.d) && TextUtils.equals(this.f16261e, m1Var.f16261e) && Objects.equals(this.f16262f, m1Var.f16262f) && Objects.equals(this.h, m1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16258a), 0, Integer.valueOf(this.f16259b), Integer.valueOf(this.f16260c), this.d, this.f16261e, null, this.f16262f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16259b + " interfaceVersion=" + this.f16260c + " service=" + this.f16261e + " IMediaSession=" + this.f16262f + " extras=" + this.f16263g + "}";
    }
}
