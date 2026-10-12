package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x implements Utilities.Callback {
    public final int f19510a;
    public final Object f19511b;
    public final Object f19512c;

    public x(int i10, Object obj, Object obj2) {
        this.f19510a = i10;
        this.f19511b = obj;
        this.f19512c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19510a) {
            case 0:
                ((BetaUpdaterController) this.f19511b).lambda$checkForUpdate$2((Runnable) this.f19512c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19511b, (Utilities.Callback) this.f19512c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19511b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19512c, (Long) obj);
                return;
        }
    }
}
