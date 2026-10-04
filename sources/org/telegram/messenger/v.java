package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f19367a;
    public final Object f19368b;
    public final Object f19369c;

    public v(int i10, Object obj, Object obj2) {
        this.f19367a = i10;
        this.f19368b = obj;
        this.f19369c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19367a) {
            case 0:
                ((BetaUpdaterController) this.f19368b).lambda$checkForUpdate$2((Runnable) this.f19369c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19368b, (Utilities.Callback) this.f19369c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19368b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f19369c, (Long) obj);
                return;
        }
    }
}
