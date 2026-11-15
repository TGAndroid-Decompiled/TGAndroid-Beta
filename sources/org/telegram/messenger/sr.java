package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sr {
    public final long f26574a;
    public final TLRPC.TL_messageReactions f26575b;
    public final TLRPC.TL_messageReactions f26576c;

    public sr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26574a = gj.Q1(j3, message2);
        this.f26575b = message.reactions;
        this.f26576c = message2.reactions;
    }
}
