package defpackage;

import org.telegram.tgnet.TLRPC;
public final class e3a implements Runnable {
    public final byte a;
    public final z3a b;
    public final TLRPC.Updates c;
    public final TLRPC.Message d;
    public final boolean e;

    public e3a(z3a z3aVar, TLRPC.Updates updates, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = z3aVar;
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
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().R3(updates, false);
                gl.c3(new s1a(z3aVar, message, z, (byte) 0));
                return;
            default:
                z3aVar.getMessagesController().R3(updates, false);
                gl.c3(new s1a(z3aVar, message, z, (byte) 1));
                return;
        }
    }
}
