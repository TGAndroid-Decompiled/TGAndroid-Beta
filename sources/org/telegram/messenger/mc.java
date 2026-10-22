package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f18961a;
    public final MessagesController f18962b;
    public final long f18963c;
    public final Runnable d;

    public mc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18961a = 2;
        this.f18962b = messagesController;
        this.d = runnable;
        this.f18963c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18961a) {
            case 0:
                this.f18962b.lambda$setUserAdminRole$104(this.f18963c, this.d);
                return;
            case 1:
                this.f18962b.lambda$setUserAdminRole$98(this.f18963c, this.d);
                return;
            default:
                this.f18962b.lambda$setCustomChatReactions$470(this.d, this.f18963c);
                return;
        }
    }

    public mc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18961a = i10;
        this.f18962b = messagesController;
        this.f18963c = j10;
        this.d = runnable;
    }
}
