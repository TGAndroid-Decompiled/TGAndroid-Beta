package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ad implements Utilities.Callback2 {
    public final int f19620a;
    public final MessagesController f19621b;
    public final long f19622c;
    public final Utilities.Callback2 d;

    public ad(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f19620a = i10;
        this.f19621b = messagesController;
        this.f19622c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19620a) {
            case 0:
                this.f19621b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f19622c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19621b.lambda$resolveCommunityJoinPendingRequest$248(this.f19622c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19621b.lambda$toggleCommunityParticipantBanned$247(this.f19622c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
