package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final String f14901i;
    public static final String f14902j;
    public static final String f14903k;
    public static final String f14904l;
    public static final String f14905m;
    public static final String f14906n;
    public static final String f14907o;
    public static final String f14908p;
    public static final String f14909q;
    public static final String f14910r;
    public final int f14911a;
    public final int f14912b;
    public final int f14913c;
    public final String d;
    public final String e;
    public final IBinder f14914f;
    public final Bundle f14915g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7882a;
        f14901i = Integer.toString(0, 36);
        f14902j = Integer.toString(1, 36);
        f14903k = Integer.toString(2, 36);
        f14904l = Integer.toString(3, 36);
        f14905m = Integer.toString(4, 36);
        f14906n = Integer.toString(5, 36);
        f14907o = Integer.toString(6, 36);
        f14908p = Integer.toString(7, 36);
        f14909q = Integer.toString(8, 36);
        f14910r = Integer.toString(9, 36);
    }

    public m1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14911a = i10;
        this.f14912b = 1008001300;
        this.f14913c = 5;
        this.d = str;
        this.e = "";
        this.f14914f = a1Var;
        this.f14915g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f14911a == m1Var.f14911a && this.f14912b == m1Var.f14912b && this.f14913c == m1Var.f14913c && TextUtils.equals(this.d, m1Var.d) && TextUtils.equals(this.e, m1Var.e) && Objects.equals(this.f14914f, m1Var.f14914f) && Objects.equals(this.h, m1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14911a), 0, Integer.valueOf(this.f14912b), Integer.valueOf(this.f14913c), this.d, this.e, null, this.f14914f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14912b + " interfaceVersion=" + this.f14913c + " service=" + this.e + " IMediaSession=" + this.f14914f + " extras=" + this.f14915g + "}";
    }
}
