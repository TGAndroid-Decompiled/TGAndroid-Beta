package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f18276a;
    public final MessagesController f18277b;
    public final long f18278c;
    public final Runnable d;

    public mc(long j3, Runnable runnable, MessagesController messagesController) {
        this.f18276a = 2;
        this.f18277b = messagesController;
        this.d = runnable;
        this.f18278c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18276a) {
            case 0:
                this.f18277b.lambda$setUserAdminRole$104(this.f18278c, this.d);
                return;
            case 1:
                this.f18277b.lambda$setUserAdminRole$98(this.f18278c, this.d);
                return;
            default:
                this.f18277b.lambda$setCustomChatReactions$470(this.d, this.f18278c);
                return;
        }
    }

    public mc(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f18276a = i10;
        this.f18277b = messagesController;
        this.f18278c = j3;
        this.d = runnable;
    }
}
