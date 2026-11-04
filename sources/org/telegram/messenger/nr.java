package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nr {
    public final long f24427a;
    public final TLRPC.TL_messageReactions f24428b;
    public final TLRPC.TL_messageReactions f24429c;

    public nr(long j10, TLRPC.Message message, TLRPC.Message message2) {
        this.f24427a = zi.R1(j10, message2);
        this.f24428b = message.reactions;
        this.f24429c = message2.reactions;
    }
}
