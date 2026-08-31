package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f20497a;
    public final Object f20498b;
    public final Object f20499c;

    public w(int i10, Object obj, Object obj2) {
        this.f20497a = i10;
        this.f20498b = obj;
        this.f20499c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20497a) {
            case 0:
                ((BetaUpdaterController) this.f20498b).lambda$checkForUpdate$2((Runnable) this.f20499c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f20498b, (h5.d) this.f20499c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f20498b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f20499c, (Long) obj);
                return;
        }
    }
}
