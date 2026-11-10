package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vr {
    public final long f26211a;
    public final TLRPC.TL_messageReactions f26212b;
    public final TLRPC.TL_messageReactions f26213c;

    public vr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26211a = ij.Q1(j3, message2);
        this.f26212b = message.reactions;
        this.f26213c = message2.reactions;
    }
}
