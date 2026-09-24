package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final String f14870i;
    public static final String f14871j;
    public static final String f14872k;
    public static final String f14873l;
    public static final String f14874m;
    public static final String f14875n;
    public static final String f14876o;
    public static final String f14877p;
    public static final String f14878q;
    public static final String f14879r;
    public final int f14880a;
    public final int f14881b;
    public final int f14882c;
    public final String d;
    public final String e;
    public final IBinder f14883f;
    public final Bundle f14884g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7870a;
        f14870i = Integer.toString(0, 36);
        f14871j = Integer.toString(1, 36);
        f14872k = Integer.toString(2, 36);
        f14873l = Integer.toString(3, 36);
        f14874m = Integer.toString(4, 36);
        f14875n = Integer.toString(5, 36);
        f14876o = Integer.toString(6, 36);
        f14877p = Integer.toString(7, 36);
        f14878q = Integer.toString(8, 36);
        f14879r = Integer.toString(9, 36);
    }

    public m1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14880a = i10;
        this.f14881b = 1008001300;
        this.f14882c = 5;
        this.d = str;
        this.e = "";
        this.f14883f = a1Var;
        this.f14884g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f14880a == m1Var.f14880a && this.f14881b == m1Var.f14881b && this.f14882c == m1Var.f14882c && TextUtils.equals(this.d, m1Var.d) && TextUtils.equals(this.e, m1Var.e) && Objects.equals(this.f14883f, m1Var.f14883f) && Objects.equals(this.h, m1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14880a), 0, Integer.valueOf(this.f14881b), Integer.valueOf(this.f14882c), this.d, this.e, null, this.f14883f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14881b + " interfaceVersion=" + this.f14882c + " service=" + this.e + " IMediaSession=" + this.f14883f + " extras=" + this.f14884g + "}";
    }
}
