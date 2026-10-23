package org.telegram.messenger;
public final class bb implements Runnable {
    public final int f17957a;
    public final MessagesController f17958b;
    public final a0.h f17959c;

    public bb(MessagesController messagesController, a0.h hVar, int i10) {
        this.f17957a = i10;
        this.f17958b = messagesController;
        this.f17959c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f17957a) {
            case 0:
                this.f17958b.lambda$processUpdateArray$409(this.f17959c);
                return;
            case 1:
                this.f17958b.lambda$processUpdateArray$410(this.f17959c);
                return;
            default:
                this.f17958b.lambda$getChannelDifference$339(this.f17959c);
                return;
        }
    }
}
