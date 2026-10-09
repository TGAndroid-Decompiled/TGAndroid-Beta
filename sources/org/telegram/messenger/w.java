package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19649a;
    public final Object f19650b;
    public final Object f19651c;

    public w(int i10, Object obj, Object obj2) {
        this.f19649a = i10;
        this.f19650b = obj;
        this.f19651c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19649a) {
            case 0:
                ((BetaUpdaterController) this.f19650b).lambda$checkForUpdate$2((Runnable) this.f19651c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19650b, (Utilities.Callback) this.f19651c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19650b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19651c, (Long) obj);
                return;
        }
    }
}
