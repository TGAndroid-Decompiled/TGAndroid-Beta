package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x implements Utilities.Callback {
    public final int f19511a;
    public final Object f19512b;
    public final Object f19513c;

    public x(int i10, Object obj, Object obj2) {
        this.f19511a = i10;
        this.f19512b = obj;
        this.f19513c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19511a) {
            case 0:
                ((BetaUpdaterController) this.f19512b).lambda$checkForUpdate$2((Runnable) this.f19513c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19512b, (Utilities.Callback) this.f19513c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19512b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19513c, (Long) obj);
                return;
        }
    }
}
