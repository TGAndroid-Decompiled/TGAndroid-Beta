package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w implements Utilities.Callback {
    public final int f19653a;
    public final Object f19654b;
    public final Object f19655c;

    public w(int i10, Object obj, Object obj2) {
        this.f19653a = i10;
        this.f19654b = obj;
        this.f19655c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19653a) {
            case 0:
                ((BetaUpdaterController) this.f19654b).lambda$checkForUpdate$2((Runnable) this.f19655c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19654b, (Utilities.Callback) this.f19655c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19654b).lambda$sendMessage$51((SendMessagesHelper.SendMessageParams) this.f19655c, (Long) obj);
                return;
        }
    }
}
