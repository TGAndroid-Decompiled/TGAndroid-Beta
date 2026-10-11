package org.telegram.messenger;
public final class jc implements Runnable {
    public final int f18261a;
    public final MessagesController f18262b;
    public final long f18263c;
    public final Runnable d;

    public jc(long j3, Runnable runnable, MessagesController messagesController) {
        this.f18261a = 2;
        this.f18262b = messagesController;
        this.d = runnable;
        this.f18263c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18261a) {
            case 0:
                this.f18262b.lambda$setUserAdminRole$104(this.f18263c, this.d);
                return;
            case 1:
                this.f18262b.lambda$setUserAdminRole$98(this.f18263c, this.d);
                return;
            default:
                this.f18262b.lambda$setCustomChatReactions$470(this.d, this.f18263c);
                return;
        }
    }

    public jc(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f18261a = i10;
        this.f18262b = messagesController;
        this.f18263c = j3;
        this.d = runnable;
    }
}
