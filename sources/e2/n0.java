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
    public CharSequence f10557a;
    public CharSequence f10558b;
    public CharSequence f10559c;
    public CharSequence d;
    public CharSequence f10560e;
    public CharSequence f10561f;
    public CharSequence f10562g;
    public Long h;
    public d1 f10563i;
    public d1 f10564j;
    public byte[] f10565k;
    public k f10566l;
    public Integer f10567m;
    public Uri f10568n;
    public Integer f10569o;
    public Integer f10570p;
    public Integer f10571q;
    public Boolean f10572r;
    public Boolean f10573s;
    public Integer f10574t;
    public Integer f10575u;
    public Integer v;
    public Integer f10576w;
    public Integer f10577x;
    public Integer f10578y;
    public CharSequence f10579z;

    public n0() {
        h9.g0 g0Var = h9.i0.f14032b;
        this.J = h9.t1.f14100e;
    }

    public final void a(int i7, byte[] bArr) {
        if (this.f10565k != null && i7 != 3 && Objects.equals(this.f10567m, 3)) {
            return;
        }
        this.f10565k = (byte[]) bArr.clone();
        this.f10566l = null;
        this.f10567m = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f10565k = bArr2;
        this.f10566l = null;
        this.f10567m = num;
    }
}
