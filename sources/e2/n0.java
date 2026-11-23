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
    public CharSequence f10523a;
    public CharSequence f10524b;
    public CharSequence f10525c;
    public CharSequence d;
    public CharSequence f10526e;
    public CharSequence f10527f;
    public CharSequence f10528g;
    public Long h;
    public d1 f10529i;
    public d1 f10530j;
    public byte[] f10531k;
    public k f10532l;
    public Integer f10533m;
    public Uri f10534n;
    public Integer f10535o;
    public Integer f10536p;
    public Integer f10537q;
    public Boolean f10538r;
    public Boolean f10539s;
    public Integer f10540t;
    public Integer f10541u;
    public Integer v;
    public Integer f10542w;
    public Integer f10543x;
    public Integer f10544y;
    public CharSequence f10545z;

    public n0() {
        h9.g0 g0Var = h9.i0.f13998b;
        this.J = h9.t1.f14066e;
    }

    public final void a(int i7, byte[] bArr) {
        if (this.f10531k != null && i7 != 3 && Objects.equals(this.f10533m, 3)) {
            return;
        }
        this.f10531k = (byte[]) bArr.clone();
        this.f10532l = null;
        this.f10533m = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f10531k = bArr2;
        this.f10532l = null;
        this.f10533m = num;
    }
}
