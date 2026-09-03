package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f20499a;
    public final Object f20500b;
    public final Object f20501c;

    public w(int i10, Object obj, Object obj2) {
        this.f20499a = i10;
        this.f20500b = obj;
        this.f20501c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20499a) {
            case 0:
                ((BetaUpdaterController) this.f20500b).lambda$checkForUpdate$2((Runnable) this.f20501c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f20500b, (h5.d) this.f20501c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f20500b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f20501c, (Long) obj);
                return;
        }
    }
}
