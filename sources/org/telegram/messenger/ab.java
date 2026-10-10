package org.telegram.messenger;

import yf.r;
public final class ab implements Runnable {
    public final int f17324a;
    public final MessagesController f17325b;
    public final r f17326c;

    public ab(MessagesController messagesController, r rVar, int i10) {
        this.f17324a = i10;
        this.f17325b = messagesController;
        this.f17326c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17324a) {
            case 0:
                this.f17325b.lambda$processUpdateArray$402(this.f17326c);
                return;
            case 1:
                this.f17325b.lambda$processUpdateArray$405(this.f17326c);
                return;
            default:
                this.f17325b.lambda$processUpdateArray$407(this.f17326c);
                return;
        }
    }
}
