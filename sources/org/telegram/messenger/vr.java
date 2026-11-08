package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vr {
    public final long f26207a;
    public final TLRPC.TL_messageReactions f26208b;
    public final TLRPC.TL_messageReactions f26209c;

    public vr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26207a = ij.R1(j3, message2);
        this.f26208b = message.reactions;
        this.f26209c = message2.reactions;
    }
}
