package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f15939i;
    public static final String f15940j;
    public static final String f15941k;
    public static final String f15942l;
    public static final String f15943m;
    public static final String f15944n;
    public static final String f15945o;
    public static final String f15946p;
    public static final String f15947q;
    public static final String f15948r;
    public final int f15949a;
    public final int f15950b;
    public final int f15951c;
    public final String d;
    public final String f15952e;
    public final IBinder f15953f;
    public final Bundle f15954g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8529a;
        f15939i = Integer.toString(0, 36);
        f15940j = Integer.toString(1, 36);
        f15941k = Integer.toString(2, 36);
        f15942l = Integer.toString(3, 36);
        f15943m = Integer.toString(4, 36);
        f15944n = Integer.toString(5, 36);
        f15945o = Integer.toString(6, 36);
        f15946p = Integer.toString(7, 36);
        f15947q = Integer.toString(8, 36);
        f15948r = Integer.toString(9, 36);
    }

    public o1(int i10, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f15949a = i10;
        this.f15950b = 1008001300;
        this.f15951c = 5;
        this.d = str;
        this.f15952e = "";
        this.f15953f = c1Var;
        this.f15954g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f15949a == o1Var.f15949a && this.f15950b == o1Var.f15950b && this.f15951c == o1Var.f15951c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f15952e, o1Var.f15952e) && Objects.equals(this.f15953f, o1Var.f15953f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15949a), 0, Integer.valueOf(this.f15950b), Integer.valueOf(this.f15951c), this.d, this.f15952e, null, this.f15953f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f15950b + " interfaceVersion=" + this.f15951c + " service=" + this.f15952e + " IMediaSession=" + this.f15953f + " extras=" + this.f15954g + "}";
    }
}
