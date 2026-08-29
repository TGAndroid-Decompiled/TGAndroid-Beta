package org.telegram.messenger;
public final class gc implements Runnable {
    public final int f20339a;
    public final MessagesController f20340b;
    public final a0.h f20341c;

    public gc(MessagesController messagesController, a0.h hVar, int i10) {
        this.f20339a = i10;
        this.f20340b = messagesController;
        this.f20341c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20339a) {
            case 0:
                this.f20340b.lambda$processUpdateArray$407(this.f20341c);
                return;
            case 1:
                this.f20340b.lambda$processUpdateArray$406(this.f20341c);
                return;
            default:
                this.f20340b.lambda$getChannelDifference$340(this.f20341c);
                return;
        }
    }
}
