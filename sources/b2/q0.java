package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class q0 {
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
    public CharSequence f3911a;
    public CharSequence f3912b;
    public CharSequence f3913c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f3914f;
    public CharSequence f3915g;
    public Long h;
    public g1 f3916i;
    public g1 f3917j;
    public byte[] f3918k;
    public l f3919l;
    public Integer f3920m;
    public Uri f3921n;
    public Integer f3922o;
    public Integer f3923p;
    public Integer f3924q;
    public Boolean f3925r;
    public Boolean f3926s;
    public Integer f3927t;
    public Integer f3928u;
    public Integer v;
    public Integer f3929w;
    public Integer f3930x;
    public Integer f3931y;
    public CharSequence f3932z;

    public q0() {
        e9.l0 l0Var = e9.n0.f8481b;
        this.J = e9.x1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f3918k != null && i10 != 3 && Objects.equals(this.f3920m, 3)) {
            return;
        }
        this.f3918k = (byte[]) bArr.clone();
        this.f3919l = null;
        this.f3920m = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f3918k = bArr2;
        this.f3919l = null;
        this.f3920m = num;
    }
}
