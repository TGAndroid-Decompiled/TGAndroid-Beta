package org.telegram.messenger;
public final class hc implements Runnable {
    public final int f17376a;
    public final MessagesController f17377b;
    public final a0.h f17378c;

    public hc(MessagesController messagesController, a0.h hVar, int i10) {
        this.f17376a = i10;
        this.f17377b = messagesController;
        this.f17378c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f17376a) {
            case 0:
                this.f17377b.lambda$processUpdateArray$407(this.f17378c);
                return;
            case 1:
                this.f17377b.lambda$processUpdateArray$406(this.f17378c);
                return;
            default:
                this.f17377b.lambda$getChannelDifference$340(this.f17378c);
                return;
        }
    }
}
