package defpackage;

import org.telegram.tgnet.TLRPC;
public final class n3a implements Runnable {
    public final byte a;
    public final a6a b;
    public final TLRPC.Updates c;

    public n3a(a6a a6aVar, TLRPC.Updates updates, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = updates;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Updates updates = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().T3(updates, false);
                return;
            default:
                a6aVar.getMessagesController().T3(updates, false);
                return;
        }
    }
}
