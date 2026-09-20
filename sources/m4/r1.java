package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class r1 {
    public static final String f14892i;
    public static final String f14893j;
    public static final String f14894k;
    public static final String f14895l;
    public static final String f14896m;
    public static final String f14897n;
    public static final String f14898o;
    public static final String f14899p;
    public static final String f14900q;
    public static final String f14901r;
    public final int f14902a;
    public final int f14903b;
    public final int f14904c;
    public final String d;
    public final String e;
    public final IBinder f14905f;
    public final Bundle f14906g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7888a;
        f14892i = Integer.toString(0, 36);
        f14893j = Integer.toString(1, 36);
        f14894k = Integer.toString(2, 36);
        f14895l = Integer.toString(3, 36);
        f14896m = Integer.toString(4, 36);
        f14897n = Integer.toString(5, 36);
        f14898o = Integer.toString(6, 36);
        f14899p = Integer.toString(7, 36);
        f14900q = Integer.toString(8, 36);
        f14901r = Integer.toString(9, 36);
    }

    public r1(int i10, String str, f1 f1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14902a = i10;
        this.f14903b = 1008001300;
        this.f14904c = 5;
        this.d = str;
        this.e = "";
        this.f14905f = f1Var;
        this.f14906g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            if (this.f14902a == r1Var.f14902a && this.f14903b == r1Var.f14903b && this.f14904c == r1Var.f14904c && TextUtils.equals(this.d, r1Var.d) && TextUtils.equals(this.e, r1Var.e) && Objects.equals(this.f14905f, r1Var.f14905f) && Objects.equals(this.h, r1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14902a), 0, Integer.valueOf(this.f14903b), Integer.valueOf(this.f14904c), this.d, this.e, null, this.f14905f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14903b + " interfaceVersion=" + this.f14904c + " service=" + this.e + " IMediaSession=" + this.f14905f + " extras=" + this.f14906g + "}";
    }
}
