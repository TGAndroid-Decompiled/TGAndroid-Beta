package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qr {
    public final long f26553a;
    public final TLRPC.TL_messageReactions f26554b;
    public final TLRPC.TL_messageReactions f26555c;

    public qr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.f26553a = fj.Q1(j3, message2);
        this.f26554b = message.reactions;
        this.f26555c = message2.reactions;
    }
}
