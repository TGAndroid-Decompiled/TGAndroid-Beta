package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17497a;
    public final Object f17498b;
    public final Object f17499c;

    public v(int i10, Object obj, Object obj2) {
        this.f17497a = i10;
        this.f17498b = obj;
        this.f17499c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17497a) {
            case 0:
                ((BetaUpdaterController) this.f17498b).lambda$checkForUpdate$2((Runnable) this.f17499c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17498b, (e2.h) this.f17499c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17498b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17499c, (Long) obj);
                return;
        }
    }
}
