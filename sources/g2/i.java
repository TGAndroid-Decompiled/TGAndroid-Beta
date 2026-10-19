package g2;

import android.content.Context;
import android.net.Uri;
import b2.r0;
import v7.w6;
public final class i implements e2.d {
    public static final d9.u e = w6.a(new a3.s(2));
    public final j9.z f10780a;
    public final qf.b f10781b;
    public final int f10782c;
    public final boolean d;

    public i(c5.f fVar) {
        this.f10781b = new qf.b((Context) fVar.f4732c, 18);
        j9.z zVar = (j9.z) e.get();
        zVar.getClass();
        this.f10780a = zVar;
        this.f10782c = fVar.f4730a;
        this.d = fVar.f4731b;
    }

    @Override
    public final j9.y g(r0 r0Var) {
        byte[] bArr = r0Var.f3961k;
        if (bArr != null) {
            return u(bArr);
        }
        Uri uri = r0Var.f3964n;
        if (uri != null) {
            return ((j9.a0) this.f10780a).a(new com.google.firebase.messaging.h(2, this, uri));
        }
        return null;
    }

    @Override
    public final j9.y u(byte[] bArr) {
        return ((j9.a0) this.f10780a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }
}
