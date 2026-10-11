package org.telegram.messenger;

import yf.r;
public final class ab implements Runnable {
    public final int f17355a;
    public final MessagesController f17356b;
    public final r f17357c;

    public ab(MessagesController messagesController, r rVar, int i10) {
        this.f17355a = i10;
        this.f17356b = messagesController;
        this.f17357c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17355a) {
            case 0:
                this.f17356b.lambda$processUpdateArray$402(this.f17357c);
                return;
            case 1:
                this.f17356b.lambda$processUpdateArray$405(this.f17357c);
                return;
            default:
                this.f17356b.lambda$processUpdateArray$407(this.f17357c);
                return;
        }
    }
}
