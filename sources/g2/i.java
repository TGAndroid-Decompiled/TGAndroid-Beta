package g2;

import a8.ac;
import android.content.Context;
import android.net.Uri;
import b2.s0;
public final class i implements e2.d {
    public static final e9.t e = ac.a(new a3.s(2));
    public final k9.z f12245a;
    public final rf.b f12246b;
    public final int f12247c;
    public final boolean d;

    public i(d5.f fVar) {
        this.f12246b = new rf.b((Context) fVar.f7972c, 19);
        k9.z zVar = (k9.z) e.get();
        zVar.getClass();
        this.f12245a = zVar;
        this.f12247c = fVar.f7970a;
        this.d = fVar.f7971b;
    }

    @Override
    public final k9.y H(byte[] bArr) {
        return ((k9.a0) this.f12245a).a(new com.google.firebase.messaging.h(1, this, bArr));
    }

    @Override
    public final k9.y t(s0 s0Var) {
        byte[] bArr = s0Var.f3417k;
        if (bArr != null) {
            return H(bArr);
        }
        Uri uri = s0Var.f3420n;
        if (uri != null) {
            return ((k9.a0) this.f12245a).a(new com.google.firebase.messaging.h(2, this, uri));
        }
        return null;
    }
}
