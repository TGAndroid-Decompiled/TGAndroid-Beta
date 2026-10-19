package org.telegram.messenger;
public final class ic implements Runnable {
    public final int f18597a;
    public final MessagesController f18598b;
    public final long f18599c;
    public final Runnable d;

    public ic(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18597a = 2;
        this.f18598b = messagesController;
        this.d = runnable;
        this.f18599c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18597a) {
            case 0:
                this.f18598b.lambda$setUserAdminRole$104(this.f18599c, this.d);
                return;
            case 1:
                this.f18598b.lambda$setUserAdminRole$98(this.f18599c, this.d);
                return;
            default:
                this.f18598b.lambda$setCustomChatReactions$470(this.d, this.f18599c);
                return;
        }
    }

    public ic(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18597a = i10;
        this.f18598b = messagesController;
        this.f18599c = j10;
        this.d = runnable;
    }
}
