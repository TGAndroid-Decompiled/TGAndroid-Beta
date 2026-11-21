package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qr {
    public final long f26469a;
    public final TLRPC.TL_messageReactions f26470b;
    public final TLRPC.TL_messageReactions f26471c;

    public qr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26469a = fj.Q1(j3, message2);
        this.f26470b = message.reactions;
        this.f26471c = message2.reactions;
    }
}
