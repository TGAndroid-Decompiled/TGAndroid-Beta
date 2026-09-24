package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17705a;
    public final Object f17706b;
    public final Object f17707c;

    public v(int i10, Object obj, Object obj2) {
        this.f17705a = i10;
        this.f17706b = obj;
        this.f17707c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17705a) {
            case 0:
                ((BetaUpdaterController) this.f17706b).lambda$checkForUpdate$2((Runnable) this.f17707c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17706b, (Utilities.Callback) this.f17707c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17706b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17707c, (Long) obj);
                return;
        }
    }
}
