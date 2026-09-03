package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f18844a;
    public final Object f18845b;
    public final Object f18846c;

    public w(int i10, Object obj, Object obj2) {
        this.f18844a = i10;
        this.f18845b = obj;
        this.f18846c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18844a) {
            case 0:
                ((BetaUpdaterController) this.f18845b).lambda$checkForUpdate$2((Runnable) this.f18846c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f18845b, (h5.d) this.f18846c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f18845b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f18846c, (Long) obj);
                return;
        }
    }
}
