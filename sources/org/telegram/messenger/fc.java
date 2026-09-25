package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16364a;
    public final MessagesController f16365b;
    public final a0.i f16366c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16364a = i10;
        this.f16365b = messagesController;
        this.f16366c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16364a) {
            case 0:
                this.f16365b.lambda$processUpdateArray$407(this.f16366c);
                return;
            case 1:
                this.f16365b.lambda$processUpdateArray$406(this.f16366c);
                return;
            default:
                this.f16365b.lambda$getChannelDifference$340(this.f16366c);
                return;
        }
    }
}
