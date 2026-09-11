package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f10329i = 0;
    public final Uri f10330a;
    public final int f10331b;
    public final byte[] f10332c;
    public final Map d;
    public final long f10333e;
    public final long f10334f;
    public final String f10335g;
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
        this.f10330a = uri;
        this.f10331b = i10;
        this.f10332c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f10333e = j3;
        this.f10334f = j10;
        this.f10335g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f10326e = this.f10330a;
        obj.f10323a = this.f10331b;
        obj.f10327f = this.f10332c;
        obj.f10328g = this.d;
        obj.f10324b = this.f10333e;
        obj.d = this.f10334f;
        obj.h = this.f10335g;
        obj.f10325c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f10334f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f10335g;
        int i10 = this.h;
        return new m(this.f10330a, this.f10331b, this.f10332c, this.d, this.f10333e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f10331b;
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
        sb2.append(this.f10330a);
        sb2.append(", ");
        sb2.append(this.f10333e);
        sb2.append(", ");
        sb2.append(this.f10334f);
        sb2.append(", ");
        sb2.append(this.f10335g);
        sb2.append(", ");
        return a4.a.n(this.h, "]", sb2);
    }
}
