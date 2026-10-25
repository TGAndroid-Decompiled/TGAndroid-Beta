package org.telegram.messenger;
public final class lb implements Runnable {
    public final int f20581a;
    public final MessagesController f20582b;
    public final long f20583c;
    public final Runnable d;

    public lb(long j10, Runnable runnable, MessagesController messagesController) {
        this.f20581a = 0;
        this.f20582b = messagesController;
        this.d = runnable;
        this.f20583c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20581a) {
            case 0:
                this.f20582b.lambda$setCustomChatReactions$472(this.d, this.f20583c);
                return;
            case 1:
                this.f20582b.lambda$setUserAdminRole$104(this.f20583c, this.d);
                return;
            default:
                this.f20582b.lambda$setUserAdminRole$98(this.f20583c, this.d);
                return;
        }
    }

    public lb(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f20581a = i10;
        this.f20582b = messagesController;
        this.f20583c = j10;
        this.d = runnable;
    }
}
