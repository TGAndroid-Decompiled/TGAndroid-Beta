package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17371a;
    public final MessagesController f17372b;
    public final r f17373c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17371a = i10;
        this.f17372b = messagesController;
        this.f17373c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17371a) {
            case 0:
                this.f17372b.lambda$processUpdateArray$402(this.f17373c);
                return;
            case 1:
                this.f17372b.lambda$processUpdateArray$404(this.f17373c);
                return;
            default:
                this.f17372b.lambda$processUpdateArray$399(this.f17373c);
                return;
        }
    }
}
