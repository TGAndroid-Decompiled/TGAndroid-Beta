package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17364a;
    public final MessagesController f17365b;
    public final r f17366c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17364a = i10;
        this.f17365b = messagesController;
        this.f17366c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17364a) {
            case 0:
                this.f17365b.lambda$processUpdateArray$402(this.f17366c);
                return;
            case 1:
                this.f17365b.lambda$processUpdateArray$404(this.f17366c);
                return;
            default:
                this.f17365b.lambda$processUpdateArray$399(this.f17366c);
                return;
        }
    }
}
