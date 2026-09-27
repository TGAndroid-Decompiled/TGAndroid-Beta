package org.telegram.messenger;

import yf.r;
public final class qa implements Runnable {
    public final int f17368a;
    public final MessagesController f17369b;
    public final r f17370c;

    public qa(MessagesController messagesController, r rVar, int i10) {
        this.f17368a = i10;
        this.f17369b = messagesController;
        this.f17370c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17368a) {
            case 0:
                this.f17369b.lambda$processUpdateArray$402(this.f17370c);
                return;
            case 1:
                this.f17369b.lambda$processUpdateArray$404(this.f17370c);
                return;
            default:
                this.f17369b.lambda$processUpdateArray$399(this.f17370c);
                return;
        }
    }
}
