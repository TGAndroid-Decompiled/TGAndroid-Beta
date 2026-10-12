package org.telegram.messenger;

import yf.r;
public final class db implements Runnable {
    public final int f17398a;
    public final MessagesController f17399b;
    public final r f17400c;

    public db(MessagesController messagesController, r rVar, int i10) {
        this.f17398a = i10;
        this.f17399b = messagesController;
        this.f17400c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17398a) {
            case 0:
                this.f17399b.lambda$processUpdateArray$402(this.f17400c);
                return;
            case 1:
                this.f17399b.lambda$processUpdateArray$405(this.f17400c);
                return;
            default:
                this.f17399b.lambda$processUpdateArray$407(this.f17400c);
                return;
        }
    }
}
