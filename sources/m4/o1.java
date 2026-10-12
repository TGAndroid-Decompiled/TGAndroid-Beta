package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f15940i;
    public static final String f15941j;
    public static final String f15942k;
    public static final String f15943l;
    public static final String f15944m;
    public static final String f15945n;
    public static final String f15946o;
    public static final String f15947p;
    public static final String f15948q;
    public static final String f15949r;
    public final int f15950a;
    public final int f15951b;
    public final int f15952c;
    public final String d;
    public final String f15953e;
    public final IBinder f15954f;
    public final Bundle f15955g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.f8529a;
        f15940i = Integer.toString(0, 36);
        f15941j = Integer.toString(1, 36);
        f15942k = Integer.toString(2, 36);
        f15943l = Integer.toString(3, 36);
        f15944m = Integer.toString(4, 36);
        f15945n = Integer.toString(5, 36);
        f15946o = Integer.toString(6, 36);
        f15947p = Integer.toString(7, 36);
        f15948q = Integer.toString(8, 36);
        f15949r = Integer.toString(9, 36);
    }

    public o1(int i10, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.f15950a = i10;
        this.f15951b = 1008001300;
        this.f15952c = 5;
        this.d = str;
        this.f15953e = "";
        this.f15954f = c1Var;
        this.f15955g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f15950a == o1Var.f15950a && this.f15951b == o1Var.f15951b && this.f15952c == o1Var.f15952c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f15953e, o1Var.f15953e) && Objects.equals(this.f15954f, o1Var.f15954f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15950a), 0, Integer.valueOf(this.f15951b), Integer.valueOf(this.f15952c), this.d, this.f15953e, null, this.f15954f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f15951b + " interfaceVersion=" + this.f15952c + " service=" + this.f15953e + " IMediaSession=" + this.f15954f + " extras=" + this.f15955g + "}";
    }
}
