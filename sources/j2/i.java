package j2;

import a8.bb;
import android.content.Context;
import android.net.Uri;
import bg.w0;
import e2.o0;
public final class i implements h2.d {
    public static final g9.t f17172e = bb.a(new d3.p(2));
    public final m9.z f17173a;
    public final wf.b f17174b;
    public final int f17175c;
    public final boolean d;

    public i(w0 w0Var) {
        this.f17174b = new wf.b((Context) w0Var.f3355c);
        m9.z zVar = (m9.z) f17172e.get();
        zVar.getClass();
        this.f17173a = zVar;
        this.f17175c = w0Var.f3354b;
        this.d = w0Var.f3353a;
    }

    @Override
    public final m9.y O(o0 o0Var) {
        byte[] bArr = o0Var.f10589k;
        if (bArr != null) {
            return t0(bArr);
        }
        Uri uri = o0Var.f10592n;
        if (uri != null) {
            return ((m9.a0) this.f17173a).a(new ab.i(3, this, uri));
        }
        return null;
    }

    @Override
    public final m9.y t0(byte[] bArr) {
        return ((m9.a0) this.f17173a).a(new ab.i(2, this, bArr));
    }
}
