package org.telegram.messenger;
public final class xa implements Runnable {
    public final int f20067a;
    public final MessagesController f20068b;
    public final a0.h f20069c;

    public xa(MessagesController messagesController, a0.h hVar, int i10) {
        this.f20067a = i10;
        this.f20068b = messagesController;
        this.f20069c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20067a) {
            case 0:
                this.f20068b.lambda$processUpdateArray$409(this.f20069c);
                return;
            case 1:
                this.f20068b.lambda$processUpdateArray$410(this.f20069c);
                return;
            default:
                this.f20068b.lambda$getChannelDifference$339(this.f20069c);
                return;
        }
    }
}
