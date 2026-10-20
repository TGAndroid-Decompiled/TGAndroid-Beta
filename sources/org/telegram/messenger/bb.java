package org.telegram.messenger;

import zf.r;
public final class bb implements Runnable {
    public final int f17945a;
    public final MessagesController f17946b;
    public final r f17947c;

    public bb(MessagesController messagesController, r rVar, int i10) {
        this.f17945a = i10;
        this.f17946b = messagesController;
        this.f17947c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f17945a) {
            case 0:
                this.f17946b.lambda$processUpdateArray$402(this.f17947c);
                return;
            case 1:
                this.f17946b.lambda$processUpdateArray$405(this.f17947c);
                return;
            default:
                this.f17946b.lambda$processUpdateArray$407(this.f17947c);
                return;
        }
    }
}
