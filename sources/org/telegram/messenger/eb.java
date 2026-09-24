package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16258a;
    public final MessagesController f16259b;
    public final Runnable f16260c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16258a = 1;
        this.f16259b = messagesController;
        this.f16260c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16258a) {
            case 0:
                this.f16259b.lambda$setUserAdminRole$105(this.d, this.f16260c);
                return;
            case 1:
                this.f16259b.lambda$setCustomChatReactions$467(this.f16260c, this.d);
                return;
            default:
                this.f16259b.lambda$setUserAdminRole$99(this.d, this.f16260c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16258a = i10;
        this.f16259b = messagesController;
        this.d = j3;
        this.f16260c = runnable;
    }
}
