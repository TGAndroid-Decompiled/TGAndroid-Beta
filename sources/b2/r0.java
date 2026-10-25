package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class r0 {
    public CharSequence A;
    public CharSequence B;
    public Integer C;
    public Integer D;
    public CharSequence E;
    public CharSequence F;
    public CharSequence G;
    public Integer H;
    public Bundle I;
    public f9.i0 J;
    public CharSequence f3362a;
    public CharSequence f3363b;
    public CharSequence f3364c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f3365f;
    public CharSequence f3366g;
    public Long h;
    public h1 f3367i;
    public h1 f3368j;
    public byte[] f3369k;
    public m f3370l;
    public Integer f3371m;
    public Uri f3372n;
    public Integer f3373o;
    public Integer f3374p;
    public Integer f3375q;
    public Boolean f3376r;
    public Boolean f3377s;
    public Integer f3378t;
    public Integer f3379u;
    public Integer v;
    public Integer f3380w;
    public Integer f3381x;
    public Integer f3382y;
    public CharSequence f3383z;

    public r0() {
        f9.g0 g0Var = f9.i0.f10287b;
        this.J = f9.s1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f3369k != null && i10 != 3 && Objects.equals(this.f3371m, 3)) {
            return;
        }
        this.f3369k = (byte[]) bArr.clone();
        this.f3370l = null;
        this.f3371m = Integer.valueOf(i10);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f3369k = bArr2;
        this.f3370l = null;
        this.f3371m = num;
    }
}
