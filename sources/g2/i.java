package g2;

import android.content.Context;
import android.net.Uri;
import b2.r0;
import v7.w6;
public final class i implements e2.d {
    public static final d9.u e = w6.a(new a3.s(2));
    public final j9.z f10797a;
    public final qf.b f10798b;
    public final int f10799c;
    public final boolean d;

    public i(c5.f fVar) {
        this.f10798b = new qf.b((Context) fVar.f4735c, 18);
        j9.z zVar = (j9.z) e.get();
        zVar.getClass();
        this.f10797a = zVar;
        this.f10799c = fVar.f4733a;
        this.d = fVar.f4734b;
    }

    @Override
    public final j9.y g(r0 r0Var) {
        byte[] bArr = r0Var.f3966k;
        if (bArr != null) {
            return v(bArr);
        }
        Uri uri = r0Var.f3969n;
        if (uri != null) {
            return ((j9.a0) this.f10797a).a(new com.google.firebase.messaging.h(2, this, uri));
        }
        return null;
    }

    @Override
    public final j9.y v(byte[] bArr) {
        return ((j9.a0) this.f10797a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }
}
