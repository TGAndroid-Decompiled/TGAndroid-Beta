package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class v1 {
    public static final String f15655i;
    public static final String f15656j;
    public static final String f15657k;
    public static final String f15658l;
    public static final String f15659m;
    public static final String f15660n;
    public static final String f15661o;
    public static final String f15662p;
    public static final String f15663q;
    public static final String f15664r;
    public final int f15665a;
    public final int f15666b;
    public final int f15667c;
    public final String d;
    public final String e;
    public final IBinder f15668f;
    public final Bundle f15669g;
    public final MediaSession.Token h;

    static {
        String str = e2.m0.f8372a;
        f15655i = Integer.toString(0, 36);
        f15656j = Integer.toString(1, 36);
        f15657k = Integer.toString(2, 36);
        f15658l = Integer.toString(3, 36);
        f15659m = Integer.toString(4, 36);
        f15660n = Integer.toString(5, 36);
        f15661o = Integer.toString(6, 36);
        f15662p = Integer.toString(7, 36);
        f15663q = Integer.toString(8, 36);
        f15664r = Integer.toString(9, 36);
    }

    public v1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f15665a = i10;
        this.f15666b = 1010001300;
        this.f15667c = 9;
        this.d = str;
        this.e = "";
        this.f15668f = j1Var;
        this.f15669g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (this.f15665a == v1Var.f15665a && this.f15666b == v1Var.f15666b && this.f15667c == v1Var.f15667c && TextUtils.equals(this.d, v1Var.d) && TextUtils.equals(this.e, v1Var.e) && Objects.equals(this.f15668f, v1Var.f15668f) && Objects.equals(this.h, v1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15665a), 0, Integer.valueOf(this.f15666b), Integer.valueOf(this.f15667c), this.d, this.e, null, this.f15668f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f15666b + " interfaceVersion=" + this.f15667c + " service=" + this.e + " IMediaSession=" + this.f15668f + " extras=" + this.f15669g + "}";
    }
}
