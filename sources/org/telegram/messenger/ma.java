package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ma implements Runnable {
    public final int f17855a;
    public final MessagesController f17856b;
    public final TLRPC.Updates f17857c;
    public final boolean d;

    public ma(MessagesController messagesController, TLRPC.Updates updates, boolean z10, int i10) {
        this.f17855a = i10;
        this.f17856b = messagesController;
        this.f17857c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17855a) {
            case 0:
                this.f17856b.lambda$processUpdates$378(this.f17857c, this.d);
                return;
            default:
                this.f17856b.lambda$processUpdates$377(this.f17857c, this.d);
                return;
        }
    }
}
