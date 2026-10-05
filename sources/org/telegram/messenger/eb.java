package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f17753a;
    public final MessagesController f17754b;
    public final Runnable f17755c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f17753a = 1;
        this.f17754b = messagesController;
        this.f17755c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17753a) {
            case 0:
                this.f17754b.lambda$setUserAdminRole$105(this.d, this.f17755c);
                return;
            case 1:
                this.f17754b.lambda$setCustomChatReactions$467(this.f17755c, this.d);
                return;
            default:
                this.f17754b.lambda$setUserAdminRole$99(this.d, this.f17755c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f17753a = i10;
        this.f17754b = messagesController;
        this.d = j3;
        this.f17755c = runnable;
    }
}
