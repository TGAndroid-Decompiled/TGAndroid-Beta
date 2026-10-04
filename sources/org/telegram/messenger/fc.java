package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f17848a;
    public final MessagesController f17849b;
    public final a0.i f17850c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17848a = i10;
        this.f17849b = messagesController;
        this.f17850c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17848a) {
            case 0:
                this.f17849b.lambda$processUpdateArray$407(this.f17850c);
                return;
            case 1:
                this.f17849b.lambda$processUpdateArray$406(this.f17850c);
                return;
            default:
                this.f17849b.lambda$getChannelDifference$340(this.f17850c);
                return;
        }
    }
}
