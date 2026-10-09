package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class n1 {
    public static final String f16188i;
    public static final String f16189j;
    public static final String f16190k;
    public static final String f16191l;
    public static final String f16192m;
    public static final String f16193n;
    public static final String f16194o;
    public static final String f16195p;
    public static final String f16196q;
    public static final String f16197r;
    public final int f16198a;
    public final int f16199b;
    public final int f16200c;
    public final String d;
    public final String f16201e;
    public final IBinder f16202f;
    public final Bundle f16203g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8532a;
        f16188i = Integer.toString(0, 36);
        f16189j = Integer.toString(1, 36);
        f16190k = Integer.toString(2, 36);
        f16191l = Integer.toString(3, 36);
        f16192m = Integer.toString(4, 36);
        f16193n = Integer.toString(5, 36);
        f16194o = Integer.toString(6, 36);
        f16195p = Integer.toString(7, 36);
        f16196q = Integer.toString(8, 36);
        f16197r = Integer.toString(9, 36);
    }

    public n1(int i10, String str, b1 b1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f16198a = i10;
        this.f16199b = 1008001300;
        this.f16200c = 5;
        this.d = str;
        this.f16201e = "";
        this.f16202f = b1Var;
        this.f16203g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            if (this.f16198a == n1Var.f16198a && this.f16199b == n1Var.f16199b && this.f16200c == n1Var.f16200c && TextUtils.equals(this.d, n1Var.d) && TextUtils.equals(this.f16201e, n1Var.f16201e) && Objects.equals(this.f16202f, n1Var.f16202f) && Objects.equals(this.h, n1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16198a), 0, Integer.valueOf(this.f16199b), Integer.valueOf(this.f16200c), this.d, this.f16201e, null, this.f16202f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16199b + " interfaceVersion=" + this.f16200c + " service=" + this.f16201e + " IMediaSession=" + this.f16202f + " extras=" + this.f16203g + "}";
    }
}
