package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v0 implements RequestDelegate {
    public final int f19723a;
    public final Utilities.Callback f19724b;

    public v0(int i10, Utilities.Callback callback) {
        this.f19723a = i10;
        this.f19724b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19723a) {
            case 0:
                ChannelBoostsController.lambda$getBoostsStats$1(this.f19724b, tLObject, tL_error);
                return;
            default:
                MessagesController.lambda$getChannelParticipant$475(this.f19724b, tLObject, tL_error);
                return;
        }
    }
}
