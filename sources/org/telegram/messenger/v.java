package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17731a;
    public final Object f17732b;
    public final Object f17733c;

    public v(int i10, Object obj, Object obj2) {
        this.f17731a = i10;
        this.f17732b = obj;
        this.f17733c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17731a) {
            case 0:
                ((BetaUpdaterController) this.f17732b).lambda$checkForUpdate$2((Runnable) this.f17733c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17732b, (Utilities.Callback) this.f17733c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17732b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17733c, (Long) obj);
                return;
        }
    }
}
