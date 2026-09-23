package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s0 implements RequestDelegate {
    public final int f17250a;
    public final Utilities.Callback f17251b;

    public s0(int i10, Utilities.Callback callback) {
        this.f17250a = i10;
        this.f17251b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17250a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.f17251b, tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$getChannelParticipant$472(this.f17251b, tLObject, tL_error);
                return;
        }
    }
}
