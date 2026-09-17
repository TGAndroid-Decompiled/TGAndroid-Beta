package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f19215a;
    public final Object f19216b;
    public final Object f19217c;

    public v(int i10, Object obj, Object obj2) {
        this.f19215a = i10;
        this.f19216b = obj;
        this.f19217c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19215a) {
            case 0:
                ((BetaUpdaterController) this.f19216b).lambda$checkForUpdate$2((Runnable) this.f19217c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19216b, (e2.h) this.f19217c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19216b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f19217c, (Long) obj);
                return;
        }
    }
}
