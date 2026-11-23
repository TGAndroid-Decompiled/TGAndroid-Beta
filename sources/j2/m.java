package j2;

import a8.la;
import a8.p0;
import android.net.Uri;
import e2.m0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f17212i = 0;
    public final Uri f17213a;
    public final int f17214b;
    public final byte[] f17215c;
    public final Map d;
    public final long f17216e;
    public final long f17217f;
    public final String f17218g;
    public final int h;

    static {
        m0.a("media3.datasource");
    }

    public m(Uri uri, int i7, byte[] bArr, Map map, long j3, long j10, String str, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        if (j3 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        la.f(z11);
        la.f((j10 > 0 || j10 == -1) ? true : z12);
        uri.getClass();
        this.f17213a = uri;
        this.f17214b = i7;
        this.f17215c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f17216e = j3;
        this.f17217f = j10;
        this.f17218g = str;
        this.h = i10;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f17209e = this.f17213a;
        obj.f17206a = this.f17214b;
        obj.f17210f = this.f17215c;
        obj.f17211g = this.d;
        obj.f17207b = this.f17216e;
        obj.d = this.f17217f;
        obj.h = this.f17218g;
        obj.f17208c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f17217f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f17218g;
        int i7 = this.h;
        return new m(this.f17213a, this.f17214b, this.f17215c, this.d, this.f17216e + j3, j12, str, i7);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i7 = this.f17214b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
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
        sb2.append(this.f17213a);
        sb2.append(", ");
        sb2.append(this.f17216e);
        sb2.append(", ");
        sb2.append(this.f17217f);
        sb2.append(", ");
        sb2.append(this.f17218g);
        sb2.append(", ");
        return p0.n(this.h, "]", sb2);
    }
}
