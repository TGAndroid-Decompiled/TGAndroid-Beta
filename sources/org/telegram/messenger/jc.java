package org.telegram.messenger;
public final class jc implements Runnable {
    public final int f18684a;
    public final MessagesController f18685b;
    public final long f18686c;
    public final Runnable d;

    public jc(long j10, Runnable runnable, MessagesController messagesController) {
        this.f18684a = 2;
        this.f18685b = messagesController;
        this.d = runnable;
        this.f18686c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18684a) {
            case 0:
                this.f18685b.lambda$setUserAdminRole$104(this.f18686c, this.d);
                return;
            case 1:
                this.f18685b.lambda$setUserAdminRole$98(this.f18686c, this.d);
                return;
            default:
                this.f18685b.lambda$setCustomChatReactions$470(this.d, this.f18686c);
                return;
        }
    }

    public jc(MessagesController messagesController, long j10, Runnable runnable, int i10) {
        this.f18684a = i10;
        this.f18685b = messagesController;
        this.f18686c = j10;
        this.d = runnable;
    }
}
