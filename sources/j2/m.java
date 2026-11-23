package j2;

import a8.ma;
import a8.p0;
import android.net.Uri;
import e2.m0;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f17275i = 0;
    public final Uri f17276a;
    public final int f17277b;
    public final byte[] f17278c;
    public final Map d;
    public final long f17279e;
    public final long f17280f;
    public final String f17281g;
    public final int h;

    static {
        m0.a("media3.datasource");
    }

    public m(long j3, Uri uri) {
        this(uri, 1, null, Collections.EMPTY_MAP, j3, -1L, null, 0);
    }

    public final l a() {
        ?? obj = new Object();
        obj.f17272e = this.f17276a;
        obj.f17269a = this.f17277b;
        obj.f17273f = this.f17278c;
        obj.f17274g = this.d;
        obj.f17270b = this.f17279e;
        obj.d = this.f17280f;
        obj.h = this.f17281g;
        obj.f17271c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f17280f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f17281g;
        int i7 = this.h;
        return new m(this.f17276a, this.f17277b, this.f17278c, this.d, this.f17279e + j3, j12, str, i7);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i7 = this.f17277b;
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
        sb2.append(this.f17276a);
        sb2.append(", ");
        sb2.append(this.f17279e);
        sb2.append(", ");
        sb2.append(this.f17280f);
        sb2.append(", ");
        sb2.append(this.f17281g);
        sb2.append(", ");
        return p0.n(this.h, "]", sb2);
    }

    public m(Uri uri, int i7, byte[] bArr, Map map, long j3, long j10, String str, int i10) {
        boolean z10 = false;
        ma.f(j3 >= 0);
        ma.f(j3 >= 0);
        ma.f((j10 > 0 || j10 == -1) ? true : z10);
        uri.getClass();
        this.f17276a = uri;
        this.f17277b = i7;
        this.f17278c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f17279e = j3;
        this.f17280f = j10;
        this.f17281g = str;
        this.h = i10;
    }
}
