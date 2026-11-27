package defpackage;

import org.telegram.tgnet.TLRPC;
public final class w5a implements Runnable {
    public final byte a;
    public final r7a b;
    public final TLRPC.Message c;
    public final int d;

    public w5a(r7a r7aVar, TLRPC.Message message, int i, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = message;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        TLRPC.Message message = this.c;
        r7a r7aVar = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                message.send_state = 2;
                r7aVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                r7aVar.c0(message.id);
                int i2 = message.id;
                if (i == 0) {
                    z = false;
                }
                r7aVar.h0(i2, z);
                return;
            default:
                message.send_state = 0;
                r7aVar.getNotificationCenter().k(20, Integer.valueOf(i));
                return;
        }
    }
}
