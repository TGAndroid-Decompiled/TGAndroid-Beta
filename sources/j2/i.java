package j2;

import a8.bb;
import android.content.Context;
import android.net.Uri;
import bg.w0;
import e2.o0;
public final class i implements h2.d {
    public static final g9.t f17194e = bb.a(new d3.p(2));
    public final m9.z f17195a;
    public final wf.b f17196b;
    public final int f17197c;
    public final boolean d;

    public i(w0 w0Var) {
        this.f17196b = new wf.b((Context) w0Var.f3368c);
        m9.z zVar = (m9.z) f17194e.get();
        zVar.getClass();
        this.f17195a = zVar;
        this.f17197c = w0Var.f3367b;
        this.d = w0Var.f3366a;
    }

    @Override
    public final m9.y O(o0 o0Var) {
        byte[] bArr = o0Var.f10615k;
        if (bArr != null) {
            return t0(bArr);
        }
        Uri uri = o0Var.f10618n;
        if (uri != null) {
            return ((m9.a0) this.f17195a).a(new ab.i(3, this, uri));
        }
        return null;
    }

    @Override
    public final m9.y t0(byte[] bArr) {
        return ((m9.a0) this.f17195a).a(new ab.i(2, this, bArr));
    }
}
