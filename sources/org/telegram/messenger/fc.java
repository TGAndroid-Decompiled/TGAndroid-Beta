package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16353a;
    public final MessagesController f16354b;
    public final a0.i f16355c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16353a = i10;
        this.f16354b = messagesController;
        this.f16355c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16353a) {
            case 0:
                this.f16354b.lambda$processUpdateArray$407(this.f16355c);
                return;
            case 1:
                this.f16354b.lambda$processUpdateArray$406(this.f16355c);
                return;
            default:
                this.f16354b.lambda$getChannelDifference$340(this.f16355c);
                return;
        }
    }
}
