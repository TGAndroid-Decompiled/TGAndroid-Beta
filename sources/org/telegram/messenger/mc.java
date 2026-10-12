package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f18277a;
    public final MessagesController f18278b;
    public final long f18279c;
    public final Runnable d;

    public mc(long j3, Runnable runnable, MessagesController messagesController) {
        this.f18277a = 2;
        this.f18278b = messagesController;
        this.d = runnable;
        this.f18279c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18277a) {
            case 0:
                this.f18278b.lambda$setUserAdminRole$104(this.f18279c, this.d);
                return;
            case 1:
                this.f18278b.lambda$setUserAdminRole$98(this.f18279c, this.d);
                return;
            default:
                this.f18278b.lambda$setCustomChatReactions$470(this.d, this.f18279c);
                return;
        }
    }

    public mc(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f18277a = i10;
        this.f18278b = messagesController;
        this.f18279c = j3;
        this.d = runnable;
    }
}
