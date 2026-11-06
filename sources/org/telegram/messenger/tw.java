package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tw implements Runnable {
    public final int f25677a;
    public final gz f25678b;
    public final TLRPC.Message f25679c;
    public final boolean d;

    public tw(gz gzVar, TLRPC.Message message, boolean z9, int i7) {
        this.f25677a = i7;
        this.f25678b = gzVar;
        this.f25679c = message;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f25677a) {
            case 0:
                gz gzVar = this.f25678b;
                gzVar.getClass();
                TLRPC.Message message = this.f25679c;
                gzVar.d0(message.f26973id);
                gzVar.i0(message.f26973id, this.d);
                return;
            case 1:
                gz gzVar2 = this.f25678b;
                gzVar2.getClass();
                TLRPC.Message message2 = this.f25679c;
                gzVar2.d0(message2.f26973id);
                gzVar2.i0(message2.f26973id, this.d);
                return;
            default:
                this.f25678b.g0(this.f25679c, this.d);
                return;
        }
    }
}
