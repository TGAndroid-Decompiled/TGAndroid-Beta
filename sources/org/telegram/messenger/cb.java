package org.telegram.messenger;
public final class cb implements Runnable {
    public final int f18077a;
    public final MessagesController f18078b;
    public final a0.h f18079c;

    public cb(MessagesController messagesController, a0.h hVar, int i10) {
        this.f18077a = i10;
        this.f18078b = messagesController;
        this.f18079c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18077a) {
            case 0:
                this.f18078b.lambda$processUpdateArray$409(this.f18079c);
                return;
            case 1:
                this.f18078b.lambda$processUpdateArray$410(this.f18079c);
                return;
            default:
                this.f18078b.lambda$getChannelDifference$339(this.f18079c);
                return;
        }
    }
}
