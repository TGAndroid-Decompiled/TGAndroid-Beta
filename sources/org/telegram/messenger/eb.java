package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16273a;
    public final MessagesController f16274b;
    public final Runnable f16275c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16273a = 1;
        this.f16274b = messagesController;
        this.f16275c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16273a) {
            case 0:
                this.f16274b.lambda$setUserAdminRole$105(this.d, this.f16275c);
                return;
            case 1:
                this.f16274b.lambda$setCustomChatReactions$467(this.f16275c, this.d);
                return;
            default:
                this.f16274b.lambda$setUserAdminRole$99(this.d, this.f16275c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16273a = i10;
        this.f16274b = messagesController;
        this.d = j3;
        this.f16275c = runnable;
    }
}
