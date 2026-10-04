package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f10192i = 0;
    public final Uri f10193a;
    public final int f10194b;
    public final byte[] f10195c;
    public final Map d;
    public final long f10196e;
    public final long f10197f;
    public final String f10198g;
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
        this.f10193a = uri;
        this.f10194b = i10;
        this.f10195c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f10196e = j3;
        this.f10197f = j10;
        this.f10198g = str;
        this.h = i11;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f10189e = this.f10193a;
        obj.f10186a = this.f10194b;
        obj.f10190f = this.f10195c;
        obj.f10191g = this.d;
        obj.f10187b = this.f10196e;
        obj.d = this.f10197f;
        obj.h = this.f10198g;
        obj.f10188c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f10197f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f10198g;
        int i10 = this.h;
        return new m(this.f10193a, this.f10194b, this.f10195c, this.d, this.f10196e + j3, j12, str, i10);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f10194b;
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
        sb2.append(this.f10193a);
        sb2.append(", ");
        sb2.append(this.f10196e);
        sb2.append(", ");
        sb2.append(this.f10197f);
        sb2.append(", ");
        sb2.append(this.f10198g);
        sb2.append(", ");
        return a4.a.n(this.h, "]", sb2);
    }
}
