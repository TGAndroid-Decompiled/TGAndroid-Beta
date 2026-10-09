package org.telegram.messenger;

import yf.r;
public final class ab implements Runnable {
    public final int f17320a;
    public final MessagesController f17321b;
    public final r f17322c;

    public ab(MessagesController messagesController, r rVar, int i10) {
        this.f17320a = i10;
        this.f17321b = messagesController;
        this.f17322c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17320a) {
            case 0:
                this.f17321b.lambda$processUpdateArray$402(this.f17322c);
                return;
            case 1:
                this.f17321b.lambda$processUpdateArray$405(this.f17322c);
                return;
            default:
                this.f17321b.lambda$processUpdateArray$407(this.f17322c);
                return;
        }
    }
}
