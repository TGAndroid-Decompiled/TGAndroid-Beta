package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f18859a;
    public final MessagesController f18860b;
    public final Runnable f18861c;
    public final long d;

    public hb(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18859a = 1;
        this.f18860b = messagesController;
        this.f18861c = runnable;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18859a) {
            case 0:
                this.f18860b.lambda$setUserAdminRole$105(this.d, this.f18861c);
                return;
            case 1:
                this.f18860b.lambda$setCustomChatReactions$467(this.f18861c, this.d);
                return;
            default:
                this.f18860b.lambda$setUserAdminRole$99(this.d, this.f18861c);
                return;
        }
    }

    public hb(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18859a = i10;
        this.f18860b = messagesController;
        this.d = j10;
        this.f18861c = runnable;
    }
}
