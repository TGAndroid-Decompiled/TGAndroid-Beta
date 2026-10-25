package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bd implements Utilities.Callback2 {
    public final int f19707a;
    public final MessagesController f19708b;
    public final long f19709c;
    public final Utilities.Callback2 d;

    public bd(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f19707a = i10;
        this.f19708b = messagesController;
        this.f19709c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19707a) {
            case 0:
                this.f19708b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f19709c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19708b.lambda$resolveCommunityJoinPendingRequest$248(this.f19709c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19708b.lambda$toggleCommunityParticipantBanned$247(this.f19709c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
