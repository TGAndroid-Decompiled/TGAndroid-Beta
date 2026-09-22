package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f9376i = 0;
    public final Uri f9377a;
    public final int f9378b;
    public final byte[] f9379c;
    public final Map d;
    public final long e;
    public final long f9380f;
    public final String f9381g;
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
        e2.d.b((j10 > 0 || j10 == -1) ? true : true);
        uri.getClass();
        this.f9377a = uri;
        this.f9378b = i10;
        this.f9379c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j3;
        this.f9380f = j10;
        this.f9381g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.e = this.f9377a;
        obj.f9371a = this.f9378b;
        obj.f9374f = this.f9379c;
        obj.f9375g = this.d;
        obj.f9372b = this.e;
        obj.d = this.f9380f;
        obj.h = this.f9381g;
        obj.f9373c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f9380f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f9381g;
        int i10 = this.h;
        return new m(this.f9377a, this.f9378b, this.f9379c, this.d, this.e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f9378b;
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
        sb2.append(this.f9377a);
        sb2.append(", ");
        sb2.append(this.e);
        sb2.append(", ");
        sb2.append(this.f9380f);
        sb2.append(", ");
        sb2.append(this.f9381g);
        sb2.append(", ");
        return a4.a.o(this.h, "]", sb2);
    }
}
