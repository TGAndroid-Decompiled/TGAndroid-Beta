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
    public CharSequence f2199a;
    public CharSequence f2200b;
    public CharSequence f2201c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f2202f;
    public CharSequence f2203g;
    public Long h;
    public g1 f2204i;
    public g1 f2205j;
    public byte[] f2206k;
    public m f2207l;
    public Integer f2208m;
    public Uri f2209n;
    public Integer f2210o;
    public Integer f2211p;
    public Integer f2212q;
    public Boolean f2213r;
    public Boolean f2214s;
    public Integer f2215t;
    public Integer f2216u;
    public Integer v;
    public Integer f2217w;
    public Integer f2218x;
    public Integer f2219y;
    public CharSequence f2220z;

    public r0() {
        e9.l0 l0Var = e9.n0.f6390b;
        this.J = e9.x1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f2206k != null && i10 != 3 && Objects.equals(this.f2208m, 3)) {
            return;
        }
        this.f2206k = (byte[]) bArr.clone();
        this.f2207l = null;
        this.f2208m = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f2206k = bArr2;
        this.f2207l = null;
        this.f2208m = num;
    }
}
