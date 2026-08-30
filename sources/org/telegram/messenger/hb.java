package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f17393a;
    public final MessagesController f17394b;
    public final Runnable f17395c;
    public final long d;

    public hb(long j10, Runnable runnable, MessagesController messagesController) {
        this.f17393a = 1;
        this.f17394b = messagesController;
        this.f17395c = runnable;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17393a) {
            case 0:
                this.f17394b.lambda$setUserAdminRole$105(this.d, this.f17395c);
                return;
            case 1:
                this.f17394b.lambda$setCustomChatReactions$467(this.f17395c, this.d);
                return;
            default:
                this.f17394b.lambda$setUserAdminRole$99(this.d, this.f17395c);
                return;
        }
    }

    public hb(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f17393a = i10;
        this.f17394b = messagesController;
        this.d = j10;
        this.f17395c = runnable;
    }
}
