package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda58 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final long f$1;
    public final Utilities.Callback2 f$2;

    public MessagesController$$ExternalSyntheticLambda58(MessagesController messagesController, long j, Utilities.Callback2 callback2, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$toggleCommunityParticipantBanned$248(this.f$1, this.f$2, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.f$0.lambda$resolveCommunityAllJoinPendingRequests$250(this.f$1, this.f$2, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.f$0.lambda$resolveCommunityJoinPendingRequest$249(this.f$1, this.f$2, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
