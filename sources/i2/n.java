package i2;

import android.net.Uri;
import b8.zb;
import d2.o0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class n {
    public static final int f14563i = 0;
    public final Uri f14564a;
    public final int f14565b;
    public final byte[] f14566c;
    public final Map d;
    public final long f14567e;
    public final long f14568f;
    public final String f14569g;
    public final int h;

    static {
        o0.a("media3.datasource");
    }

    public n(Uri uri, int i3, byte[] bArr, Map map, long j10, long j11, String str, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        if (j10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.f(z11);
        zb.f((j11 > 0 || j11 == -1) ? true : z12);
        uri.getClass();
        this.f14564a = uri;
        this.f14565b = i3;
        this.f14566c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f14567e = j10;
        this.f14568f = j11;
        this.f14569g = str;
        this.h = i10;
    }

    public final m a() {
        ?? obj = new Object();
        obj.f14560e = this.f14564a;
        obj.f14557a = this.f14565b;
        obj.f14561f = this.f14566c;
        obj.f14562g = this.d;
        obj.f14558b = this.f14567e;
        obj.d = this.f14568f;
        obj.h = this.f14569g;
        obj.f14559c = this.h;
        return obj;
    }

    public final n b(long j10) {
        long j11 = this.f14568f;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        long j13 = j12;
        if (j10 == 0 && j11 == j13) {
            return this;
        }
        String str = this.f14569g;
        int i3 = this.h;
        return new n(this.f14564a, this.f14565b, this.f14566c, this.d, this.f14567e + j10, j13, str, i3);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i3 = this.f14565b;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
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
        sb2.append(this.f14564a);
        sb2.append(", ");
        sb2.append(this.f14567e);
        sb2.append(", ");
        sb2.append(this.f14568f);
        sb2.append(", ");
        sb2.append(this.f14569g);
        sb2.append(", ");
        return a1.g.o(this.h, "]", sb2);
    }
}
