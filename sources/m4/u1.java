package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class u1 {
    public static final String f16806i;
    public static final String f16807j;
    public static final String f16808k;
    public static final String f16809l;
    public static final String f16810m;
    public static final String f16811n;
    public static final String f16812o;
    public static final String f16813p;
    public static final String f16814q;
    public static final String f16815r;
    public final int f16816a;
    public final int f16817b;
    public final int f16818c;
    public final String d;
    public final String e;
    public final IBinder f16819f;
    public final Bundle f16820g;
    public final MediaSession.Token h;

    static {
        String str = e2.m0.f8259a;
        f16806i = Integer.toString(0, 36);
        f16807j = Integer.toString(1, 36);
        f16808k = Integer.toString(2, 36);
        f16809l = Integer.toString(3, 36);
        f16810m = Integer.toString(4, 36);
        f16811n = Integer.toString(5, 36);
        f16812o = Integer.toString(6, 36);
        f16813p = Integer.toString(7, 36);
        f16814q = Integer.toString(8, 36);
        f16815r = Integer.toString(9, 36);
    }

    public u1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f16816a = i10;
        this.f16817b = 1010001300;
        this.f16818c = 9;
        this.d = str;
        this.e = "";
        this.f16819f = i1Var;
        this.f16820g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (this.f16816a == u1Var.f16816a && this.f16817b == u1Var.f16817b && this.f16818c == u1Var.f16818c && TextUtils.equals(this.d, u1Var.d) && TextUtils.equals(this.e, u1Var.e) && Objects.equals(this.f16819f, u1Var.f16819f) && Objects.equals(this.h, u1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16816a), 0, Integer.valueOf(this.f16817b), Integer.valueOf(this.f16818c), this.d, this.e, null, this.f16819f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f16817b + " interfaceVersion=" + this.f16818c + " service=" + this.e + " IMediaSession=" + this.f16819f + " extras=" + this.f16820g + "}";
    }
}
