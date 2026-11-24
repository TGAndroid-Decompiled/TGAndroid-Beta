package defpackage;

import org.telegram.tgnet.TLRPC;
public final class x0 implements p8c {
    public final byte a;
    public final Object b;
    public final Object c;

    public x0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void b(Object obj) {
        TLRPC.Message message = (TLRPC.Message) this.c;
        na7 messagesController = ((wt1) this.b).a.getMessagesController();
        long n = cf3.n(message.peer_id);
        messagesController.s(message.id, -1, n, (String) obj, true);
    }

    @Override
    public final void a(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0.a(java.lang.Object):void");
    }
}
