package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16129a;
    public final MessagesController f16130b;
    public final a0.i f16131c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16129a = i10;
        this.f16130b = messagesController;
        this.f16131c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16129a) {
            case 0:
                this.f16130b.lambda$processUpdateArray$407(this.f16131c);
                return;
            case 1:
                this.f16130b.lambda$processUpdateArray$406(this.f16131c);
                return;
            default:
                this.f16130b.lambda$getChannelDifference$340(this.f16131c);
                return;
        }
    }
}
