package g2;

import a8.yb;
import android.net.Uri;
import b2.q0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f12257i = 0;
    public final Uri f12258a;
    public final int f12259b;
    public final byte[] f12260c;
    public final Map d;
    public final long e;
    public final long f12261f;
    public final String f12262g;
    public final int h;

    static {
        q0.a("media3.datasource");
    }

    public m(Uri uri, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        if (j10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.g(z11);
        yb.g((j11 > 0 || j11 == -1) ? true : z12);
        uri.getClass();
        this.f12258a = uri;
        this.f12259b = i10;
        this.f12260c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j10;
        this.f12261f = j11;
        this.f12262g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.e = this.f12258a;
        obj.f12252a = this.f12259b;
        obj.f12255f = this.f12260c;
        obj.f12256g = this.d;
        obj.f12253b = this.e;
        obj.d = this.f12261f;
        obj.h = this.f12262g;
        obj.f12254c = this.h;
        return obj;
    }

    public final m b(long j10) {
        long j11 = this.f12261f;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        long j13 = j12;
        if (j10 == 0 && j11 == j13) {
            return this;
        }
        String str = this.f12262g;
        int i10 = this.h;
        return new m(this.f12258a, this.f12259b, this.f12260c, this.d, this.e + j10, j13, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f12259b;
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
        sb2.append(this.f12258a);
        sb2.append(", ");
        sb2.append(this.e);
        sb2.append(", ");
        sb2.append(this.f12261f);
        sb2.append(", ");
        sb2.append(this.f12262g);
        sb2.append(", ");
        return a1.g.n(this.h, "]", sb2);
    }
}
