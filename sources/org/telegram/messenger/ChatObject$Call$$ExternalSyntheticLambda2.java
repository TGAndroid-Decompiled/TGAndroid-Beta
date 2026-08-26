package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChatObject$Call$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final ChatObject.Call f$0;

    public ChatObject$Call$$ExternalSyntheticLambda2(ChatObject.Call call, int i) {
        this.$r8$classId = i;
        this.f$0 = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$reloadGroupCall$9(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$loadGroupCall$11(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$setTitle$4(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$toggleRecord$13(tLObject, tL_error);
                break;
        }
    }
}
