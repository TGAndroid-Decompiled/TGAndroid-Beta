package j2;

import a8.ia;
import a8.p0;
import android.net.Uri;
import e2.m0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f16445i = 0;
    public final Uri f16446a;
    public final int f16447b;
    public final byte[] f16448c;
    public final Map d;
    public final long f16449e;
    public final long f16450f;
    public final String f16451g;
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
        this.f16446a = uri;
        this.f16447b = i7;
        this.f16448c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f16449e = j3;
        this.f16450f = j10;
        this.f16451g = str;
        this.h = i10;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f16442e = this.f16446a;
        obj.f16439a = this.f16447b;
        obj.f16443f = this.f16448c;
        obj.f16444g = this.d;
        obj.f16440b = this.f16449e;
        obj.d = this.f16450f;
        obj.h = this.f16451g;
        obj.f16441c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f16450f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f16451g;
        int i7 = this.h;
        return new m(this.f16446a, this.f16447b, this.f16448c, this.d, this.f16449e + j3, j12, str, i7);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i7 = this.f16447b;
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
        sb2.append(this.f16446a);
        sb2.append(", ");
        sb2.append(this.f16449e);
        sb2.append(", ");
        sb2.append(this.f16450f);
        sb2.append(", ");
        sb2.append(this.f16451g);
        sb2.append(", ");
        return p0.n(this.h, "]", sb2);
    }
}
