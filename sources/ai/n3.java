package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f1870a = 0;
    public final long f1871b;
    public final long f1872c;
    public final Utilities.Callback d;
    public final Object e;
    public final Object f1873f;
    public final Object h;

    public n3(long j10, long j11, l7 l7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.e = l7Var;
        this.d = callback;
        this.f1873f = tL_error;
        this.h = tLObject;
        this.f1871b = j10;
        this.f1872c = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.n3.run():void");
    }

    public n3(org.telegram.ui.Wallet.q0 q0Var, String str, org.telegram.ui.Wallet.j0 j0Var, long j10, long j11, Utilities.Callback callback) {
        this.e = q0Var;
        this.f1873f = str;
        this.h = j0Var;
        this.f1871b = j10;
        this.f1872c = j11;
        this.d = callback;
    }
}
