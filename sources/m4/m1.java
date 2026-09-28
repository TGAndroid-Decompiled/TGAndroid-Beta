package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final String f14885i;
    public static final String f14886j;
    public static final String f14887k;
    public static final String f14888l;
    public static final String f14889m;
    public static final String f14890n;
    public static final String f14891o;
    public static final String f14892p;
    public static final String f14893q;
    public static final String f14894r;
    public final int f14895a;
    public final int f14896b;
    public final int f14897c;
    public final String d;
    public final String e;
    public final IBinder f14898f;
    public final Bundle f14899g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7870a;
        f14885i = Integer.toString(0, 36);
        f14886j = Integer.toString(1, 36);
        f14887k = Integer.toString(2, 36);
        f14888l = Integer.toString(3, 36);
        f14889m = Integer.toString(4, 36);
        f14890n = Integer.toString(5, 36);
        f14891o = Integer.toString(6, 36);
        f14892p = Integer.toString(7, 36);
        f14893q = Integer.toString(8, 36);
        f14894r = Integer.toString(9, 36);
    }

    public m1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14895a = i10;
        this.f14896b = 1008001300;
        this.f14897c = 5;
        this.d = str;
        this.e = "";
        this.f14898f = a1Var;
        this.f14899g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f14895a == m1Var.f14895a && this.f14896b == m1Var.f14896b && this.f14897c == m1Var.f14897c && TextUtils.equals(this.d, m1Var.d) && TextUtils.equals(this.e, m1Var.e) && Objects.equals(this.f14898f, m1Var.f14898f) && Objects.equals(this.h, m1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14895a), 0, Integer.valueOf(this.f14896b), Integer.valueOf(this.f14897c), this.d, this.e, null, this.f14898f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14896b + " interfaceVersion=" + this.f14897c + " service=" + this.e + " IMediaSession=" + this.f14898f + " extras=" + this.f14899g + "}";
    }
}
