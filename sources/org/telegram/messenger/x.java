package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x implements Utilities.Callback {
    public final int f20027a;
    public final Object f20028b;
    public final Object f20029c;

    public x(int i10, Object obj, Object obj2) {
        this.f20027a = i10;
        this.f20028b = obj;
        this.f20029c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20027a) {
            case 0:
                ((BetaUpdaterController) this.f20028b).lambda$checkForUpdate$2((Runnable) this.f20029c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f20028b, (Utilities.Callback) this.f20029c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f20028b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f20029c, (Long) obj);
                return;
        }
    }
}
