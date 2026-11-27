package defpackage;

import android.content.Context;
import android.net.Uri;
public final class j73 implements xj0 {
    public static final mfb d = nze.a(new m40((byte) 1));
    public final ah7 a;
    public final lh2 b;
    public final int c;

    public j73(ed edVar) {
        this.b = new lh2((Context) edVar.c);
        ah7 ah7Var = (ah7) d.get();
        ah7Var.getClass();
        this.a = ah7Var;
        this.c = edVar.b;
    }

    @Override
    public final x76 X(nt6 nt6Var) {
        byte[] bArr = nt6Var.k;
        if (bArr != null) {
            return b0(bArr);
        }
        Uri uri = nt6Var.n;
        if (uri != null) {
            return this.a.a(new i73(this, uri, (byte) 1));
        }
        return null;
    }

    @Override
    public final x76 b0(byte[] bArr) {
        return this.a.a(new i73(this, bArr, (byte) 0));
    }
}
