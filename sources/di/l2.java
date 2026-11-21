package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l2 implements Runnable {
    public final int f9273a = 0;
    public final long f9274b;
    public final long f9275c;
    public final x10 d;
    public final Object f9276e;
    public final Object f9277f;
    public final Object h;

    public l2(f6 f6Var, x10 x10Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, long j10) {
        this.f9276e = f6Var;
        this.d = x10Var;
        this.f9277f = tL_error;
        this.h = tLObject;
        this.f9274b = j3;
        this.f9275c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.l2.run():void");
    }

    public l2(org.telegram.ui.Wallet.z0 z0Var, String str, org.telegram.ui.Wallet.r0 r0Var, long j3, long j10, x10 x10Var) {
        this.f9276e = z0Var;
        this.f9277f = str;
        this.h = r0Var;
        this.f9274b = j3;
        this.f9275c = j10;
        this.d = x10Var;
    }
}
