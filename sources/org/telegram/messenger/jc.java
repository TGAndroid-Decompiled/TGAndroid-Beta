package org.telegram.messenger;
public final class jc implements Runnable {
    public final int f18686a;
    public final MessagesController f18687b;
    public final long f18688c;
    public final Runnable d;

    public jc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18686a = 2;
        this.f18687b = messagesController;
        this.d = runnable;
        this.f18688c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18686a) {
            case 0:
                this.f18687b.lambda$setUserAdminRole$104(this.f18688c, this.d);
                return;
            case 1:
                this.f18687b.lambda$setUserAdminRole$98(this.f18688c, this.d);
                return;
            default:
                this.f18687b.lambda$setCustomChatReactions$470(this.d, this.f18688c);
                return;
        }
    }

    public jc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18686a = i10;
        this.f18687b = messagesController;
        this.f18688c = j10;
        this.d = runnable;
    }
}
