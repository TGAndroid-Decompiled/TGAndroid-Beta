package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f9378i = 0;
    public final Uri f9379a;
    public final int f9380b;
    public final byte[] f9381c;
    public final Map d;
    public final long e;
    public final long f9382f;
    public final String f9383g;
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
        this.f9379a = uri;
        this.f9380b = i10;
        this.f9381c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j3;
        this.f9382f = j10;
        this.f9383g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.e = this.f9379a;
        obj.f9373a = this.f9380b;
        obj.f9376f = this.f9381c;
        obj.f9377g = this.d;
        obj.f9374b = this.e;
        obj.d = this.f9382f;
        obj.h = this.f9383g;
        obj.f9375c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f9382f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f9383g;
        int i10 = this.h;
        return new m(this.f9379a, this.f9380b, this.f9381c, this.d, this.e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f9380b;
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
        sb2.append(this.f9379a);
        sb2.append(", ");
        sb2.append(this.e);
        sb2.append(", ");
        sb2.append(this.f9382f);
        sb2.append(", ");
        sb2.append(this.f9383g);
        sb2.append(", ");
        return a4.a.n(this.h, "]", sb2);
    }
}
