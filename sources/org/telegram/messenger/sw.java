package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sw implements Runnable {
    public final int f25526a;
    public final gz f25527b;
    public final TLRPC.Message f25528c;
    public final boolean d;

    public sw(gz gzVar, TLRPC.Message message, boolean z9, int i7) {
        this.f25526a = i7;
        this.f25527b = gzVar;
        this.f25528c = message;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f25526a) {
            case 0:
                gz gzVar = this.f25527b;
                gzVar.getClass();
                TLRPC.Message message = this.f25528c;
                gzVar.d0(message.f26977id);
                gzVar.i0(message.f26977id, this.d);
                return;
            case 1:
                gz gzVar2 = this.f25527b;
                gzVar2.getClass();
                TLRPC.Message message2 = this.f25528c;
                gzVar2.d0(message2.f26977id);
                gzVar2.i0(message2.f26977id, this.d);
                return;
            default:
                this.f25527b.g0(this.f25528c, this.d);
                return;
        }
    }
}
