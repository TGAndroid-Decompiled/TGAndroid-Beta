package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f17553a;
    public final Utilities.Callback f17554b;

    public t0(int i10, Utilities.Callback callback) {
        this.f17553a = i10;
        this.f17554b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17553a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.f17554b, tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$getChannelParticipant$472(this.f17554b, tLObject, tL_error);
                return;
        }
    }
}
