package defpackage;

import org.telegram.tgnet.TLRPC;
public final class gf7 {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public gf7(long j, TLRPC.Message message, TLRPC.Message message2) {
        this.a = r47.Q1(j, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
