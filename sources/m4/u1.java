package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class u1 {
    public static final String f16745i;
    public static final String f16746j;
    public static final String f16747k;
    public static final String f16748l;
    public static final String f16749m;
    public static final String f16750n;
    public static final String f16751o;
    public static final String f16752p;
    public static final String f16753q;
    public static final String f16754r;
    public final int f16755a;
    public final int f16756b;
    public final int f16757c;
    public final String d;
    public final String e;
    public final IBinder f16758f;
    public final Bundle f16759g;
    public final MediaSession.Token h;

    static {
        String str = e2.m0.f8254a;
        f16745i = Integer.toString(0, 36);
        f16746j = Integer.toString(1, 36);
        f16747k = Integer.toString(2, 36);
        f16748l = Integer.toString(3, 36);
        f16749m = Integer.toString(4, 36);
        f16750n = Integer.toString(5, 36);
        f16751o = Integer.toString(6, 36);
        f16752p = Integer.toString(7, 36);
        f16753q = Integer.toString(8, 36);
        f16754r = Integer.toString(9, 36);
    }

    public u1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f16755a = i10;
        this.f16756b = 1010001300;
        this.f16757c = 9;
        this.d = str;
        this.e = "";
        this.f16758f = i1Var;
        this.f16759g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (this.f16755a == u1Var.f16755a && this.f16756b == u1Var.f16756b && this.f16757c == u1Var.f16757c && TextUtils.equals(this.d, u1Var.d) && TextUtils.equals(this.e, u1Var.e) && Objects.equals(this.f16758f, u1Var.f16758f) && Objects.equals(this.h, u1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16755a), 0, Integer.valueOf(this.f16756b), Integer.valueOf(this.f16757c), this.d, this.e, null, this.f16758f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16756b + " interfaceVersion=" + this.f16757c + " service=" + this.e + " IMediaSession=" + this.f16758f + " extras=" + this.f16759g + "}";
    }
}
