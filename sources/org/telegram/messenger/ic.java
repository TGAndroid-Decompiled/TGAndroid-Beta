package org.telegram.messenger;
public final class ic implements Runnable {
    public final int f18594a;
    public final MessagesController f18595b;
    public final long f18596c;
    public final Runnable d;

    public ic(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18594a = 2;
        this.f18595b = messagesController;
        this.d = runnable;
        this.f18596c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18594a) {
            case 0:
                this.f18595b.lambda$setUserAdminRole$104(this.f18596c, this.d);
                return;
            case 1:
                this.f18595b.lambda$setUserAdminRole$98(this.f18596c, this.d);
                return;
            default:
                this.f18595b.lambda$setCustomChatReactions$470(this.d, this.f18596c);
                return;
        }
    }

    public ic(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18594a = i10;
        this.f18595b = messagesController;
        this.f18596c = j10;
        this.d = runnable;
    }
}
