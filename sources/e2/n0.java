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
    public CharSequence f10531a;
    public CharSequence f10532b;
    public CharSequence f10533c;
    public CharSequence d;
    public CharSequence f10534e;
    public CharSequence f10535f;
    public CharSequence f10536g;
    public Long h;
    public d1 f10537i;
    public d1 f10538j;
    public byte[] f10539k;
    public k f10540l;
    public Integer f10541m;
    public Uri f10542n;
    public Integer f10543o;
    public Integer f10544p;
    public Integer f10545q;
    public Boolean f10546r;
    public Boolean f10547s;
    public Integer f10548t;
    public Integer f10549u;
    public Integer v;
    public Integer f10550w;
    public Integer f10551x;
    public Integer f10552y;
    public CharSequence f10553z;

    public n0() {
        h9.g0 g0Var = h9.i0.f14006b;
        this.J = h9.t1.f14074e;
    }

    public final void a(int i7, byte[] bArr) {
        if (this.f10539k != null && i7 != 3 && Objects.equals(this.f10541m, 3)) {
            return;
        }
        this.f10539k = (byte[]) bArr.clone();
        this.f10540l = null;
        this.f10541m = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f10539k = bArr2;
        this.f10540l = null;
        this.f10541m = num;
    }
}
