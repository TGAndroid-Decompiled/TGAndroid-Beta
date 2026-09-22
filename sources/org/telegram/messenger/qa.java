package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17123a;
    public final MessagesController f17124b;
    public final r f17125c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17123a = i10;
        this.f17124b = messagesController;
        this.f17125c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17123a) {
            case 0:
                this.f17124b.lambda$processUpdateArray$402(this.f17125c);
                return;
            case 1:
                this.f17124b.lambda$processUpdateArray$404(this.f17125c);
                return;
            default:
                this.f17124b.lambda$processUpdateArray$399(this.f17125c);
                return;
        }
    }
}
