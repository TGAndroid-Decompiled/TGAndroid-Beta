package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sw implements Runnable {
    public final int f25530a;
    public final gz f25531b;
    public final TLRPC.Message f25532c;
    public final boolean d;

    public sw(gz gzVar, TLRPC.Message message, boolean z9, int i7) {
        this.f25530a = i7;
        this.f25531b = gzVar;
        this.f25532c = message;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f25530a) {
            case 0:
                gz gzVar = this.f25531b;
                gzVar.getClass();
                TLRPC.Message message = this.f25532c;
                gzVar.d0(message.f26981id);
                gzVar.i0(message.f26981id, this.d);
                return;
            case 1:
                gz gzVar2 = this.f25531b;
                gzVar2.getClass();
                TLRPC.Message message2 = this.f25532c;
                gzVar2.d0(message2.f26981id);
                gzVar2.i0(message2.f26981id, this.d);
                return;
            default:
                this.f25531b.g0(this.f25532c, this.d);
                return;
        }
    }
}
