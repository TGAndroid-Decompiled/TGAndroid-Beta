package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tw implements Runnable {
    public final int f25685a;
    public final gz f25686b;
    public final TLRPC.Message f25687c;
    public final boolean d;

    public tw(gz gzVar, TLRPC.Message message, boolean z9, int i7) {
        this.f25685a = i7;
        this.f25686b = gzVar;
        this.f25687c = message;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f25685a) {
            case 0:
                gz gzVar = this.f25686b;
                gzVar.getClass();
                TLRPC.Message message = this.f25687c;
                gzVar.d0(message.f26974id);
                gzVar.i0(message.f26974id, this.d);
                return;
            case 1:
                gz gzVar2 = this.f25686b;
                gzVar2.getClass();
                TLRPC.Message message2 = this.f25687c;
                gzVar2.d0(message2.f26974id);
                gzVar2.i0(message2.f26974id, this.d);
                return;
            default:
                this.f25686b.g0(this.f25687c, this.d);
                return;
        }
    }
}
