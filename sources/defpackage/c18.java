package defpackage;

import org.telegram.tgnet.TLRPC;
public final class c18 implements b7c {
    public final byte a;
    public final int b;
    public final qcc c;
    public final nu0 d;
    public final h18 e;
    public final kcc f;
    public final boolean h;
    public final boolean n;
    public final c34 r;

    public c18(int i, qcc qccVar, nu0 nu0Var, h18 h18Var, kcc kccVar, boolean z, boolean z2, c34 c34Var, byte b) {
        this.a = b;
        this.b = i;
        this.c = qccVar;
        this.d = nu0Var;
        this.e = h18Var;
        this.f = kccVar;
        this.h = z;
        this.n = z2;
        this.r = c34Var;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                i18.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                return;
            default:
                i18.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                return;
        }
    }
}
