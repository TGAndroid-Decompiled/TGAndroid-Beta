package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class r1 {
    public static final String f16092i;
    public static final String f16093j;
    public static final String f16094k;
    public static final String f16095l;
    public static final String f16096m;
    public static final String f16097n;
    public static final String f16098o;
    public static final String f16099p;
    public static final String f16100q;
    public static final String f16101r;
    public final int f16102a;
    public final int f16103b;
    public final int f16104c;
    public final String d;
    public final String f16105e;
    public final IBinder f16106f;
    public final Bundle f16107g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8765a;
        f16092i = Integer.toString(0, 36);
        f16093j = Integer.toString(1, 36);
        f16094k = Integer.toString(2, 36);
        f16095l = Integer.toString(3, 36);
        f16096m = Integer.toString(4, 36);
        f16097n = Integer.toString(5, 36);
        f16098o = Integer.toString(6, 36);
        f16099p = Integer.toString(7, 36);
        f16100q = Integer.toString(8, 36);
        f16101r = Integer.toString(9, 36);
    }

    public r1(int i10, String str, f1 f1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f16102a = i10;
        this.f16103b = 1008001300;
        this.f16104c = 5;
        this.d = str;
        this.f16105e = "";
        this.f16106f = f1Var;
        this.f16107g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            if (this.f16102a == r1Var.f16102a && this.f16103b == r1Var.f16103b && this.f16104c == r1Var.f16104c && TextUtils.equals(this.d, r1Var.d) && TextUtils.equals(this.f16105e, r1Var.f16105e) && Objects.equals(this.f16106f, r1Var.f16106f) && Objects.equals(this.h, r1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16102a), 0, Integer.valueOf(this.f16103b), Integer.valueOf(this.f16104c), this.d, this.f16105e, null, this.f16106f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16103b + " interfaceVersion=" + this.f16104c + " service=" + this.f16105e + " IMediaSession=" + this.f16106f + " extras=" + this.f16107g + "}";
    }
}
