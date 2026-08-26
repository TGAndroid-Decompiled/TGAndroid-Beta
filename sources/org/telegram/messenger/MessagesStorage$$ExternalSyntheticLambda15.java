package org.telegram.messenger;

import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;

public final class MessagesStorage$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final BaseController f$0;
    public final long f$1;
    public final long f$2;
    public final Object f$3;
    public final int f$4;

    public MessagesStorage$$ExternalSyntheticLambda15(BaseController baseController, long j, long j2, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = obj;
        this.f$4 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$loadPendingTasks$20(this.f$1, this.f$2, (TLMethod) this.f$3, this.f$4);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$loadBotInfo$199(this.f$1, this.f$2, (Utilities.Callback) this.f$3, this.f$4);
                break;
            default:
                ((MessagesController) this.f$0).lambda$loadFullChat$67(this.f$1, (TLRPC.TL_messages_chatFull) this.f$3, this.f$4, this.f$2);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda15(MessagesController messagesController, long j, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i, long j2) {
        this.$r8$classId = 2;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$3 = tL_messages_chatFull;
        this.f$4 = i;
        this.f$2 = j2;
    }
}
