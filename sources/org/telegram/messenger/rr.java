package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rr {
    public final long f26652a;
    public final TLRPC.TL_messageReactions f26653b;
    public final TLRPC.TL_messageReactions f26654c;

    public rr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26652a = gj.Q1(j3, message2);
        this.f26653b = message.reactions;
        this.f26654c = message2.reactions;
    }
}
