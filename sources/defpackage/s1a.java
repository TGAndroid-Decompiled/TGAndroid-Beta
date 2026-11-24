package defpackage;

import org.telegram.tgnet.TLRPC;
public final class s1a implements Runnable {
    public final byte a;
    public final z3a b;
    public final TLRPC.Message c;
    public final boolean d;

    public s1a(z3a z3aVar, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = message;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Message message = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.c0(message.id);
                z3aVar.h0(message.id, z);
                return;
            case 1:
                z3aVar.c0(message.id);
                z3aVar.h0(message.id, z);
                return;
            default:
                z3aVar.f0(message, z);
                return;
        }
    }
}
