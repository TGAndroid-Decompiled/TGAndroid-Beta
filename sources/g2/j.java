package g2;

import android.content.Context;
import android.net.Uri;
import b2.s0;
import v7.v6;
public final class j implements e2.d {
    public static final d9.t e = v6.a(new a3.s(2));
    public final j9.z f7302a;
    public final hf.b f7303b;
    public final int f7304c;
    public final boolean d;

    public j(c5.e eVar) {
        this.f7303b = new hf.b((Context) eVar.f3777c);
        j9.z zVar = (j9.z) e.get();
        zVar.getClass();
        this.f7302a = zVar;
        this.f7304c = eVar.f3775a;
        this.d = eVar.f3776b;
    }

    @Override
    public final j9.y a(s0 s0Var) {
        byte[] bArr = s0Var.f2254k;
        if (bArr != null) {
            return w(bArr);
        }
        Uri uri = s0Var.f2257n;
        if (uri != null) {
            return ((j9.a0) this.f7302a).a(new i(1, this, uri));
        }
        return null;
    }

    @Override
    public final j9.y w(byte[] bArr) {
        return ((j9.a0) this.f7302a).a(new i(0, this, bArr));
    }
}
