package org.telegram.messenger;

import yf.r;
public final class db implements Runnable {
    public final int f17397a;
    public final MessagesController f17398b;
    public final r f17399c;

    public db(MessagesController messagesController, r rVar, int i10) {
        this.f17397a = i10;
        this.f17398b = messagesController;
        this.f17399c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17397a) {
            case 0:
                this.f17398b.lambda$processUpdateArray$402(this.f17399c);
                return;
            case 1:
                this.f17398b.lambda$processUpdateArray$405(this.f17399c);
                return;
            default:
                this.f17398b.lambda$processUpdateArray$407(this.f17399c);
                return;
        }
    }
}
