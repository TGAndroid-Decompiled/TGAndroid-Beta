package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f21977a;
    public final Object f21978b;
    public final Object f21979c;

    public w(int i9, Object obj, Object obj2) {
        this.f21977a = i9;
        this.f21978b = obj;
        this.f21979c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21977a) {
            case 0:
                ((BetaUpdaterController) this.f21978b).lambda$checkForUpdate$2((Runnable) this.f21979c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f21978b, (d5.d) this.f21979c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f21978b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f21979c, (Long) obj);
                return;
        }
    }
}
