package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f18021a;
    public final MessagesController f18022b;
    public final a0.h f18023c;

    public bb(MessagesController messagesController, a0.h hVar, int i10) {
        this.f18021a = i10;
        this.f18022b = messagesController;
        this.f18023c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f18021a) {
            case 0:
                this.f18022b.lambda$processUpdateArray$409(this.f18023c);
                return;
            case 1:
                this.f18022b.lambda$processUpdateArray$410(this.f18023c);
                return;
            default:
                this.f18022b.lambda$getChannelDifference$339(this.f18023c);
                return;
        }
    }
}
