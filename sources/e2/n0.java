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
    public CharSequence f10528a;
    public CharSequence f10529b;
    public CharSequence f10530c;
    public CharSequence d;
    public CharSequence f10531e;
    public CharSequence f10532f;
    public CharSequence f10533g;
    public Long h;
    public d1 f10534i;
    public d1 f10535j;
    public byte[] f10536k;
    public k f10537l;
    public Integer f10538m;
    public Uri f10539n;
    public Integer f10540o;
    public Integer f10541p;
    public Integer f10542q;
    public Boolean f10543r;
    public Boolean f10544s;
    public Integer f10545t;
    public Integer f10546u;
    public Integer v;
    public Integer f10547w;
    public Integer f10548x;
    public Integer f10549y;
    public CharSequence f10550z;

    public n0() {
        h9.g0 g0Var = h9.i0.f14003b;
        this.J = h9.t1.f14071e;
    }

    public final void a(int i7, byte[] bArr) {
        if (this.f10536k != null && i7 != 3 && Objects.equals(this.f10538m, 3)) {
            return;
        }
        this.f10536k = (byte[]) bArr.clone();
        this.f10537l = null;
        this.f10538m = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f10536k = bArr2;
        this.f10537l = null;
        this.f10538m = num;
    }
}
