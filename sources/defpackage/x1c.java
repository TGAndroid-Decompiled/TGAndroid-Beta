package defpackage;

import org.telegram.tgnet.TLRPC;
public final class x1c implements r0b {
    public final d2c a;

    public x1c(d2c d2cVar) {
        this.a = d2cVar;
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
    public final void e(TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, boolean z2, int i, int i2) {
        this.a.b.f(i, obj, document, z2);
    }
}
