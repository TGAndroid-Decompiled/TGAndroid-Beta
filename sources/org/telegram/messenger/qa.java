package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17357a;
    public final MessagesController f17358b;
    public final r f17359c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17357a = i10;
        this.f17358b = messagesController;
        this.f17359c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17357a) {
            case 0:
                this.f17358b.lambda$processUpdateArray$402(this.f17359c);
                return;
            case 1:
                this.f17358b.lambda$processUpdateArray$404(this.f17359c);
                return;
            default:
                this.f17358b.lambda$processUpdateArray$399(this.f17359c);
                return;
        }
    }
}
