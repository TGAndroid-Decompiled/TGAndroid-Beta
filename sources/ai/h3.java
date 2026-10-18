package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h3 implements Runnable {
    public final int f1403a = 0;
    public final long f1404b;
    public final long f1405c;
    public final Utilities.Callback d;
    public final Object e;
    public final Object f1406f;
    public final Object h;

    public h3(long j10, long j11, k7 k7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.e = k7Var;
        this.d = callback;
        this.f1406f = tL_error;
        this.h = tLObject;
        this.f1404b = j10;
        this.f1405c = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h3.run():void");
    }

    public h3(org.telegram.ui.Wallet.q0 q0Var, String str, org.telegram.ui.Wallet.j0 j0Var, long j10, long j11, Utilities.Callback callback) {
        this.e = q0Var;
        this.f1406f = str;
        this.h = j0Var;
        this.f1404b = j10;
        this.f1405c = j11;
        this.d = callback;
    }
}
