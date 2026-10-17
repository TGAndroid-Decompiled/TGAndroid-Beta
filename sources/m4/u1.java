package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class u1 {
    public static final String f16737i;
    public static final String f16738j;
    public static final String f16739k;
    public static final String f16740l;
    public static final String f16741m;
    public static final String f16742n;
    public static final String f16743o;
    public static final String f16744p;
    public static final String f16745q;
    public static final String f16746r;
    public final int f16747a;
    public final int f16748b;
    public final int f16749c;
    public final String d;
    public final String e;
    public final IBinder f16750f;
    public final Bundle f16751g;
    public final MediaSession.Token h;

    static {
        String str = e2.m0.f8254a;
        f16737i = Integer.toString(0, 36);
        f16738j = Integer.toString(1, 36);
        f16739k = Integer.toString(2, 36);
        f16740l = Integer.toString(3, 36);
        f16741m = Integer.toString(4, 36);
        f16742n = Integer.toString(5, 36);
        f16743o = Integer.toString(6, 36);
        f16744p = Integer.toString(7, 36);
        f16745q = Integer.toString(8, 36);
        f16746r = Integer.toString(9, 36);
    }

    public u1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f16747a = i10;
        this.f16748b = 1010001300;
        this.f16749c = 9;
        this.d = str;
        this.e = "";
        this.f16750f = i1Var;
        this.f16751g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (this.f16747a == u1Var.f16747a && this.f16748b == u1Var.f16748b && this.f16749c == u1Var.f16749c && TextUtils.equals(this.d, u1Var.d) && TextUtils.equals(this.e, u1Var.e) && Objects.equals(this.f16750f, u1Var.f16750f) && Objects.equals(this.h, u1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16747a), 0, Integer.valueOf(this.f16748b), Integer.valueOf(this.f16749c), this.d, this.e, null, this.f16750f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16748b + " interfaceVersion=" + this.f16749c + " service=" + this.e + " IMediaSession=" + this.f16750f + " extras=" + this.f16751g + "}";
    }
}
