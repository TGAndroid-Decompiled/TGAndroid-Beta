package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback2 {
    public final int f17771a;
    public final MessagesController f17772b;
    public final long f17773c;
    public final Utilities.Callback2 d;

    public vc(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f17771a = i10;
        this.f17772b = messagesController;
        this.f17773c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17771a) {
            case 0:
                this.f17772b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f17773c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17772b.lambda$resolveCommunityJoinPendingRequest$249(this.f17773c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17772b.lambda$toggleCommunityParticipantBanned$248(this.f17773c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
