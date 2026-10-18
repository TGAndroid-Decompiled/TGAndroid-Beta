package g2;

import android.content.Context;
import android.net.Uri;
import b2.r0;
import v7.w6;
public final class i implements e2.d {
    public static final d9.u e = w6.a(new a3.s(2));
    public final j9.z f10779a;
    public final qf.b f10780b;
    public final int f10781c;
    public final boolean d;

    public i(c5.f fVar) {
        this.f10780b = new qf.b((Context) fVar.f4733c, 18);
        j9.z zVar = (j9.z) e.get();
        zVar.getClass();
        this.f10779a = zVar;
        this.f10781c = fVar.f4731a;
        this.d = fVar.f4732b;
    }

    @Override
    public final j9.y e(r0 r0Var) {
        byte[] bArr = r0Var.f3963k;
        if (bArr != null) {
            return v(bArr);
        }
        Uri uri = r0Var.f3966n;
        if (uri != null) {
            return ((j9.a0) this.f10779a).a(new com.google.firebase.messaging.h(2, this, uri));
        }
        return null;
    }

    @Override
    public final j9.y v(byte[] bArr) {
        return ((j9.a0) this.f10779a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }
}
