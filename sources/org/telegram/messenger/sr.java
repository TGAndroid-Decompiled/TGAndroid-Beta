package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sr {
    public final long f26565a;
    public final TLRPC.TL_messageReactions f26566b;
    public final TLRPC.TL_messageReactions f26567c;

    public sr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26565a = gj.Q1(j3, message2);
        this.f26566b = message.reactions;
        this.f26567c = message2.reactions;
    }
}
