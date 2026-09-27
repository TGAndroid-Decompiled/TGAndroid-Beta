package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16361a;
    public final MessagesController f16362b;
    public final a0.i f16363c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16361a = i10;
        this.f16362b = messagesController;
        this.f16363c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16361a) {
            case 0:
                this.f16362b.lambda$processUpdateArray$407(this.f16363c);
                return;
            case 1:
                this.f16362b.lambda$processUpdateArray$406(this.f16363c);
                return;
            default:
                this.f16362b.lambda$getChannelDifference$340(this.f16363c);
                return;
        }
    }
}
