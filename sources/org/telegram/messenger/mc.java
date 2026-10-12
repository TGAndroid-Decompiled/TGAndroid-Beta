package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f17865a;
    public final MessagesController f17866b;
    public final long f17867c;
    public final Runnable d;

    public mc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f17865a = 2;
        this.f17866b = messagesController;
        this.d = runnable;
        this.f17867c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17865a) {
            case 0:
                this.f17866b.lambda$setUserAdminRole$104(this.f17867c, this.d);
                return;
            case 1:
                this.f17866b.lambda$setUserAdminRole$98(this.f17867c, this.d);
                return;
            default:
                this.f17866b.lambda$setCustomChatReactions$470(this.d, this.f17867c);
                return;
        }
    }

    public mc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f17865a = i10;
        this.f17866b = messagesController;
        this.f17867c = j10;
        this.d = runnable;
    }
}
