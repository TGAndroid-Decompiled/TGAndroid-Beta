package g2;

import android.content.Context;
import android.net.Uri;
import b2.s0;
import v7.w6;
public final class i implements e2.d {
    public static final d9.u e = w6.a(new a3.s(2));
    public final j9.z f9870a;
    public final qf.b f9871b;
    public final int f9872c;
    public final boolean d;

    public i(c5.f fVar) {
        this.f9871b = new qf.b((Context) fVar.f4359c, 20);
        j9.z zVar = (j9.z) e.get();
        zVar.getClass();
        this.f9870a = zVar;
        this.f9872c = fVar.f4357a;
        this.d = fVar.f4358b;
    }

    @Override
    public final j9.y d(s0 s0Var) {
        byte[] bArr = s0Var.f2350k;
        if (bArr != null) {
            return q(bArr);
        }
        Uri uri = s0Var.f2353n;
        if (uri != null) {
            return ((j9.a0) this.f9870a).a(new com.google.firebase.messaging.h(2, this, uri));
        }
        return null;
    }

    @Override
    public final j9.y q(byte[] bArr) {
        return ((j9.a0) this.f9870a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }
}
