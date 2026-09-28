package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17370a;
    public final MessagesController f17371b;
    public final r f17372c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17370a = i10;
        this.f17371b = messagesController;
        this.f17372c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17370a) {
            case 0:
                this.f17371b.lambda$processUpdateArray$402(this.f17372c);
                return;
            case 1:
                this.f17371b.lambda$processUpdateArray$404(this.f17372c);
                return;
            default:
                this.f17371b.lambda$processUpdateArray$399(this.f17372c);
                return;
        }
    }
}
