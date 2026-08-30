package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xc implements Utilities.Callback2 {
    public final int f18978a;
    public final MessagesController f18979b;
    public final long f18980c;
    public final Utilities.Callback2 d;

    public xc(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f18978a = i10;
        this.f18979b = messagesController;
        this.f18980c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18978a) {
            case 0:
                this.f18979b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f18980c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18979b.lambda$resolveCommunityJoinPendingRequest$249(this.f18980c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18979b.lambda$toggleCommunityParticipantBanned$248(this.f18980c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
