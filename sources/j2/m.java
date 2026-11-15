package j2;

import a8.ja;
import a8.p0;
import android.net.Uri;
import e2.m0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class m {
    public static final int f16802i = 0;
    public final Uri f16803a;
    public final int f16804b;
    public final byte[] f16805c;
    public final Map d;
    public final long f16806e;
    public final long f16807f;
    public final String f16808g;
    public final int h;

    static {
        m0.a("media3.datasource");
    }

    public m(Uri uri, int i7, byte[] bArr, Map map, long j3, long j10, String str, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        if (j3 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ja.f(z11);
        ja.f((j10 > 0 || j10 == -1) ? true : z12);
        uri.getClass();
        this.f16803a = uri;
        this.f16804b = i7;
        this.f16805c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f16806e = j3;
        this.f16807f = j10;
        this.f16808g = str;
        this.h = i10;
    }

    public final l a() {
        ?? obj = new Object();
        obj.f16799e = this.f16803a;
        obj.f16796a = this.f16804b;
        obj.f16800f = this.f16805c;
        obj.f16801g = this.d;
        obj.f16797b = this.f16806e;
        obj.d = this.f16807f;
        obj.h = this.f16808g;
        obj.f16798c = this.h;
        return obj;
    }

    public final m b(long j3) {
        long j10 = this.f16807f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j3;
        }
        long j12 = j11;
        if (j3 == 0 && j10 == j12) {
            return this;
        }
        String str = this.f16808g;
        int i7 = this.h;
        return new m(this.f16803a, this.f16804b, this.f16805c, this.d, this.f16806e + j3, j12, str, i7);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i7 = this.f16804b;
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
        sb2.append(this.f16803a);
        sb2.append(", ");
        sb2.append(this.f16806e);
        sb2.append(", ");
        sb2.append(this.f16807f);
        sb2.append(", ");
        sb2.append(this.f16808g);
        sb2.append(", ");
        return p0.n(this.h, "]", sb2);
    }
}
