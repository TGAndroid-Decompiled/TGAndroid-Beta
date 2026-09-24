package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16349a;
    public final MessagesController f16350b;
    public final a0.i f16351c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16349a = i10;
        this.f16350b = messagesController;
        this.f16351c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16349a) {
            case 0:
                this.f16350b.lambda$processUpdateArray$407(this.f16351c);
                return;
            case 1:
                this.f16350b.lambda$processUpdateArray$406(this.f16351c);
                return;
            default:
                this.f16350b.lambda$getChannelDifference$340(this.f16351c);
                return;
        }
    }
}
