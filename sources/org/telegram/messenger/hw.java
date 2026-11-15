package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hw implements Runnable {
    public final int f24232a;
    public final ez f24233b;
    public final TLRPC.Updates f24234c;

    public hw(ez ezVar, TLRPC.Updates updates, int i7) {
        this.f24232a = i7;
        this.f24233b = ezVar;
        this.f24234c = updates;
    }

    @Override
    public final void run() {
        switch (this.f24232a) {
            case 0:
                this.f24233b.getMessagesController().O3(this.f24234c, false);
                return;
            default:
                this.f24233b.getMessagesController().O3(this.f24234c, false);
                return;
        }
    }
}
