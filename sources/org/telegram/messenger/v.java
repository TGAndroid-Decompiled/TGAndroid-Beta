package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f19216a;
    public final Object f19217b;
    public final Object f19218c;

    public v(int i10, Object obj, Object obj2) {
        this.f19216a = i10;
        this.f19217b = obj;
        this.f19218c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19216a) {
            case 0:
                ((BetaUpdaterController) this.f19217b).lambda$checkForUpdate$2((Runnable) this.f19218c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19217b, (e2.h) this.f19218c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19217b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f19218c, (Long) obj);
                return;
        }
    }
}
