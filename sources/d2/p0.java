package d2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class p0 {
    public CharSequence A;
    public CharSequence B;
    public Integer C;
    public Integer D;
    public CharSequence E;
    public CharSequence F;
    public CharSequence G;
    public Integer H;
    public Bundle I;
    public g9.i0 J;
    public CharSequence f8260a;
    public CharSequence f8261b;
    public CharSequence f8262c;
    public CharSequence d;
    public CharSequence f8263e;
    public CharSequence f8264f;
    public CharSequence f8265g;
    public Long h;
    public f1 f8266i;
    public f1 f8267j;
    public byte[] f8268k;
    public l f8269l;
    public Integer f8270m;
    public Uri f8271n;
    public Integer f8272o;
    public Integer f8273p;
    public Integer f8274q;
    public Boolean f8275r;
    public Boolean f8276s;
    public Integer f8277t;
    public Integer f8278u;
    public Integer v;
    public Integer f8279w;
    public Integer f8280x;
    public Integer f8281y;
    public CharSequence f8282z;

    public p0() {
        g9.g0 g0Var = g9.i0.f12083b;
        this.J = g9.s1.f12146e;
    }

    public final void a(int i3, byte[] bArr) {
        if (this.f8268k != null && i3 != 3 && Objects.equals(this.f8270m, 3)) {
            return;
        }
        this.f8268k = (byte[]) bArr.clone();
        this.f8269l = null;
        this.f8270m = Integer.valueOf(i3);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f8268k = bArr2;
        this.f8269l = null;
        this.f8270m = num;
    }
}
