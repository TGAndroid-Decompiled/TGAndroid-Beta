package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class r0 {
    public CharSequence A;
    public CharSequence B;
    public Integer C;
    public Integer D;
    public CharSequence E;
    public CharSequence F;
    public CharSequence G;
    public Integer H;
    public Bundle I;
    public e9.n0 J;
    public CharSequence f2295a;
    public CharSequence f2296b;
    public CharSequence f2297c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f2298f;
    public CharSequence f2299g;
    public Long h;
    public h1 f2300i;
    public h1 f2301j;
    public byte[] f2302k;
    public m f2303l;
    public Integer f2304m;
    public Uri f2305n;
    public Integer f2306o;
    public Integer f2307p;
    public Integer f2308q;
    public Boolean f2309r;
    public Boolean f2310s;
    public Integer f2311t;
    public Integer f2312u;
    public Integer v;
    public Integer f2313w;
    public Integer f2314x;
    public Integer f2315y;
    public CharSequence f2316z;

    public r0() {
        e9.l0 l0Var = e9.n0.f8592b;
        this.J = e9.x1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f2302k != null && i10 != 3 && Objects.equals(this.f2304m, 3)) {
            return;
        }
        this.f2302k = (byte[]) bArr.clone();
        this.f2303l = null;
        this.f2304m = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f2302k = bArr2;
        this.f2303l = null;
        this.f2304m = num;
    }
}
