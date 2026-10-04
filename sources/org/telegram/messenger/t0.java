package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f19187a;
    public final Utilities.Callback f19188b;

    public t0(int i10, Utilities.Callback callback) {
        this.f19187a = i10;
        this.f19188b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19187a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.f19188b, tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$getChannelParticipant$472(this.f19188b, tLObject, tL_error);
                return;
        }
    }
}
