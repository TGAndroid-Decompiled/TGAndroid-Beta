package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f10357i = 0;
    public final Uri f10358a;
    public final int f10359b;
    public final byte[] f10360c;
    public final Map d;
    public final long f10361e;
    public final long f10362f;
    public final String f10363g;
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
        this.f10358a = uri;
        this.f10359b = i10;
        this.f10360c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f10361e = j3;
        this.f10362f = j10;
        this.f10363g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f10354e = this.f10358a;
        obj.f10351a = this.f10359b;
        obj.f10355f = this.f10360c;
        obj.f10356g = this.d;
        obj.f10352b = this.f10361e;
        obj.d = this.f10362f;
        obj.h = this.f10363g;
        obj.f10353c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f10362f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f10363g;
        int i10 = this.h;
        return new m(this.f10358a, this.f10359b, this.f10360c, this.d, this.f10361e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f10359b;
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
        sb2.append(this.f10358a);
        sb2.append(", ");
        sb2.append(this.f10361e);
        sb2.append(", ");
        sb2.append(this.f10362f);
        sb2.append(", ");
        sb2.append(this.f10363g);
        sb2.append(", ");
        return a4.a.n(this.h, "]", sb2);
    }
}
