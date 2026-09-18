package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17136a;
    public final MessagesController f17137b;
    public final r f17138c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17136a = i10;
        this.f17137b = messagesController;
        this.f17138c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17136a) {
            case 0:
                this.f17137b.lambda$processUpdateArray$402(this.f17138c);
                return;
            case 1:
                this.f17137b.lambda$processUpdateArray$404(this.f17138c);
                return;
            default:
                this.f17137b.lambda$processUpdateArray$399(this.f17138c);
                return;
        }
    }
}
