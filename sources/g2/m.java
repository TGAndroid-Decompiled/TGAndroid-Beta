package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f10265i = 0;
    public final Uri f10266a;
    public final int f10267b;
    public final byte[] f10268c;
    public final Map d;
    public final long f10269e;
    public final long f10270f;
    public final String f10271g;
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
        this.f10266a = uri;
        this.f10267b = i10;
        this.f10268c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f10269e = j3;
        this.f10270f = j10;
        this.f10271g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f10262e = this.f10266a;
        obj.f10259a = this.f10267b;
        obj.f10263f = this.f10268c;
        obj.f10264g = this.d;
        obj.f10260b = this.f10269e;
        obj.d = this.f10270f;
        obj.h = this.f10271g;
        obj.f10261c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f10270f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f10271g;
        int i10 = this.h;
        return new m(this.f10266a, this.f10267b, this.f10268c, this.d, this.f10269e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f10267b;
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
        sb2.append(this.f10266a);
        sb2.append(", ");
        sb2.append(this.f10269e);
        sb2.append(", ");
        sb2.append(this.f10270f);
        sb2.append(", ");
        sb2.append(this.f10271g);
        sb2.append(", ");
        return a1.g.o(this.h, "]", sb2);
    }
}
