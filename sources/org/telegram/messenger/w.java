package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class w implements Utilities.Callback {

    public final int f22001a;

    public final Object f22002b;

    public final Object f22003c;

    public w(int i10, Object obj, Object obj2) {
        this.f22001a = i10;
        this.f22002b = obj;
        this.f22003c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22001a) {
            case 0:
                ((BetaUpdaterController) this.f22002b).lambda$checkForUpdate$2((Runnable) this.f22003c, (String) obj);
                break;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f22002b, (d5.d) this.f22003c, (TLRPC.TL_error) obj);
                break;
            default:
                ((SendMessagesHelper) this.f22002b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f22003c, (Long) obj);
                break;
        }
    }
}
