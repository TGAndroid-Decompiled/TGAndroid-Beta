package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17495a;
    public final Object f17496b;
    public final Object f17497c;

    public v(int i10, Object obj, Object obj2) {
        this.f17495a = i10;
        this.f17496b = obj;
        this.f17497c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17495a) {
            case 0:
                ((BetaUpdaterController) this.f17496b).lambda$checkForUpdate$2((Runnable) this.f17497c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17496b, (e2.h) this.f17497c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17496b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17497c, (Long) obj);
                return;
        }
    }
}
