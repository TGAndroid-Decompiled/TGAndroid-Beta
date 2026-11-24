package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class ht6 {
    public CharSequence A;
    public CharSequence B;
    public CharSequence C;
    public Integer D;
    public Integer E;
    public CharSequence F;
    public CharSequence G;
    public CharSequence H;
    public Integer I;
    public Bundle J;
    public mo5 K;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public g19 i;
    public g19 j;
    public byte[] k;
    public k41 l;
    public Integer m;
    public Uri n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Boolean r;
    public Boolean s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Integer y;
    public CharSequence z;

    public ht6() {
        ko5 ko5Var = mo5.b;
        this.K = y79.e;
    }

    public final void a(int i, byte[] bArr) {
        if (this.k != null && i != 3 && Objects.equals(this.m, 3)) {
            return;
        }
        this.k = (byte[]) bArr.clone();
        this.l = null;
        this.m = Integer.valueOf(i);
    }

    public final void b(byte[] bArr, Integer num) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.k = bArr2;
        this.l = null;
        this.m = num;
    }
}
