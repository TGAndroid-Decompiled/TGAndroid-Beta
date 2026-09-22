package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17726a;
    public final Object f17727b;
    public final Object f17728c;

    public v(int i10, Object obj, Object obj2) {
        this.f17726a = i10;
        this.f17727b = obj;
        this.f17728c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17726a) {
            case 0:
                ((BetaUpdaterController) this.f17727b).lambda$checkForUpdate$2((Runnable) this.f17728c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17727b, (e2.h) this.f17728c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17727b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17728c, (Long) obj);
                return;
        }
    }
}
