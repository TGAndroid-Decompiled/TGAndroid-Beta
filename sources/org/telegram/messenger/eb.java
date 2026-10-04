package org.telegram.messenger;
public final class eb implements Runnable {
    public final int f17748a;
    public final MessagesController f17749b;
    public final Runnable f17750c;
    public final long d;

    public eb(long j3, Runnable runnable, MessagesController messagesController) {
        this.f17748a = 1;
        this.f17749b = messagesController;
        this.f17750c = runnable;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17748a) {
            case 0:
                this.f17749b.lambda$setUserAdminRole$105(this.d, this.f17750c);
                return;
            case 1:
                this.f17749b.lambda$setCustomChatReactions$467(this.f17750c, this.d);
                return;
            default:
                this.f17749b.lambda$setUserAdminRole$99(this.d, this.f17750c);
                return;
        }
    }

    public eb(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f17748a = i10;
        this.f17749b = messagesController;
        this.d = j3;
        this.f17750c = runnable;
    }
}
