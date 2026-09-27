package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class m1 {
    public static final String f14912i;
    public static final String f14913j;
    public static final String f14914k;
    public static final String f14915l;
    public static final String f14916m;
    public static final String f14917n;
    public static final String f14918o;
    public static final String f14919p;
    public static final String f14920q;
    public static final String f14921r;
    public final int f14922a;
    public final int f14923b;
    public final int f14924c;
    public final String d;
    public final String e;
    public final IBinder f14925f;
    public final Bundle f14926g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f7872a;
        f14912i = Integer.toString(0, 36);
        f14913j = Integer.toString(1, 36);
        f14914k = Integer.toString(2, 36);
        f14915l = Integer.toString(3, 36);
        f14916m = Integer.toString(4, 36);
        f14917n = Integer.toString(5, 36);
        f14918o = Integer.toString(6, 36);
        f14919p = Integer.toString(7, 36);
        f14920q = Integer.toString(8, 36);
        f14921r = Integer.toString(9, 36);
    }

    public m1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f14922a = i10;
        this.f14923b = 1008001300;
        this.f14924c = 5;
        this.d = str;
        this.e = "";
        this.f14925f = a1Var;
        this.f14926g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f14922a == m1Var.f14922a && this.f14923b == m1Var.f14923b && this.f14924c == m1Var.f14924c && TextUtils.equals(this.d, m1Var.d) && TextUtils.equals(this.e, m1Var.e) && Objects.equals(this.f14925f, m1Var.f14925f) && Objects.equals(this.h, m1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14922a), 0, Integer.valueOf(this.f14923b), Integer.valueOf(this.f14924c), this.d, this.e, null, this.f14925f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f14923b + " interfaceVersion=" + this.f14924c + " service=" + this.e + " IMediaSession=" + this.f14925f + " extras=" + this.f14926g + "}";
    }
}
