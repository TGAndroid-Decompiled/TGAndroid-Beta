package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dd implements Utilities.Callback2 {
    public final int f17076a;
    public final MessagesController f17077b;
    public final long f17078c;
    public final Utilities.Callback2 d;

    public dd(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f17076a = i10;
        this.f17077b = messagesController;
        this.f17078c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17076a) {
            case 0:
                this.f17077b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f17078c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17077b.lambda$resolveCommunityJoinPendingRequest$248(this.f17078c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17077b.lambda$toggleCommunityParticipantBanned$247(this.f17078c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
