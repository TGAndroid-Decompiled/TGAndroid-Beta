package g5;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class p {
    public static final int f6884i = 0;
    public final Uri f6885a;
    public final int f6886b;
    public final byte[] f6887c;
    public final Map d;
    public final long f6888e;
    public final long f6889f;
    public final String f6890g;
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
        this.f6885a = uri;
        this.f6886b = i10;
        this.f6887c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f6888e = j10;
        this.f6889f = j11;
        this.f6890g = str;
        this.h = i11;
    }

    public final c4.c a() {
        ?? obj = new Object();
        obj.f2244e = this.f6885a;
        obj.f2241a = this.f6886b;
        obj.f2245f = this.f6887c;
        obj.f2246g = this.d;
        obj.f2242b = this.f6888e;
        obj.f2243c = this.f6889f;
        obj.h = this.f6890g;
        obj.d = this.h;
        return obj;
    }

    public final p b(long j10) {
        long j11 = this.f6889f;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        long j13 = j12;
        if (j10 == 0 && j11 == j13) {
            return this;
        }
        String str = this.f6890g;
        int i10 = this.h;
        return new p(this.f6885a, this.f6886b, this.f6887c, this.d, this.f6888e + j10, j13, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i10 = this.f6886b;
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
        sb.append(this.f6885a);
        sb.append(", ");
        sb.append(this.f6888e);
        sb.append(", ");
        sb.append(this.f6889f);
        sb.append(", ");
        sb.append(this.f6890g);
        sb.append(", ");
        return android.support.v4.media.a.m(this.h, "]", sb);
    }
}
