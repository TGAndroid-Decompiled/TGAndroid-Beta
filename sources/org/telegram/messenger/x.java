package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x implements Utilities.Callback {
    public final int f18961a;
    public final Object f18962b;
    public final Object f18963c;

    public x(int i10, Object obj, Object obj2) {
        this.f18961a = i10;
        this.f18962b = obj;
        this.f18963c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18961a) {
            case 0:
                ((BetaUpdaterController) this.f18962b).lambda$checkForUpdate$2((Runnable) this.f18963c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f18962b, (Utilities.Callback) this.f18963c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f18962b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f18963c, (Long) obj);
                return;
        }
    }
}
