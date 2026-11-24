package defpackage;

import org.telegram.tgnet.TLRPC;
public final class u3a implements Runnable {
    public final byte a;
    public final a6a b;
    public final TLRPC.Message c;
    public final boolean d;

    public u3a(a6a a6aVar, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = message;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        TLRPC.Message message = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.c0(message.id);
                a6aVar.h0(message.id, z);
                return;
            case 1:
                a6aVar.c0(message.id);
                a6aVar.h0(message.id, z);
                return;
            default:
                a6aVar.f0(message, z);
                return;
        }
    }
}
