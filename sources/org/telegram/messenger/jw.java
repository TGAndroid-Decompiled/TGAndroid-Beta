package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jw implements Runnable {
    public final int f23615a;
    public final gz f23616b;
    public final TLRPC.Updates f23617c;

    public jw(gz gzVar, TLRPC.Updates updates, int i7) {
        this.f23615a = i7;
        this.f23616b = gzVar;
        this.f23617c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23615a) {
            case 0:
                this.f23616b.getMessagesController().O3(this.f23617c, false);
                return;
            default:
                this.f23616b.getMessagesController().O3(this.f23617c, false);
                return;
        }
    }
}
