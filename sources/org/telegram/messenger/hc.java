package org.telegram.messenger;
public final class hc implements Runnable {
    public final int f17396a;
    public final MessagesController f17397b;
    public final a0.h f17398c;

    public hc(MessagesController messagesController, a0.h hVar, int i10) {
        this.f17396a = i10;
        this.f17397b = messagesController;
        this.f17398c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f17396a) {
            case 0:
                this.f17397b.lambda$processUpdateArray$407(this.f17398c);
                return;
            case 1:
                this.f17397b.lambda$processUpdateArray$406(this.f17398c);
                return;
            default:
                this.f17397b.lambda$getChannelDifference$340(this.f17398c);
                return;
        }
    }
}
