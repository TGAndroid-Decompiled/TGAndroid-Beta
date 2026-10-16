package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f18582a;
    public final Object f18583b;
    public final Object f18584c;

    public w(int i10, Object obj, Object obj2) {
        this.f18582a = i10;
        this.f18583b = obj;
        this.f18584c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18582a) {
            case 0:
                ((BetaUpdaterController) this.f18583b).lambda$checkForUpdate$2((Runnable) this.f18584c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f18583b, (Utilities.Callback) this.f18584c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f18583b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f18584c, (Long) obj);
                return;
        }
    }
}
