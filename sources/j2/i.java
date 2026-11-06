package j2;

import a8.ka;
import android.content.Context;
import android.net.Uri;
import bg.w0;
import e2.o0;
public final class i implements h2.d {
    public static final g9.u f16430e = ka.a(new d3.q(2));
    public final m9.z f16431a;
    public final n f16432b;
    public final int f16433c;
    public final boolean d;

    public i(w0 w0Var) {
        this.f16432b = new n((Context) w0Var.f3394c);
        m9.z zVar = (m9.z) f16430e.get();
        zVar.getClass();
        this.f16431a = zVar;
        this.f16433c = w0Var.f3393b;
        this.d = w0Var.f3392a;
    }

    @Override
    public final m9.y A(o0 o0Var) {
        byte[] bArr = o0Var.f10435k;
        if (bArr != null) {
            return W(bArr);
        }
        Uri uri = o0Var.f10438n;
        if (uri != null) {
            return ((m9.a0) this.f16431a).a(new ab.i(2, this, uri));
        }
        return null;
    }

    @Override
    public final m9.y W(byte[] bArr) {
        return ((m9.a0) this.f16431a).a(new ab.i(1, this, bArr));
    }
}
