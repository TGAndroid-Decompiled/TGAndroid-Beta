package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19682a;
    public final Object f19683b;
    public final Object f19684c;

    public w(int i10, Object obj, Object obj2) {
        this.f19682a = i10;
        this.f19683b = obj;
        this.f19684c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19682a) {
            case 0:
                ((BetaUpdaterController) this.f19683b).lambda$checkForUpdate$2((Runnable) this.f19684c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19683b, (Utilities.Callback) this.f19684c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19683b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19684c, (Long) obj);
                return;
        }
    }
}
