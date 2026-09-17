package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16040a;
    public final MessagesController f16041b;
    public final Runnable f16042c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16040a = 1;
        this.f16041b = messagesController;
        this.f16042c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16040a) {
            case 0:
                this.f16041b.lambda$setUserAdminRole$105(this.d, this.f16042c);
                return;
            case 1:
                this.f16041b.lambda$setCustomChatReactions$467(this.f16042c, this.d);
                return;
            default:
                this.f16041b.lambda$setUserAdminRole$99(this.d, this.f16042c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16040a = i10;
        this.f16041b = messagesController;
        this.d = j3;
        this.f16042c = runnable;
    }
}
