package j2;

import android.content.Context;
import android.net.Uri;
import bg.w0;
import e2.o0;
public final class i implements h2.d {
    public static final g9.t f17163e = af.b.b(new d3.p(2));
    public final m9.z f17164a;
    public final wf.b f17165b;
    public final int f17166c;
    public final boolean d;

    public i(w0 w0Var) {
        this.f17165b = new wf.b((Context) w0Var.f3326c);
        m9.z zVar = (m9.z) f17163e.get();
        zVar.getClass();
        this.f17164a = zVar;
        this.f17166c = w0Var.f3325b;
        this.d = w0Var.f3324a;
    }

    @Override
    public final m9.y O(o0 o0Var) {
        byte[] bArr = o0Var.f10581k;
        if (bArr != null) {
            return t0(bArr);
        }
        Uri uri = o0Var.f10584n;
        if (uri != null) {
            return ((m9.a0) this.f17164a).a(new ab.i(3, this, uri));
        }
        return null;
    }

    @Override
    public final m9.y t0(byte[] bArr) {
        return ((m9.a0) this.f17164a).a(new ab.i(2, this, bArr));
    }
}
