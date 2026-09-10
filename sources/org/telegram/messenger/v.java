package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f16546a;
    public final Object f16547b;
    public final Object f16548c;

    public v(int i10, Object obj, Object obj2) {
        this.f16546a = i10;
        this.f16547b = obj;
        this.f16548c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16546a) {
            case 0:
                ((BetaUpdaterController) this.f16547b).lambda$checkForUpdate$2((Runnable) this.f16548c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f16547b, (e2.h) this.f16548c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f16547b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f16548c, (Long) obj);
                return;
        }
    }
}
