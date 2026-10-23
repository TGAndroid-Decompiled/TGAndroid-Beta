package org.telegram.messenger;
public final class lc implements Runnable {
    public final int f18885a;
    public final MessagesController f18886b;
    public final long f18887c;
    public final Runnable d;

    public lc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18885a = 2;
        this.f18886b = messagesController;
        this.d = runnable;
        this.f18887c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18885a) {
            case 0:
                this.f18886b.lambda$setUserAdminRole$104(this.f18887c, this.d);
                return;
            case 1:
                this.f18886b.lambda$setUserAdminRole$98(this.f18887c, this.d);
                return;
            default:
                this.f18886b.lambda$setCustomChatReactions$470(this.d, this.f18887c);
                return;
        }
    }

    public lc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18885a = i10;
        this.f18886b = messagesController;
        this.f18887c = j10;
        this.d = runnable;
    }
}
