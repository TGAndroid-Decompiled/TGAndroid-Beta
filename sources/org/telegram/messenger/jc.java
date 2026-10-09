package org.telegram.messenger;
public final class jc implements Runnable {
    public final int f18252a;
    public final MessagesController f18253b;
    public final long f18254c;
    public final Runnable d;

    public jc(long j3, Runnable runnable, MessagesController messagesController) {
        this.f18252a = 2;
        this.f18253b = messagesController;
        this.d = runnable;
        this.f18254c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18252a) {
            case 0:
                this.f18253b.lambda$setUserAdminRole$104(this.f18254c, this.d);
                return;
            case 1:
                this.f18253b.lambda$setUserAdminRole$98(this.f18254c, this.d);
                return;
            default:
                this.f18253b.lambda$setCustomChatReactions$470(this.d, this.f18254c);
                return;
        }
    }

    public jc(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f18252a = i10;
        this.f18253b = messagesController;
        this.f18254c = j3;
        this.d = runnable;
    }
}
