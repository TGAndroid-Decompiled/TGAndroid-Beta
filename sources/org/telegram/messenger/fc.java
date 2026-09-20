package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16338a;
    public final MessagesController f16339b;
    public final a0.i f16340c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16338a = i10;
        this.f16339b = messagesController;
        this.f16340c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16338a) {
            case 0:
                this.f16339b.lambda$processUpdateArray$407(this.f16340c);
                return;
            case 1:
                this.f16339b.lambda$processUpdateArray$406(this.f16340c);
                return;
            default:
                this.f16339b.lambda$getChannelDifference$340(this.f16340c);
                return;
        }
    }
}
