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
    public CharSequence f10521a;
    public CharSequence f10522b;
    public CharSequence f10523c;
    public CharSequence d;
    public CharSequence f10524e;
    public CharSequence f10525f;
    public CharSequence f10526g;
    public Long h;
    public d1 f10527i;
    public d1 f10528j;
    public byte[] f10529k;
    public k f10530l;
    public Integer f10531m;
    public Uri f10532n;
    public Integer f10533o;
    public Integer f10534p;
    public Integer f10535q;
    public Boolean f10536r;
    public Boolean f10537s;
    public Integer f10538t;
    public Integer f10539u;
    public Integer v;
    public Integer f10540w;
    public Integer f10541x;
    public Integer f10542y;
    public CharSequence f10543z;

    public n0() {
        h9.g0 g0Var = h9.i0.f13995b;
        this.J = h9.s1.f14058e;
    }

    public final void a(int i7, byte[] bArr) {
        if (this.f10529k != null && i7 != 3 && Objects.equals(this.f10531m, 3)) {
            return;
        }
        this.f10529k = (byte[]) bArr.clone();
        this.f10530l = null;
        this.f10531m = Integer.valueOf(i7);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f10529k = bArr2;
        this.f10530l = null;
        this.f10531m = num;
    }
}
