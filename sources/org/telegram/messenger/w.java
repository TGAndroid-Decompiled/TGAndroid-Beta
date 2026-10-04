package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19638a;
    public final Object f19639b;
    public final Object f19640c;

    public w(int i10, Object obj, Object obj2) {
        this.f19638a = i10;
        this.f19639b = obj;
        this.f19640c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19638a) {
            case 0:
                ((BetaUpdaterController) this.f19639b).lambda$checkForUpdate$2((Runnable) this.f19640c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19639b, (Utilities.Callback) this.f19640c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19639b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f19640c, (Long) obj);
                return;
        }
    }
}
