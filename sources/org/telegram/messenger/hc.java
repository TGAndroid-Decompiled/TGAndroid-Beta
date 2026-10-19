package org.telegram.messenger;
public final class hc implements Runnable {
    public final int f18517a;
    public final MessagesController f18518b;
    public final long f18519c;
    public final Runnable d;

    public hc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18517a = 2;
        this.f18518b = messagesController;
        this.d = runnable;
        this.f18519c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18517a) {
            case 0:
                this.f18518b.lambda$setUserAdminRole$104(this.f18519c, this.d);
                return;
            case 1:
                this.f18518b.lambda$setUserAdminRole$98(this.f18519c, this.d);
                return;
            default:
                this.f18518b.lambda$setCustomChatReactions$470(this.d, this.f18519c);
                return;
        }
    }

    public hc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18517a = i10;
        this.f18518b = messagesController;
        this.f18519c = j10;
        this.d = runnable;
    }
}
