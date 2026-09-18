package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f17917a;
    public final Object f17918b;
    public final Object f17919c;

    public w(int i10, Object obj, Object obj2) {
        this.f17917a = i10;
        this.f17918b = obj;
        this.f17919c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17917a) {
            case 0:
                ((BetaUpdaterController) this.f17918b).lambda$checkForUpdate$2((Runnable) this.f17919c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17918b, (e2.h) this.f17919c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17918b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17919c, (Long) obj);
                return;
        }
    }
}
