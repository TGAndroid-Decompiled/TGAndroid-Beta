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
    public CharSequence f3908a;
    public CharSequence f3909b;
    public CharSequence f3910c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f3911f;
    public CharSequence f3912g;
    public Long h;
    public g1 f3913i;
    public g1 f3914j;
    public byte[] f3915k;
    public l f3916l;
    public Integer f3917m;
    public Uri f3918n;
    public Integer f3919o;
    public Integer f3920p;
    public Integer f3921q;
    public Boolean f3922r;
    public Boolean f3923s;
    public Integer f3924t;
    public Integer f3925u;
    public Integer v;
    public Integer f3926w;
    public Integer f3927x;
    public Integer f3928y;
    public CharSequence f3929z;

    public q0() {
        e9.l0 l0Var = e9.n0.f8477b;
        this.J = e9.x1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f3915k != null && i10 != 3 && Objects.equals(this.f3917m, 3)) {
            return;
        }
        this.f3915k = (byte[]) bArr.clone();
        this.f3916l = null;
        this.f3917m = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f3915k = bArr2;
        this.f3916l = null;
        this.f3917m = num;
    }
}
