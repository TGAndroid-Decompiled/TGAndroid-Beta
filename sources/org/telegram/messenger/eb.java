package org.telegram.messenger;

import zf.r;
public final class eb implements Runnable {
    public final int f18259a;
    public final MessagesController f18260b;
    public final r f18261c;

    public eb(MessagesController messagesController, r rVar, int i10) {
        this.f18259a = i10;
        this.f18260b = messagesController;
        this.f18261c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18259a) {
            case 0:
                this.f18260b.lambda$processUpdateArray$402(this.f18261c);
                return;
            case 1:
                this.f18260b.lambda$processUpdateArray$405(this.f18261c);
                return;
            default:
                this.f18260b.lambda$processUpdateArray$407(this.f18261c);
                return;
        }
    }
}
