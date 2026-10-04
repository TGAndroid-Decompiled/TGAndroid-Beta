package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f18965a;
    public final MessagesController f18966b;
    public final r f18967c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f18965a = i10;
        this.f18966b = messagesController;
        this.f18967c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18965a) {
            case 0:
                this.f18966b.lambda$processUpdateArray$402(this.f18967c);
                return;
            case 1:
                this.f18966b.lambda$processUpdateArray$404(this.f18967c);
                return;
            default:
                this.f18966b.lambda$processUpdateArray$399(this.f18967c);
                return;
        }
    }
}
