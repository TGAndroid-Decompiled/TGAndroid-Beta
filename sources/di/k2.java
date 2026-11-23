package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k2 implements Runnable {
    public final int f9129a = 0;
    public final long f9130b;
    public final long f9131c;
    public final y10 d;
    public final Object f9132e;
    public final Object f9133f;
    public final Object h;

    public k2(f6 f6Var, y10 y10Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, long j10) {
        this.f9132e = f6Var;
        this.d = y10Var;
        this.f9133f = tL_error;
        this.h = tLObject;
        this.f9130b = j3;
        this.f9131c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.k2.run():void");
    }

    public k2(org.telegram.ui.Wallet.z0 z0Var, String str, org.telegram.ui.Wallet.r0 r0Var, long j3, long j10, y10 y10Var) {
        this.f9132e = z0Var;
        this.f9133f = str;
        this.h = r0Var;
        this.f9130b = j3;
        this.f9131c = j10;
        this.d = y10Var;
    }
}
