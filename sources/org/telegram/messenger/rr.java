package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rr {
    public final long f26616a;
    public final TLRPC.TL_messageReactions f26617b;
    public final TLRPC.TL_messageReactions f26618c;

    public rr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26616a = gj.Q1(j3, message2);
        this.f26617b = message.reactions;
        this.f26618c = message2.reactions;
    }
}
