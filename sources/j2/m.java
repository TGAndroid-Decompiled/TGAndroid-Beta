package j2;

import a8.ma;
import a8.p0;
import android.net.Uri;
import e2.m0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f17178i = 0;
    public final Uri f17179a;
    public final int f17180b;
    public final byte[] f17181c;
    public final Map d;
    public final long f17182e;
    public final long f17183f;
    public final String f17184g;
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
        ma.f(z10);
        if (j3 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ma.f(z11);
        ma.f((j10 > 0 || j10 == -1) ? true : z12);
        uri.getClass();
        this.f17179a = uri;
        this.f17180b = i7;
        this.f17181c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f17182e = j3;
        this.f17183f = j10;
        this.f17184g = str;
        this.h = i10;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f17175e = this.f17179a;
        obj.f17172a = this.f17180b;
        obj.f17176f = this.f17181c;
        obj.f17177g = this.d;
        obj.f17173b = this.f17182e;
        obj.d = this.f17183f;
        obj.h = this.f17184g;
        obj.f17174c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f17183f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f17184g;
        int i7 = this.h;
        return new m(this.f17179a, this.f17180b, this.f17181c, this.d, this.f17182e + j3, j12, str, i7);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i7 = this.f17180b;
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
        sb2.append(this.f17179a);
        sb2.append(", ");
        sb2.append(this.f17182e);
        sb2.append(", ");
        sb2.append(this.f17183f);
        sb2.append(", ");
        sb2.append(this.f17184g);
        sb2.append(", ");
        return p0.n(this.h, "]", sb2);
    }
}
