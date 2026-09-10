package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f8507i = 0;
    public final Uri f8508a;
    public final int f8509b;
    public final byte[] f8510c;
    public final Map d;
    public final long e;
    public final long f8511f;
    public final String f8512g;
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
        this.f8508a = uri;
        this.f8509b = i10;
        this.f8510c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j3;
        this.f8511f = j10;
        this.f8512g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.e = this.f8508a;
        obj.f8502a = this.f8509b;
        obj.f8505f = this.f8510c;
        obj.f8506g = this.d;
        obj.f8503b = this.e;
        obj.d = this.f8511f;
        obj.h = this.f8512g;
        obj.f8504c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f8511f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f8512g;
        int i10 = this.h;
        return new m(this.f8508a, this.f8509b, this.f8510c, this.d, this.e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f8509b;
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
        sb2.append(this.f8508a);
        sb2.append(", ");
        sb2.append(this.e);
        sb2.append(", ");
        sb2.append(this.f8511f);
        sb2.append(", ");
        sb2.append(this.f8512g);
        sb2.append(", ");
        return a4.a.n(this.h, "]", sb2);
    }
}
