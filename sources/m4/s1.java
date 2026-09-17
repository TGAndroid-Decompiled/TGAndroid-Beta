package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class s1 {
    public static final String f14692i;
    public static final String f14693j;
    public static final String f14694k;
    public static final String f14695l;
    public static final String f14696m;
    public static final String f14697n;
    public static final String f14698o;
    public static final String f14699p;
    public static final String f14700q;
    public static final String f14701r;
    public final int f14702a;
    public final int f14703b;
    public final int f14704c;
    public final String d;
    public final String e;
    public final IBinder f14705f;
    public final Bundle f14706g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7888a;
        f14692i = Integer.toString(0, 36);
        f14693j = Integer.toString(1, 36);
        f14694k = Integer.toString(2, 36);
        f14695l = Integer.toString(3, 36);
        f14696m = Integer.toString(4, 36);
        f14697n = Integer.toString(5, 36);
        f14698o = Integer.toString(6, 36);
        f14699p = Integer.toString(7, 36);
        f14700q = Integer.toString(8, 36);
        f14701r = Integer.toString(9, 36);
    }

    public s1(int i10, String str, g1 g1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14702a = i10;
        this.f14703b = 1008001300;
        this.f14704c = 5;
        this.d = str;
        this.e = "";
        this.f14705f = g1Var;
        this.f14706g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            if (this.f14702a == s1Var.f14702a && this.f14703b == s1Var.f14703b && this.f14704c == s1Var.f14704c && TextUtils.equals(this.d, s1Var.d) && TextUtils.equals(this.e, s1Var.e) && Objects.equals(this.f14705f, s1Var.f14705f) && Objects.equals(this.h, s1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14702a), 0, Integer.valueOf(this.f14703b), Integer.valueOf(this.f14704c), this.d, this.e, null, this.f14705f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14703b + " interfaceVersion=" + this.f14704c + " service=" + this.e + " IMediaSession=" + this.f14705f + " extras=" + this.f14706g + "}";
    }
}
