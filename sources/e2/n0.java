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
    public CharSequence f10560a;
    public CharSequence f10561b;
    public CharSequence f10562c;
    public CharSequence d;
    public CharSequence f10563e;
    public CharSequence f10564f;
    public CharSequence f10565g;
    public Long h;
    public d1 f10566i;
    public d1 f10567j;
    public byte[] f10568k;
    public k f10569l;
    public Integer f10570m;
    public Uri f10571n;
    public Integer f10572o;
    public Integer f10573p;
    public Integer f10574q;
    public Boolean f10575r;
    public Boolean f10576s;
    public Integer f10577t;
    public Integer f10578u;
    public Integer v;
    public Integer f10579w;
    public Integer f10580x;
    public Integer f10581y;
    public CharSequence f10582z;

    public n0() {
        h9.g0 g0Var = h9.i0.f14035b;
        this.J = h9.t1.f14103e;
    }

    public final void a(int i7, byte[] bArr) {
        if (this.f10568k != null && i7 != 3 && Objects.equals(this.f10570m, 3)) {
            return;
        }
        this.f10568k = (byte[]) bArr.clone();
        this.f10569l = null;
        this.f10570m = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f10568k = bArr2;
        this.f10569l = null;
        this.f10570m = num;
    }
}
