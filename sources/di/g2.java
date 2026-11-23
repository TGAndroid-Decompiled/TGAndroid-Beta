package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g2 implements RequestDelegate {
    public final int f8848a = 1;
    public final f6 f8849b;
    public final long f8850c;
    public final long d;
    public final long f8851e;
    public final Object f8852f;

    public g2(f6 f6Var, long j3, long j10, y10 y10Var, long j11) {
        this.f8849b = f6Var;
        this.f8850c = j3;
        this.d = j10;
        this.f8852f = y10Var;
        this.f8851e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8848a) {
            case 0:
                org.telegram.messenger.g0.g3(new u2(this.f8849b, (org.telegram.ui.ActionBar.t1) this.f8852f, tLObject, this.f8850c, this.d, this.f8851e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new u2(this.f8849b, tLObject, this.f8850c, this.d, (y10) this.f8852f, tL_error, this.f8851e));
                return;
        }
    }

    public g2(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, long j3, long j10, long j11) {
        this.f8849b = f6Var;
        this.f8852f = t1Var;
        this.f8850c = j3;
        this.d = j10;
        this.f8851e = j11;
    }
}
