package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class r1 {
    public static final String f16065i;
    public static final String f16066j;
    public static final String f16067k;
    public static final String f16068l;
    public static final String f16069m;
    public static final String f16070n;
    public static final String f16071o;
    public static final String f16072p;
    public static final String f16073q;
    public static final String f16074r;
    public final int f16075a;
    public final int f16076b;
    public final int f16077c;
    public final String d;
    public final String f16078e;
    public final IBinder f16079f;
    public final Bundle f16080g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8737a;
        f16065i = Integer.toString(0, 36);
        f16066j = Integer.toString(1, 36);
        f16067k = Integer.toString(2, 36);
        f16068l = Integer.toString(3, 36);
        f16069m = Integer.toString(4, 36);
        f16070n = Integer.toString(5, 36);
        f16071o = Integer.toString(6, 36);
        f16072p = Integer.toString(7, 36);
        f16073q = Integer.toString(8, 36);
        f16074r = Integer.toString(9, 36);
    }

    public r1(int i10, String str, f1 f1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f16075a = i10;
        this.f16076b = 1008001300;
        this.f16077c = 5;
        this.d = str;
        this.f16078e = "";
        this.f16079f = f1Var;
        this.f16080g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            if (this.f16075a == r1Var.f16075a && this.f16076b == r1Var.f16076b && this.f16077c == r1Var.f16077c && TextUtils.equals(this.d, r1Var.d) && TextUtils.equals(this.f16078e, r1Var.f16078e) && Objects.equals(this.f16079f, r1Var.f16079f) && Objects.equals(this.h, r1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16075a), 0, Integer.valueOf(this.f16076b), Integer.valueOf(this.f16077c), this.d, this.f16078e, null, this.f16079f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16076b + " interfaceVersion=" + this.f16077c + " service=" + this.f16078e + " IMediaSession=" + this.f16079f + " extras=" + this.f16080g + "}";
    }
}
