package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f16218a;
    public final MessagesController f16219b;
    public final Runnable f16220c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f16218a = 1;
        this.f16219b = messagesController;
        this.f16220c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16218a) {
            case 0:
                this.f16219b.lambda$setUserAdminRole$105(this.d, this.f16220c);
                return;
            case 1:
                this.f16219b.lambda$setCustomChatReactions$467(this.f16220c, this.d);
                return;
            default:
                this.f16219b.lambda$setUserAdminRole$99(this.d, this.f16220c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f16218a = i10;
        this.f16219b = messagesController;
        this.d = j3;
        this.f16220c = runnable;
    }
}
