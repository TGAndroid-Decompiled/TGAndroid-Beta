package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17119a;
    public final MessagesController f17120b;
    public final r f17121c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17119a = i10;
        this.f17120b = messagesController;
        this.f17121c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17119a) {
            case 0:
                this.f17120b.lambda$processUpdateArray$402(this.f17121c);
                return;
            case 1:
                this.f17120b.lambda$processUpdateArray$404(this.f17121c);
                return;
            default:
                this.f17120b.lambda$processUpdateArray$399(this.f17121c);
                return;
        }
    }
}
