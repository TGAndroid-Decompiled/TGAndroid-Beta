package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17711a;
    public final Object f17712b;
    public final Object f17713c;

    public v(int i10, Object obj, Object obj2) {
        this.f17711a = i10;
        this.f17712b = obj;
        this.f17713c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17711a) {
            case 0:
                ((BetaUpdaterController) this.f17712b).lambda$checkForUpdate$2((Runnable) this.f17713c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17712b, (e2.h) this.f17713c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17712b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17713c, (Long) obj);
                return;
        }
    }
}
