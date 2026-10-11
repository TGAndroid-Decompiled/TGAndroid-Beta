package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19646a;
    public final Object f19647b;
    public final Object f19648c;

    public w(int i10, Object obj, Object obj2) {
        this.f19646a = i10;
        this.f19647b = obj;
        this.f19648c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19646a) {
            case 0:
                ((BetaUpdaterController) this.f19647b).lambda$checkForUpdate$2((Runnable) this.f19648c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19647b, (Utilities.Callback) this.f19648c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19647b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19648c, (Long) obj);
                return;
        }
    }
}
