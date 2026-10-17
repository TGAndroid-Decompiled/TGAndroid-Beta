package org.telegram.messenger;
public final class xa implements Runnable {
    public final int f20068a;
    public final MessagesController f20069b;
    public final a0.h f20070c;

    public xa(MessagesController messagesController, a0.h hVar, int i10) {
        this.f20068a = i10;
        this.f20069b = messagesController;
        this.f20070c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20068a) {
            case 0:
                this.f20069b.lambda$processUpdateArray$409(this.f20070c);
                return;
            case 1:
                this.f20069b.lambda$processUpdateArray$410(this.f20070c);
                return;
            default:
                this.f20069b.lambda$getChannelDifference$339(this.f20070c);
                return;
        }
    }
}
