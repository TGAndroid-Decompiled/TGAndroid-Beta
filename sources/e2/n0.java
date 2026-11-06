package e2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class n0 {
    public CharSequence A;
    public CharSequence B;
    public Integer C;
    public Integer D;
    public CharSequence E;
    public CharSequence F;
    public CharSequence G;
    public Integer H;
    public Bundle I;
    public h9.i0 J;
    public CharSequence f10377a;
    public CharSequence f10378b;
    public CharSequence f10379c;
    public CharSequence d;
    public CharSequence f10380e;
    public CharSequence f10381f;
    public CharSequence f10382g;
    public Long h;
    public d1 f10383i;
    public d1 f10384j;
    public byte[] f10385k;
    public k f10386l;
    public Integer f10387m;
    public Uri f10388n;
    public Integer f10389o;
    public Integer f10390p;
    public Integer f10391q;
    public Boolean f10392r;
    public Boolean f10393s;
    public Integer f10394t;
    public Integer f10395u;
    public Integer v;
    public Integer f10396w;
    public Integer f10397x;
    public Integer f10398y;
    public CharSequence f10399z;

    public n0() {
        h9.g0 g0Var = h9.i0.f14329b;
        this.J = h9.t1.f14397e;
    }

    public final void a(int i7, byte[] bArr) {
        if (this.f10385k != null && i7 != 3 && Objects.equals(this.f10387m, 3)) {
            return;
        }
        this.f10385k = (byte[]) bArr.clone();
        this.f10386l = null;
        this.f10387m = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f10385k = bArr2;
        this.f10386l = null;
        this.f10387m = num;
    }
}
