package defpackage;

import org.telegram.tgnet.TLRPC;
public final class k5a implements Runnable {
    public final byte a;
    public final r7a b;
    public final TLRPC.Updates c;

    public k5a(r7a r7aVar, TLRPC.Updates updates, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = updates;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Updates updates = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().Y3(updates, false);
                return;
            default:
                r7aVar.getMessagesController().Y3(updates, false);
                return;
        }
    }
}
