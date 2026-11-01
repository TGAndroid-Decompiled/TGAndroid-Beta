package g2;

import android.net.Uri;
import b2.q0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import v7.t6;
public final class n {
    public static final int f7314i = 0;
    public final Uri f7315a;
    public final int f7316b;
    public final byte[] f7317c;
    public final Map d;
    public final long e;
    public final long f7318f;
    public final String f7319g;
    public final int h;

    static {
        q0.a("media3.datasource");
    }

    public n(Uri uri, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        if (j10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6.f(z11);
        t6.f((j11 > 0 || j11 == -1) ? true : z12);
        uri.getClass();
        this.f7315a = uri;
        this.f7316b = i10;
        this.f7317c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j10;
        this.f7318f = j11;
        this.f7319g = str;
        this.h = i11;
    }

    public final m a() {
        ?? obj = new Object();
        obj.e = this.f7315a;
        obj.f7309a = this.f7316b;
        obj.f7312f = this.f7317c;
        obj.f7313g = this.d;
        obj.f7310b = this.e;
        obj.d = this.f7318f;
        obj.h = this.f7319g;
        obj.f7311c = this.h;
        return obj;
    }

    public final n b(long j10) {
        long j11 = this.f7318f;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        long j13 = j12;
        if (j10 == 0 && j11 == j13) {
            return this;
        }
        String str = this.f7319g;
        int i10 = this.h;
        return new n(this.f7315a, this.f7316b, this.f7317c, this.d, this.e + j10, j13, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f7316b;
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
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f7315a);
        sb2.append(", ");
        sb2.append(this.e);
        sb2.append(", ");
        sb2.append(this.f7318f);
        sb2.append(", ");
        sb2.append(this.f7319g);
        sb2.append(", ");
        return a1.g.p(sb2, this.h, "]");
    }
}
