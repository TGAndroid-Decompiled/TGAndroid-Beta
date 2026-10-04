package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f17847a;
    public final MessagesController f17848b;
    public final a0.i f17849c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17847a = i10;
        this.f17848b = messagesController;
        this.f17849c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17847a) {
            case 0:
                this.f17848b.lambda$processUpdateArray$407(this.f17849c);
                return;
            case 1:
                this.f17848b.lambda$processUpdateArray$406(this.f17849c);
                return;
            default:
                this.f17848b.lambda$getChannelDifference$340(this.f17849c);
                return;
        }
    }
}
