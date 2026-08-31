package org.telegram.messenger;
public final class hc implements Runnable {
    public final int f18860a;
    public final MessagesController f18861b;
    public final a0.h f18862c;

    public hc(MessagesController messagesController, a0.h hVar, int i10) {
        this.f18860a = i10;
        this.f18861b = messagesController;
        this.f18862c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18860a) {
            case 0:
                this.f18861b.lambda$processUpdateArray$407(this.f18862c);
                return;
            case 1:
                this.f18861b.lambda$processUpdateArray$406(this.f18862c);
                return;
            default:
                this.f18861b.lambda$getChannelDifference$340(this.f18862c);
                return;
        }
    }
}
