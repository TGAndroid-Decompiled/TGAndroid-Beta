package defpackage;

import org.telegram.tgnet.TLRPC;
public final class l1a implements Runnable {
    public final byte a;
    public final z3a b;
    public final TLRPC.Updates c;

    public l1a(z3a z3aVar, TLRPC.Updates updates, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = updates;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Updates updates = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().Q3(updates, false);
                return;
            default:
                z3aVar.getMessagesController().Q3(updates, false);
                return;
        }
    }
}
