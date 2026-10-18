package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class u1 {
    public static final String f16744i;
    public static final String f16745j;
    public static final String f16746k;
    public static final String f16747l;
    public static final String f16748m;
    public static final String f16749n;
    public static final String f16750o;
    public static final String f16751p;
    public static final String f16752q;
    public static final String f16753r;
    public final int f16754a;
    public final int f16755b;
    public final int f16756c;
    public final String d;
    public final String e;
    public final IBinder f16757f;
    public final Bundle f16758g;
    public final MediaSession.Token h;

    static {
        String str = e2.m0.f8255a;
        f16744i = Integer.toString(0, 36);
        f16745j = Integer.toString(1, 36);
        f16746k = Integer.toString(2, 36);
        f16747l = Integer.toString(3, 36);
        f16748m = Integer.toString(4, 36);
        f16749n = Integer.toString(5, 36);
        f16750o = Integer.toString(6, 36);
        f16751p = Integer.toString(7, 36);
        f16752q = Integer.toString(8, 36);
        f16753r = Integer.toString(9, 36);
    }

    public u1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f16754a = i10;
        this.f16755b = 1010001300;
        this.f16756c = 9;
        this.d = str;
        this.e = "";
        this.f16757f = i1Var;
        this.f16758g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (this.f16754a == u1Var.f16754a && this.f16755b == u1Var.f16755b && this.f16756c == u1Var.f16756c && TextUtils.equals(this.d, u1Var.d) && TextUtils.equals(this.e, u1Var.e) && Objects.equals(this.f16757f, u1Var.f16757f) && Objects.equals(this.h, u1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16754a), 0, Integer.valueOf(this.f16755b), Integer.valueOf(this.f16756c), this.d, this.e, null, this.f16757f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16755b + " interfaceVersion=" + this.f16756c + " service=" + this.e + " IMediaSession=" + this.f16757f + " extras=" + this.f16758g + "}";
    }
}
