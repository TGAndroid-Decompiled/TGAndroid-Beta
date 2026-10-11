package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f16253i;
    public static final String f16254j;
    public static final String f16255k;
    public static final String f16256l;
    public static final String f16257m;
    public static final String f16258n;
    public static final String f16259o;
    public static final String f16260p;
    public static final String f16261q;
    public static final String f16262r;
    public final int f16263a;
    public final int f16264b;
    public final int f16265c;
    public final String d;
    public final String f16266e;
    public final IBinder f16267f;
    public final Bundle f16268g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8531a;
        f16253i = Integer.toString(0, 36);
        f16254j = Integer.toString(1, 36);
        f16255k = Integer.toString(2, 36);
        f16256l = Integer.toString(3, 36);
        f16257m = Integer.toString(4, 36);
        f16258n = Integer.toString(5, 36);
        f16259o = Integer.toString(6, 36);
        f16260p = Integer.toString(7, 36);
        f16261q = Integer.toString(8, 36);
        f16262r = Integer.toString(9, 36);
    }

    public o1(int i10, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f16263a = i10;
        this.f16264b = 1008001300;
        this.f16265c = 5;
        this.d = str;
        this.f16266e = "";
        this.f16267f = c1Var;
        this.f16268g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f16263a == o1Var.f16263a && this.f16264b == o1Var.f16264b && this.f16265c == o1Var.f16265c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f16266e, o1Var.f16266e) && Objects.equals(this.f16267f, o1Var.f16267f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16263a), 0, Integer.valueOf(this.f16264b), Integer.valueOf(this.f16265c), this.d, this.f16266e, null, this.f16267f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16264b + " interfaceVersion=" + this.f16265c + " service=" + this.f16266e + " IMediaSession=" + this.f16267f + " extras=" + this.f16268g + "}";
    }
}
