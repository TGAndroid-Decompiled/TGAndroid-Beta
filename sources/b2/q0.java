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
    public CharSequence f3906a;
    public CharSequence f3907b;
    public CharSequence f3908c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f3909f;
    public CharSequence f3910g;
    public Long h;
    public g1 f3911i;
    public g1 f3912j;
    public byte[] f3913k;
    public l f3914l;
    public Integer f3915m;
    public Uri f3916n;
    public Integer f3917o;
    public Integer f3918p;
    public Integer f3919q;
    public Boolean f3920r;
    public Boolean f3921s;
    public Integer f3922t;
    public Integer f3923u;
    public Integer v;
    public Integer f3924w;
    public Integer f3925x;
    public Integer f3926y;
    public CharSequence f3927z;

    public q0() {
        e9.l0 l0Var = e9.n0.f8476b;
        this.J = e9.x1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f3913k != null && i10 != 3 && Objects.equals(this.f3915m, 3)) {
            return;
        }
        this.f3913k = (byte[]) bArr.clone();
        this.f3914l = null;
        this.f3915m = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f3913k = bArr2;
        this.f3914l = null;
        this.f3915m = num;
    }
}
