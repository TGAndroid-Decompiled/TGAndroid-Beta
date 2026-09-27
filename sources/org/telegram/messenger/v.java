package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17714a;
    public final Object f17715b;
    public final Object f17716c;

    public v(int i10, Object obj, Object obj2) {
        this.f17714a = i10;
        this.f17715b = obj;
        this.f17716c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17714a) {
            case 0:
                ((BetaUpdaterController) this.f17715b).lambda$checkForUpdate$2((Runnable) this.f17716c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17715b, (Utilities.Callback) this.f17716c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17715b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17716c, (Long) obj);
                return;
        }
    }
}
