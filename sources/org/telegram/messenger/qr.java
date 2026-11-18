package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qr {
    public final long f26443a;
    public final TLRPC.TL_messageReactions f26444b;
    public final TLRPC.TL_messageReactions f26445c;

    public qr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26443a = fj.Q1(j3, message2);
        this.f26444b = message.reactions;
        this.f26445c = message2.reactions;
    }
}
