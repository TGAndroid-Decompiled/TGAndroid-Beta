package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f18964a;
    public final MessagesController f18965b;
    public final r f18966c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f18964a = i10;
        this.f18965b = messagesController;
        this.f18966c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18964a) {
            case 0:
                this.f18965b.lambda$processUpdateArray$402(this.f18966c);
                return;
            case 1:
                this.f18965b.lambda$processUpdateArray$404(this.f18966c);
                return;
            default:
                this.f18965b.lambda$processUpdateArray$399(this.f18966c);
                return;
        }
    }
}
