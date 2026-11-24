package defpackage;

import org.telegram.tgnet.TLRPC;
public final class x3c implements u2b {
    public final d4c a;

    public x3c(d4c d4cVar) {
        this.a = d4cVar;
    }

    @Override
    public final boolean b() {
        return this.a.b.a();
    }

    @Override
    public final boolean c() {
        return this.a.b.c();
    }

    @Override
    public final void e(TLRPC.Document document, String str, Object obj, g47 g47Var, boolean z, boolean z2, int i, int i2) {
        this.a.b.f(i, obj, document, z2);
    }
}
