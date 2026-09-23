package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class n1 {
    public static final String f14638i;
    public static final String f14639j;
    public static final String f14640k;
    public static final String f14641l;
    public static final String f14642m;
    public static final String f14643n;
    public static final String f14644o;
    public static final String f14645p;
    public static final String f14646q;
    public static final String f14647r;
    public final int f14648a;
    public final int f14649b;
    public final int f14650c;
    public final String d;
    public final String e;
    public final IBinder f14651f;
    public final Bundle f14652g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7871a;
        f14638i = Integer.toString(0, 36);
        f14639j = Integer.toString(1, 36);
        f14640k = Integer.toString(2, 36);
        f14641l = Integer.toString(3, 36);
        f14642m = Integer.toString(4, 36);
        f14643n = Integer.toString(5, 36);
        f14644o = Integer.toString(6, 36);
        f14645p = Integer.toString(7, 36);
        f14646q = Integer.toString(8, 36);
        f14647r = Integer.toString(9, 36);
    }

    public n1(int i10, String str, b1 b1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14648a = i10;
        this.f14649b = 1008001300;
        this.f14650c = 5;
        this.d = str;
        this.e = "";
        this.f14651f = b1Var;
        this.f14652g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            if (this.f14648a == n1Var.f14648a && this.f14649b == n1Var.f14649b && this.f14650c == n1Var.f14650c && TextUtils.equals(this.d, n1Var.d) && TextUtils.equals(this.e, n1Var.e) && Objects.equals(this.f14651f, n1Var.f14651f) && Objects.equals(this.h, n1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14648a), 0, Integer.valueOf(this.f14649b), Integer.valueOf(this.f14650c), this.d, this.e, null, this.f14651f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14649b + " interfaceVersion=" + this.f14650c + " service=" + this.e + " IMediaSession=" + this.f14651f + " extras=" + this.f14652g + "}";
    }
}
