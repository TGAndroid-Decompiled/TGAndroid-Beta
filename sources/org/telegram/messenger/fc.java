package org.telegram.messenger;
public final class fc implements Runnable {
    public final int f16389a;
    public final MessagesController f16390b;
    public final a0.i f16391c;

    public fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.f16389a = i10;
        this.f16390b = messagesController;
        this.f16391c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f16389a) {
            case 0:
                this.f16390b.lambda$processUpdateArray$407(this.f16391c);
                return;
            case 1:
                this.f16390b.lambda$processUpdateArray$406(this.f16391c);
                return;
            default:
                this.f16390b.lambda$getChannelDifference$340(this.f16391c);
                return;
        }
    }
}
