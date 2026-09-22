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
    public CharSequence f3092a;
    public CharSequence f3093b;
    public CharSequence f3094c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f3095f;
    public CharSequence f3096g;
    public Long h;
    public c1 f3097i;
    public c1 f3098j;
    public byte[] f3099k;
    public Integer f3100l;
    public Uri f3101m;
    public Integer f3102n;
    public Integer f3103o;
    public Integer f3104p;
    public Boolean f3105q;
    public Boolean f3106r;
    public Integer f3107s;
    public Integer f3108t;
    public Integer f3109u;
    public Integer v;
    public Integer f3110w;
    public Integer f3111x;
    public CharSequence f3112y;
    public CharSequence f3113z;

    public m0() {
        e9.g0 g0Var = e9.i0.f8081b;
        this.I = e9.a1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f3099k != null && i10 != 3 && Objects.equals(this.f3100l, 3)) {
            return;
        }
        this.f3099k = (byte[]) bArr.clone();
        this.f3100l = Integer.valueOf(i10);
    }
}
