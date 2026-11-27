package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public final class n73 {
    public static final int i = 0;
    public final Uri a;
    public final byte b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final byte h;

    static {
        gt6.a("media3.datasource");
    }

    public n73(Uri uri, int i2, byte[] bArr, Map map, long j, long j2, String str, int i3) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        if (j >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        yve.f(z2);
        yve.f((j2 > 0 || j2 == -1) ? true : z3);
        uri.getClass();
        this.a = uri;
        this.b = i2;
        this.c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = i3;
    }

    public final m73 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }

    public final n73 b(long j) {
        long j2 = this.f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        long j4 = j3;
        if (j == 0 && j2 == j4) {
            return this;
        }
        String str = this.g;
        byte b = this.h;
        return new n73(this.a, this.b, this.c, this.d, this.e + j, j4, str, b);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        byte b = this.b;
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    str = "HEAD";
                } else {
                    grb.g();
                    return null;
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        return uh9.l(sb, this.h, "]");
    }

    public n73(long j, Uri uri) {
        this(uri, 1, null, Collections.EMPTY_MAP, j, -1L, null, 0);
    }
}
