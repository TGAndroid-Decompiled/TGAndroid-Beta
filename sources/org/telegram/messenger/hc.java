package org.telegram.messenger;
public final class hc implements Runnable {
    public final int f18521a;
    public final MessagesController f18522b;
    public final long f18523c;
    public final Runnable d;

    public hc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18521a = 2;
        this.f18522b = messagesController;
        this.d = runnable;
        this.f18523c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18521a) {
            case 0:
                this.f18522b.lambda$setUserAdminRole$104(this.f18523c, this.d);
                return;
            case 1:
                this.f18522b.lambda$setUserAdminRole$98(this.f18523c, this.d);
                return;
            default:
                this.f18522b.lambda$setCustomChatReactions$470(this.d, this.f18523c);
                return;
        }
    }

    public hc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18521a = i10;
        this.f18522b = messagesController;
        this.f18523c = j10;
        this.d = runnable;
    }
}
