package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fs {
    public final long f15789a;
    public final TLRPC.TL_messageReactions f15790b;
    public final TLRPC.TL_messageReactions f15791c;

    public fs(long j10, TLRPC.Message message, TLRPC.Message message2) {
        this.f15789a = kj.R1(j10, message2);
        this.f15790b = message.reactions;
        this.f15791c = message2.reactions;
    }
}
