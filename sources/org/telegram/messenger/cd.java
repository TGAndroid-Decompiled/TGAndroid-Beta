package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cd implements Utilities.Callback2 {
    public final int f18156a;
    public final MessagesController f18157b;
    public final long f18158c;
    public final Utilities.Callback2 d;

    public cd(MessagesController messagesController, long j10, Utilities.Callback2 callback2, int i10) {
        this.f18156a = i10;
        this.f18157b = messagesController;
        this.f18158c = j10;
        this.d = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18156a) {
            case 0:
                this.f18157b.lambda$resolveCommunityAllJoinPendingRequests$249(this.f18158c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f18157b.lambda$resolveCommunityJoinPendingRequest$248(this.f18158c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f18157b.lambda$toggleCommunityParticipantBanned$247(this.f18158c, this.d, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
