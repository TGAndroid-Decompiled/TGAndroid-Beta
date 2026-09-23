package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f9362i = 0;
    public final Uri f9363a;
    public final int f9364b;
    public final byte[] f9365c;
    public final Map d;
    public final long e;
    public final long f9366f;
    public final String f9367g;
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
        this.f9363a = uri;
        this.f9364b = i10;
        this.f9365c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j3;
        this.f9366f = j10;
        this.f9367g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.e = this.f9363a;
        obj.f9357a = this.f9364b;
        obj.f9360f = this.f9365c;
        obj.f9361g = this.d;
        obj.f9358b = this.e;
        obj.d = this.f9366f;
        obj.h = this.f9367g;
        obj.f9359c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f9366f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f9367g;
        int i10 = this.h;
        return new m(this.f9363a, this.f9364b, this.f9365c, this.d, this.e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f9364b;
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
        sb2.append(this.f9363a);
        sb2.append(", ");
        sb2.append(this.e);
        sb2.append(", ");
        sb2.append(this.f9366f);
        sb2.append(", ");
        sb2.append(this.f9367g);
        sb2.append(", ");
        return a4.a.o(this.h, "]", sb2);
    }
}
