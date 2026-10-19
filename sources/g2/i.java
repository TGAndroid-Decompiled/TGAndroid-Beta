package g2;

import android.content.Context;
import android.net.Uri;
import b2.r0;
import v7.w6;
public final class i implements e2.d {
    public static final d9.u e = w6.a(new a3.s(2));
    public final j9.z f10778a;
    public final qf.b f10779b;
    public final int f10780c;
    public final boolean d;

    public i(c5.f fVar) {
        this.f10779b = new qf.b((Context) fVar.f4730c, 18);
        j9.z zVar = (j9.z) e.get();
        zVar.getClass();
        this.f10778a = zVar;
        this.f10780c = fVar.f4728a;
        this.d = fVar.f4729b;
    }

    @Override
    public final j9.y g(r0 r0Var) {
        byte[] bArr = r0Var.f3959k;
        if (bArr != null) {
            return u(bArr);
        }
        Uri uri = r0Var.f3962n;
        if (uri != null) {
            return ((j9.a0) this.f10778a).a(new com.google.firebase.messaging.h(2, this, uri));
        }
        return null;
    }

    @Override
    public final j9.y u(byte[] bArr) {
        return ((j9.a0) this.f10778a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }
}
