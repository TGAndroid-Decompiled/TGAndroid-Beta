package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l2 implements Runnable {
    public final int f9276a = 0;
    public final long f9277b;
    public final long f9278c;
    public final y10 d;
    public final Object f9279e;
    public final Object f9280f;
    public final Object h;

    public l2(f6 f6Var, y10 y10Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, long j10) {
        this.f9279e = f6Var;
        this.d = y10Var;
        this.f9280f = tL_error;
        this.h = tLObject;
        this.f9277b = j3;
        this.f9278c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.l2.run():void");
    }

    public l2(org.telegram.ui.Wallet.z0 z0Var, String str, org.telegram.ui.Wallet.r0 r0Var, long j3, long j10, y10 y10Var) {
        this.f9279e = z0Var;
        this.f9280f = str;
        this.h = r0Var;
        this.f9277b = j3;
        this.f9278c = j10;
        this.d = y10Var;
    }
}
