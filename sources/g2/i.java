package g2;

import android.content.Context;
import android.net.Uri;
import b2.s0;
import v7.w6;
public final class i implements e2.d {
    public static final d9.u e = w6.a(new a3.s(2));
    public final j9.z f9873a;
    public final qf.b f9874b;
    public final int f9875c;
    public final boolean d;

    public i(c5.f fVar) {
        this.f9874b = new qf.b((Context) fVar.f4362c, 20);
        j9.z zVar = (j9.z) e.get();
        zVar.getClass();
        this.f9873a = zVar;
        this.f9875c = fVar.f4360a;
        this.d = fVar.f4361b;
    }

    @Override
    public final j9.y o(s0 s0Var) {
        byte[] bArr = s0Var.f2354k;
        if (bArr != null) {
            return u(bArr);
        }
        Uri uri = s0Var.f2357n;
        if (uri != null) {
            return ((j9.a0) this.f9873a).a(new com.google.firebase.messaging.h(2, this, uri));
        }
        return null;
    }

    @Override
    public final j9.y u(byte[] bArr) {
        return ((j9.a0) this.f9873a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }
}
