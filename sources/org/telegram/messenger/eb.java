package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16274a;
    public final MessagesController f16275b;
    public final Runnable f16276c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16274a = 1;
        this.f16275b = messagesController;
        this.f16276c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16274a) {
            case 0:
                this.f16275b.lambda$setUserAdminRole$105(this.d, this.f16276c);
                return;
            case 1:
                this.f16275b.lambda$setCustomChatReactions$467(this.f16276c, this.d);
                return;
            default:
                this.f16275b.lambda$setUserAdminRole$99(this.d, this.f16276c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16274a = i10;
        this.f16275b = messagesController;
        this.d = j3;
        this.f16276c = runnable;
    }
}
