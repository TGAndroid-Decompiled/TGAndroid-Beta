package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vr {
    public final long f26201a;
    public final TLRPC.TL_messageReactions f26202b;
    public final TLRPC.TL_messageReactions f26203c;

    public vr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26201a = ij.R1(j3, message2);
        this.f26202b = message.reactions;
        this.f26203c = message2.reactions;
    }
}
