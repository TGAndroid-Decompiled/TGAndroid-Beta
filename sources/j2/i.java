package j2;

import android.content.Context;
import android.net.Uri;
import bg.w0;
import e2.o0;
public final class i implements h2.d {
    public static final g9.t f17260e = af.b.b(new d3.p(2));
    public final m9.z f17261a;
    public final wf.b f17262b;
    public final int f17263c;
    public final boolean d;

    public i(w0 w0Var) {
        this.f17262b = new wf.b((Context) w0Var.f3326c);
        m9.z zVar = (m9.z) f17260e.get();
        zVar.getClass();
        this.f17261a = zVar;
        this.f17263c = w0Var.f3325b;
        this.d = w0Var.f3324a;
    }

    @Override
    public final m9.y I(o0 o0Var) {
        byte[] bArr = o0Var.f10579k;
        if (bArr != null) {
            return V(bArr);
        }
        Uri uri = o0Var.f10582n;
        if (uri != null) {
            return ((m9.a0) this.f17261a).a(new ab.i(3, this, uri));
        }
        return null;
    }

    @Override
    public final m9.y V(byte[] bArr) {
        return ((m9.a0) this.f17261a).a(new ab.i(2, this, bArr));
    }
}
