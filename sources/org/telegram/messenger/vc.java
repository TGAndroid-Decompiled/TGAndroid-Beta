package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback2 {
    public final int f17547a;
    public final MessagesController f17548b;
    public final long f17549c;
    public final Utilities.Callback2 d;

    public vc(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f17547a = i10;
        this.f17548b = messagesController;
        this.f17549c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17547a) {
            case 0:
                this.f17548b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f17549c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f17548b.lambda$resolveCommunityJoinPendingRequest$249(this.f17549c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f17548b.lambda$toggleCommunityParticipantBanned$248(this.f17549c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
