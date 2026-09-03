package g5;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class p {
    public static final int f6400i = 0;
    public final Uri f6401a;
    public final int f6402b;
    public final byte[] f6403c;
    public final Map d;
    public final long e;
    public final long f6404f;
    public final String f6405g;
    public final int h;

    static {
        j3.l0.a("goog.exo.datasource");
    }

    public p(Uri uri, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11) {
        boolean z4;
        boolean z10;
        boolean z11 = false;
        if (j10 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.f(z10);
        h5.a.f((j11 > 0 || j11 == -1) ? true : true);
        this.f6401a = uri;
        this.f6402b = i10;
        this.f6403c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j10;
        this.f6404f = j11;
        this.f6405g = str;
        this.h = i11;
    }

    public final c4.c a() {
        ?? obj = new Object();
        obj.e = this.f6401a;
        obj.f2085a = this.f6402b;
        obj.f2088f = this.f6403c;
        obj.f2089g = this.d;
        obj.f2086b = this.e;
        obj.f2087c = this.f6404f;
        obj.h = this.f6405g;
        obj.d = this.h;
        return obj;
    }

    public final p b(long j10) {
        long j11 = this.f6404f;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        long j13 = j12;
        if (j10 == 0 && j11 == j13) {
            return this;
        }
        String str = this.f6405g;
        int i10 = this.h;
        return new p(this.f6401a, this.f6402b, this.f6403c, this.d, this.e + j10, j13, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i10 = this.f6402b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f6401a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f6404f);
        sb.append(", ");
        sb.append(this.f6405g);
        sb.append(", ");
        return android.support.v4.media.a.m(this.h, "]", sb);
    }
}
