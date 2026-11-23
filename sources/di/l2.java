package di;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l2 implements Runnable {
    public final int f9237a = 0;
    public final long f9238b;
    public final long f9239c;
    public final w10 d;
    public final Object f9240e;
    public final Object f9241f;
    public final Object h;

    public l2(f6 f6Var, w10 w10Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, long j10) {
        this.f9240e = f6Var;
        this.d = w10Var;
        this.f9241f = tL_error;
        this.h = tLObject;
        this.f9238b = j3;
        this.f9239c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.l2.run():void");
    }

    public l2(org.telegram.ui.Wallet.a1 a1Var, String str, org.telegram.ui.Wallet.s0 s0Var, long j3, long j10, w10 w10Var) {
        this.f9240e = a1Var;
        this.f9241f = str;
        this.h = s0Var;
        this.f9238b = j3;
        this.f9239c = j10;
        this.d = w10Var;
    }
}
