package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f4864a = 0;
    public final long f4865b;
    public final long f4866c;
    public final Utilities.Callback d;
    public final Object e;
    public final Object f4867f;
    public final Object h;

    public j3(long j10, long j11, h7 h7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.e = h7Var;
        this.d = callback;
        this.f4867f = tL_error;
        this.h = tLObject;
        this.f4865b = j10;
        this.f4866c = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.j3.run():void");
    }

    public j3(org.telegram.ui.Wallet.p0 p0Var, String str, org.telegram.ui.Wallet.i0 i0Var, long j10, long j11, Utilities.Callback callback) {
        this.e = p0Var;
        this.f4867f = str;
        this.h = i0Var;
        this.f4865b = j10;
        this.f4866c = j11;
        this.d = callback;
    }
}
