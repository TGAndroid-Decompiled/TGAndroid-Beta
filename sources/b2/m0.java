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
    public CharSequence f3095a;
    public CharSequence f3096b;
    public CharSequence f3097c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f3098f;
    public CharSequence f3099g;
    public Long h;
    public c1 f3100i;
    public c1 f3101j;
    public byte[] f3102k;
    public Integer f3103l;
    public Uri f3104m;
    public Integer f3105n;
    public Integer f3106o;
    public Integer f3107p;
    public Boolean f3108q;
    public Boolean f3109r;
    public Integer f3110s;
    public Integer f3111t;
    public Integer f3112u;
    public Integer v;
    public Integer f3113w;
    public Integer f3114x;
    public CharSequence f3115y;
    public CharSequence f3116z;

    public m0() {
        e9.g0 g0Var = e9.i0.f8084b;
        this.I = e9.a1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f3102k != null && i10 != 3 && Objects.equals(this.f3103l, 3)) {
            return;
        }
        this.f3102k = (byte[]) bArr.clone();
        this.f3103l = Integer.valueOf(i10);
    }
}
