package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f19366a;
    public final Object f19367b;
    public final Object f19368c;

    public v(int i10, Object obj, Object obj2) {
        this.f19366a = i10;
        this.f19367b = obj;
        this.f19368c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19366a) {
            case 0:
                ((BetaUpdaterController) this.f19367b).lambda$checkForUpdate$2((Runnable) this.f19368c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19367b, (Utilities.Callback) this.f19368c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19367b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f19368c, (Long) obj);
                return;
        }
    }
}
