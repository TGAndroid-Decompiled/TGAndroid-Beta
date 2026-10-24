package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f20013a;
    public final Object f20014b;
    public final Object f20015c;

    public w(int i10, Object obj, Object obj2) {
        this.f20013a = i10;
        this.f20014b = obj;
        this.f20015c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20013a) {
            case 0:
                ((BetaUpdaterController) this.f20014b).lambda$checkForUpdate$2((Runnable) this.f20015c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f20014b, (Utilities.Callback) this.f20015c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f20014b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f20015c, (Long) obj);
                return;
        }
    }
}
