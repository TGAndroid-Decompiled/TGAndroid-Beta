package defpackage;

import org.telegram.tgnet.TLRPC;
public final class y3a implements Runnable {
    public final byte a;
    public final a6a b;
    public final TLRPC.Message c;
    public final int d;

    public y3a(a6a a6aVar, TLRPC.Message message, int i, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = message;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.d;
        TLRPC.Message message = this.c;
        a6a a6aVar = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                message.send_state = 2;
                a6aVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                a6aVar.c0(message.id);
                int i2 = message.id;
                if (i == 0) {
                    z = false;
                }
                a6aVar.h0(i2, z);
                return;
            default:
                message.send_state = 0;
                a6aVar.getNotificationCenter().k(20, Integer.valueOf(i));
                return;
        }
    }
}
