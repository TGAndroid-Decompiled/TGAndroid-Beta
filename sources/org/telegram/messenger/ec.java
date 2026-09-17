package org.telegram.messenger;
public final class ec implements Runnable {
    public final int f17585a;
    public final MessagesController f17586b;
    public final a0.i f17587c;

    public ec(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17585a = i10;
        this.f17586b = messagesController;
        this.f17587c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17585a) {
            case 0:
                this.f17586b.lambda$processUpdateArray$407(this.f17587c);
                return;
            case 1:
                this.f17586b.lambda$processUpdateArray$406(this.f17587c);
                return;
            default:
                this.f17586b.lambda$getChannelDifference$340(this.f17587c);
                return;
        }
    }
}
