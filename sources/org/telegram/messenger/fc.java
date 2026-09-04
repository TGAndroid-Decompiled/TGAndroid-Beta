package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f17644a;
    public final MessagesController f17645b;
    public final a0.i f17646c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17644a = i10;
        this.f17645b = messagesController;
        this.f17646c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17644a) {
            case 0:
                this.f17645b.lambda$processUpdateArray$407(this.f17646c);
                return;
            case 1:
                this.f17645b.lambda$processUpdateArray$406(this.f17646c);
                return;
            default:
                this.f17645b.lambda$getChannelDifference$340(this.f17646c);
                return;
        }
    }
}
