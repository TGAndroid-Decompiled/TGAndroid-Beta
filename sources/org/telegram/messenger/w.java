package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19950a;
    public final Object f19951b;
    public final Object f19952c;

    public w(int i10, Object obj, Object obj2) {
        this.f19950a = i10;
        this.f19951b = obj;
        this.f19952c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19950a) {
            case 0:
                ((BetaUpdaterController) this.f19951b).lambda$checkForUpdate$2((Runnable) this.f19952c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19951b, (Utilities.Callback) this.f19952c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19951b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19952c, (Long) obj);
                return;
        }
    }
}
