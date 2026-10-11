package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f16217i;
    public static final String f16218j;
    public static final String f16219k;
    public static final String f16220l;
    public static final String f16221m;
    public static final String f16222n;
    public static final String f16223o;
    public static final String f16224p;
    public static final String f16225q;
    public static final String f16226r;
    public final int f16227a;
    public final int f16228b;
    public final int f16229c;
    public final String d;
    public final String f16230e;
    public final IBinder f16231f;
    public final Bundle f16232g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8531a;
        f16217i = Integer.toString(0, 36);
        f16218j = Integer.toString(1, 36);
        f16219k = Integer.toString(2, 36);
        f16220l = Integer.toString(3, 36);
        f16221m = Integer.toString(4, 36);
        f16222n = Integer.toString(5, 36);
        f16223o = Integer.toString(6, 36);
        f16224p = Integer.toString(7, 36);
        f16225q = Integer.toString(8, 36);
        f16226r = Integer.toString(9, 36);
    }

    public o1(int i10, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f16227a = i10;
        this.f16228b = 1008001300;
        this.f16229c = 5;
        this.d = str;
        this.f16230e = "";
        this.f16231f = c1Var;
        this.f16232g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f16227a == o1Var.f16227a && this.f16228b == o1Var.f16228b && this.f16229c == o1Var.f16229c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f16230e, o1Var.f16230e) && Objects.equals(this.f16231f, o1Var.f16231f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16227a), 0, Integer.valueOf(this.f16228b), Integer.valueOf(this.f16229c), this.d, this.f16230e, null, this.f16231f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16228b + " interfaceVersion=" + this.f16229c + " service=" + this.f16230e + " IMediaSession=" + this.f16231f + " extras=" + this.f16232g + "}";
    }
}
