package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class u1 {
    public static final String f15385i;
    public static final String f15386j;
    public static final String f15387k;
    public static final String f15388l;
    public static final String f15389m;
    public static final String f15390n;
    public static final String f15391o;
    public static final String f15392p;
    public static final String f15393q;
    public static final String f15394r;
    public final int f15395a;
    public final int f15396b;
    public final int f15397c;
    public final String d;
    public final String e;
    public final IBinder f15398f;
    public final Bundle f15399g;
    public final MediaSession.Token h;

    static {
        String str = e2.m0.f8375a;
        f15385i = Integer.toString(0, 36);
        f15386j = Integer.toString(1, 36);
        f15387k = Integer.toString(2, 36);
        f15388l = Integer.toString(3, 36);
        f15389m = Integer.toString(4, 36);
        f15390n = Integer.toString(5, 36);
        f15391o = Integer.toString(6, 36);
        f15392p = Integer.toString(7, 36);
        f15393q = Integer.toString(8, 36);
        f15394r = Integer.toString(9, 36);
    }

    public u1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f15395a = i10;
        this.f15396b = 1010001300;
        this.f15397c = 9;
        this.d = str;
        this.e = "";
        this.f15398f = i1Var;
        this.f15399g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (this.f15395a == u1Var.f15395a && this.f15396b == u1Var.f15396b && this.f15397c == u1Var.f15397c && TextUtils.equals(this.d, u1Var.d) && TextUtils.equals(this.e, u1Var.e) && Objects.equals(this.f15398f, u1Var.f15398f) && Objects.equals(this.h, u1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15395a), 0, Integer.valueOf(this.f15396b), Integer.valueOf(this.f15397c), this.d, this.e, null, this.f15398f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f15396b + " interfaceVersion=" + this.f15397c + " service=" + this.e + " IMediaSession=" + this.f15398f + " extras=" + this.f15399g + "}";
    }
}
