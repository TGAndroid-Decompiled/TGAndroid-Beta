package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final String f16244i;
    public static final String f16245j;
    public static final String f16246k;
    public static final String f16247l;
    public static final String f16248m;
    public static final String f16249n;
    public static final String f16250o;
    public static final String f16251p;
    public static final String f16252q;
    public static final String f16253r;
    public final int f16254a;
    public final int f16255b;
    public final int f16256c;
    public final String d;
    public final String f16257e;
    public final IBinder f16258f;
    public final Bundle f16259g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8537a;
        f16244i = Integer.toString(0, 36);
        f16245j = Integer.toString(1, 36);
        f16246k = Integer.toString(2, 36);
        f16247l = Integer.toString(3, 36);
        f16248m = Integer.toString(4, 36);
        f16249n = Integer.toString(5, 36);
        f16250o = Integer.toString(6, 36);
        f16251p = Integer.toString(7, 36);
        f16252q = Integer.toString(8, 36);
        f16253r = Integer.toString(9, 36);
    }

    public m1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f16254a = i10;
        this.f16255b = 1008001300;
        this.f16256c = 5;
        this.d = str;
        this.f16257e = "";
        this.f16258f = a1Var;
        this.f16259g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f16254a == m1Var.f16254a && this.f16255b == m1Var.f16255b && this.f16256c == m1Var.f16256c && TextUtils.equals(this.d, m1Var.d) && TextUtils.equals(this.f16257e, m1Var.f16257e) && Objects.equals(this.f16258f, m1Var.f16258f) && Objects.equals(this.h, m1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16254a), 0, Integer.valueOf(this.f16255b), Integer.valueOf(this.f16256c), this.d, this.f16257e, null, this.f16258f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16255b + " interfaceVersion=" + this.f16256c + " service=" + this.f16257e + " IMediaSession=" + this.f16258f + " extras=" + this.f16259g + "}";
    }
}
