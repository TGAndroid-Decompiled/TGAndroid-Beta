package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f22040a;
    public final Object f22041b;
    public final Object f22042c;

    public w(int i10, Object obj, Object obj2) {
        this.f22040a = i10;
        this.f22041b = obj;
        this.f22042c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22040a) {
            case 0:
                ((BetaUpdaterController) this.f22041b).lambda$checkForUpdate$2((Runnable) this.f22042c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f22041b, (f5.d) this.f22042c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f22041b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f22042c, (Long) obj);
                return;
        }
    }
}
