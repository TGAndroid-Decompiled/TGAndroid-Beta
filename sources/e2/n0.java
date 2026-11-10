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
    public CharSequence f10382a;
    public CharSequence f10383b;
    public CharSequence f10384c;
    public CharSequence d;
    public CharSequence f10385e;
    public CharSequence f10386f;
    public CharSequence f10387g;
    public Long h;
    public d1 f10388i;
    public d1 f10389j;
    public byte[] f10390k;
    public k f10391l;
    public Integer f10392m;
    public Uri f10393n;
    public Integer f10394o;
    public Integer f10395p;
    public Integer f10396q;
    public Boolean f10397r;
    public Boolean f10398s;
    public Integer f10399t;
    public Integer f10400u;
    public Integer v;
    public Integer f10401w;
    public Integer f10402x;
    public Integer f10403y;
    public CharSequence f10404z;

    public n0() {
        h9.g0 g0Var = h9.i0.f14331b;
        this.J = h9.t1.f14399e;
    }

    public final void a(int i7, byte[] bArr) {
        if (this.f10390k != null && i7 != 3 && Objects.equals(this.f10392m, 3)) {
            return;
        }
        this.f10390k = (byte[]) bArr.clone();
        this.f10391l = null;
        this.f10392m = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f10390k = bArr2;
        this.f10391l = null;
        this.f10392m = num;
    }
}
