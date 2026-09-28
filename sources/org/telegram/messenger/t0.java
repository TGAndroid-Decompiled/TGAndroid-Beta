package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f17571a;
    public final Utilities.Callback f17572b;

    public t0(int i10, Utilities.Callback callback) {
        this.f17571a = i10;
        this.f17572b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17571a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.f17572b, tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$getChannelParticipant$472(this.f17572b, tLObject, tL_error);
                return;
        }
    }
}
