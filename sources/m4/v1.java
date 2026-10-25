package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class v1 {
    public static final String f18271i;
    public static final String f18272j;
    public static final String f18273k;
    public static final String f18274l;
    public static final String f18275m;
    public static final String f18276n;
    public static final String f18277o;
    public static final String f18278p;
    public static final String f18279q;
    public static final String f18280r;
    public final int f18281a;
    public final int f18282b;
    public final int f18283c;
    public final String d;
    public final String e;
    public final IBinder f18284f;
    public final Bundle f18285g;
    public final MediaSession.Token h;

    static {
        String str = e2.n0.f9692a;
        f18271i = Integer.toString(0, 36);
        f18272j = Integer.toString(1, 36);
        f18273k = Integer.toString(2, 36);
        f18274l = Integer.toString(3, 36);
        f18275m = Integer.toString(4, 36);
        f18276n = Integer.toString(5, 36);
        f18277o = Integer.toString(6, 36);
        f18278p = Integer.toString(7, 36);
        f18279q = Integer.toString(8, 36);
        f18280r = Integer.toString(9, 36);
    }

    public v1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f18281a = i10;
        this.f18282b = 1010001300;
        this.f18283c = 9;
        this.d = str;
        this.e = "";
        this.f18284f = j1Var;
        this.f18285g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (this.f18281a == v1Var.f18281a && this.f18282b == v1Var.f18282b && this.f18283c == v1Var.f18283c && TextUtils.equals(this.d, v1Var.d) && TextUtils.equals(this.e, v1Var.e) && Objects.equals(this.f18284f, v1Var.f18284f) && Objects.equals(this.h, v1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f18281a), 0, Integer.valueOf(this.f18282b), Integer.valueOf(this.f18283c), this.d, this.e, null, this.f18284f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f18282b + " interfaceVersion=" + this.f18283c + " service=" + this.e + " IMediaSession=" + this.f18284f + " extras=" + this.f18285g + "}";
    }
}
