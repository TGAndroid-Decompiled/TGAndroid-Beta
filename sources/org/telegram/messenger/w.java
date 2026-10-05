package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19643a;
    public final Object f19644b;
    public final Object f19645c;

    public w(int i10, Object obj, Object obj2) {
        this.f19643a = i10;
        this.f19644b = obj;
        this.f19645c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19643a) {
            case 0:
                ((BetaUpdaterController) this.f19644b).lambda$checkForUpdate$2((Runnable) this.f19645c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19644b, (Utilities.Callback) this.f19645c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19644b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f19645c, (Long) obj);
                return;
        }
    }
}
