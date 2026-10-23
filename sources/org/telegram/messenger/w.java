package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19953a;
    public final Object f19954b;
    public final Object f19955c;

    public w(int i10, Object obj, Object obj2) {
        this.f19953a = i10;
        this.f19954b = obj;
        this.f19955c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19953a) {
            case 0:
                ((BetaUpdaterController) this.f19954b).lambda$checkForUpdate$2((Runnable) this.f19955c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19954b, (Utilities.Callback) this.f19955c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19954b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19955c, (Long) obj);
                return;
        }
    }
}
