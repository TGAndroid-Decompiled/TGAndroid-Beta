package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16373a;
    public final MessagesController f16374b;
    public final a0.i f16375c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16373a = i10;
        this.f16374b = messagesController;
        this.f16375c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16373a) {
            case 0:
                this.f16374b.lambda$processUpdateArray$407(this.f16375c);
                return;
            case 1:
                this.f16374b.lambda$processUpdateArray$406(this.f16375c);
                return;
            default:
                this.f16374b.lambda$getChannelDifference$340(this.f16375c);
                return;
        }
    }
}
