package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f10266i = 0;
    public final Uri f10267a;
    public final int f10268b;
    public final byte[] f10269c;
    public final Map d;
    public final long f10270e;
    public final long f10271f;
    public final String f10272g;
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
        this.f10267a = uri;
        this.f10268b = i10;
        this.f10269c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f10270e = j3;
        this.f10271f = j10;
        this.f10272g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f10263e = this.f10267a;
        obj.f10260a = this.f10268b;
        obj.f10264f = this.f10269c;
        obj.f10265g = this.d;
        obj.f10261b = this.f10270e;
        obj.d = this.f10271f;
        obj.h = this.f10272g;
        obj.f10262c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f10271f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f10272g;
        int i10 = this.h;
        return new m(this.f10267a, this.f10268b, this.f10269c, this.d, this.f10270e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f10268b;
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
        sb2.append(this.f10267a);
        sb2.append(", ");
        sb2.append(this.f10270e);
        sb2.append(", ");
        sb2.append(this.f10271f);
        sb2.append(", ");
        sb2.append(this.f10272g);
        sb2.append(", ");
        return a1.g.o(this.h, "]", sb2);
    }
}
