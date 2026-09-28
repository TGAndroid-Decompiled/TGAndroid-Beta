package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16372a;
    public final MessagesController f16373b;
    public final a0.i f16374c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16372a = i10;
        this.f16373b = messagesController;
        this.f16374c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16372a) {
            case 0:
                this.f16373b.lambda$processUpdateArray$407(this.f16374c);
                return;
            case 1:
                this.f16373b.lambda$processUpdateArray$406(this.f16374c);
                return;
            default:
                this.f16373b.lambda$getChannelDifference$340(this.f16374c);
                return;
        }
    }
}
