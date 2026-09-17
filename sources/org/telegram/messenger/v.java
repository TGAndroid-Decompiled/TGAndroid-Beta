package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17506a;
    public final Object f17507b;
    public final Object f17508c;

    public v(int i10, Object obj, Object obj2) {
        this.f17506a = i10;
        this.f17507b = obj;
        this.f17508c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17506a) {
            case 0:
                ((BetaUpdaterController) this.f17507b).lambda$checkForUpdate$2((Runnable) this.f17508c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17507b, (e2.h) this.f17508c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17507b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17508c, (Long) obj);
                return;
        }
    }
}
