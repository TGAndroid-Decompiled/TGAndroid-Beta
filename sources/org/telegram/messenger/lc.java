package org.telegram.messenger;
public final class lc implements Runnable {
    public final int f18953a;
    public final MessagesController f18954b;
    public final long f18955c;
    public final Runnable d;

    public lc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18953a = 2;
        this.f18954b = messagesController;
        this.d = runnable;
        this.f18955c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18953a) {
            case 0:
                this.f18954b.lambda$setUserAdminRole$104(this.f18955c, this.d);
                return;
            case 1:
                this.f18954b.lambda$setUserAdminRole$98(this.f18955c, this.d);
                return;
            default:
                this.f18954b.lambda$setCustomChatReactions$470(this.d, this.f18955c);
                return;
        }
    }

    public lc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18953a = i10;
        this.f18954b = messagesController;
        this.f18955c = j10;
        this.d = runnable;
    }
}
