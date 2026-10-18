package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19932a;
    public final Object f19933b;
    public final Object f19934c;

    public w(int i10, Object obj, Object obj2) {
        this.f19932a = i10;
        this.f19933b = obj;
        this.f19934c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19932a) {
            case 0:
                ((BetaUpdaterController) this.f19933b).lambda$checkForUpdate$2((Runnable) this.f19934c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19933b, (Utilities.Callback) this.f19934c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19933b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19934c, (Long) obj);
                return;
        }
    }
}
