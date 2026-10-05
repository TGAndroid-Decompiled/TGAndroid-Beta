package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f19195a;
    public final Utilities.Callback f19196b;

    public t0(int i10, Utilities.Callback callback) {
        this.f19195a = i10;
        this.f19196b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19195a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.f19196b, tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$getChannelParticipant$472(this.f19196b, tLObject, tL_error);
                return;
        }
    }
}
