package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f10264i = 0;
    public final Uri f10265a;
    public final int f10266b;
    public final byte[] f10267c;
    public final Map d;
    public final long f10268e;
    public final long f10269f;
    public final String f10270g;
    public final int h;

    static {
        l0.a("media3.datasource");
    }

    public m(Uri uri, int i10, byte[] bArr, Map map, long j3, long j10, String str, int i11) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (j3 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        e2.d.b((j10 > 0 || j10 == -1) ? true : z12);
        uri.getClass();
        this.f10265a = uri;
        this.f10266b = i10;
        this.f10267c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f10268e = j3;
        this.f10269f = j10;
        this.f10270g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f10261e = this.f10265a;
        obj.f10258a = this.f10266b;
        obj.f10262f = this.f10267c;
        obj.f10263g = this.d;
        obj.f10259b = this.f10268e;
        obj.d = this.f10269f;
        obj.h = this.f10270g;
        obj.f10260c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f10269f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f10270g;
        int i10 = this.h;
        return new m(this.f10265a, this.f10266b, this.f10267c, this.d, this.f10268e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f10266b;
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
        sb2.append(this.f10265a);
        sb2.append(", ");
        sb2.append(this.f10268e);
        sb2.append(", ");
        sb2.append(this.f10269f);
        sb2.append(", ");
        sb2.append(this.f10270g);
        sb2.append(", ");
        return a1.g.o(this.h, "]", sb2);
    }
}
