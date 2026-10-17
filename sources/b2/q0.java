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
    public CharSequence f3907a;
    public CharSequence f3908b;
    public CharSequence f3909c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f3910f;
    public CharSequence f3911g;
    public Long h;
    public g1 f3912i;
    public g1 f3913j;
    public byte[] f3914k;
    public l f3915l;
    public Integer f3916m;
    public Uri f3917n;
    public Integer f3918o;
    public Integer f3919p;
    public Integer f3920q;
    public Boolean f3921r;
    public Boolean f3922s;
    public Integer f3923t;
    public Integer f3924u;
    public Integer v;
    public Integer f3925w;
    public Integer f3926x;
    public Integer f3927y;
    public CharSequence f3928z;

    public q0() {
        e9.l0 l0Var = e9.n0.f8476b;
        this.J = e9.x1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f3914k != null && i10 != 3 && Objects.equals(this.f3916m, 3)) {
            return;
        }
        this.f3914k = (byte[]) bArr.clone();
        this.f3915l = null;
        this.f3916m = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f3914k = bArr2;
        this.f3915l = null;
        this.f3916m = num;
    }
}
