package j2;

import a8.ia;
import a8.p0;
import android.net.Uri;
import e2.m0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f16448i = 0;
    public final Uri f16449a;
    public final int f16450b;
    public final byte[] f16451c;
    public final Map d;
    public final long f16452e;
    public final long f16453f;
    public final String f16454g;
    public final int h;

    static {
        m0.a("media3.datasource");
    }

    public m(Uri uri, int i7, byte[] bArr, Map map, long j3, long j10, String str, int i10) {
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (j3 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.f(z10);
        ia.f((j10 > 0 || j10 == -1) ? true : z11);
        uri.getClass();
        this.f16449a = uri;
        this.f16450b = i7;
        this.f16451c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f16452e = j3;
        this.f16453f = j10;
        this.f16454g = str;
        this.h = i10;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f16445e = this.f16449a;
        obj.f16442a = this.f16450b;
        obj.f16446f = this.f16451c;
        obj.f16447g = this.d;
        obj.f16443b = this.f16452e;
        obj.d = this.f16453f;
        obj.h = this.f16454g;
        obj.f16444c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f16453f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f16454g;
        int i7 = this.h;
        return new m(this.f16449a, this.f16450b, this.f16451c, this.d, this.f16452e + j3, j12, str, i7);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i7 = this.f16450b;
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
        sb2.append(this.f16449a);
        sb2.append(", ");
        sb2.append(this.f16452e);
        sb2.append(", ");
        sb2.append(this.f16453f);
        sb2.append(", ");
        sb2.append(this.f16454g);
        sb2.append(", ");
        return p0.n(this.h, "]", sb2);
    }
}
