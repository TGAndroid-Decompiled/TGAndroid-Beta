package org.telegram.messenger;

public final class ec implements Runnable {

    public final int f20141a;

    public final MessagesController f20142b;

    public final a0.h f20143c;

    public ec(MessagesController messagesController, a0.h hVar, int i10) {
        this.f20141a = i10;
        this.f20142b = messagesController;
        this.f20143c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20141a) {
            case 0:
                this.f20142b.lambda$processUpdateArray$407(this.f20143c);
                break;
            case 1:
                this.f20142b.lambda$processUpdateArray$406(this.f20143c);
                break;
            default:
                this.f20142b.lambda$getChannelDifference$340(this.f20143c);
                break;
        }
    }
}
