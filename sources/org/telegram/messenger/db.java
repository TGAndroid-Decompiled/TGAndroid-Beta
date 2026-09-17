package org.telegram.messenger;
public final class db implements Runnable {
    public final int f17498a;
    public final MessagesController f17499b;
    public final Runnable f17500c;
    public final long d;

    public db(long j3, Runnable runnable, MessagesController messagesController) {
        this.f17498a = 1;
        this.f17499b = messagesController;
        this.f17500c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17498a) {
            case 0:
                this.f17499b.lambda$setUserAdminRole$105(this.d, this.f17500c);
                return;
            case 1:
                this.f17499b.lambda$setCustomChatReactions$467(this.f17500c, this.d);
                return;
            default:
                this.f17499b.lambda$setUserAdminRole$99(this.d, this.f17500c);
                return;
        }
    }

    public db(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f17498a = i10;
        this.f17499b = messagesController;
        this.d = j3;
        this.f17500c = runnable;
    }
}
