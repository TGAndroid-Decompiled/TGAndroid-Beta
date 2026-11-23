package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mw implements Runnable {
    public final int f25649a;
    public final az f25650b;
    public final TLRPC.Message f25651c;
    public final boolean d;

    public mw(az azVar, TLRPC.Message message, boolean z10, int i7) {
        this.f25649a = i7;
        this.f25650b = azVar;
        this.f25651c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f25649a) {
            case 0:
                az azVar = this.f25650b;
                azVar.getClass();
                TLRPC.Message message = this.f25651c;
                azVar.d0(message.f28455id);
                azVar.i0(message.f28455id, this.d);
                return;
            case 1:
                az azVar2 = this.f25650b;
                azVar2.getClass();
                TLRPC.Message message2 = this.f25651c;
                azVar2.d0(message2.f28455id);
                azVar2.i0(message2.f28455id, this.d);
                return;
            default:
                this.f25650b.g0(this.f25651c, this.d);
                return;
        }
    }
}
