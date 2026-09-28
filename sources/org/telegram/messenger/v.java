package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f17730a;
    public final Object f17731b;
    public final Object f17732c;

    public v(int i10, Object obj, Object obj2) {
        this.f17730a = i10;
        this.f17731b = obj;
        this.f17732c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17730a) {
            case 0:
                ((BetaUpdaterController) this.f17731b).lambda$checkForUpdate$2((Runnable) this.f17732c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f17731b, (Utilities.Callback) this.f17732c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f17731b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f17732c, (Long) obj);
                return;
        }
    }
}
