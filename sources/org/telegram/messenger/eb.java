package org.telegram.messenger;

public final class eb implements Runnable {

    public final int f20138a;

    public final MessagesController f20139b;

    public final Runnable f20140c;
    public final long d;

    public eb(long j10, Runnable runnable, MessagesController messagesController) {
        this.f20138a = 1;
        this.f20139b = messagesController;
        this.f20140c = runnable;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20138a) {
            case 0:
                this.f20139b.lambda$setUserAdminRole$105(this.d, this.f20140c);
                break;
            case 1:
                this.f20139b.lambda$setCustomChatReactions$467(this.f20140c, this.d);
                break;
            default:
                this.f20139b.lambda$setUserAdminRole$99(this.d, this.f20140c);
                break;
        }
    }

    public eb(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f20138a = i10;
        this.f20139b = messagesController;
        this.d = j10;
        this.f20140c = runnable;
    }
}
