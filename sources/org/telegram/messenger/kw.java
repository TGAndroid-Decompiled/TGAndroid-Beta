package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kw implements Runnable {
    public final int f23786a;
    public final gz f23787b;
    public final TLRPC.Updates f23788c;

    public kw(gz gzVar, TLRPC.Updates updates, int i7) {
        this.f23786a = i7;
        this.f23787b = gzVar;
        this.f23788c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23786a) {
            case 0:
                this.f23787b.getMessagesController().O3(this.f23788c, false);
                return;
            default:
                this.f23787b.getMessagesController().O3(this.f23788c, false);
                return;
        }
    }
}
