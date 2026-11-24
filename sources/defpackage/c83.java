package defpackage;

import android.content.Context;
import android.net.Uri;
public final class c83 implements wk0 {
    public static final sdb d = xwe.a(new k50((byte) 1));
    public final tg7 a;
    public final lx6 b;
    public final int c;

    public c83(de deVar) {
        this.b = new lx6((Context) deVar.c, (byte) 20);
        tg7 tg7Var = (tg7) d.get();
        tg7Var.getClass();
        this.a = tg7Var;
        this.c = deVar.b;
    }

    @Override
    public final t76 F(jt6 jt6Var) {
        byte[] bArr = jt6Var.k;
        if (bArr != null) {
            return N(bArr);
        }
        Uri uri = jt6Var.n;
        if (uri != null) {
            return this.a.a(new b83(this, uri, (byte) 1));
        }
        return null;
    }

    @Override
    public final t76 N(byte[] bArr) {
        return this.a.a(new b83(this, bArr, (byte) 0));
    }
}
