package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k2 implements Runnable {
    public final int f9138a = 0;
    public final long f9139b;
    public final long f9140c;
    public final x10 d;
    public final Object f9141e;
    public final Object f9142f;
    public final Object h;

    public k2(f6 f6Var, x10 x10Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, long j10) {
        this.f9141e = f6Var;
        this.d = x10Var;
        this.f9142f = tL_error;
        this.h = tLObject;
        this.f9139b = j3;
        this.f9140c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.k2.run():void");
    }

    public k2(org.telegram.ui.Wallet.z0 z0Var, String str, org.telegram.ui.Wallet.r0 r0Var, long j3, long j10, x10 x10Var) {
        this.f9141e = z0Var;
        this.f9142f = str;
        this.h = r0Var;
        this.f9139b = j3;
        this.f9140c = j10;
        this.d = x10Var;
    }
}
