package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17720a;
    public final Object f17721b;
    public final Object f17722c;

    public v(int i10, Object obj, Object obj2) {
        this.f17720a = i10;
        this.f17721b = obj;
        this.f17722c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17720a) {
            case 0:
                ((BetaUpdaterController) this.f17721b).lambda$checkForUpdate$2((Runnable) this.f17722c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17721b, (Utilities.Callback) this.f17722c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17721b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17722c, (Long) obj);
                return;
        }
    }
}
