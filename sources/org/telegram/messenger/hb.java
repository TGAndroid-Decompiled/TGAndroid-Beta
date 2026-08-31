package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f18857a;
    public final MessagesController f18858b;
    public final Runnable f18859c;
    public final long d;

    public hb(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18857a = 1;
        this.f18858b = messagesController;
        this.f18859c = runnable;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18857a) {
            case 0:
                this.f18858b.lambda$setUserAdminRole$105(this.d, this.f18859c);
                return;
            case 1:
                this.f18858b.lambda$setCustomChatReactions$467(this.f18859c, this.d);
                return;
            default:
                this.f18858b.lambda$setUserAdminRole$99(this.d, this.f18859c);
                return;
        }
    }

    public hb(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18857a = i10;
        this.f18858b = messagesController;
        this.d = j10;
        this.f18859c = runnable;
    }
}
