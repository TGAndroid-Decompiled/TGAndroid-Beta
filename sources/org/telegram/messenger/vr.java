package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vr {
    public final long f26193a;
    public final TLRPC.TL_messageReactions f26194b;
    public final TLRPC.TL_messageReactions f26195c;

    public vr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26193a = ij.R1(j3, message2);
        this.f26194b = message.reactions;
        this.f26195c = message2.reactions;
    }
}
