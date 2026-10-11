package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f19202a;
    public final Utilities.Callback f19203b;

    public t0(int i10, Utilities.Callback callback) {
        this.f19202a = i10;
        this.f19203b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19202a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.f19203b, tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$getChannelParticipant$475(this.f19203b, tLObject, tL_error);
                return;
        }
    }
}
