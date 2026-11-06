package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kw implements Runnable {
    public final int f23779a;
    public final gz f23780b;
    public final TLRPC.Updates f23781c;

    public kw(gz gzVar, TLRPC.Updates updates, int i7) {
        this.f23779a = i7;
        this.f23780b = gzVar;
        this.f23781c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23779a) {
            case 0:
                this.f23780b.getMessagesController().O3(this.f23781c, false);
                return;
            default:
                this.f23780b.getMessagesController().O3(this.f23781c, false);
                return;
        }
    }
}
