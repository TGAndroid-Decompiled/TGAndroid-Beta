package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16028a;
    public final MessagesController f16029b;
    public final Runnable f16030c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16028a = 1;
        this.f16029b = messagesController;
        this.f16030c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16028a) {
            case 0:
                this.f16029b.lambda$setUserAdminRole$105(this.d, this.f16030c);
                return;
            case 1:
                this.f16029b.lambda$setCustomChatReactions$467(this.f16030c, this.d);
                return;
            default:
                this.f16029b.lambda$setUserAdminRole$99(this.d, this.f16030c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16028a = i10;
        this.f16029b = messagesController;
        this.d = j3;
        this.f16030c = runnable;
    }
}
