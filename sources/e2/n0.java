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
    public CharSequence f10213a;
    public CharSequence f10214b;
    public CharSequence f10215c;
    public CharSequence d;
    public CharSequence f10216e;
    public CharSequence f10217f;
    public CharSequence f10218g;
    public Long h;
    public d1 f10219i;
    public d1 f10220j;
    public byte[] f10221k;
    public k f10222l;
    public Integer f10223m;
    public Uri f10224n;
    public Integer f10225o;
    public Integer f10226p;
    public Integer f10227q;
    public Boolean f10228r;
    public Boolean f10229s;
    public Integer f10230t;
    public Integer f10231u;
    public Integer v;
    public Integer f10232w;
    public Integer f10233x;
    public Integer f10234y;
    public CharSequence f10235z;

    public n0() {
        h9.g0 g0Var = h9.i0.f13686b;
        this.J = h9.s1.f13749e;
    }

    public final void a(int i7, byte[] bArr) {
        if (this.f10221k != null && i7 != 3 && Objects.equals(this.f10223m, 3)) {
            return;
        }
        this.f10221k = (byte[]) bArr.clone();
        this.f10222l = null;
        this.f10223m = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f10221k = bArr2;
        this.f10222l = null;
        this.f10223m = num;
    }
}
