package org.telegram.messenger;
public final class ec implements Runnable {
    public final int f17558a;
    public final MessagesController f17559b;
    public final a0.i f17560c;

    public ec(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17558a = i10;
        this.f17559b = messagesController;
        this.f17560c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17558a) {
            case 0:
                this.f17559b.lambda$processUpdateArray$407(this.f17560c);
                return;
            case 1:
                this.f17559b.lambda$processUpdateArray$406(this.f17560c);
                return;
            default:
                this.f17559b.lambda$getChannelDifference$340(this.f17560c);
                return;
        }
    }
}
