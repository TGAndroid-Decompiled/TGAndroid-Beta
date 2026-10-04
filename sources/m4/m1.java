package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final String f16243i;
    public static final String f16244j;
    public static final String f16245k;
    public static final String f16246l;
    public static final String f16247m;
    public static final String f16248n;
    public static final String f16249o;
    public static final String f16250p;
    public static final String f16251q;
    public static final String f16252r;
    public final int f16253a;
    public final int f16254b;
    public final int f16255c;
    public final String d;
    public final String f16256e;
    public final IBinder f16257f;
    public final Bundle f16258g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8537a;
        f16243i = Integer.toString(0, 36);
        f16244j = Integer.toString(1, 36);
        f16245k = Integer.toString(2, 36);
        f16246l = Integer.toString(3, 36);
        f16247m = Integer.toString(4, 36);
        f16248n = Integer.toString(5, 36);
        f16249o = Integer.toString(6, 36);
        f16250p = Integer.toString(7, 36);
        f16251q = Integer.toString(8, 36);
        f16252r = Integer.toString(9, 36);
    }

    public m1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f16253a = i10;
        this.f16254b = 1008001300;
        this.f16255c = 5;
        this.d = str;
        this.f16256e = "";
        this.f16257f = a1Var;
        this.f16258g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f16253a == m1Var.f16253a && this.f16254b == m1Var.f16254b && this.f16255c == m1Var.f16255c && TextUtils.equals(this.d, m1Var.d) && TextUtils.equals(this.f16256e, m1Var.f16256e) && Objects.equals(this.f16257f, m1Var.f16257f) && Objects.equals(this.h, m1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16253a), 0, Integer.valueOf(this.f16254b), Integer.valueOf(this.f16255c), this.d, this.f16256e, null, this.f16257f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16254b + " interfaceVersion=" + this.f16255c + " service=" + this.f16256e + " IMediaSession=" + this.f16257f + " extras=" + this.f16258g + "}";
    }
}
