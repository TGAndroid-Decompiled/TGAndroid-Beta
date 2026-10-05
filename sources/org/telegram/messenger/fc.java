package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f17846a;
    public final MessagesController f17847b;
    public final a0.i f17848c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17846a = i10;
        this.f17847b = messagesController;
        this.f17848c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17846a) {
            case 0:
                this.f17847b.lambda$processUpdateArray$407(this.f17848c);
                return;
            case 1:
                this.f17847b.lambda$processUpdateArray$406(this.f17848c);
                return;
            default:
                this.f17847b.lambda$getChannelDifference$340(this.f17848c);
                return;
        }
    }
}
