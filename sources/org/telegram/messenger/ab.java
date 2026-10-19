package org.telegram.messenger;

import zf.r;
public final class ab implements Runnable {
    public final int f17858a;
    public final MessagesController f17859b;
    public final r f17860c;

    public ab(MessagesController messagesController, r rVar, int i10) {
        this.f17858a = i10;
        this.f17859b = messagesController;
        this.f17860c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17858a) {
            case 0:
                this.f17859b.lambda$processUpdateArray$402(this.f17860c);
                return;
            case 1:
                this.f17859b.lambda$processUpdateArray$405(this.f17860c);
                return;
            default:
                this.f17859b.lambda$processUpdateArray$407(this.f17860c);
                return;
        }
    }
}
