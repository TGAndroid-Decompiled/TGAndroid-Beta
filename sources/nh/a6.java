package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ja0;
public final class a6 implements RequestDelegate {
    public final long f15073a;
    public final ja0 f15074b;
    public final t6 f15075c;

    public a6(t6 t6Var, long j10, ja0 ja0Var) {
        this.f15075c = t6Var;
        this.f15073a = j10;
        this.f15074b = ja0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new lh.c2(this, tLObject, this.f15073a, this.f15074b, 9));
    }
}
