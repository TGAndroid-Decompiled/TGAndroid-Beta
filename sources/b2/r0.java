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
    public CharSequence f2299a;
    public CharSequence f2300b;
    public CharSequence f2301c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f2302f;
    public CharSequence f2303g;
    public Long h;
    public h1 f2304i;
    public h1 f2305j;
    public byte[] f2306k;
    public m f2307l;
    public Integer f2308m;
    public Uri f2309n;
    public Integer f2310o;
    public Integer f2311p;
    public Integer f2312q;
    public Boolean f2313r;
    public Boolean f2314s;
    public Integer f2315t;
    public Integer f2316u;
    public Integer v;
    public Integer f2317w;
    public Integer f2318x;
    public Integer f2319y;
    public CharSequence f2320z;

    public r0() {
        e9.l0 l0Var = e9.n0.f8595b;
        this.J = e9.x1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f2306k != null && i10 != 3 && Objects.equals(this.f2308m, 3)) {
            return;
        }
        this.f2306k = (byte[]) bArr.clone();
        this.f2307l = null;
        this.f2308m = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f2306k = bArr2;
        this.f2307l = null;
        this.f2308m = num;
    }
}
