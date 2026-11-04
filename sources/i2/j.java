package i2;

import android.content.Context;
import android.net.Uri;
import b8.bc;
import cg.v0;
import d2.q0;
public final class j implements g2.e {
    public static final f9.t f14548e = bc.a(new c3.q(2));
    public final l9.z f14549a;
    public final tf.b f14550b;
    public final int f14551c;
    public final boolean d;

    public j(v0 v0Var) {
        this.f14550b = new tf.b((Context) v0Var.f4759c);
        l9.z zVar = (l9.z) f14548e.get();
        zVar.getClass();
        this.f14549a = zVar;
        this.f14551c = v0Var.f4758b;
        this.d = v0Var.f4757a;
    }

    @Override
    public final l9.y L(q0 q0Var) {
        byte[] bArr = q0Var.f8315k;
        if (bArr != null) {
            return u(bArr);
        }
        Uri uri = q0Var.f8318n;
        if (uri != null) {
            return ((l9.a0) this.f14549a).a(new i(1, this, uri));
        }
        return null;
    }

    @Override
    public final l9.y u(byte[] bArr) {
        return ((l9.a0) this.f14549a).a(new i(0, this, bArr));
    }
}
