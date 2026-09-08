package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f17671a;
    public final MessagesController f17672b;
    public final a0.i f17673c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f17671a = i10;
        this.f17672b = messagesController;
        this.f17673c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f17671a) {
            case 0:
                this.f17672b.lambda$processUpdateArray$407(this.f17673c);
                return;
            case 1:
                this.f17672b.lambda$processUpdateArray$406(this.f17673c);
                return;
            default:
                this.f17672b.lambda$getChannelDifference$340(this.f17673c);
                return;
        }
    }
}
