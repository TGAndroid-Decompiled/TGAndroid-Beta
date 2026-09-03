package org.telegram.messenger;
public final class hc implements Runnable {
    public final int f18862a;
    public final MessagesController f18863b;
    public final a0.h f18864c;

    public hc(MessagesController messagesController, a0.h hVar, int i10) {
        this.f18862a = i10;
        this.f18863b = messagesController;
        this.f18864c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18862a) {
            case 0:
                this.f18863b.lambda$processUpdateArray$407(this.f18864c);
                return;
            case 1:
                this.f18863b.lambda$processUpdateArray$406(this.f18864c);
                return;
            default:
                this.f18863b.lambda$getChannelDifference$340(this.f18864c);
                return;
        }
    }
}
