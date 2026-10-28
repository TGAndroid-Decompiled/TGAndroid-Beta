package org.telegram.messenger;
public final class ia implements Runnable {
    public final int f20325a;
    public final MessagesController f20326b;
    public final long f20327c;
    public final Runnable d;

    public ia(long j10, Runnable runnable, MessagesController messagesController) {
        this.f20325a = 0;
        this.f20326b = messagesController;
        this.d = runnable;
        this.f20327c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20325a) {
            case 0:
                this.f20326b.lambda$setCustomChatReactions$473(this.d, this.f20327c);
                return;
            case 1:
                this.f20326b.lambda$setUserAdminRole$104(this.f20327c, this.d);
                return;
            default:
                this.f20326b.lambda$setUserAdminRole$98(this.f20327c, this.d);
                return;
        }
    }

    public ia(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f20325a = i10;
        this.f20326b = messagesController;
        this.f20327c = j10;
        this.d = runnable;
    }
}
