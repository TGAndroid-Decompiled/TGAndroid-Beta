package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class es {
    public final long f15448a;
    public final TLRPC.TL_messageReactions f15449b;
    public final TLRPC.TL_messageReactions f15450c;

    public es(long j10, TLRPC.Message message, TLRPC.Message message2) {
        this.f15448a = jj.R1(j10, message2);
        this.f15449b = message.reactions;
        this.f15450c = message2.reactions;
    }
}
