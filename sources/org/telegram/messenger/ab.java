package org.telegram.messenger;

import yf.r;
public final class ab implements Runnable {
    public final int f17319a;
    public final MessagesController f17320b;
    public final r f17321c;

    public ab(MessagesController messagesController, r rVar, int i10) {
        this.f17319a = i10;
        this.f17320b = messagesController;
        this.f17321c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17319a) {
            case 0:
                this.f17320b.lambda$processUpdateArray$402(this.f17321c);
                return;
            case 1:
                this.f17320b.lambda$processUpdateArray$405(this.f17321c);
                return;
            default:
                this.f17320b.lambda$processUpdateArray$407(this.f17321c);
                return;
        }
    }
}
