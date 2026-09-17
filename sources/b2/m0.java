package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class m0 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public e9.i0 I;
    public CharSequence f2147a;
    public CharSequence f2148b;
    public CharSequence f2149c;
    public CharSequence d;
    public CharSequence f2150e;
    public CharSequence f2151f;
    public CharSequence f2152g;
    public Long h;
    public c1 f2153i;
    public c1 f2154j;
    public byte[] f2155k;
    public Integer f2156l;
    public Uri f2157m;
    public Integer f2158n;
    public Integer f2159o;
    public Integer f2160p;
    public Boolean f2161q;
    public Boolean f2162r;
    public Integer f2163s;
    public Integer f2164t;
    public Integer f2165u;
    public Integer v;
    public Integer f2166w;
    public Integer f2167x;
    public CharSequence f2168y;
    public CharSequence f2169z;

    public m0() {
        e9.g0 g0Var = e9.i0.f8957b;
        this.I = e9.a1.f8920e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f2155k != null && i10 != 3 && Objects.equals(this.f2156l, 3)) {
            return;
        }
        this.f2155k = (byte[]) bArr.clone();
        this.f2156l = Integer.valueOf(i10);
    }
}
