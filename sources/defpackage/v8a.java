package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
public final class v8a {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public final int a;
    public final String b;
    public final oz6 c;
    public final Bundle d;
    public final MediaSession.Token e;

    static {
        String str = hac.a;
        f = "0";
        g = "1";
        h = "2";
        i = "3";
        j = "4";
        k = "5";
        l = "6";
        m = "7";
        n = "8";
        o = "9";
    }

    public v8a(int i2, String str, oz6 oz6Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.a = i2;
        this.b = str;
        this.c = oz6Var;
        this.d = bundle;
        this.e = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v8a) {
            v8a v8aVar = (v8a) obj;
            if (this.a == v8aVar.a && TextUtils.equals(this.b, v8aVar.b) && this.c == v8aVar.c && Objects.equals(this.e, v8aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0, 1011001300, 10, this.b, "", null, this.c, this.e, null);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.b + " type=0 libraryVersion=1011001300 interfaceVersion=10 service= IMediaSession=" + this.c + " extras=" + this.d + "}";
    }
}
