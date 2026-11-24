package defpackage;

import org.telegram.tgnet.TLRPC;
public final class yz7 implements c5c {
    public final byte a;
    public final int b;
    public final rac c;
    public final nv0 d;
    public final d08 e;
    public final lac f;
    public final boolean h;
    public final boolean n;
    public final s34 r;

    public yz7(int i, rac racVar, nv0 nv0Var, d08 d08Var, lac lacVar, boolean z, boolean z2, s34 s34Var, byte b) {
        this.a = b;
        this.b = i;
        this.c = racVar;
        this.d = nv0Var;
        this.e = d08Var;
        this.f = lacVar;
        this.h = z;
        this.n = z2;
        this.r = s34Var;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                e08.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                return;
            default:
                e08.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                return;
        }
    }
}
