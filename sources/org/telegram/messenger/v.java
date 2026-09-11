package org.telegram.messenger;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v implements Utilities.Callback {
    public final int f19188a;
    public final Object f19189b;
    public final Object f19190c;

    public v(int i10, Object obj, Object obj2) {
        this.f19188a = i10;
        this.f19189b = obj;
        this.f19190c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19188a) {
            case 0:
                ((BetaUpdaterController) this.f19189b).lambda$checkForUpdate$2((Runnable) this.f19190c, (String) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f19189b, (e2.h) this.f19190c, (TLRPC.TL_error) obj);
                return;
            default:
                ((SendMessagesHelper) this.f19189b).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f19190c, (Long) obj);
                return;
        }
    }
}
