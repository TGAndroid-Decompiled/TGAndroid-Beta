package defpackage;

import org.telegram.tgnet.TLRPC;
public final class g5a implements Runnable {
    public final byte a;
    public final a6a b;
    public final TLRPC.Updates c;
    public final TLRPC.Message d;
    public final boolean e;

    public g5a(a6a a6aVar, TLRPC.Updates updates, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = updates;
        this.d = message;
        this.e = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.e;
        TLRPC.Message message = this.d;
        TLRPC.Updates updates = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().T3(updates, false);
                gm.c3(new u3a(a6aVar, message, z, (byte) 0));
                return;
            default:
                a6aVar.getMessagesController().T3(updates, false);
                gm.c3(new u3a(a6aVar, message, z, (byte) 1));
                return;
        }
    }
}
