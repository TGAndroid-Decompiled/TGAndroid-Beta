package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f17841a;
    public final MessagesController f17842b;
    public final a0.i f17843c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17841a = i10;
        this.f17842b = messagesController;
        this.f17843c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17841a) {
            case 0:
                this.f17842b.lambda$processUpdateArray$407(this.f17843c);
                return;
            case 1:
                this.f17842b.lambda$processUpdateArray$406(this.f17843c);
                return;
            default:
                this.f17842b.lambda$getChannelDifference$340(this.f17843c);
                return;
        }
    }
}
