package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class v1 {
    public static final String f12966i;
    public static final String f12967j;
    public static final String f12968k;
    public static final String f12969l;
    public static final String f12970m;
    public static final String f12971n;
    public static final String f12972o;
    public static final String f12973p;
    public static final String f12974q;
    public static final String f12975r;
    public final int f12976a;
    public final int f12977b;
    public final int f12978c;
    public final String d;
    public final String e;
    public final IBinder f12979f;
    public final Bundle f12980g;
    public final MediaSession.Token h;

    static {
        String str = e2.l0.f6165a;
        f12966i = Integer.toString(0, 36);
        f12967j = Integer.toString(1, 36);
        f12968k = Integer.toString(2, 36);
        f12969l = Integer.toString(3, 36);
        f12970m = Integer.toString(4, 36);
        f12971n = Integer.toString(5, 36);
        f12972o = Integer.toString(6, 36);
        f12973p = Integer.toString(7, 36);
        f12974q = Integer.toString(8, 36);
        f12975r = Integer.toString(9, 36);
    }

    public v1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f12976a = i10;
        this.f12977b = 1010001300;
        this.f12978c = 9;
        this.d = str;
        this.e = "";
        this.f12979f = j1Var;
        this.f12980g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (this.f12976a == v1Var.f12976a && this.f12977b == v1Var.f12977b && this.f12978c == v1Var.f12978c && TextUtils.equals(this.d, v1Var.d) && TextUtils.equals(this.e, v1Var.e) && Objects.equals(this.f12979f, v1Var.f12979f) && Objects.equals(this.h, v1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12976a), 0, Integer.valueOf(this.f12977b), Integer.valueOf(this.f12978c), this.d, this.e, null, this.f12979f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f12977b + " interfaceVersion=" + this.f12978c + " service=" + this.e + " IMediaSession=" + this.f12979f + " extras=" + this.f12980g + "}";
    }
}
