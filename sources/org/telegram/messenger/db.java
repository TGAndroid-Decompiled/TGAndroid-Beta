package org.telegram.messenger;

import zf.r;
public final class db implements Runnable {
    public final int f18186a;
    public final MessagesController f18187b;
    public final r f18188c;

    public db(MessagesController messagesController, r rVar, int i10) {
        this.f18186a = i10;
        this.f18187b = messagesController;
        this.f18188c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18186a) {
            case 0:
                this.f18187b.lambda$processUpdateArray$402(this.f18188c);
                return;
            case 1:
                this.f18187b.lambda$processUpdateArray$405(this.f18188c);
                return;
            default:
                this.f18187b.lambda$processUpdateArray$407(this.f18188c);
                return;
        }
    }
}
