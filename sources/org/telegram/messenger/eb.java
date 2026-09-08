package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f17572a;
    public final MessagesController f17573b;
    public final Runnable f17574c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f17572a = 1;
        this.f17573b = messagesController;
        this.f17574c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17572a) {
            case 0:
                this.f17573b.lambda$setUserAdminRole$105(this.d, this.f17574c);
                return;
            case 1:
                this.f17573b.lambda$setCustomChatReactions$467(this.f17574c, this.d);
                return;
            default:
                this.f17573b.lambda$setUserAdminRole$99(this.d, this.f17574c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f17572a = i10;
        this.f17573b = messagesController;
        this.d = j3;
        this.f17574c = runnable;
    }
}
