package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback2 {
    public final int f19160a;
    public final MessagesController f19161b;
    public final long f19162c;
    public final Utilities.Callback2 d;

    public uc(MessagesController messagesController, long j3, Utilities.Callback2 callback2, int i10) {
        this.f19160a = i10;
        this.f19161b = messagesController;
        this.f19162c = j3;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19160a) {
            case 0:
                this.f19161b.lambda$resolveCommunityAllJoinPendingRequests$250(this.f19162c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19161b.lambda$resolveCommunityJoinPendingRequest$249(this.f19162c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19161b.lambda$toggleCommunityParticipantBanned$248(this.f19162c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
