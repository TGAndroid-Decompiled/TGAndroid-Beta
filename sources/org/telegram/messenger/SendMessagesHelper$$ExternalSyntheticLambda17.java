package org.telegram.messenger;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.tgnet.TLRPC;

public final class SendMessagesHelper$$ExternalSyntheticLambda17 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public SendMessagesHelper$$ExternalSyntheticLambda17(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((SendMessagesHelper) this.f$0).lambda$sendMessage$48((SendMessagesHelper.SendMessageParams) this.f$1, (Long) obj);
                break;
            case 1:
                ((BetaUpdaterController) this.f$0).lambda$checkForUpdate$2((Runnable) this.f$1, (String) obj);
                break;
            default:
                ChannelBoostsController.lambda$userCanBoostChannel$3((ChannelBoostsController.CanApplyBoost) this.f$0, (Consumer) this.f$1, (TLRPC.TL_error) obj);
                break;
        }
    }
}
