package j2;

import a8.la;
import a8.p0;
import android.net.Uri;
import e2.m0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f17184i = 0;
    public final Uri f17185a;
    public final int f17186b;
    public final byte[] f17187c;
    public final Map d;
    public final long f17188e;
    public final long f17189f;
    public final String f17190g;
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
        this.f17185a = uri;
        this.f17186b = i7;
        this.f17187c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f17188e = j3;
        this.f17189f = j10;
        this.f17190g = str;
        this.h = i10;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f17181e = this.f17185a;
        obj.f17178a = this.f17186b;
        obj.f17182f = this.f17187c;
        obj.f17183g = this.d;
        obj.f17179b = this.f17188e;
        obj.d = this.f17189f;
        obj.h = this.f17190g;
        obj.f17180c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f17189f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f17190g;
        int i7 = this.h;
        return new m(this.f17185a, this.f17186b, this.f17187c, this.d, this.f17188e + j3, j12, str, i7);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i7 = this.f17186b;
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
        sb2.append(this.f17185a);
        sb2.append(", ");
        sb2.append(this.f17188e);
        sb2.append(", ");
        sb2.append(this.f17189f);
        sb2.append(", ");
        sb2.append(this.f17190g);
        sb2.append(", ");
        return p0.n(this.h, "]", sb2);
    }
}
