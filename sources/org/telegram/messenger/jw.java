package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jw implements Runnable {
    public final int f23619a;
    public final gz f23620b;
    public final TLRPC.Updates f23621c;

    public jw(gz gzVar, TLRPC.Updates updates, int i7) {
        this.f23619a = i7;
        this.f23620b = gzVar;
        this.f23621c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23619a) {
            case 0:
                this.f23620b.getMessagesController().O3(this.f23621c, false);
                return;
            default:
                this.f23620b.getMessagesController().O3(this.f23621c, false);
                return;
        }
    }
}
