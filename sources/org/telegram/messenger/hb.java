package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f17373a;
    public final MessagesController f17374b;
    public final Runnable f17375c;
    public final long d;

    public hb(long j10, Runnable runnable, MessagesController messagesController) {
        this.f17373a = 1;
        this.f17374b = messagesController;
        this.f17375c = runnable;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17373a) {
            case 0:
                this.f17374b.lambda$setUserAdminRole$105(this.d, this.f17375c);
                return;
            case 1:
                this.f17374b.lambda$setCustomChatReactions$467(this.f17375c, this.d);
                return;
            default:
                this.f17374b.lambda$setUserAdminRole$99(this.d, this.f17375c);
                return;
        }
    }

    public hb(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f17373a = i10;
        this.f17374b = messagesController;
        this.d = j10;
        this.f17375c = runnable;
    }
}
