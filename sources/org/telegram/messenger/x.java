package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x implements Utilities.Callback {
    public final int f18935a;
    public final Object f18936b;
    public final Object f18937c;

    public x(int i10, Object obj, Object obj2) {
        this.f18935a = i10;
        this.f18936b = obj;
        this.f18937c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18935a) {
            case 0:
                ((BetaUpdaterController) this.f18936b).lambda$checkForUpdate$2((Runnable) this.f18937c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f18936b, (h5.d) this.f18937c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f18936b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f18937c, (Long) obj);
                return;
        }
    }
}
