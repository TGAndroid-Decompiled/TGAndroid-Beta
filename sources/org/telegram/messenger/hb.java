package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f20239a;
    public final MessagesController f20240b;
    public final a0.h f20241c;

    public hb(MessagesController messagesController, a0.h hVar, int i10) {
        this.f20239a = i10;
        this.f20240b = messagesController;
        this.f20241c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20239a) {
            case 0:
                this.f20240b.lambda$processUpdateArray$412(this.f20241c);
                return;
            case 1:
                this.f20240b.lambda$getChannelDifference$341(this.f20241c);
                return;
            default:
                this.f20240b.lambda$processUpdateArray$413(this.f20241c);
                return;
        }
    }
}
