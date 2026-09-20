package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17349a;
    public final MessagesController f17350b;
    public final r f17351c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17349a = i10;
        this.f17350b = messagesController;
        this.f17351c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17349a) {
            case 0:
                this.f17350b.lambda$processUpdateArray$402(this.f17351c);
                return;
            case 1:
                this.f17350b.lambda$processUpdateArray$404(this.f17351c);
                return;
            default:
                this.f17350b.lambda$processUpdateArray$399(this.f17351c);
                return;
        }
    }
}
