package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f17747a;
    public final MessagesController f17748b;
    public final Runnable f17749c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f17747a = 1;
        this.f17748b = messagesController;
        this.f17749c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17747a) {
            case 0:
                this.f17748b.lambda$setUserAdminRole$105(this.d, this.f17749c);
                return;
            case 1:
                this.f17748b.lambda$setCustomChatReactions$467(this.f17749c, this.d);
                return;
            default:
                this.f17748b.lambda$setUserAdminRole$99(this.d, this.f17749c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f17747a = i10;
        this.f17748b = messagesController;
        this.d = j3;
        this.f17749c = runnable;
    }
}
