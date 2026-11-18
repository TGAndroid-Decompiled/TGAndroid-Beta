package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qr {
    public final long f26441a;
    public final TLRPC.TL_messageReactions f26442b;
    public final TLRPC.TL_messageReactions f26443c;

    public qr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26441a = fj.Q1(j3, message2);
        this.f26442b = message.reactions;
        this.f26443c = message2.reactions;
    }
}
