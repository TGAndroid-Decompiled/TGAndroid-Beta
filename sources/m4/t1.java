package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class t1 {
    public static final String f13522i;
    public static final String f13523j;
    public static final String f13524k;
    public static final String f13525l;
    public static final String f13526m;
    public static final String f13527n;
    public static final String f13528o;
    public static final String f13529p;
    public static final String f13530q;
    public static final String f13531r;
    public final int f13532a;
    public final int f13533b;
    public final int f13534c;
    public final String d;
    public final String e;
    public final IBinder f13535f;
    public final Bundle f13536g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7188a;
        f13522i = Integer.toString(0, 36);
        f13523j = Integer.toString(1, 36);
        f13524k = Integer.toString(2, 36);
        f13525l = Integer.toString(3, 36);
        f13526m = Integer.toString(4, 36);
        f13527n = Integer.toString(5, 36);
        f13528o = Integer.toString(6, 36);
        f13529p = Integer.toString(7, 36);
        f13530q = Integer.toString(8, 36);
        f13531r = Integer.toString(9, 36);
    }

    public t1(int i10, String str, h1 h1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f13532a = i10;
        this.f13533b = 1008001300;
        this.f13534c = 5;
        this.d = str;
        this.e = "";
        this.f13535f = h1Var;
        this.f13536g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (this.f13532a == t1Var.f13532a && this.f13533b == t1Var.f13533b && this.f13534c == t1Var.f13534c && TextUtils.equals(this.d, t1Var.d) && TextUtils.equals(this.e, t1Var.e) && Objects.equals(this.f13535f, t1Var.f13535f) && Objects.equals(this.h, t1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13532a), 0, Integer.valueOf(this.f13533b), Integer.valueOf(this.f13534c), this.d, this.e, null, this.f13535f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f13533b + " interfaceVersion=" + this.f13534c + " service=" + this.e + " IMediaSession=" + this.f13535f + " extras=" + this.f13536g + "}";
    }
}
