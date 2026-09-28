package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final String f14886i;
    public static final String f14887j;
    public static final String f14888k;
    public static final String f14889l;
    public static final String f14890m;
    public static final String f14891n;
    public static final String f14892o;
    public static final String f14893p;
    public static final String f14894q;
    public static final String f14895r;
    public final int f14896a;
    public final int f14897b;
    public final int f14898c;
    public final String d;
    public final String e;
    public final IBinder f14899f;
    public final Bundle f14900g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7870a;
        f14886i = Integer.toString(0, 36);
        f14887j = Integer.toString(1, 36);
        f14888k = Integer.toString(2, 36);
        f14889l = Integer.toString(3, 36);
        f14890m = Integer.toString(4, 36);
        f14891n = Integer.toString(5, 36);
        f14892o = Integer.toString(6, 36);
        f14893p = Integer.toString(7, 36);
        f14894q = Integer.toString(8, 36);
        f14895r = Integer.toString(9, 36);
    }

    public m1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14896a = i10;
        this.f14897b = 1008001300;
        this.f14898c = 5;
        this.d = str;
        this.e = "";
        this.f14899f = a1Var;
        this.f14900g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f14896a == m1Var.f14896a && this.f14897b == m1Var.f14897b && this.f14898c == m1Var.f14898c && TextUtils.equals(this.d, m1Var.d) && TextUtils.equals(this.e, m1Var.e) && Objects.equals(this.f14899f, m1Var.f14899f) && Objects.equals(this.h, m1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14896a), 0, Integer.valueOf(this.f14897b), Integer.valueOf(this.f14898c), this.d, this.e, null, this.f14899f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14897b + " interfaceVersion=" + this.f14898c + " service=" + this.e + " IMediaSession=" + this.f14899f + " extras=" + this.f14900g + "}";
    }
}
