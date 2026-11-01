package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class v1 {
    public static final String f12967i;
    public static final String f12968j;
    public static final String f12969k;
    public static final String f12970l;
    public static final String f12971m;
    public static final String f12972n;
    public static final String f12973o;
    public static final String f12974p;
    public static final String f12975q;
    public static final String f12976r;
    public final int f12977a;
    public final int f12978b;
    public final int f12979c;
    public final String d;
    public final String e;
    public final IBinder f12980f;
    public final Bundle f12981g;
    public final MediaSession.Token h;

    static {
        String str = e2.l0.f6165a;
        f12967i = Integer.toString(0, 36);
        f12968j = Integer.toString(1, 36);
        f12969k = Integer.toString(2, 36);
        f12970l = Integer.toString(3, 36);
        f12971m = Integer.toString(4, 36);
        f12972n = Integer.toString(5, 36);
        f12973o = Integer.toString(6, 36);
        f12974p = Integer.toString(7, 36);
        f12975q = Integer.toString(8, 36);
        f12976r = Integer.toString(9, 36);
    }

    public v1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f12977a = i10;
        this.f12978b = 1010001300;
        this.f12979c = 9;
        this.d = str;
        this.e = "";
        this.f12980f = j1Var;
        this.f12981g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (this.f12977a == v1Var.f12977a && this.f12978b == v1Var.f12978b && this.f12979c == v1Var.f12979c && TextUtils.equals(this.d, v1Var.d) && TextUtils.equals(this.e, v1Var.e) && Objects.equals(this.f12980f, v1Var.f12980f) && Objects.equals(this.h, v1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12977a), 0, Integer.valueOf(this.f12978b), Integer.valueOf(this.f12979c), this.d, this.e, null, this.f12980f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f12978b + " interfaceVersion=" + this.f12979c + " service=" + this.e + " IMediaSession=" + this.f12980f + " extras=" + this.f12981g + "}";
    }
}
