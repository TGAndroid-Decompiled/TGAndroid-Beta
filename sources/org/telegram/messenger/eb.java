package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f19988a;
    public final MessagesController f19989b;
    public final a0.h f19990c;

    public eb(MessagesController messagesController, a0.h hVar, int i10) {
        this.f19988a = i10;
        this.f19989b = messagesController;
        this.f19990c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19988a) {
            case 0:
                this.f19989b.lambda$getChannelDifference$341(this.f19990c);
                return;
            case 1:
                this.f19989b.lambda$processUpdateArray$412(this.f19990c);
                return;
            default:
                this.f19989b.lambda$processUpdateArray$411(this.f19990c);
                return;
        }
    }
}
