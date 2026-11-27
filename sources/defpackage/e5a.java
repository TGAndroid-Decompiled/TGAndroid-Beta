package defpackage;

import org.telegram.tgnet.TLRPC;
public final class e5a implements Runnable {
    public final byte a;
    public final r7a b;
    public final TLRPC.Updates c;
    public final TLRPC.Message d;
    public final boolean e;

    public e5a(r7a r7aVar, TLRPC.Updates updates, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = r7aVar;
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
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().Y3(updates, false);
                hl.c3(new s5a(r7aVar, message, z, (byte) 1));
                return;
            default:
                r7aVar.getMessagesController().Y3(updates, false);
                hl.c3(new s5a(r7aVar, message, z, (byte) 0));
                return;
        }
    }
}
