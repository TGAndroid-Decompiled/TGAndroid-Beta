package org.telegram.messenger;
public final class jc implements Runnable {
    public final int f18256a;
    public final MessagesController f18257b;
    public final long f18258c;
    public final Runnable d;

    public jc(long j3, Runnable runnable, MessagesController messagesController) {
        this.f18256a = 2;
        this.f18257b = messagesController;
        this.d = runnable;
        this.f18258c = j3;
    }

    @Override
    public final void run() {
        switch (this.f18256a) {
            case 0:
                this.f18257b.lambda$setUserAdminRole$104(this.f18258c, this.d);
                return;
            case 1:
                this.f18257b.lambda$setUserAdminRole$98(this.f18258c, this.d);
                return;
            default:
                this.f18257b.lambda$setCustomChatReactions$470(this.d, this.f18258c);
                return;
        }
    }

    public jc(MessagesController messagesController, long j3, Runnable runnable, int i10) {
        this.f18256a = i10;
        this.f18257b = messagesController;
        this.f18258c = j3;
        this.d = runnable;
    }
}
