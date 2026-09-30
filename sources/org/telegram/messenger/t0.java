package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f17572a;
    public final Utilities.Callback f17573b;

    public t0(int i10, Utilities.Callback callback) {
        this.f17572a = i10;
        this.f17573b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17572a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.f17573b, tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$getChannelParticipant$472(this.f17573b, tLObject, tL_error);
                return;
        }
    }
}
