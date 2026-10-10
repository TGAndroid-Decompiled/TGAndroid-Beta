package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class n1 {
    public static final String f16192i;
    public static final String f16193j;
    public static final String f16194k;
    public static final String f16195l;
    public static final String f16196m;
    public static final String f16197n;
    public static final String f16198o;
    public static final String f16199p;
    public static final String f16200q;
    public static final String f16201r;
    public final int f16202a;
    public final int f16203b;
    public final int f16204c;
    public final String d;
    public final String f16205e;
    public final IBinder f16206f;
    public final Bundle f16207g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8532a;
        f16192i = Integer.toString(0, 36);
        f16193j = Integer.toString(1, 36);
        f16194k = Integer.toString(2, 36);
        f16195l = Integer.toString(3, 36);
        f16196m = Integer.toString(4, 36);
        f16197n = Integer.toString(5, 36);
        f16198o = Integer.toString(6, 36);
        f16199p = Integer.toString(7, 36);
        f16200q = Integer.toString(8, 36);
        f16201r = Integer.toString(9, 36);
    }

    public n1(int i10, String str, b1 b1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f16202a = i10;
        this.f16203b = 1008001300;
        this.f16204c = 5;
        this.d = str;
        this.f16205e = "";
        this.f16206f = b1Var;
        this.f16207g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            if (this.f16202a == n1Var.f16202a && this.f16203b == n1Var.f16203b && this.f16204c == n1Var.f16204c && TextUtils.equals(this.d, n1Var.d) && TextUtils.equals(this.f16205e, n1Var.f16205e) && Objects.equals(this.f16206f, n1Var.f16206f) && Objects.equals(this.h, n1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16202a), 0, Integer.valueOf(this.f16203b), Integer.valueOf(this.f16204c), this.d, this.f16205e, null, this.f16206f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16203b + " interfaceVersion=" + this.f16204c + " service=" + this.f16205e + " IMediaSession=" + this.f16206f + " extras=" + this.f16207g + "}";
    }
}
