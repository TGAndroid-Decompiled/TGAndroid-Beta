package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback2 {
    public final int f19234a;
    public final MessagesController f19235b;
    public final long f19236c;
    public final Utilities.Callback2 d;

    public vc(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f19234a = i10;
        this.f19235b = messagesController;
        this.f19236c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19234a) {
            case 0:
                this.f19235b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f19236c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19235b.lambda$resolveCommunityJoinPendingRequest$249(this.f19236c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19235b.lambda$toggleCommunityParticipantBanned$248(this.f19236c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
