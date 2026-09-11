package org.telegram.messenger;
public final class db implements Runnable {
    public final int f17471a;
    public final MessagesController f17472b;
    public final Runnable f17473c;
    public final long d;

    public db(long j3, Runnable runnable, MessagesController messagesController) {
        this.f17471a = 1;
        this.f17472b = messagesController;
        this.f17473c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17471a) {
            case 0:
                this.f17472b.lambda$setUserAdminRole$105(this.d, this.f17473c);
                return;
            case 1:
                this.f17472b.lambda$setCustomChatReactions$467(this.f17473c, this.d);
                return;
            default:
                this.f17472b.lambda$setUserAdminRole$99(this.d, this.f17473c);
                return;
        }
    }

    public db(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f17471a = i10;
        this.f17472b = messagesController;
        this.d = j3;
        this.f17473c = runnable;
    }
}
