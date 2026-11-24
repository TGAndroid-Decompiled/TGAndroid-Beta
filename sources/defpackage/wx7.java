package defpackage;

import org.telegram.tgnet.TLRPC;
public final class wx7 implements b3c {
    public final byte a;
    public final int b;
    public final q8c c;
    public final eu0 d;
    public final by7 e;
    public final k8c f;
    public final boolean h;
    public final boolean n;
    public final h24 r;

    public wx7(int i, q8c q8cVar, eu0 eu0Var, by7 by7Var, k8c k8cVar, boolean z, boolean z2, h24 h24Var, byte b) {
        this.a = b;
        this.b = i;
        this.c = q8cVar;
        this.d = eu0Var;
        this.e = by7Var;
        this.f = k8cVar;
        this.h = z;
        this.n = z2;
        this.r = h24Var;
    }

    @Override
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                cy7.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                return;
            default:
                cy7.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                return;
        }
    }
}
