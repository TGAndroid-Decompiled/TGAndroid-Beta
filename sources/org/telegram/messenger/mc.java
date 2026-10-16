package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f17561a;
    public final MessagesController f17562b;
    public final long f17563c;
    public final Runnable d;

    public mc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f17561a = 2;
        this.f17562b = messagesController;
        this.d = runnable;
        this.f17563c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17561a) {
            case 0:
                this.f17562b.lambda$setUserAdminRole$104(this.f17563c, this.d);
                return;
            case 1:
                this.f17562b.lambda$setUserAdminRole$98(this.f17563c, this.d);
                return;
            default:
                this.f17562b.lambda$setCustomChatReactions$470(this.d, this.f17563c);
                return;
        }
    }

    public mc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f17561a = i10;
        this.f17562b = messagesController;
        this.f17563c = j10;
        this.d = runnable;
    }
}
