package j2;

import a8.ka;
import android.content.Context;
import android.net.Uri;
import bg.w0;
import e2.o0;
public final class i implements h2.d {
    public static final g9.u f16433e = ka.a(new d3.q(2));
    public final m9.z f16434a;
    public final n f16435b;
    public final int f16436c;
    public final boolean d;

    public i(w0 w0Var) {
        this.f16435b = new n((Context) w0Var.f3394c);
        m9.z zVar = (m9.z) f16433e.get();
        zVar.getClass();
        this.f16434a = zVar;
        this.f16436c = w0Var.f3393b;
        this.d = w0Var.f3392a;
    }

    @Override
    public final m9.y A(o0 o0Var) {
        byte[] bArr = o0Var.f10440k;
        if (bArr != null) {
            return W(bArr);
        }
        Uri uri = o0Var.f10443n;
        if (uri != null) {
            return ((m9.a0) this.f16434a).a(new ab.i(2, this, uri));
        }
        return null;
    }

    @Override
    public final m9.y W(byte[] bArr) {
        return ((m9.a0) this.f16434a).a(new ab.i(1, this, bArr));
    }
}
