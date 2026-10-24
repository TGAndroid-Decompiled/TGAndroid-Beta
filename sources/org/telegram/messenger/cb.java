package org.telegram.messenger;
public final class cb implements Runnable {
    public final int f18141a;
    public final MessagesController f18142b;
    public final a0.h f18143c;

    public cb(MessagesController messagesController, a0.h hVar, int i10) {
        this.f18141a = i10;
        this.f18142b = messagesController;
        this.f18143c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18141a) {
            case 0:
                this.f18142b.lambda$processUpdateArray$409(this.f18143c);
                return;
            case 1:
                this.f18142b.lambda$processUpdateArray$410(this.f18143c);
                return;
            default:
                this.f18142b.lambda$getChannelDifference$339(this.f18143c);
                return;
        }
    }
}
