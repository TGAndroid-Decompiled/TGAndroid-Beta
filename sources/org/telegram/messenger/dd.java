package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dd implements Utilities.Callback2 {
    public final int f18236a;
    public final MessagesController f18237b;
    public final long f18238c;
    public final Utilities.Callback2 d;

    public dd(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f18236a = i10;
        this.f18237b = messagesController;
        this.f18238c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18236a) {
            case 0:
                this.f18237b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f18238c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18237b.lambda$resolveCommunityJoinPendingRequest$248(this.f18238c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18237b.lambda$toggleCommunityParticipantBanned$247(this.f18238c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
