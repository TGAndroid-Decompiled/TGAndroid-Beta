package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qw implements Runnable {
    public final int f26516a;
    public final az f26517b;
    public final TLRPC.Message f26518c;
    public final int d;

    public qw(az azVar, TLRPC.Message message, int i7, int i10) {
        this.f26516a = i10;
        this.f26517b = azVar;
        this.f26518c = message;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f26516a;
        int i10 = this.d;
        TLRPC.Message message = this.f26518c;
        az azVar = this.f26517b;
        boolean z10 = true;
        switch (i7) {
            case 0:
                message.send_state = 2;
                azVar.getNotificationCenter().k(23, Integer.valueOf(message.f28455id));
                azVar.d0(message.f28455id);
                int i11 = message.f28455id;
                if (i10 == 0) {
                    z10 = false;
                }
                azVar.i0(i11, z10);
                return;
            default:
                message.send_state = 0;
                azVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                return;
        }
    }
}
