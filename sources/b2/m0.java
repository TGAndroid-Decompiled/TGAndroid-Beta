package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class m0 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public e9.i0 I;
    public CharSequence f3094a;
    public CharSequence f3095b;
    public CharSequence f3096c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f3097f;
    public CharSequence f3098g;
    public Long h;
    public c1 f3099i;
    public c1 f3100j;
    public byte[] f3101k;
    public Integer f3102l;
    public Uri f3103m;
    public Integer f3104n;
    public Integer f3105o;
    public Integer f3106p;
    public Boolean f3107q;
    public Boolean f3108r;
    public Integer f3109s;
    public Integer f3110t;
    public Integer f3111u;
    public Integer v;
    public Integer f3112w;
    public Integer f3113x;
    public CharSequence f3114y;
    public CharSequence f3115z;

    public m0() {
        e9.g0 g0Var = e9.i0.f8083b;
        this.I = e9.a1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f3101k != null && i10 != 3 && Objects.equals(this.f3102l, 3)) {
            return;
        }
        this.f3101k = (byte[]) bArr.clone();
        this.f3102l = Integer.valueOf(i10);
    }
}
