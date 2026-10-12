package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dd implements Utilities.Callback2 {
    public final int f17407a;
    public final MessagesController f17408b;
    public final long f17409c;
    public final Utilities.Callback2 d;

    public dd(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f17407a = i10;
        this.f17408b = messagesController;
        this.f17409c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17407a) {
            case 0:
                this.f17408b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f17409c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17408b.lambda$resolveCommunityJoinPendingRequest$248(this.f17409c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17408b.lambda$toggleCommunityParticipantBanned$247(this.f17409c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
