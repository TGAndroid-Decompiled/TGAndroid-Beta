package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17464a;
    public final Object f17465b;
    public final Object f17466c;

    public v(int i10, Object obj, Object obj2) {
        this.f17464a = i10;
        this.f17465b = obj;
        this.f17466c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17464a) {
            case 0:
                ((BetaUpdaterController) this.f17465b).lambda$checkForUpdate$2((Runnable) this.f17466c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17465b, (Utilities.Callback) this.f17466c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17465b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17466c, (Long) obj);
                return;
        }
    }
}
