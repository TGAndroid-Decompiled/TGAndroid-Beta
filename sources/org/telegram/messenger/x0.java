package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x0 implements RequestDelegate {
    public final int f21787a;
    public final Utilities.Callback f21788b;

    public x0(int i10, Utilities.Callback callback) {
        this.f21787a = i10;
        this.f21788b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21787a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.f21788b, tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$getChannelParticipant$477(this.f21788b, tLObject, tL_error);
                return;
        }
    }
}
