package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f19189a;
    public final Object f19190b;
    public final Object f19191c;

    public v(int i10, Object obj, Object obj2) {
        this.f19189a = i10;
        this.f19190b = obj;
        this.f19191c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19189a) {
            case 0:
                ((BetaUpdaterController) this.f19190b).lambda$checkForUpdate$2((Runnable) this.f19191c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19190b, (e2.h) this.f19191c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19190b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f19191c, (Long) obj);
                return;
        }
    }
}
