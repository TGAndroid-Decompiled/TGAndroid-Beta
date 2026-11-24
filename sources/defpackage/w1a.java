package defpackage;

import org.telegram.tgnet.TLRPC;
public final class w1a implements Runnable {
    public final byte a;
    public final z3a b;
    public final TLRPC.Message c;
    public final int d;

    public w1a(z3a z3aVar, TLRPC.Message message, int i, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = message;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        TLRPC.Message message = this.c;
        z3a z3aVar = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                message.send_state = 2;
                z3aVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                z3aVar.c0(message.id);
                int i2 = message.id;
                if (i == 0) {
                    z = false;
                }
                z3aVar.h0(i2, z);
                return;
            default:
                message.send_state = 0;
                z3aVar.getNotificationCenter().k(20, Integer.valueOf(i));
                return;
        }
    }
}
