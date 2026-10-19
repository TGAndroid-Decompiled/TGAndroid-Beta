package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19938a;
    public final Object f19939b;
    public final Object f19940c;

    public w(int i10, Object obj, Object obj2) {
        this.f19938a = i10;
        this.f19939b = obj;
        this.f19940c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19938a) {
            case 0:
                ((BetaUpdaterController) this.f19939b).lambda$checkForUpdate$2((Runnable) this.f19940c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19939b, (Utilities.Callback) this.f19940c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19939b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19940c, (Long) obj);
                return;
        }
    }
}
