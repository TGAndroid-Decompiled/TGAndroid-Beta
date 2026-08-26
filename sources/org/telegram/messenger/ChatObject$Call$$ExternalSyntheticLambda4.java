package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class ChatObject$Call$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ChatObject.Call f$0;
    public final TLObject f$1;

    public ChatObject$Call$$ExternalSyntheticLambda4(ChatObject.Call call, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = call;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$reloadGroupCall$8(this.f$1);
                break;
            default:
                this.f$0.lambda$loadGroupCall$10(this.f$1);
                break;
        }
    }
}
