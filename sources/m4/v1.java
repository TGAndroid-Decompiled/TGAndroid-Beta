package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class v1 {
    public static final String f18270i;
    public static final String f18271j;
    public static final String f18272k;
    public static final String f18273l;
    public static final String f18274m;
    public static final String f18275n;
    public static final String f18276o;
    public static final String f18277p;
    public static final String f18278q;
    public static final String f18279r;
    public final int f18280a;
    public final int f18281b;
    public final int f18282c;
    public final String d;
    public final String e;
    public final IBinder f18283f;
    public final Bundle f18284g;
    public final MediaSession.Token h;

    static {
        String str = e2.n0.f9691a;
        f18270i = Integer.toString(0, 36);
        f18271j = Integer.toString(1, 36);
        f18272k = Integer.toString(2, 36);
        f18273l = Integer.toString(3, 36);
        f18274m = Integer.toString(4, 36);
        f18275n = Integer.toString(5, 36);
        f18276o = Integer.toString(6, 36);
        f18277p = Integer.toString(7, 36);
        f18278q = Integer.toString(8, 36);
        f18279r = Integer.toString(9, 36);
    }

    public v1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f18280a = i10;
        this.f18281b = 1010001300;
        this.f18282c = 9;
        this.d = str;
        this.e = "";
        this.f18283f = j1Var;
        this.f18284g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (this.f18280a == v1Var.f18280a && this.f18281b == v1Var.f18281b && this.f18282c == v1Var.f18282c && TextUtils.equals(this.d, v1Var.d) && TextUtils.equals(this.e, v1Var.e) && Objects.equals(this.f18283f, v1Var.f18283f) && Objects.equals(this.h, v1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f18280a), 0, Integer.valueOf(this.f18281b), Integer.valueOf(this.f18282c), this.d, this.e, null, this.f18283f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f18281b + " interfaceVersion=" + this.f18282c + " service=" + this.e + " IMediaSession=" + this.f18283f + " extras=" + this.f18284g + "}";
    }
}
