package org.telegram.messenger;
public final class gb implements Runnable {
    public final int f20336a;
    public final MessagesController f20337b;
    public final Runnable f20338c;
    public final long d;

    public gb(long j10, Runnable runnable, MessagesController messagesController) {
        this.f20336a = 1;
        this.f20337b = messagesController;
        this.f20338c = runnable;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20336a) {
            case 0:
                this.f20337b.lambda$setUserAdminRole$105(this.d, this.f20338c);
                return;
            case 1:
                this.f20337b.lambda$setCustomChatReactions$467(this.f20338c, this.d);
                return;
            default:
                this.f20337b.lambda$setUserAdminRole$99(this.d, this.f20338c);
                return;
        }
    }

    public gb(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f20336a = i10;
        this.f20337b = messagesController;
        this.d = j10;
        this.f20338c = runnable;
    }
}
