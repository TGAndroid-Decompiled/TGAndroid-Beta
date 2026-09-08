package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f18802a;
    public final MessagesController f18803b;
    public final r f18804c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f18802a = i10;
        this.f18803b = messagesController;
        this.f18804c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18802a) {
            case 0:
                this.f18803b.lambda$processUpdateArray$402(this.f18804c);
                return;
            case 1:
                this.f18803b.lambda$processUpdateArray$404(this.f18804c);
                return;
            default:
                this.f18803b.lambda$processUpdateArray$399(this.f18804c);
                return;
        }
    }
}
