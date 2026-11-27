package defpackage;

import org.telegram.tgnet.TLRPC;
public final class s5a implements Runnable {
    public final byte a;
    public final r7a b;
    public final TLRPC.Message c;
    public final boolean d;

    public s5a(r7a r7aVar, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = message;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Message message = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.c0(message.id);
                r7aVar.h0(message.id, z);
                return;
            case 1:
                r7aVar.c0(message.id);
                r7aVar.h0(message.id, z);
                return;
            default:
                r7aVar.f0(message, z);
                return;
        }
    }
}
