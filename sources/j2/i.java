package j2;

import a8.la;
import android.content.Context;
import android.net.Uri;
import bg.v0;
import e2.o0;
public final class i implements h2.d {
    public static final g9.t f16787e = la.a(new d3.p(2));
    public final m9.z f16788a;
    public final wf.b f16789b;
    public final int f16790c;
    public final boolean d;

    public i(v0 v0Var) {
        this.f16789b = new wf.b((Context) v0Var.f3348c);
        m9.z zVar = (m9.z) f16787e.get();
        zVar.getClass();
        this.f16788a = zVar;
        this.f16790c = v0Var.f3347b;
        this.d = v0Var.f3346a;
    }

    @Override
    public final m9.y L(o0 o0Var) {
        byte[] bArr = o0Var.f10271k;
        if (bArr != null) {
            return d0(bArr);
        }
        Uri uri = o0Var.f10274n;
        if (uri != null) {
            return ((m9.a0) this.f16788a).a(new ab.i(3, this, uri));
        }
        return null;
    }

    @Override
    public final m9.y d0(byte[] bArr) {
        return ((m9.a0) this.f16788a).a(new ab.i(2, this, bArr));
    }
}
