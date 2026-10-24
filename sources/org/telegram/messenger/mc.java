package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f19027a;
    public final MessagesController f19028b;
    public final long f19029c;
    public final Runnable d;

    public mc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f19027a = 2;
        this.f19028b = messagesController;
        this.d = runnable;
        this.f19029c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19027a) {
            case 0:
                this.f19028b.lambda$setUserAdminRole$104(this.f19029c, this.d);
                return;
            case 1:
                this.f19028b.lambda$setUserAdminRole$98(this.f19029c, this.d);
                return;
            default:
                this.f19028b.lambda$setCustomChatReactions$470(this.d, this.f19029c);
                return;
        }
    }

    public mc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f19027a = i10;
        this.f19028b = messagesController;
        this.f19029c = j10;
        this.d = runnable;
    }
}
