package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19929a;
    public final Object f19930b;
    public final Object f19931c;

    public w(int i10, Object obj, Object obj2) {
        this.f19929a = i10;
        this.f19930b = obj;
        this.f19931c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19929a) {
            case 0:
                ((BetaUpdaterController) this.f19930b).lambda$checkForUpdate$2((Runnable) this.f19931c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19930b, (Utilities.Callback) this.f19931c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19930b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19931c, (Long) obj);
                return;
        }
    }
}
