package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class r1 {
    public static final String f14856i;
    public static final String f14857j;
    public static final String f14858k;
    public static final String f14859l;
    public static final String f14860m;
    public static final String f14861n;
    public static final String f14862o;
    public static final String f14863p;
    public static final String f14864q;
    public static final String f14865r;
    public final int f14866a;
    public final int f14867b;
    public final int f14868c;
    public final String d;
    public final String e;
    public final IBinder f14869f;
    public final Bundle f14870g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7887a;
        f14856i = Integer.toString(0, 36);
        f14857j = Integer.toString(1, 36);
        f14858k = Integer.toString(2, 36);
        f14859l = Integer.toString(3, 36);
        f14860m = Integer.toString(4, 36);
        f14861n = Integer.toString(5, 36);
        f14862o = Integer.toString(6, 36);
        f14863p = Integer.toString(7, 36);
        f14864q = Integer.toString(8, 36);
        f14865r = Integer.toString(9, 36);
    }

    public r1(int i10, String str, f1 f1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14866a = i10;
        this.f14867b = 1008001300;
        this.f14868c = 5;
        this.d = str;
        this.e = "";
        this.f14869f = f1Var;
        this.f14870g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            if (this.f14866a == r1Var.f14866a && this.f14867b == r1Var.f14867b && this.f14868c == r1Var.f14868c && TextUtils.equals(this.d, r1Var.d) && TextUtils.equals(this.e, r1Var.e) && Objects.equals(this.f14869f, r1Var.f14869f) && Objects.equals(this.h, r1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14866a), 0, Integer.valueOf(this.f14867b), Integer.valueOf(this.f14868c), this.d, this.e, null, this.f14869f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14867b + " interfaceVersion=" + this.f14868c + " service=" + this.e + " IMediaSession=" + this.f14869f + " extras=" + this.f14870g + "}";
    }
}
