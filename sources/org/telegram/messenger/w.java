package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f20018a;
    public final Object f20019b;
    public final Object f20020c;

    public w(int i10, Object obj, Object obj2) {
        this.f20018a = i10;
        this.f20019b = obj;
        this.f20020c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20018a) {
            case 0:
                ((BetaUpdaterController) this.f20019b).lambda$checkForUpdate$2((Runnable) this.f20020c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f20019b, (Utilities.Callback) this.f20020c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f20019b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f20020c, (Long) obj);
                return;
        }
    }
}
