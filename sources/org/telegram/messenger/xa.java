package org.telegram.messenger;
public final class xa implements Runnable {
    public final int f20073a;
    public final MessagesController f20074b;
    public final a0.h f20075c;

    public xa(MessagesController messagesController, a0.h hVar, int i10) {
        this.f20073a = i10;
        this.f20074b = messagesController;
        this.f20075c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20073a) {
            case 0:
                this.f20074b.lambda$processUpdateArray$409(this.f20075c);
                return;
            case 1:
                this.f20074b.lambda$processUpdateArray$410(this.f20075c);
                return;
            default:
                this.f20074b.lambda$getChannelDifference$339(this.f20075c);
                return;
        }
    }
}
