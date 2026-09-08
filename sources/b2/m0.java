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
    public CharSequence f2174a;
    public CharSequence f2175b;
    public CharSequence f2176c;
    public CharSequence d;
    public CharSequence f2177e;
    public CharSequence f2178f;
    public CharSequence f2179g;
    public Long h;
    public c1 f2180i;
    public c1 f2181j;
    public byte[] f2182k;
    public Integer f2183l;
    public Uri f2184m;
    public Integer f2185n;
    public Integer f2186o;
    public Integer f2187p;
    public Boolean f2188q;
    public Boolean f2189r;
    public Integer f2190s;
    public Integer f2191t;
    public Integer f2192u;
    public Integer v;
    public Integer f2193w;
    public Integer f2194x;
    public CharSequence f2195y;
    public CharSequence f2196z;

    public m0() {
        e9.g0 g0Var = e9.i0.f8985b;
        this.I = e9.a1.f8948e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f2182k != null && i10 != 3 && Objects.equals(this.f2183l, 3)) {
            return;
        }
        this.f2182k = (byte[]) bArr.clone();
        this.f2183l = Integer.valueOf(i10);
    }
}
