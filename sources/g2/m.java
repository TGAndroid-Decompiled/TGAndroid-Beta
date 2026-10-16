package g2;

import android.net.Uri;
import b2.q0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import v7.u6;
public final class m {
    public static final int f9885i = 0;
    public final Uri f9886a;
    public final int f9887b;
    public final byte[] f9888c;
    public final Map d;
    public final long e;
    public final long f9889f;
    public final String f9890g;
    public final int h;

    static {
        q0.a("media3.datasource");
    }

    public m(Uri uri, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        if (j10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        u6.g((j11 > 0 || j11 == -1) ? true : z12);
        uri.getClass();
        this.f9886a = uri;
        this.f9887b = i10;
        this.f9888c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j10;
        this.f9889f = j11;
        this.f9890g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.e = this.f9886a;
        obj.f9880a = this.f9887b;
        obj.f9883f = this.f9888c;
        obj.f9884g = this.d;
        obj.f9881b = this.e;
        obj.d = this.f9889f;
        obj.h = this.f9890g;
        obj.f9882c = this.h;
        return obj;
    }

    public final m b(long j10) {
        long j11 = this.f9889f;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        long j13 = j12;
        if (j10 == 0 && j11 == j13) {
            return this;
        }
        String str = this.f9890g;
        int i10 = this.h;
        return new m(this.f9886a, this.f9887b, this.f9888c, this.d, this.e + j10, j13, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f9887b;
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
        sb2.append(this.f9886a);
        sb2.append(", ");
        sb2.append(this.e);
        sb2.append(", ");
        sb2.append(this.f9889f);
        sb2.append(", ");
        sb2.append(this.f9890g);
        sb2.append(", ");
        return a1.g.n(this.h, "]", sb2);
    }
}
