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
    public CharSequence f3904a;
    public CharSequence f3905b;
    public CharSequence f3906c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f3907f;
    public CharSequence f3908g;
    public Long h;
    public g1 f3909i;
    public g1 f3910j;
    public byte[] f3911k;
    public l f3912l;
    public Integer f3913m;
    public Uri f3914n;
    public Integer f3915o;
    public Integer f3916p;
    public Integer f3917q;
    public Boolean f3918r;
    public Boolean f3919s;
    public Integer f3920t;
    public Integer f3921u;
    public Integer v;
    public Integer f3922w;
    public Integer f3923x;
    public Integer f3924y;
    public CharSequence f3925z;

    public q0() {
        e9.l0 l0Var = e9.n0.f8474b;
        this.J = e9.x1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f3911k != null && i10 != 3 && Objects.equals(this.f3913m, 3)) {
            return;
        }
        this.f3911k = (byte[]) bArr.clone();
        this.f3912l = null;
        this.f3913m = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f3911k = bArr2;
        this.f3912l = null;
        this.f3913m = num;
    }
}
