package org.telegram.messenger;
public final class hc implements Runnable {
    public final int f18520a;
    public final MessagesController f18521b;
    public final long f18522c;
    public final Runnable d;

    public hc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18520a = 2;
        this.f18521b = messagesController;
        this.d = runnable;
        this.f18522c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18520a) {
            case 0:
                this.f18521b.lambda$setUserAdminRole$104(this.f18522c, this.d);
                return;
            case 1:
                this.f18521b.lambda$setUserAdminRole$98(this.f18522c, this.d);
                return;
            default:
                this.f18521b.lambda$setCustomChatReactions$470(this.d, this.f18522c);
                return;
        }
    }

    public hc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18520a = i10;
        this.f18521b = messagesController;
        this.f18522c = j10;
        this.d = runnable;
    }
}
